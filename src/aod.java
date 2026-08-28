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

public class aod {
   private static final Logger a = LogUtils.getLogger();
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("commands.perf.notRunning"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xe.c("commands.perf.alreadyRunning"));

   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("perf").requires($$0x -> $$0x.c(4)))
               .then(ev.a("start").executes($$0x -> a((eu)$$0x.getSource()))))
            .then(ev.a("stop").executes($$0x -> b((eu)$$0x.getSource())))
      );
   }

   private static int a(eu $$0) throws CommandSyntaxException {
      MinecraftServer $$1 = $$0.l();
      if ($$1.aU()) {
         throw c.create();
      } else {
         Consumer<bof> $$2 = $$1x -> a($$0, $$1x);
         Consumer<Path> $$3 = $$2x -> a($$0, $$2x, $$1);
         $$1.a($$2, $$3);
         $$0.a(() -> xe.c("commands.perf.started"), false);
         return 0;
      }
   }

   private static int b(eu $$0) throws CommandSyntaxException {
      MinecraftServer $$1 = $$0.l();
      if (!$$1.aU()) {
         throw b.create();
      } else {
         $$1.aW();
         return 0;
      }
   }

   private static void a(eu $$0, Path $$1, MinecraftServer $$2) {
      String $$3 = String.format(Locale.ROOT, "%s-%s-%s", ad.f(), $$2.ba().e(), ab.b().b());

      String $$4;
      try {
         $$4 = v.a(bpy.a, $$3, ".zip");
      } catch (IOException var11) {
         $$0.b(xe.c("commands.perf.reportFailed"));
         a.error("Failed to create report name", var11);
         return;
      }

      try (ayq $$7 = new ayq(bpy.a.resolve($$4))) {
         $$7.a(Paths.get("system.txt"), $$2.b(new ac()).a());
         $$7.a($$1);
      }

      try {
         FileUtils.forceDelete($$1.toFile());
      } catch (IOException var9) {
         a.warn("Failed to delete temporary profiling file {}", $$1, var9);
      }

      $$0.a(() -> xe.a("commands.perf.reportSaved", $$4), false);
   }

   private static void a(eu $$0, bof $$1) {
      if ($$1 != bob.a) {
         int $$2 = $$1.f();
         double $$3 = (double)$$1.g() / (double)bag.a;
         $$0.a(() -> xe.a("commands.perf.stopped", String.format(Locale.ROOT, "%.2f", $$3), $$2, String.format(Locale.ROOT, "%.2f", (double)$$2 / $$3)), false);
      }
   }
}
