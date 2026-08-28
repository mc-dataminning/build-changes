import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class fg implements fw<fg.a> {
   private static final Collection<String> a = Arrays.asList("Hello world!", "foo", "@e", "Hello @p :)");

   public static fg a() {
      return new fg();
   }

   public static xl a(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      fg.a $$2 = (fg.a)$$0.getArgument($$1, fg.a.class);
      return $$2.a((ep)$$0.getSource());
   }

   public static void a(CommandContext<ep> $$0, String $$1, Consumer<yb> $$2) throws CommandSyntaxException {
      fg.a $$3 = (fg.a)$$0.getArgument($$1, fg.a.class);
      ep $$4 = (ep)$$0.getSource();
      xl $$5 = $$3.a($$4);
      en $$6 = $$4.n();
      yb $$7 = $$6.a($$1);
      if ($$7 != null) {
         a($$2, $$4, $$7.a($$5));
      } else {
         b($$2, $$4, yb.a($$3.a).a($$5));
      }
   }

   private static void a(Consumer<yb> $$0, ep $$1, yb $$2) {
      MinecraftServer $$3 = $$1.l();
      CompletableFuture<art> $$4 = a($$1, $$2);
      xl $$5 = $$3.bm().decorate($$1.i(), $$2.d());
      $$1.o().append($$4, $$3x -> {
         yb $$4x = $$2.a($$5).a($$3x.e());
         $$0.accept($$4x);
      });
   }

   private static void b(Consumer<yb> $$0, ep $$1, yb $$2) {
      xg $$3 = $$1.l().bm();
      xl $$4 = $$3.decorate($$1.i(), $$2.d());
      $$0.accept($$2.a($$4));
   }

   private static CompletableFuture<art> a(ep $$0, yb $$1) {
      arc $$2 = $$0.i();
      return $$2 != null && $$1.a($$2.cz()) ? $$2.X().a($$1.c()) : CompletableFuture.completedFuture(art.a($$1.c()));
   }

   public fg.a a(StringReader $$0) throws CommandSyntaxException {
      return fg.a.a($$0, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a {
      final String a;
      private final fg.b[] b;

      public a(String $$0, fg.b[] $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public String a() {
         return this.a;
      }

      public fg.b[] b() {
         return this.b;
      }

      xl a(ep $$0) throws CommandSyntaxException {
         return this.a($$0, $$0.c(2));
      }

      public xl a(ep $$0, boolean $$1) throws CommandSyntaxException {
         if (this.b.length != 0 && $$1) {
            xz $$2 = xl.b(this.a.substring(0, this.b[0].a()));
            int $$3 = this.b[0].a();

            for (fg.b $$4 : this.b) {
               xl $$5 = $$4.a($$0);
               if ($$3 < $$4.a()) {
                  $$2.f(this.a.substring($$3, $$4.a()));
               }

               if ($$5 != null) {
                  $$2.b($$5);
               }

               $$3 = $$4.b();
            }

            if ($$3 < this.a.length()) {
               $$2.f(this.a.substring($$3));
            }

            return $$2;
         } else {
            return xl.b(this.a);
         }
      }

      public static fg.a a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
         String $$2 = $$0.getString().substring($$0.getCursor(), $$0.getTotalLength());
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

   public static class b {
      private final int a;
      private final int b;
      private final he c;

      public b(int $$0, int $$1, he $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public int a() {
         return this.a;
      }

      public int b() {
         return this.b;
      }

      public he c() {
         return this.c;
      }

      @Nullable
      public xl a(ep $$0) throws CommandSyntaxException {
         return he.a(this.c.b($$0));
      }
   }
}
