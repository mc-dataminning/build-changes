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

public class fk implements ga<fk.a> {
   private static final Collection<String> a = Arrays.asList("Hello world!", "foo", "@e", "Hello @p :)");
   static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> wy.b("argument.message.too_long", $$0, $$1));

   public static fk a() {
      return new fk();
   }

   public static wy a(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      fk.a $$2 = (fk.a)$$0.getArgument($$1, fk.a.class);
      return $$2.a((et)$$0.getSource());
   }

   public static void a(CommandContext<et> $$0, String $$1, Consumer<xo> $$2) throws CommandSyntaxException {
      fk.a $$3 = (fk.a)$$0.getArgument($$1, fk.a.class);
      et $$4 = (et)$$0.getSource();
      wy $$5 = $$3.a($$4);
      er $$6 = $$4.n();
      xo $$7 = $$6.a($$1);
      if ($$7 != null) {
         a($$2, $$4, $$7.a($$5));
      } else {
         b($$2, $$4, xo.a($$3.a).a($$5));
      }
   }

   private static void a(Consumer<xo> $$0, et $$1, xo $$2) {
      MinecraftServer $$3 = $$1.l();
      CompletableFuture<arl> $$4 = a($$1, $$2);
      wy $$5 = $$3.bm().decorate($$1.i(), $$2.d());
      $$1.o().append($$4, $$3x -> {
         xo $$4x = $$2.a($$5).a($$3x.e());
         $$0.accept($$4x);
      });
   }

   private static void b(Consumer<xo> $$0, et $$1, xo $$2) {
      wt $$3 = $$1.l().bm();
      wy $$4 = $$3.decorate($$1.i(), $$2.d());
      $$0.accept($$2.a($$4));
   }

   private static CompletableFuture<arl> a(et $$0, xo $$1) {
      aqu $$2 = $$0.i();
      return $$2 != null && $$1.a($$2.cA()) ? $$2.Y().a($$1.c()) : CompletableFuture.completedFuture(arl.a($$1.c()));
   }

   public fk.a a(StringReader $$0) throws CommandSyntaxException {
      return fk.a.a($$0, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static record a(String a, fk.b[] b) {

      wy a(et $$0) throws CommandSyntaxException {
         return this.a($$0, $$0.c(2));
      }

      public wy a(et $$0, boolean $$1) throws CommandSyntaxException {
         if (this.b.length != 0 && $$1) {
            xm $$2 = wy.b(this.a.substring(0, this.b[0].a()));
            int $$3 = this.b[0].a();

            for (fk.b $$4 : this.b) {
               wy $$5 = $$4.a($$0);
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
            return wy.b(this.a);
         }
      }

      public static fk.a a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
         if ($$0.getRemainingLength() > 256) {
            throw fk.b.create($$0.getRemainingLength(), 256);
         } else {
            String $$2 = $$0.getRemaining();
            if (!$$1) {
               $$0.setCursor($$0.getTotalLength());
               return new fk.a($$2, new fk.b[0]);
            } else {
               List<fk.b> $$3 = Lists.newArrayList();
               int $$4 = $$0.getCursor();

               while (true) {
                  int $$5;
                  hi $$7;
                  while (true) {
                     if (!$$0.canRead()) {
                        return new fk.a($$2, $$3.toArray(new fk.b[0]));
                     }

                     if ($$0.peek() == '@') {
                        $$5 = $$0.getCursor();

                        try {
                           hj $$6 = new hj($$0);
                           $$7 = $$6.t();
                           break;
                        } catch (CommandSyntaxException var8) {
                           if (var8.getType() != hj.h && var8.getType() != hj.f) {
                              throw var8;
                           }

                           $$0.setCursor($$5 + 1);
                        }
                     } else {
                        $$0.skip();
                     }
                  }

                  $$3.add(new fk.b($$5 - $$4, $$0.getCursor() - $$4, $$7));
               }
            }
         }
      }
   }

   public static record b(int a, int b, hi c) {
      public wy a(et $$0) throws CommandSyntaxException {
         return hi.a(this.c.b($$0));
      }
   }
}
