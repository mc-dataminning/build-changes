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

public class fl implements gb<fl.a> {
   private static final Collection<String> a = Arrays.asList("Hello world!", "foo", "@e", "Hello @p :)");
   static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("argument.message.too_long", $$0, $$1));

   public static fl a() {
      return new fl();
   }

   public static xe a(CommandContext<eu> $$0, String $$1) throws CommandSyntaxException {
      fl.a $$2 = (fl.a)$$0.getArgument($$1, fl.a.class);
      return $$2.a((eu)$$0.getSource());
   }

   public static void a(CommandContext<eu> $$0, String $$1, Consumer<xu> $$2) throws CommandSyntaxException {
      fl.a $$3 = (fl.a)$$0.getArgument($$1, fl.a.class);
      eu $$4 = (eu)$$0.getSource();
      xe $$5 = $$3.a($$4);
      es $$6 = $$4.n();
      xu $$7 = $$6.a($$1);
      if ($$7 != null) {
         a($$2, $$4, $$7.a($$5));
      } else {
         b($$2, $$4, xu.a($$3.a).a($$5));
      }
   }

   private static void a(Consumer<xu> $$0, eu $$1, xu $$2) {
      MinecraftServer $$3 = $$1.l();
      CompletableFuture<asb> $$4 = a($$1, $$2);
      xe $$5 = $$3.bl().decorate($$1.i(), $$2.d());
      $$1.o().append($$4, $$3x -> {
         xu $$4x = $$2.a($$5).a($$3x.e());
         $$0.accept($$4x);
      });
   }

   private static void b(Consumer<xu> $$0, eu $$1, xu $$2) {
      wz $$3 = $$1.l().bl();
      xe $$4 = $$3.decorate($$1.i(), $$2.d());
      $$0.accept($$2.a($$4));
   }

   private static CompletableFuture<asb> a(eu $$0, xu $$1) {
      ark $$2 = $$0.i();
      return $$2 != null && $$1.a($$2.cD()) ? $$2.aa().a($$1.c()) : CompletableFuture.completedFuture(asb.a($$1.c()));
   }

   public fl.a a(StringReader $$0) throws CommandSyntaxException {
      return fl.a.a($$0, true);
   }

   public <S> fl.a a(StringReader $$0, @Nullable S $$1) throws CommandSyntaxException {
      return fl.a.a($$0, hk.a($$1));
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static record a(String a, fl.b[] b) {

      xe a(eu $$0) throws CommandSyntaxException {
         return this.a($$0, hk.a($$0));
      }

      public xe a(eu $$0, boolean $$1) throws CommandSyntaxException {
         if (this.b.length != 0 && $$1) {
            xs $$2 = xe.b(this.a.substring(0, this.b[0].a()));
            int $$3 = this.b[0].a();

            for (fl.b $$4 : this.b) {
               xe $$5 = $$4.a($$0);
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
            return xe.b(this.a);
         }
      }

      public static fl.a a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
         if ($$0.getRemainingLength() > 256) {
            throw fl.b.create($$0.getRemainingLength(), 256);
         } else {
            String $$2 = $$0.getRemaining();
            if (!$$1) {
               $$0.setCursor($$0.getTotalLength());
               return new fl.a($$2, new fl.b[0]);
            } else {
               List<fl.b> $$3 = Lists.newArrayList();
               int $$4 = $$0.getCursor();

               while (true) {
                  int $$5;
                  hj $$7;
                  while (true) {
                     if (!$$0.canRead()) {
                        return new fl.a($$2, $$3.toArray(new fl.b[0]));
                     }

                     if ($$0.peek() == '@') {
                        $$5 = $$0.getCursor();

                        try {
                           hk $$6 = new hk($$0, true);
                           $$7 = $$6.t();
                           break;
                        } catch (CommandSyntaxException var8) {
                           if (var8.getType() != hk.h && var8.getType() != hk.f) {
                              throw var8;
                           }

                           $$0.setCursor($$5 + 1);
                        }
                     } else {
                        $$0.skip();
                     }
                  }

                  $$3.add(new fl.b($$5 - $$4, $$0.getCursor() - $$4, $$7));
               }
            }
         }
      }
   }

   public static record b(int a, int b, hj c) {
      public xe a(eu $$0) throws CommandSyntaxException {
         return hj.a(this.c.b($$0));
      }
   }
}
