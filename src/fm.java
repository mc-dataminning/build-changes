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

public class fm implements gc<fm.a> {
   private static final Collection<String> a = Arrays.asList("Hello world!", "foo", "@e", "Hello @p :)");
   static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xh.b("argument.message.too_long", $$0, $$1));

   public static fm a() {
      return new fm();
   }

   public static xh a(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      fm.a $$2 = (fm.a)$$0.getArgument($$1, fm.a.class);
      return $$2.a((ev)$$0.getSource());
   }

   public static void a(CommandContext<ev> $$0, String $$1, Consumer<xx> $$2) throws CommandSyntaxException {
      fm.a $$3 = (fm.a)$$0.getArgument($$1, fm.a.class);
      ev $$4 = (ev)$$0.getSource();
      xh $$5 = $$3.a($$4);
      et $$6 = $$4.n();
      xx $$7 = $$6.a($$1);
      if ($$7 != null) {
         a($$2, $$4, $$7.a($$5));
      } else {
         b($$2, $$4, xx.a($$3.a).a($$5));
      }
   }

   private static void a(Consumer<xx> $$0, ev $$1, xx $$2) {
      MinecraftServer $$3 = $$1.l();
      CompletableFuture<asf> $$4 = a($$1, $$2);
      xh $$5 = $$3.bl().decorate($$1.i(), $$2.d());
      $$1.o().append($$4, $$3x -> {
         xx $$4x = $$2.a($$5).a($$3x.e());
         $$0.accept($$4x);
      });
   }

   private static void b(Consumer<xx> $$0, ev $$1, xx $$2) {
      xc $$3 = $$1.l().bl();
      xh $$4 = $$3.decorate($$1.i(), $$2.d());
      $$0.accept($$2.a($$4));
   }

   private static CompletableFuture<asf> a(ev $$0, xx $$1) {
      arn $$2 = $$0.i();
      return $$2 != null && $$1.a($$2.cH()) ? $$2.aa().a($$1.c()) : CompletableFuture.completedFuture(asf.a($$1.c()));
   }

   public fm.a a(StringReader $$0) throws CommandSyntaxException {
      return fm.a.a($$0, true);
   }

   public <S> fm.a a(StringReader $$0, @Nullable S $$1) throws CommandSyntaxException {
      return fm.a.a($$0, hl.a($$1));
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static record a(String a, fm.b[] b) {

      xh a(ev $$0) throws CommandSyntaxException {
         return this.a($$0, hl.a($$0));
      }

      public xh a(ev $$0, boolean $$1) throws CommandSyntaxException {
         if (this.b.length != 0 && $$1) {
            xv $$2 = xh.b(this.a.substring(0, this.b[0].a()));
            int $$3 = this.b[0].a();

            for (fm.b $$4 : this.b) {
               xh $$5 = $$4.a($$0);
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
            return xh.b(this.a);
         }
      }

      public static fm.a a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
         if ($$0.getRemainingLength() > 256) {
            throw fm.b.create($$0.getRemainingLength(), 256);
         } else {
            String $$2 = $$0.getRemaining();
            if (!$$1) {
               $$0.setCursor($$0.getTotalLength());
               return new fm.a($$2, new fm.b[0]);
            } else {
               List<fm.b> $$3 = Lists.newArrayList();
               int $$4 = $$0.getCursor();

               while (true) {
                  int $$5;
                  hk $$7;
                  while (true) {
                     if (!$$0.canRead()) {
                        return new fm.a($$2, $$3.toArray(new fm.b[0]));
                     }

                     if ($$0.peek() == '@') {
                        $$5 = $$0.getCursor();

                        try {
                           hl $$6 = new hl($$0, true);
                           $$7 = $$6.t();
                           break;
                        } catch (CommandSyntaxException var8) {
                           if (var8.getType() != hl.h && var8.getType() != hl.f) {
                              throw var8;
                           }

                           $$0.setCursor($$5 + 1);
                        }
                     } else {
                        $$0.skip();
                     }
                  }

                  $$3.add(new fm.b($$5 - $$4, $$0.getCursor() - $$4, $$7));
               }
            }
         }
      }
   }

   public static record b(int a, int b, hk c) {
      public xh a(ev $$0) throws CommandSyntaxException {
         return hk.a(this.c.b($$0));
      }
   }
}
