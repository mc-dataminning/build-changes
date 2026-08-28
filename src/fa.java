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
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class fa implements fr<fa.a> {
   private static final Collection<String> a = Arrays.asList("Hello world!", "foo", "@e", "Hello @p :)");
   static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xa.b("argument.message.too_long", $$0, $$1));

   public static fa a() {
      return new fa();
   }

   public static xa a(CommandContext<ej> $$0, String $$1) throws CommandSyntaxException {
      fa.a $$2 = (fa.a)$$0.getArgument($$1, fa.a.class);
      return $$2.a((ej)$$0.getSource());
   }

   public static void a(CommandContext<ej> $$0, String $$1, Consumer<xq> $$2) throws CommandSyntaxException {
      fa.a $$3 = (fa.a)$$0.getArgument($$1, fa.a.class);
      ej $$4 = (ej)$$0.getSource();
      xa $$5 = $$3.a($$4);
      eh $$6 = $$4.n();
      xq $$7 = $$6.a($$1);
      if ($$7 != null) {
         a($$2, $$4, $$7.a($$5));
      } else {
         b($$2, $$4, xq.a($$3.a).a($$5));
      }
   }

   private static void a(Consumer<xq> $$0, ej $$1, xq $$2) {
      MinecraftServer $$3 = $$1.l();
      CompletableFuture<asl> $$4 = a($$1, $$2);
      xa $$5 = $$3.bk().decorate($$1.i(), $$2.d());
      $$1.o().append($$4, $$3x -> {
         xq $$4x = $$2.a($$5).a($$3x.e());
         $$0.accept($$4x);
      });
   }

   private static void b(Consumer<xq> $$0, ej $$1, xq $$2) {
      wv $$3 = $$1.l().bk();
      xa $$4 = $$3.decorate($$1.i(), $$2.d());
      $$0.accept($$2.a($$4));
   }

   private static CompletableFuture<asl> a(ej $$0, xq $$1) {
      art $$2 = $$0.i();
      return $$2 != null && $$1.a($$2.cG()) ? $$2.W().a($$1.c()) : CompletableFuture.completedFuture(asl.a($$1.c()));
   }

   public fa.a a(StringReader $$0) throws CommandSyntaxException {
      return fa.a.a($$0, true);
   }

   public <S> fa.a a(StringReader $$0, @Nullable S $$1) throws CommandSyntaxException {
      return fa.a.a($$0, ha.a($$1));
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static record a(String a, fa.b[] b) {

      xa a(ej $$0) throws CommandSyntaxException {
         return this.a($$0, ha.a($$0));
      }

      public xa a(ej $$0, boolean $$1) throws CommandSyntaxException {
         if (this.b.length != 0 && $$1) {
            xo $$2 = xa.b(this.a.substring(0, this.b[0].a()));
            int $$3 = this.b[0].a();

            for (fa.b $$4 : this.b) {
               xa $$5 = $$4.a($$0);
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
            return xa.b(this.a);
         }
      }

      public static fa.a a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
         if ($$0.getRemainingLength() > 256) {
            throw fa.b.create($$0.getRemainingLength(), 256);
         } else {
            String $$2 = $$0.getRemaining();
            if (!$$1) {
               $$0.setCursor($$0.getTotalLength());
               return new fa.a($$2, new fa.b[0]);
            } else {
               List<fa.b> $$3 = Lists.newArrayList();
               int $$4 = $$0.getCursor();

               while (true) {
                  int $$5;
                  gz $$7;
                  while (true) {
                     if (!$$0.canRead()) {
                        return new fa.a($$2, $$3.toArray(new fa.b[0]));
                     }

                     if ($$0.peek() == '@') {
                        $$5 = $$0.getCursor();

                        try {
                           ha $$6 = new ha($$0, true);
                           $$7 = $$6.t();
                           break;
                        } catch (CommandSyntaxException var8) {
                           if (var8.getType() != ha.h && var8.getType() != ha.f) {
                              throw var8;
                           }

                           $$0.setCursor($$5 + 1);
                        }
                     } else {
                        $$0.skip();
                     }
                  }

                  $$3.add(new fa.b($$5 - $$4, $$0.getCursor() - $$4, $$7));
               }
            }
         }
      }
   }

   public static record b(int a, int b, gz c) {
      public xa a(ej $$0) throws CommandSyntaxException {
         return gz.a(this.c.b($$0));
      }
   }
}
