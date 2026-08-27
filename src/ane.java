import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class ane {
   private static final Logger a = LogUtils.getLogger();
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("commands.perf.notRunning"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wu.c("commands.perf.alreadyRunning"));

   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("perf").requires($$0x -> $$0x.c(4)))
               .then(ee.a("start").executes($$0x -> a((ed)$$0x.getSource()))))
            .then(ee.a("stop").executes($$0x -> b((ed)$$0x.getSource())))
      );
   }

   private static int a(ed $$0) throws CommandSyntaxException {
      MinecraftServer $$1 = $$0.l();
      if ($$1.aV()) {
         throw c.create();
      } else {
         Consumer<blz> $$2 = $$1x -> a($$0, $$1x);
         Consumer<Path> $$3 = $$2x -> a($$0, $$2x, $$1);
         $$1.a($$2, $$3);
         $$0.a(() -> wu.c("commands.perf.started"), false);
         return 0;
      }
   }

   private static int b(ed $$0) throws CommandSyntaxException {
      MinecraftServer $$1 = $$0.l();
      if (!$$1.aV()) {
         throw b.create();
      } else {
         $$1.aX();
         return 0;
      }
   }

   private static void a(ed $$0, Path $$1, MinecraftServer $$2) {
      String $$3 = String.format(Locale.ROOT, "%s-%s-%s", ac.e(), $$2.bb().e(), aa.b().b());

      String $$4;
      try {
         $$4 = v.a(bns.a, $$3, ".zip");
      } catch (IOException var11) {
         $$0.b(wu.c("commands.perf.reportFailed"));
         a.error("Failed to create report name", var11);
         return;
      }

      try (axk $$7 = new axk(bns.a.resolve($$4))) {
         $$7.a(Paths.get("system.txt"), $$2.b(new ab()).a());
         $$7.a($$1);
      }

      try {
         FileUtils.forceDelete($$1.toFile());
      } catch (IOException var9) {
         a.warn("Failed to delete temporary profiling file {}", $$1, var9);
      }

      $$0.a(() -> wu.a("commands.perf.reportSaved", $$4), false);
   }

   private static void a(ed $$0, blz $$1) {
      if ($$1 != blv.a) {
         int $$2 = $$1.f();
         double $$3 = (double)$$1.g() / (double)ayy.a;
         $$0.a(() -> wu.a("commands.perf.stopped", String.format(Locale.ROOT, "%.2f", $$3), $$2, String.format(Locale.ROOT, "%.2f", (double)$$2 / $$3)), false);
      }
   }
}
