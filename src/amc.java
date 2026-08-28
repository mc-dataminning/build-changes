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

public class amc {
   static final Logger a = LogUtils.getLogger();
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("commands.debug.notRunning"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wu.c("commands.debug.alreadyRunning"));
   static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wu.c("commands.debug.function.noRecursion"));
   static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wu.c("commands.debug.function.noReturnRun"));

   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("debug").requires($$0x -> $$0x.c(3)))
                  .then(er.a("start").executes($$0x -> a((eq)$$0x.getSource()))))
               .then(er.a("stop").executes($$0x -> b((eq)$$0x.getSource()))))
            .then(((LiteralArgumentBuilder)er.a("function").requires($$0x -> $$0x.c(3))).then(er.a("name", gy.a()).suggests(amq.b).executes(new amc.a())))
      );
   }

   private static int a(eq $$0) throws CommandSyntaxException {
      MinecraftServer $$1 = $$0.l();
      if ($$1.bj()) {
         throw c.create();
      } else {
         $$1.bk();
         $$0.a(() -> wu.c("commands.debug.started"), true);
         return 0;
      }
   }

   private static int b(eq $$0) throws CommandSyntaxException {
      MinecraftServer $$1 = $$0.l();
      if (!$$1.bj()) {
         throw b.create();
      } else {
         bmt $$2 = $$1.bl();
         double $$3 = (double)$$2.g() / (double)azh.a;
         double $$4 = (double)$$2.f() / $$3;
         $$0.a(() -> wu.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3), $$2.f(), String.format(Locale.ROOT, "%.2f", $$4)), true);
         return (int)$$4;
      }
   }

   static class a extends hm.b<eq> implements hm.a<eq> {
      public void a(eq $$0, ContextChain<eq> $$1, hk $$2, hq<eq> $$3) throws CommandSyntaxException {
         if ($$2.c()) {
            throw amc.e.create();
         } else if ($$3.a() != null) {
            throw amc.d.create();
         } else {
            CommandContext<eq> $$4 = $$1.getTopContext();
            Collection<ic<eq>> $$5 = gy.a($$4, "name");
            MinecraftServer $$6 = $$0.l();
            String $$7 = "debug-trace-" + ac.f() + ".txt";
            CommandDispatcher<eq> $$8 = $$0.l().aG().a();
            int $$9 = 0;

            try {
               Path $$10 = $$6.c("debug").toPath();
               Files.createDirectories($$10);
               final PrintWriter $$11 = new PrintWriter(Files.newBufferedWriter($$10.resolve($$7), StandardCharsets.UTF_8));
               amc.b $$12 = new amc.b($$11);
               $$3.a($$12);

               for (final ic<eq> $$13 : $$5) {
                  try {
                     eq $$14 = $$0.a($$12).b(2);
                     ie<eq> $$15 = $$13.a(null, $$8);
                     $$3.a((new hw<eq>($$15, en.a, false) {
                        public void a(eq $$0, hp<eq> $$1, hr $$2) {
                           $$11.println($$13.a());
                           super.a($$0, $$1, $$2);
                        }
                     }).bind($$14));
                     $$9 += $$15.b().size();
                  } catch (et var18) {
                     $$0.b(var18.a());
                  }
               }
            } catch (IOException | UncheckedIOException var19) {
               amc.a.warn("Tracing failed", var19);
               $$0.b(wu.c("commands.debug.function.traceFailed"));
            }

            int $$18 = $$9;
            $$3.a(($$4x, $$5x) -> {
               if ($$5.size() == 1) {
                  $$0.a(() -> wu.a("commands.debug.function.success.single", $$18, wu.a($$5.iterator().next().a()), $$7), true);
               } else {
                  $$0.a(() -> wu.a("commands.debug.function.success.multiple", $$18, $$5.size(), $$7), true);
               }
            });
         }
      }
   }

   static class b implements ep, hs {
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
      public void a(int $$0, akk $$1, int $$2) {
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
      public void a(wu $$0) {
         this.e();
         this.b(this.d + 1);
         this.c.print("[M] ");
         this.c.println($$0.getString());
      }

      @Override
      public boolean l_() {
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
      public boolean m_() {
         return true;
      }

      @Override
      public void close() {
         IOUtils.closeQuietly(this.c);
      }
   }
}
