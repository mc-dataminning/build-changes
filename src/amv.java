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

public class amv {
   static final Logger a = LogUtils.getLogger();
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xd.c("commands.debug.notRunning"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xd.c("commands.debug.alreadyRunning"));
   static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xd.c("commands.debug.function.noRecursion"));
   static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xd.c("commands.debug.function.noReturnRun"));

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("debug").requires($$0x -> $$0x.c(3)))
                  .then(eu.a("start").executes($$0x -> a((et)$$0x.getSource()))))
               .then(eu.a("stop").executes($$0x -> b((et)$$0x.getSource()))))
            .then(((LiteralArgumentBuilder)eu.a("function").requires($$0x -> $$0x.c(3))).then(eu.a("name", hb.a()).suggests(anj.b).executes(new amv.a())))
      );
   }

   private static int a(et $$0) throws CommandSyntaxException {
      MinecraftServer $$1 = $$0.l();
      if ($$1.bh()) {
         throw c.create();
      } else {
         $$1.bi();
         $$0.a(() -> xd.c("commands.debug.started"), true);
         return 0;
      }
   }

   private static int b(et $$0) throws CommandSyntaxException {
      MinecraftServer $$1 = $$0.l();
      if (!$$1.bh()) {
         throw b.create();
      } else {
         bnx $$2 = $$1.bj();
         double $$3 = (double)$$2.g() / (double)bad.a;
         double $$4 = (double)$$2.f() / $$3;
         $$0.a(() -> xd.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3), $$2.f(), String.format(Locale.ROOT, "%.2f", $$4)), true);
         return (int)$$4;
      }
   }

   static class a extends hq.b<et> implements hq.a<et> {
      public void a(et $$0, ContextChain<et> $$1, ho $$2, hu<et> $$3) throws CommandSyntaxException {
         if ($$2.c()) {
            throw amv.e.create();
         } else if ($$3.a() != null) {
            throw amv.d.create();
         } else {
            CommandContext<et> $$4 = $$1.getTopContext();
            Collection<ih<et>> $$5 = hb.a($$4, "name");
            MinecraftServer $$6 = $$0.l();
            String $$7 = "debug-trace-" + ad.f() + ".txt";
            CommandDispatcher<et> $$8 = $$0.l().aE().a();
            int $$9 = 0;

            try {
               Path $$10 = $$6.c("debug");
               Files.createDirectories($$10);
               final PrintWriter $$11 = new PrintWriter(Files.newBufferedWriter($$10.resolve($$7), StandardCharsets.UTF_8));
               amv.b $$12 = new amv.b($$11);
               $$3.a($$12);

               for (final ih<et> $$13 : $$5) {
                  try {
                     et $$14 = $$0.a($$12).b(2);
                     ij<et> $$15 = $$13.a(null, $$8);
                     $$3.a((new ia<et>($$15, eq.a, false) {
                        public void a(et $$0, ht<et> $$1, hv $$2) {
                           $$11.println($$13.a());
                           super.a($$0, $$1, $$2);
                        }
                     }).bind($$14));
                     $$9 += $$15.b().size();
                  } catch (ew var18) {
                     $$0.b(var18.a());
                  }
               }
            } catch (IOException | UncheckedIOException var19) {
               amv.a.warn("Tracing failed", var19);
               $$0.b(xd.c("commands.debug.function.traceFailed"));
            }

            int $$18 = $$9;
            $$3.a(($$4x, $$5x) -> {
               if ($$5.size() == 1) {
                  $$0.a(() -> xd.a("commands.debug.function.success.single", $$18, xd.a($$5.iterator().next().a()), $$7), true);
               } else {
                  $$0.a(() -> xd.a("commands.debug.function.success.multiple", $$18, $$5.size(), $$7), true);
               }
            });
         }
      }
   }

   static class b implements es, hw {
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
      public void a(int $$0, alb $$1, int $$2) {
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
      public void a(xd $$0) {
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
      public boolean v_() {
         return true;
      }

      @Override
      public boolean J_() {
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
