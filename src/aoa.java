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

public class aoa {
   private static final Logger a = LogUtils.getLogger();
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xd.c("commands.perf.notRunning"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xd.c("commands.perf.alreadyRunning"));

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("perf").requires($$0x -> $$0x.c(4)))
               .then(eu.a("start").executes($$0x -> a((et)$$0x.getSource()))))
            .then(eu.a("stop").executes($$0x -> b((et)$$0x.getSource())))
      );
   }

   private static int a(et $$0) throws CommandSyntaxException {
      MinecraftServer $$1 = $$0.l();
      if ($$1.aU()) {
         throw c.create();
      } else {
         Consumer<bnx> $$2 = $$1x -> a($$0, $$1x);
         Consumer<Path> $$3 = $$2x -> a($$0, $$2x, $$1);
         $$1.a($$2, $$3);
         $$0.a(() -> xd.c("commands.perf.started"), false);
         return 0;
      }
   }

   private static int b(et $$0) throws CommandSyntaxException {
      MinecraftServer $$1 = $$0.l();
      if (!$$1.aU()) {
         throw b.create();
      } else {
         $$1.aW();
         return 0;
      }
   }

   private static void a(et $$0, Path $$1, MinecraftServer $$2) {
      String $$3 = String.format(Locale.ROOT, "%s-%s-%s", ad.f(), $$2.ba().e(), ab.b().b());

      String $$4;
      try {
         $$4 = v.a(bpq.a, $$3, ".zip");
      } catch (IOException var11) {
         $$0.b(xd.c("commands.perf.reportFailed"));
         a.error("Failed to create report name", var11);
         return;
      }

      try (ayn $$7 = new ayn(bpq.a.resolve($$4))) {
         $$7.a(Paths.get("system.txt"), $$2.b(new ac()).a());
         $$7.a($$1);
      }

      try {
         FileUtils.forceDelete($$1.toFile());
      } catch (IOException var9) {
         a.warn("Failed to delete temporary profiling file {}", $$1, var9);
      }

      $$0.a(() -> xd.a("commands.perf.reportSaved", $$4), false);
   }

   private static void a(et $$0, bnx $$1) {
      if ($$1 != bnt.a) {
         int $$2 = $$1.f();
         double $$3 = (double)$$1.g() / (double)bad.a;
         $$0.a(() -> xd.a("commands.perf.stopped", String.format(Locale.ROOT, "%.2f", $$3), $$2, String.format(Locale.ROOT, "%.2f", (double)$$2 / $$3)), false);
      }
   }
}
