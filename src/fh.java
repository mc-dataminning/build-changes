import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class fh implements fx<fh.a> {
   private static final Collection<String> a = Arrays.asList("Hello world!", "foo", "@e", "Hello @p :)");
   static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> wu.b("argument.message.too_long", $$0, $$1));

   public static fh a() {
      return new fh();
   }

   public static wu a(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      fh.a $$2 = (fh.a)$$0.getArgument($$1, fh.a.class);
      return $$2.a((eq)$$0.getSource());
   }

   public static void a(CommandContext<eq> $$0, String $$1, Consumer<xk> $$2) throws CommandSyntaxException {
      fh.a $$3 = (fh.a)$$0.getArgument($$1, fh.a.class);
      eq $$4 = (eq)$$0.getSource();
      wu $$5 = $$3.a($$4);
      eo $$6 = $$4.n();
      xk $$7 = $$6.a($$1);
      if ($$7 != null) {
         a($$2, $$4, $$7.a($$5));
      } else {
         b($$2, $$4, xk.a($$3.a).a($$5));
      }
   }

   private static void a(Consumer<xk> $$0, eq $$1, xk $$2) {
      MinecraftServer $$3 = $$1.l();
      CompletableFuture<are> $$4 = a($$1, $$2);
      wu $$5 = $$3.bn().decorate($$1.i(), $$2.d());
      $$1.o().append($$4, $$3x -> {
         xk $$4x = $$2.a($$5).a($$3x.e());
         $$0.accept($$4x);
      });
   }

   private static void b(Consumer<xk> $$0, eq $$1, xk $$2) {
      wp $$3 = $$1.l().bn();
      wu $$4 = $$3.decorate($$1.i(), $$2.d());
      $$0.accept($$2.a($$4));
   }

   private static CompletableFuture<are> a(eq $$0, xk $$1) {
      aqn $$2 = $$0.i();
      return $$2 != null && $$1.a($$2.cA()) ? $$2.X().a($$1.c()) : CompletableFuture.completedFuture(are.a($$1.c()));
   }

   public fh.a a(StringReader $$0) throws CommandSyntaxException {
      return fh.a.a($$0, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static record a(String a, fh.b[] b) {

      wu a(eq $$0) throws CommandSyntaxException {
         return this.a($$0, $$0.c(2));
      }

      public wu a(eq $$0, boolean $$1) throws CommandSyntaxException {
         if (this.b.length != 0 && $$1) {
            xi $$2 = wu.b(this.a.substring(0, this.b[0].a()));
            int $$3 = this.b[0].a();

            for (fh.b $$4 : this.b) {
               wu $$5 = $$4.a($$0);
               if ($$3 < $$4.a()) {
                  $$2.f(this.a.substring($$3, $$4.a()));
               }

               $$2.b($$5);
               $$3 = $$4.b();
            }

            if ($$3 < this.a.length()) {
               $$2.f(this.a.substring($$3));
            }

            return $$2;
         } else {
            return wu.b(this.a);
         }
      }

      public static fh.a a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
         if ($$0.getRemainingLength() > 256) {
            throw fh.b.create($$0.getRemainingLength(), 256);
         } else {
            String $$2 = $$0.getRemaining();
            if (!$$1) {
               $$0.setCursor($$0.getTotalLength());
               return new fh.a($$2, new fh.b[0]);
            } else {
               List<fh.b> $$3 = Lists.newArrayList();
               int $$4 = $$0.getCursor();

               while (true) {
                  int $$5;
                  hf $$7;
                  while (true) {
                     if (!$$0.canRead()) {
                        return new fh.a($$2, $$3.toArray(new fh.b[0]));
                     }

                     if ($$0.peek() == '@') {
                        $$5 = $$0.getCursor();

                        try {
                           hg $$6 = new hg($$0);
                           $$7 = $$6.t();
                           break;
                        } catch (CommandSyntaxException var8) {
                           if (var8.getType() != hg.h && var8.getType() != hg.f) {
                              throw var8;
                           }

                           $$0.setCursor($$5 + 1);
                        }
                     } else {
                        $$0.skip();
                     }
                  }

                  $$3.add(new fh.b($$5 - $$4, $$0.getCursor() - $$4, $$7));
               }
            }
         }
      }
   }

   public static record b(int a, int b, hf c) {
      public wu a(eq $$0) throws CommandSyntaxException {
         return hf.a(this.c.b($$0));
      }
   }
}
