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

public class aoj {
   private static final Logger a = LogUtils.getLogger();
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xa.c("commands.perf.notRunning"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xa.c("commands.perf.alreadyRunning"));

   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("perf").requires($$0x -> $$0x.c(4)))
               .then(ek.a("start").executes($$0x -> a((ej)$$0x.getSource()))))
            .then(ek.a("stop").executes($$0x -> b((ej)$$0x.getSource())))
      );
   }

   private static int a(ej $$0) throws CommandSyntaxException {
      MinecraftServer $$1 = $$0.l();
      if ($$1.aT()) {
         throw c.create();
      } else {
         Consumer<bqz> $$2 = $$1x -> a($$0, $$1x);
         Consumer<Path> $$3 = $$2x -> a($$0, $$2x, $$1);
         $$1.a($$2, $$3);
         $$0.a(() -> xa.c("commands.perf.started"), false);
         return 0;
      }
   }

   private static int b(ej $$0) throws CommandSyntaxException {
      MinecraftServer $$1 = $$0.l();
      if (!$$1.aT()) {
         throw b.create();
      } else {
         $$1.aV();
         return 0;
      }
   }

   private static void a(ej $$0, Path $$1, MinecraftServer $$2) {
      String $$3 = String.format(Locale.ROOT, "%s-%s-%s", ag.f(), $$2.aZ().e(), ac.b().b());

      String $$4;
      try {
         $$4 = w.a(bsw.a, $$3, ".zip");
      } catch (IOException var11) {
         $$0.b(xa.c("commands.perf.reportFailed"));
         a.error("Failed to create report name", var11);
         return;
      }

      try (ayz $$7 = new ayz(bsw.a.resolve($$4))) {
         $$7.a(Paths.get("system.txt"), $$2.b(new ae()).a());
         $$7.a($$1);
      }

      try {
         FileUtils.forceDelete($$1.toFile());
      } catch (IOException var9) {
         a.warn("Failed to delete temporary profiling file {}", $$1, var9);
      }

      $$0.a(() -> xa.a("commands.perf.reportSaved", $$4), false);
   }

   private static void a(ej $$0, bqz $$1) {
      if ($$1 != bqv.a) {
         int $$2 = $$1.f();
         double $$3 = (double)$$1.g() / (double)bas.a;
         $$0.a(() -> xa.a("commands.perf.stopped", String.format(Locale.ROOT, "%.2f", $$3), $$2, String.format(Locale.ROOT, "%.2f", (double)$$2 / $$3)), false);
      }
   }
}
