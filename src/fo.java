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

public class fo implements ge<fo.a> {
   private static final Collection<String> a = Arrays.asList("Hello world!", "foo", "@e", "Hello @p :)");
   static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> wp.b("argument.message.too_long", $$0, $$1));

   public static fo a() {
      return new fo();
   }

   public static wp a(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      fo.a $$2 = (fo.a)$$0.getArgument($$1, fo.a.class);
      return $$2.a((ex)$$0.getSource());
   }

   public static void a(CommandContext<ex> $$0, String $$1, Consumer<xf> $$2) throws CommandSyntaxException {
      fo.a $$3 = (fo.a)$$0.getArgument($$1, fo.a.class);
      ex $$4 = (ex)$$0.getSource();
      wp $$5 = $$3.a($$4);
      ev $$6 = $$4.n();
      xf $$7 = $$6.a($$1);
      if ($$7 != null) {
         a($$2, $$4, $$7.a($$5));
      } else {
         b($$2, $$4, xf.a($$3.a).a($$5));
      }
   }

   private static void a(Consumer<xf> $$0, ex $$1, xf $$2) {
      MinecraftServer $$3 = $$1.l();
      CompletableFuture<arw> $$4 = a($$1, $$2);
      wp $$5 = $$3.bk().decorate($$1.i(), $$2.d());
      $$1.o().append($$4, $$3x -> {
         xf $$4x = $$2.a($$5).a($$3x.e());
         $$0.accept($$4x);
      });
   }

   private static void b(Consumer<xf> $$0, ex $$1, xf $$2) {
      wk $$3 = $$1.l().bk();
      wp $$4 = $$3.decorate($$1.i(), $$2.d());
      $$0.accept($$2.a($$4));
   }

   private static CompletableFuture<arw> a(ex $$0, xf $$1) {
      are $$2 = $$0.i();
      return $$2 != null && $$1.a($$2.cG()) ? $$2.Z().a($$1.c()) : CompletableFuture.completedFuture(arw.a($$1.c()));
   }

   public fo.a a(StringReader $$0) throws CommandSyntaxException {
      return fo.a.a($$0, true);
   }

   public <S> fo.a a(StringReader $$0, @Nullable S $$1) throws CommandSyntaxException {
      return fo.a.a($$0, hn.a($$1));
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static record a(String a, fo.b[] b) {

      wp a(ex $$0) throws CommandSyntaxException {
         return this.a($$0, hn.a($$0));
      }

      public wp a(ex $$0, boolean $$1) throws CommandSyntaxException {
         if (this.b.length != 0 && $$1) {
            xd $$2 = wp.b(this.a.substring(0, this.b[0].a()));
            int $$3 = this.b[0].a();

            for (fo.b $$4 : this.b) {
               wp $$5 = $$4.a($$0);
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
            return wp.b(this.a);
         }
      }

      public static fo.a a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
         if ($$0.getRemainingLength() > 256) {
            throw fo.b.create($$0.getRemainingLength(), 256);
         } else {
            String $$2 = $$0.getRemaining();
            if (!$$1) {
               $$0.setCursor($$0.getTotalLength());
               return new fo.a($$2, new fo.b[0]);
            } else {
               List<fo.b> $$3 = Lists.newArrayList();
               int $$4 = $$0.getCursor();

               while (true) {
                  int $$5;
                  hm $$7;
                  while (true) {
                     if (!$$0.canRead()) {
                        return new fo.a($$2, $$3.toArray(new fo.b[0]));
                     }

                     if ($$0.peek() == '@') {
                        $$5 = $$0.getCursor();

                        try {
                           hn $$6 = new hn($$0, true);
                           $$7 = $$6.t();
                           break;
                        } catch (CommandSyntaxException var8) {
                           if (var8.getType() != hn.h && var8.getType() != hn.f) {
                              throw var8;
                           }

                           $$0.setCursor($$5 + 1);
                        }
                     } else {
                        $$0.skip();
                     }
                  }

                  $$3.add(new fo.b($$5 - $$4, $$0.getCursor() - $$4, $$7));
               }
            }
         }
      }
   }

   public static record b(int a, int b, hm c) {
      public wp a(ex $$0) throws CommandSyntaxException {
         return hm.a(this.c.b($$0));
      }
   }
}
