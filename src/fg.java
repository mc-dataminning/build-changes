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

public class fg implements fw<fg.a> {
   private static final Collection<String> a = Arrays.asList("Hello world!", "foo", "@e", "Hello @p :)");
   static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xo.b("argument.message.too_long", $$0, $$1));

   public static fg a() {
      return new fg();
   }

   public static xo a(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      fg.a $$2 = (fg.a)$$0.getArgument($$1, fg.a.class);
      return $$2.a((ep)$$0.getSource());
   }

   public static void a(CommandContext<ep> $$0, String $$1, Consumer<ye> $$2) throws CommandSyntaxException {
      fg.a $$3 = (fg.a)$$0.getArgument($$1, fg.a.class);
      ep $$4 = (ep)$$0.getSource();
      xo $$5 = $$3.a($$4);
      en $$6 = $$4.n();
      ye $$7 = $$6.a($$1);
      if ($$7 != null) {
         a($$2, $$4, $$7.a($$5));
      } else {
         b($$2, $$4, ye.a($$3.a).a($$5));
      }
   }

   private static void a(Consumer<ye> $$0, ep $$1, ye $$2) {
      MinecraftServer $$3 = $$1.l();
      CompletableFuture<arw> $$4 = a($$1, $$2);
      xo $$5 = $$3.bm().decorate($$1.i(), $$2.d());
      $$1.o().append($$4, $$3x -> {
         ye $$4x = $$2.a($$5).a($$3x.e());
         $$0.accept($$4x);
      });
   }

   private static void b(Consumer<ye> $$0, ep $$1, ye $$2) {
      xj $$3 = $$1.l().bm();
      xo $$4 = $$3.decorate($$1.i(), $$2.d());
      $$0.accept($$2.a($$4));
   }

   private static CompletableFuture<arw> a(ep $$0, ye $$1) {
      arf $$2 = $$0.i();
      return $$2 != null && $$1.a($$2.cz()) ? $$2.X().a($$1.c()) : CompletableFuture.completedFuture(arw.a($$1.c()));
   }

   public fg.a a(StringReader $$0) throws CommandSyntaxException {
      return fg.a.a($$0, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static record a(String a, fg.b[] b) {

      xo a(ep $$0) throws CommandSyntaxException {
         return this.a($$0, $$0.c(2));
      }

      public xo a(ep $$0, boolean $$1) throws CommandSyntaxException {
         if (this.b.length != 0 && $$1) {
            yc $$2 = xo.b(this.a.substring(0, this.b[0].a()));
            int $$3 = this.b[0].a();

            for (fg.b $$4 : this.b) {
               xo $$5 = $$4.a($$0);
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
            return xo.b(this.a);
         }
      }

      public static fg.a a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
         if ($$0.getRemainingLength() > 256) {
            throw fg.b.create($$0.getRemainingLength(), 256);
         } else {
            String $$2 = $$0.getRemaining();
            if (!$$1) {
               $$0.setCursor($$0.getTotalLength());
               return new fg.a($$2, new fg.b[0]);
            } else {
               List<fg.b> $$3 = Lists.newArrayList();
               int $$4 = $$0.getCursor();

               while (true) {
                  int $$5;
                  he $$7;
                  while (true) {
                     if (!$$0.canRead()) {
                        return new fg.a($$2, $$3.toArray(new fg.b[0]));
                     }

                     if ($$0.peek() == '@') {
                        $$5 = $$0.getCursor();

                        try {
                           hf $$6 = new hf($$0);
                           $$7 = $$6.t();
                           break;
                        } catch (CommandSyntaxException var8) {
                           if (var8.getType() != hf.h && var8.getType() != hf.f) {
                              throw var8;
                           }

                           $$0.setCursor($$5 + 1);
                        }
                     } else {
                        $$0.skip();
                     }
                  }

                  $$3.add(new fg.b($$5 - $$4, $$0.getCursor() - $$4, $$7));
               }
            }
         }
      }
   }

   public static record b(int a, int b, he c) {
      public xo a(ep $$0) throws CommandSyntaxException {
         return he.a(this.c.b($$0));
      }
   }
}
