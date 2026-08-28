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

public class ez implements fq<ez.a> {
   private static final Collection<String> a = Arrays.asList("Hello world!", "foo", "@e", "Hello @p :)");
   static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> ww.b("argument.message.too_long", $$0, $$1));

   public static ez a() {
      return new ez();
   }

   public static ww a(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      ez.a $$2 = (ez.a)$$0.getArgument($$1, ez.a.class);
      return $$2.a((ei)$$0.getSource());
   }

   public static void a(CommandContext<ei> $$0, String $$1, Consumer<xm> $$2) throws CommandSyntaxException {
      ez.a $$3 = (ez.a)$$0.getArgument($$1, ez.a.class);
      ei $$4 = (ei)$$0.getSource();
      ww $$5 = $$3.a($$4);
      eg $$6 = $$4.n();
      xm $$7 = $$6.a($$1);
      if ($$7 != null) {
         a($$2, $$4, $$7.a($$5));
      } else {
         b($$2, $$4, xm.a($$3.a).a($$5));
      }
   }

   private static void a(Consumer<xm> $$0, ei $$1, xm $$2) {
      MinecraftServer $$3 = $$1.l();
      CompletableFuture<ash> $$4 = a($$1, $$2);
      ww $$5 = $$3.bk().decorate($$1.i(), $$2.d());
      $$1.o().append($$4, $$3x -> {
         xm $$4x = $$2.a($$5).a($$3x.e());
         $$0.accept($$4x);
      });
   }

   private static void b(Consumer<xm> $$0, ei $$1, xm $$2) {
      wr $$3 = $$1.l().bk();
      ww $$4 = $$3.decorate($$1.i(), $$2.d());
      $$0.accept($$2.a($$4));
   }

   private static CompletableFuture<ash> a(ei $$0, xm $$1) {
      arp $$2 = $$0.i();
      return $$2 != null && $$1.a($$2.cG()) ? $$2.Z().a($$1.c()) : CompletableFuture.completedFuture(ash.a($$1.c()));
   }

   public ez.a a(StringReader $$0) throws CommandSyntaxException {
      return ez.a.a($$0, true);
   }

   public <S> ez.a a(StringReader $$0, @Nullable S $$1) throws CommandSyntaxException {
      return ez.a.a($$0, gz.a($$1));
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static record a(String a, ez.b[] b) {

      ww a(ei $$0) throws CommandSyntaxException {
         return this.a($$0, gz.a($$0));
      }

      public ww a(ei $$0, boolean $$1) throws CommandSyntaxException {
         if (this.b.length != 0 && $$1) {
            xk $$2 = ww.b(this.a.substring(0, this.b[0].a()));
            int $$3 = this.b[0].a();

            for (ez.b $$4 : this.b) {
               ww $$5 = $$4.a($$0);
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
            return ww.b(this.a);
         }
      }

      public static ez.a a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
         if ($$0.getRemainingLength() > 256) {
            throw ez.b.create($$0.getRemainingLength(), 256);
         } else {
            String $$2 = $$0.getRemaining();
            if (!$$1) {
               $$0.setCursor($$0.getTotalLength());
               return new ez.a($$2, new ez.b[0]);
            } else {
               List<ez.b> $$3 = Lists.newArrayList();
               int $$4 = $$0.getCursor();

               while (true) {
                  int $$5;
                  gy $$7;
                  while (true) {
                     if (!$$0.canRead()) {
                        return new ez.a($$2, $$3.toArray(new ez.b[0]));
                     }

                     if ($$0.peek() == '@') {
                        $$5 = $$0.getCursor();

                        try {
                           gz $$6 = new gz($$0, true);
                           $$7 = $$6.t();
                           break;
                        } catch (CommandSyntaxException var8) {
                           if (var8.getType() != gz.h && var8.getType() != gz.f) {
                              throw var8;
                           }

                           $$0.setCursor($$5 + 1);
                        }
                     } else {
                        $$0.skip();
                     }
                  }

                  $$3.add(new ez.b($$5 - $$4, $$0.getCursor() - $$4, $$7));
               }
            }
         }
      }
   }

   public static record b(int a, int b, gy c) {
      public ww a(ei $$0) throws CommandSyntaxException {
         return gy.a(this.c.b($$0));
      }
   }
}
