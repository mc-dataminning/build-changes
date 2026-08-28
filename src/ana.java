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

public class ana {
   static final Logger a = LogUtils.getLogger();
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.c("commands.debug.notRunning"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wy.c("commands.debug.alreadyRunning"));
   static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wy.c("commands.debug.function.noRecursion"));
   static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wy.c("commands.debug.function.noReturnRun"));

   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("debug").requires($$0x -> $$0x.c(3)))
                  .then(ej.a("start").executes($$0x -> a((ei)$$0x.getSource()))))
               .then(ej.a("stop").executes($$0x -> b((ei)$$0x.getSource()))))
            .then(((LiteralArgumentBuilder)ej.a("function").requires($$0x -> $$0x.c(3))).then(ej.a("name", gr.a()).suggests(ano.b).executes(new ana.a())))
      );
   }

   private static int a(ei $$0) throws CommandSyntaxException {
      MinecraftServer $$1 = $$0.l();
      if ($$1.bg()) {
         throw c.create();
      } else {
         $$1.bh();
         $$0.a(() -> wy.c("commands.debug.started"), true);
         return 0;
      }
   }

   private static int b(ei $$0) throws CommandSyntaxException {
      MinecraftServer $$1 = $$0.l();
      if (!$$1.bg()) {
         throw b.create();
      } else {
         bqk $$2 = $$1.bi();
         double $$3 = (double)$$2.g() / (double)baq.a;
         double $$4 = (double)$$2.f() / $$3;
         $$0.a(() -> wy.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3), $$2.f(), String.format(Locale.ROOT, "%.2f", $$4)), true);
         return (int)$$4;
      }
   }

   static class a extends hg.b<ei> implements hg.a<ei> {
      public void a(ei $$0, ContextChain<ei> $$1, he $$2, hk<ei> $$3) throws CommandSyntaxException {
         if ($$2.c()) {
            throw ana.e.create();
         } else if ($$3.a() != null) {
            throw ana.d.create();
         } else {
            CommandContext<ei> $$4 = $$1.getTopContext();
            Collection<hw<ei>> $$5 = gr.a($$4, "name");
            MinecraftServer $$6 = $$0.l();
            String $$7 = "debug-trace-" + af.f() + ".txt";
            CommandDispatcher<ei> $$8 = $$0.l().aE().a();
            int $$9 = 0;

            try {
               Path $$10 = $$6.c("debug");
               Files.createDirectories($$10);
               final PrintWriter $$11 = new PrintWriter(Files.newBufferedWriter($$10.resolve($$7), StandardCharsets.UTF_8));
               ana.b $$12 = new ana.b($$11);
               $$3.a($$12);

               for (final hw<ei> $$13 : $$5) {
                  try {
                     ei $$14 = $$0.a($$12).b(2);
                     hy<ei> $$15 = $$13.a(null, $$8);
                     $$3.a((new hq<ei>($$15, ef.a, false) {
                        public void a(ei $$0, hj<ei> $$1, hl $$2) {
                           $$11.println($$13.a());
                           super.a($$0, $$1, $$2);
                        }
                     }).bind($$14));
                     $$9 += $$15.b().size();
                  } catch (el var18) {
                     $$0.b(var18.a());
                  }
               }
            } catch (IOException | UncheckedIOException var19) {
               ana.a.warn("Tracing failed", var19);
               $$0.b(wy.c("commands.debug.function.traceFailed"));
            }

            int $$18 = $$9;
            $$3.a(($$4x, $$5x) -> {
               if ($$5.size() == 1) {
                  $$0.a(() -> wy.a("commands.debug.function.success.single", $$18, wy.a($$5.iterator().next().a()), $$7), true);
               } else {
                  $$0.a(() -> wy.a("commands.debug.function.success.multiple", $$18, $$5.size(), $$7), true);
               }
            });
         }
      }
   }

   static class b implements eh, hm {
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
      public void a(int $$0, alg $$1, int $$2) {
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
      public void a(wy $$0) {
         this.e();
         this.b(this.d + 1);
         this.c.print("[M] ");
         this.c.println($$0.getString());
      }

      @Override
      public boolean t_() {
         return true;
      }

      @Override
      public boolean u_() {
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
