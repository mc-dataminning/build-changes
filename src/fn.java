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

public class fn implements gd<fn.a> {
   private static final Collection<String> a = Arrays.asList("Hello world!", "foo", "@e", "Hello @p :)");
   static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xk.b("argument.message.too_long", $$0, $$1));

   public static fn a() {
      return new fn();
   }

   public static xk a(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      fn.a $$2 = (fn.a)$$0.getArgument($$1, fn.a.class);
      return $$2.a((ew)$$0.getSource());
   }

   public static void a(CommandContext<ew> $$0, String $$1, Consumer<ya> $$2) throws CommandSyntaxException {
      fn.a $$3 = (fn.a)$$0.getArgument($$1, fn.a.class);
      ew $$4 = (ew)$$0.getSource();
      xk $$5 = $$3.a($$4);
      eu $$6 = $$4.n();
      ya $$7 = $$6.a($$1);
      if ($$7 != null) {
         a($$2, $$4, $$7.a($$5));
      } else {
         b($$2, $$4, ya.a($$3.a).a($$5));
      }
   }

   private static void a(Consumer<ya> $$0, ew $$1, ya $$2) {
      MinecraftServer $$3 = $$1.l();
      CompletableFuture<asq> $$4 = a($$1, $$2);
      xk $$5 = $$3.bk().decorate($$1.i(), $$2.d());
      $$1.o().append($$4, $$3x -> {
         ya $$4x = $$2.a($$5).a($$3x.e());
         $$0.accept($$4x);
      });
   }

   private static void b(Consumer<ya> $$0, ew $$1, ya $$2) {
      xf $$3 = $$1.l().bk();
      xk $$4 = $$3.decorate($$1.i(), $$2.d());
      $$0.accept($$2.a($$4));
   }

   private static CompletableFuture<asq> a(ew $$0, ya $$1) {
      ary $$2 = $$0.i();
      return $$2 != null && $$1.a($$2.cG()) ? $$2.Z().a($$1.c()) : CompletableFuture.completedFuture(asq.a($$1.c()));
   }

   public fn.a a(StringReader $$0) throws CommandSyntaxException {
      return fn.a.a($$0, true);
   }

   public <S> fn.a a(StringReader $$0, @Nullable S $$1) throws CommandSyntaxException {
      return fn.a.a($$0, hm.a($$1));
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static record a(String a, fn.b[] b) {

      xk a(ew $$0) throws CommandSyntaxException {
         return this.a($$0, hm.a($$0));
      }

      public xk a(ew $$0, boolean $$1) throws CommandSyntaxException {
         if (this.b.length != 0 && $$1) {
            xy $$2 = xk.b(this.a.substring(0, this.b[0].a()));
            int $$3 = this.b[0].a();

            for (fn.b $$4 : this.b) {
               xk $$5 = $$4.a($$0);
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
            return xk.b(this.a);
         }
      }

      public static fn.a a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
         if ($$0.getRemainingLength() > 256) {
            throw fn.b.create($$0.getRemainingLength(), 256);
         } else {
            String $$2 = $$0.getRemaining();
            if (!$$1) {
               $$0.setCursor($$0.getTotalLength());
               return new fn.a($$2, new fn.b[0]);
            } else {
               List<fn.b> $$3 = Lists.newArrayList();
               int $$4 = $$0.getCursor();

               while (true) {
                  int $$5;
                  hl $$7;
                  while (true) {
                     if (!$$0.canRead()) {
                        return new fn.a($$2, $$3.toArray(new fn.b[0]));
                     }

                     if ($$0.peek() == '@') {
                        $$5 = $$0.getCursor();

                        try {
                           hm $$6 = new hm($$0, true);
                           $$7 = $$6.t();
                           break;
                        } catch (CommandSyntaxException var8) {
                           if (var8.getType() != hm.h && var8.getType() != hm.f) {
                              throw var8;
                           }

                           $$0.setCursor($$5 + 1);
                        }
                     } else {
                        $$0.skip();
                     }
                  }

                  $$3.add(new fn.b($$5 - $$4, $$0.getCursor() - $$4, $$7));
               }
            }
         }
      }
   }

   public static record b(int a, int b, hl c) {
      public xk a(ew $$0) throws CommandSyntaxException {
         return hl.a(this.c.b($$0));
      }
   }
}
