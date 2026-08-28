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

public class anc {
   static final Logger a = LogUtils.getLogger();
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xa.c("commands.debug.notRunning"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xa.c("commands.debug.alreadyRunning"));
   static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xa.c("commands.debug.function.noRecursion"));
   static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xa.c("commands.debug.function.noReturnRun"));

   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("debug").requires($$0x -> $$0x.c(3)))
                  .then(ek.a("start").executes($$0x -> a((ej)$$0x.getSource()))))
               .then(ek.a("stop").executes($$0x -> b((ej)$$0x.getSource()))))
            .then(((LiteralArgumentBuilder)ek.a("function").requires($$0x -> $$0x.c(3))).then(ek.a("name", gs.a()).suggests(anq.b).executes(new anc.a())))
      );
   }

   private static int a(ej $$0) throws CommandSyntaxException {
      MinecraftServer $$1 = $$0.l();
      if ($$1.bg()) {
         throw c.create();
      } else {
         $$1.bh();
         $$0.a(() -> xa.c("commands.debug.started"), true);
         return 0;
      }
   }

   private static int b(ej $$0) throws CommandSyntaxException {
      MinecraftServer $$1 = $$0.l();
      if (!$$1.bg()) {
         throw b.create();
      } else {
         bqz $$2 = $$1.bi();
         double $$3 = (double)$$2.g() / (double)bas.a;
         double $$4 = (double)$$2.f() / $$3;
         $$0.a(() -> xa.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3), $$2.f(), String.format(Locale.ROOT, "%.2f", $$4)), true);
         return (int)$$4;
      }
   }

   static class a extends hh.b<ej> implements hh.a<ej> {
      public void a(ej $$0, ContextChain<ej> $$1, hf $$2, hl<ej> $$3) throws CommandSyntaxException {
         if ($$2.c()) {
            throw anc.e.create();
         } else if ($$3.a() != null) {
            throw anc.d.create();
         } else {
            CommandContext<ej> $$4 = $$1.getTopContext();
            Collection<hx<ej>> $$5 = gs.a($$4, "name");
            MinecraftServer $$6 = $$0.l();
            String $$7 = "debug-trace-" + ag.f() + ".txt";
            CommandDispatcher<ej> $$8 = $$0.l().aE().a();
            int $$9 = 0;

            try {
               Path $$10 = $$6.c("debug");
               Files.createDirectories($$10);
               final PrintWriter $$11 = new PrintWriter(Files.newBufferedWriter($$10.resolve($$7), StandardCharsets.UTF_8));
               anc.b $$12 = new anc.b($$11);
               $$3.a($$12);

               for (final hx<ej> $$13 : $$5) {
                  try {
                     ej $$14 = $$0.a($$12).b(2);
                     hz<ej> $$15 = $$13.a(null, $$8);
                     $$3.a((new hr<ej>($$15, eg.a, false) {
                        public void a(ej $$0, hk<ej> $$1, hm $$2) {
                           $$11.println($$13.a());
                           super.a($$0, $$1, $$2);
                        }
                     }).bind($$14));
                     $$9 += $$15.b().size();
                  } catch (em var18) {
                     $$0.b(var18.a());
                  }
               }
            } catch (IOException | UncheckedIOException var19) {
               anc.a.warn("Tracing failed", var19);
               $$0.b(xa.c("commands.debug.function.traceFailed"));
            }

            int $$18 = $$9;
            $$3.a(($$4x, $$5x) -> {
               if ($$5.size() == 1) {
                  $$0.a(() -> xa.a("commands.debug.function.success.single", $$18, xa.a($$5.iterator().next().a()), $$7), true);
               } else {
                  $$0.a(() -> xa.a("commands.debug.function.success.multiple", $$18, $$5.size(), $$7), true);
               }
            });
         }
      }
   }

   static class b implements ei, hn {
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
      public void a(int $$0, ali $$1, int $$2) {
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
      public void a(xa $$0) {
         this.e();
         this.b(this.d + 1);
         this.c.print("[M] ");
         this.c.println($$0.getString());
      }

      @Override
      public boolean x_() {
         return true;
      }

      @Override
      public boolean y_() {
         return true;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public boolean o_() {
         return true;
      }

      @Override
      public void close() {
         IOUtils.closeQuietly(this.c);
      }
   }
}
