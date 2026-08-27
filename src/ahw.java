import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Locale;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class ahw {
   static final Logger a = LogUtils.getLogger();
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ur.c("commands.debug.notRunning"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(ur.c("commands.debug.alreadyRunning"));
   static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(ur.c("commands.debug.function.noRecursion"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("debug").requires($$0x -> $$0x.c(3)))
                  .then(dv.a("start").executes($$0x -> a((du)$$0x.getSource()))))
               .then(dv.a("stop").executes($$0x -> b((du)$$0x.getSource()))))
            .then(((LiteralArgumentBuilder)dv.a("function").requires($$0x -> $$0x.c(3))).then(dv.a("name", fx.a()).suggests(aik.b).executes(new ahw.a())))
      );
   }

   private static int a(du $$0) throws CommandSyntaxException {
      MinecraftServer $$1 = $$0.m();
      if ($$1.aZ()) {
         throw c.create();
      } else {
         $$1.ba();
         $$0.a(() -> ur.c("commands.debug.started"), true);
         return 0;
      }
   }

   private static int b(du $$0) throws CommandSyntaxException {
      MinecraftServer $$1 = $$0.m();
      if (!$$1.aZ()) {
         throw b.create();
      } else {
         bfg $$2 = $$1.bb();
         double $$3 = (double)$$2.g() / (double)aug.a;
         double $$4 = (double)$$2.f() / $$3;
         $$0.a(() -> ur.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3), $$2.f(), String.format(Locale.ROOT, "%.2f", $$4)), true);
         return (int)$$4;
      }
   }

   static class a extends gk.b<du> implements gk.a<du> {
      public void a(du $$0, ContextChain<du> $$1, boolean $$2, go<du> $$3) throws CommandSyntaxException {
         if ($$3.b() != null) {
            throw ahw.d.create();
         } else {
            CommandContext<du> $$4 = $$1.getTopContext();
            Collection<gx<du>> $$5 = fx.a($$4, "name");
            MinecraftServer $$6 = $$0.m();
            String $$7 = "debug-trace-" + ac.e() + ".txt";
            CommandDispatcher<du> $$8 = $$0.m().aA().a();
            int $$9 = 0;

            try {
               Path $$10 = $$6.c("debug").toPath();
               Files.createDirectories($$10);
               final PrintWriter $$11 = new PrintWriter(Files.newBufferedWriter($$10.resolve($$7), StandardCharsets.UTF_8));
               ahw.b $$12 = new ahw.b($$11);
               $$3.a($$12);

               for (final gx<du> $$13 : $$5) {
                  try {
                     du $$14 = $$0.a($$12).b(2);
                     gz<du> $$15 = $$13.a(null, $$8, $$14);
                     $$3.a((new gt<du>($$15) {
                        public void a(du $$0, gn<du> $$1, int $$2) {
                           $$11.println($$13.a());
                           super.execute($$0, $$1, $$2);
                        }
                     }).bind($$14));
                     $$9 += $$15.b().size();
                  } catch (dx var18) {
                     $$0.b(var18.a());
                  }
               }
            } catch (IOException | UncheckedIOException var19) {
               ahw.a.warn("Tracing failed", var19);
               $$0.b(ur.c("commands.debug.function.traceFailed"));
            }

            int $$18 = $$9;
            $$3.a(($$4x, $$5x) -> {
               if ($$5.size() == 1) {
                  $$0.a(() -> ur.a("commands.debug.function.success.single", $$18, ur.a($$5.iterator().next().a()), $$7), true);
               } else {
                  $$0.a(() -> ur.a("commands.debug.function.success.multiple", $$18, $$5.size(), $$7), true);
               }
            });
         }
      }
   }

   static class b implements dt, gp {
      public static final int b = 1;
      private final PrintWriter c;
      private int d;
      private boolean e;

      b(PrintWriter $$0) {
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
      public void a(int $$0, agg $$1, int $$2) {
         this.e();
         this.a($$0);
         this.c.print("[F] ");
         this.c.print($$1);
         this.c.print(" size=");
         this.c.println($$2);
      }

      @Override
      public void a(String $$0) {
         this.e();
         this.a(this.d + 1);
         this.c.print("[E] ");
         this.c.print($$0);
      }

      @Override
      public void a(ur $$0) {
         this.e();
         this.b(this.d + 1);
         this.c.print("[M] ");
         this.c.println($$0.getString());
      }

      @Override
      public boolean k_() {
         return true;
      }

      @Override
      public boolean w_() {
         return true;
      }

      @Override
      public boolean U_() {
         return false;
      }

      @Override
      public boolean l_() {
         return true;
      }

      @Override
      public void close() {
         IOUtils.closeQuietly(this.c);
      }
   }
}
