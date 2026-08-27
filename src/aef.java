import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Locale;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class aef {
   private static final Logger a = LogUtils.getLogger();
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(sw.c("commands.debug.notRunning"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(sw.c("commands.debug.alreadyRunning"));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("debug").requires($$0x -> $$0x.c(3)))
                  .then(dt.a("start").executes($$0x -> a((ds)$$0x.getSource()))))
               .then(dt.a("stop").executes($$0x -> b((ds)$$0x.getSource()))))
            .then(
               ((LiteralArgumentBuilder)dt.a("function").requires($$0x -> $$0x.c(3)))
                  .then(dt.a("name", ft.a()).suggests(aes.a).executes($$0x -> a((ds)$$0x.getSource(), ft.a($$0x, "name"))))
            )
      );
   }

   private static int a(ds $$0) throws CommandSyntaxException {
      MinecraftServer $$1 = $$0.l();
      if ($$1.ba()) {
         throw c.create();
      } else {
         $$1.bb();
         $$0.a(() -> sw.c("commands.debug.started"), true);
         return 0;
      }
   }

   private static int b(ds $$0) throws CommandSyntaxException {
      MinecraftServer $$1 = $$0.l();
      if (!$$1.ba()) {
         throw b.create();
      } else {
         bam $$2 = $$1.bc();
         double $$3 = (double)$$2.g() / (double)apw.a;
         double $$4 = (double)$$2.f() / $$3;
         $$0.a(() -> sw.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3), $$2.f(), String.format(Locale.ROOT, "%.2f", $$4)), true);
         return (int)$$4;
      }
   }

   private static int a(ds $$0, Collection<dn> $$1) {
      int $$2 = 0;
      MinecraftServer $$3 = $$0.l();
      String $$4 = "debug-trace-" + ac.e() + ".txt";

      try {
         Path $$5 = $$3.c("debug").toPath();
         Files.createDirectories($$5);

         try (Writer $$6 = Files.newBufferedWriter($$5.resolve($$4), StandardCharsets.UTF_8)) {
            PrintWriter $$7 = new PrintWriter($$6);

            for (dn $$8 : $$1) {
               $$7.println($$8.a());
               aef.a $$9 = new aef.a($$7);
               $$2 += $$0.l().aA().a($$8, $$0.a($$9).b(2), $$9);
            }
         }
      } catch (IOException | UncheckedIOException var13) {
         a.warn("Tracing failed", var13);
         $$0.b(sw.c("commands.debug.function.traceFailed"));
      }

      int $$11 = $$2;
      if ($$1.size() == 1) {
         $$0.a(() -> sw.a("commands.debug.function.success.single", $$11, $$1.iterator().next().a(), $$4), true);
      } else {
         $$0.a(() -> sw.a("commands.debug.function.success.multiple", $$11, $$1.size(), $$4), true);
      }

      return $$2;
   }

   static class a implements ade.c, dr {
      public static final int b = 1;
      private final PrintWriter c;
      private int d;
      private boolean e;

      a(PrintWriter $$0) {
         this.c = $$0;
      }

      private void a(int $$0) {
         this.b($$0);
         this.d = $$0;
      }

      private void b(int $$0) {
         for (int $$1 = 0; $$1 < $$0 + 1; $$1++) {
            this.c.write("    ");
         }
      }

      private void e() {
         if (this.e) {
            this.c.println();
            this.e = false;
         }
      }

      @Override
      public void a(int $$0, String $$1) {
         this.e();
         this.a($$0);
         this.c.print("[C] ");
         this.c.print($$1);
         this.e = true;
      }

      @Override
      public void a(int $$0, String $$1, int $$2) {
         if (this.e) {
            this.c.print(" -> ");
            this.c.println($$2);
            this.e = false;
         } else {
            this.a($$0);
            this.c.print("[R = ");
            this.c.print($$2);
            this.c.print("] ");
            this.c.println($$1);
         }
      }

      @Override
      public void a(int $$0, acq $$1, int $$2) {
         this.e();
         this.a($$0);
         this.c.print("[F] ");
         this.c.print($$1);
         this.c.print(" size=");
         this.c.println($$2);
      }

      @Override
      public void b(int $$0, String $$1) {
         this.e();
         this.a($$0 + 1);
         this.c.print("[E] ");
         this.c.print($$1);
      }

      @Override
      public void a(sw $$0) {
         this.e();
         this.b(this.d + 1);
         this.c.print("[M] ");
         this.c.println($$0.getString());
      }

      @Override
      public boolean e_() {
         return true;
      }

      @Override
      public boolean q_() {
         return true;
      }

      @Override
      public boolean N_() {
         return false;
      }

      @Override
      public boolean f_() {
         return true;
      }
   }
}
