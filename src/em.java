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

public class em implements fb<em.a> {
   private static final Collection<String> a = Arrays.asList("Hello world!", "foo", "@e", "Hello @p :)");

   public static em a() {
      return new em();
   }

   public static wi a(CommandContext<dv> $$0, String $$1) throws CommandSyntaxException {
      em.a $$2 = (em.a)$$0.getArgument($$1, em.a.class);
      return $$2.a((dv)$$0.getSource());
   }

   public static void a(CommandContext<dv> $$0, String $$1, Consumer<wy> $$2) throws CommandSyntaxException {
      em.a $$3 = (em.a)$$0.getArgument($$1, em.a.class);
      dv $$4 = (dv)$$0.getSource();
      wi $$5 = $$3.a($$4);
      dt $$6 = $$4.n();
      wy $$7 = $$6.a($$1);
      if ($$7 != null) {
         a($$2, $$4, $$7.a($$5));
      } else {
         b($$2, $$4, wy.a($$3.a).a($$5));
      }
   }

   private static void a(Consumer<wy> $$0, dv $$1, wy $$2) {
      MinecraftServer $$3 = $$1.l();
      CompletableFuture<aqm> $$4 = a($$1, $$2);
      wi $$5 = $$3.bm().decorate($$1.i(), $$2.d());
      $$1.o().append($$4, $$3x -> {
         wy $$4x = $$2.a($$5).a($$3x.e());
         $$0.accept($$4x);
      });
   }

   private static void b(Consumer<wy> $$0, dv $$1, wy $$2) {
      wd $$3 = $$1.l().bm();
      wi $$4 = $$3.decorate($$1.i(), $$2.d());
      $$0.accept($$2.a($$4));
   }

   private static CompletableFuture<aqm> a(dv $$0, wy $$1) {
      apv $$2 = $$0.i();
      return $$2 != null && $$1.a($$2.cw()) ? $$2.X().a($$1.c()) : CompletableFuture.completedFuture(aqm.a($$1.c()));
   }

   public em.a a(StringReader $$0) throws CommandSyntaxException {
      return em.a.a($$0, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a {
      final String a;
      private final em.b[] b;

      public a(String $$0, em.b[] $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public String a() {
         return this.a;
      }

      public em.b[] b() {
         return this.b;
      }

      wi a(dv $$0) throws CommandSyntaxException {
         return this.a($$0, $$0.c(2));
      }

      public wi a(dv $$0, boolean $$1) throws CommandSyntaxException {
         if (this.b.length != 0 && $$1) {
            ww $$2 = wi.b(this.a.substring(0, this.b[0].a()));
            int $$3 = this.b[0].a();

            for (em.b $$4 : this.b) {
               wi $$5 = $$4.a($$0);
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
            return wi.b(this.a);
         }
      }

      public static em.a a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
         String $$2 = $$0.getString().substring($$0.getCursor(), $$0.getTotalLength());
         if (!$$1) {
            $$0.setCursor($$0.getTotalLength());
            return new em.a($$2, new em.b[0]);
         } else {
            List<em.b> $$3 = Lists.newArrayList();
            int $$4 = $$0.getCursor();

            while (true) {
               int $$5;
               gk $$7;
               while (true) {
                  if (!$$0.canRead()) {
                     return new em.a($$2, $$3.toArray(new em.b[0]));
                  }

                  if ($$0.peek() == '@') {
                     $$5 = $$0.getCursor();

                     try {
                        gl $$6 = new gl($$0);
                        $$7 = $$6.t();
                        break;
                     } catch (CommandSyntaxException var8) {
                        if (var8.getType() != gl.h && var8.getType() != gl.f) {
                           throw var8;
                        }

                        $$0.setCursor($$5 + 1);
                     }
                  } else {
                     $$0.skip();
                  }
               }

               $$3.add(new em.b($$5 - $$4, $$0.getCursor() - $$4, $$7));
            }
         }
      }
   }

   public static class b {
      private final int a;
      private final int b;
      private final gk c;

      public b(int $$0, int $$1, gk $$2) {
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

      public gk c() {
         return this.c;
      }

      @Nullable
      public wi a(dv $$0) throws CommandSyntaxException {
         return gk.a(this.c.b($$0));
      }
   }
}
