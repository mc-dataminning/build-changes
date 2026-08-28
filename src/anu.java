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

public class anu {
   private static final Logger a = LogUtils.getLogger();
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wo.c("commands.perf.notRunning"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wo.c("commands.perf.alreadyRunning"));

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("perf").requires($$0x -> $$0x.c(4)))
               .then(ey.a("start").executes($$0x -> a((ex)$$0x.getSource()))))
            .then(ey.a("stop").executes($$0x -> b((ex)$$0x.getSource())))
      );
   }

   private static int a(ex $$0) throws CommandSyntaxException {
      MinecraftServer $$1 = $$0.l();
      if ($$1.aT()) {
         throw c.create();
      } else {
         Consumer<bop> $$2 = $$1x -> a($$0, $$1x);
         Consumer<Path> $$3 = $$2x -> a($$0, $$2x, $$1);
         $$1.a($$2, $$3);
         $$0.a(() -> wo.c("commands.perf.started"), false);
         return 0;
      }
   }

   private static int b(ex $$0) throws CommandSyntaxException {
      MinecraftServer $$1 = $$0.l();
      if (!$$1.aT()) {
         throw b.create();
      } else {
         $$1.aV();
         return 0;
      }
   }

   private static void a(ex $$0, Path $$1, MinecraftServer $$2) {
      String $$3 = String.format(Locale.ROOT, "%s-%s-%s", af.f(), $$2.aZ().e(), ab.b().b());

      String $$4;
      try {
         $$4 = v.a(bqm.a, $$3, ".zip");
      } catch (IOException var11) {
         $$0.b(wo.c("commands.perf.reportFailed"));
         a.error("Failed to create report name", var11);
         return;
      }

      try (ayj $$7 = new ayj(bqm.a.resolve($$4))) {
         $$7.a(Paths.get("system.txt"), $$2.b(new ad()).a());
         $$7.a($$1);
      }

      try {
         FileUtils.forceDelete($$1.toFile());
      } catch (IOException var9) {
         a.warn("Failed to delete temporary profiling file {}", $$1, var9);
      }

      $$0.a(() -> wo.a("commands.perf.reportSaved", $$4), false);
   }

   private static void a(ex $$0, bop $$1) {
      if ($$1 != bol.a) {
         int $$2 = $$1.f();
         double $$3 = (double)$$1.g() / (double)baa.a;
         $$0.a(() -> wo.a("commands.perf.stopped", String.format(Locale.ROOT, "%.2f", $$3), $$2, String.format(Locale.ROOT, "%.2f", (double)$$2 / $$3)), false);
      }
   }
}
