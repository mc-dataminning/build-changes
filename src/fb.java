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

public class fb implements fs<fb.a> {
   private static final Collection<String> a = Arrays.asList("Hello world!", "foo", "@e", "Hello @p :)");
   static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xg.b("argument.message.too_long", $$0, $$1));

   public static fb a() {
      return new fb();
   }

   public static xg a(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      fb.a $$2 = (fb.a)$$0.getArgument($$1, fb.a.class);
      return $$2.a((ek)$$0.getSource());
   }

   public static void a(CommandContext<ek> $$0, String $$1, Consumer<xw> $$2) throws CommandSyntaxException {
      fb.a $$3 = (fb.a)$$0.getArgument($$1, fb.a.class);
      ek $$4 = (ek)$$0.getSource();
      xg $$5 = $$3.a($$4);
      ei $$6 = $$4.n();
      xw $$7 = $$6.a($$1);
      if ($$7 != null) {
         a($$2, $$4, $$7.a($$5));
      } else {
         b($$2, $$4, xw.a($$3.a).a($$5));
      }
   }

   private static void a(Consumer<xw> $$0, ek $$1, xw $$2) {
      MinecraftServer $$3 = $$1.l();
      CompletableFuture<asu> $$4 = a($$1, $$2);
      xg $$5 = $$3.bk().decorate($$1.i(), $$2.d());
      $$1.o().append($$4, $$3x -> {
         xw $$4x = $$2.a($$5).a($$3x.e());
         $$0.accept($$4x);
      });
   }

   private static void b(Consumer<xw> $$0, ek $$1, xw $$2) {
      xb $$3 = $$1.l().bk();
      xg $$4 = $$3.decorate($$1.i(), $$2.d());
      $$0.accept($$2.a($$4));
   }

   private static CompletableFuture<asu> a(ek $$0, xw $$1) {
      asc $$2 = $$0.i();
      return $$2 != null && $$1.a($$2.cG()) ? $$2.W().a($$1.c()) : CompletableFuture.completedFuture(asu.a($$1.c()));
   }

   public fb.a a(StringReader $$0) throws CommandSyntaxException {
      return fb.a.a($$0, true);
   }

   public <S> fb.a a(StringReader $$0, @Nullable S $$1) throws CommandSyntaxException {
      return fb.a.a($$0, hb.a($$1));
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static record a(String a, fb.b[] b) {

      xg a(ek $$0) throws CommandSyntaxException {
         return this.a($$0, hb.a($$0));
      }

      public xg a(ek $$0, boolean $$1) throws CommandSyntaxException {
         if (this.b.length != 0 && $$1) {
            xu $$2 = xg.b(this.a.substring(0, this.b[0].a()));
            int $$3 = this.b[0].a();

            for (fb.b $$4 : this.b) {
               xg $$5 = $$4.a($$0);
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
            return xg.b(this.a);
         }
      }

      public static fb.a a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
         if ($$0.getRemainingLength() > 256) {
            throw fb.b.create($$0.getRemainingLength(), 256);
         } else {
            String $$2 = $$0.getRemaining();
            if (!$$1) {
               $$0.setCursor($$0.getTotalLength());
               return new fb.a($$2, new fb.b[0]);
            } else {
               List<fb.b> $$3 = Lists.newArrayList();
               int $$4 = $$0.getCursor();

               while (true) {
                  int $$5;
                  ha $$7;
                  while (true) {
                     if (!$$0.canRead()) {
                        return new fb.a($$2, $$3.toArray(new fb.b[0]));
                     }

                     if ($$0.peek() == '@') {
                        $$5 = $$0.getCursor();

                        try {
                           hb $$6 = new hb($$0, true);
                           $$7 = $$6.t();
                           break;
                        } catch (CommandSyntaxException var8) {
                           if (var8.getType() != hb.h && var8.getType() != hb.f) {
                              throw var8;
                           }

                           $$0.setCursor($$5 + 1);
                        }
                     } else {
                        $$0.skip();
                     }
                  }

                  $$3.add(new fb.b($$5 - $$4, $$0.getCursor() - $$4, $$7));
               }
            }
         }
      }
   }

   public static record b(int a, int b, ha c) {
      public xg a(ek $$0) throws CommandSyntaxException {
         return ha.a(this.c.b($$0));
      }
   }
}
