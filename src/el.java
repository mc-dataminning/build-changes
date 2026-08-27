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

public class el implements fa<el.a> {
   private static final Collection<String> a = Arrays.asList("Hello world!", "foo", "@e", "Hello @p :)");

   public static el a() {
      return new el();
   }

   public static wg a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      el.a $$2 = (el.a)$$0.getArgument($$1, el.a.class);
      return $$2.a((du)$$0.getSource());
   }

   public static void a(CommandContext<du> $$0, String $$1, Consumer<ww> $$2) throws CommandSyntaxException {
      el.a $$3 = (el.a)$$0.getArgument($$1, el.a.class);
      du $$4 = (du)$$0.getSource();
      wg $$5 = $$3.a($$4);
      ds $$6 = $$4.n();
      ww $$7 = $$6.a($$1);
      if ($$7 != null) {
         a($$2, $$4, $$7.a($$5));
      } else {
         b($$2, $$4, ww.a($$3.a).a($$5));
      }
   }

   private static void a(Consumer<ww> $$0, du $$1, ww $$2) {
      MinecraftServer $$3 = $$1.l();
      CompletableFuture<aqk> $$4 = a($$1, $$2);
      wg $$5 = $$3.bm().decorate($$1.i(), $$2.d());
      $$1.o().append($$4, $$3x -> {
         ww $$4x = $$2.a($$5).a($$3x.e());
         $$0.accept($$4x);
      });
   }

   private static void b(Consumer<ww> $$0, du $$1, ww $$2) {
      wb $$3 = $$1.l().bm();
      wg $$4 = $$3.decorate($$1.i(), $$2.d());
      $$0.accept($$2.a($$4));
   }

   private static CompletableFuture<aqk> a(du $$0, ww $$1) {
      apt $$2 = $$0.i();
      return $$2 != null && $$1.a($$2.cw()) ? $$2.X().a($$1.c()) : CompletableFuture.completedFuture(aqk.a($$1.c()));
   }

   public el.a a(StringReader $$0) throws CommandSyntaxException {
      return el.a.a($$0, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a {
      final String a;
      private final el.b[] b;

      public a(String $$0, el.b[] $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public String a() {
         return this.a;
      }

      public el.b[] b() {
         return this.b;
      }

      wg a(du $$0) throws CommandSyntaxException {
         return this.a($$0, $$0.c(2));
      }

      public wg a(du $$0, boolean $$1) throws CommandSyntaxException {
         if (this.b.length != 0 && $$1) {
            wu $$2 = wg.b(this.a.substring(0, this.b[0].a()));
            int $$3 = this.b[0].a();

            for (el.b $$4 : this.b) {
               wg $$5 = $$4.a($$0);
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
            return wg.b(this.a);
         }
      }

      public static el.a a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
         String $$2 = $$0.getString().substring($$0.getCursor(), $$0.getTotalLength());
         if (!$$1) {
            $$0.setCursor($$0.getTotalLength());
            return new el.a($$2, new el.b[0]);
         } else {
            List<el.b> $$3 = Lists.newArrayList();
            int $$4 = $$0.getCursor();

            while (true) {
               int $$5;
               gi $$7;
               while (true) {
                  if (!$$0.canRead()) {
                     return new el.a($$2, $$3.toArray(new el.b[0]));
                  }

                  if ($$0.peek() == '@') {
                     $$5 = $$0.getCursor();

                     try {
                        gj $$6 = new gj($$0);
                        $$7 = $$6.t();
                        break;
                     } catch (CommandSyntaxException var8) {
                        if (var8.getType() != gj.h && var8.getType() != gj.f) {
                           throw var8;
                        }

                        $$0.setCursor($$5 + 1);
                     }
                  } else {
                     $$0.skip();
                  }
               }

               $$3.add(new el.b($$5 - $$4, $$0.getCursor() - $$4, $$7));
            }
         }
      }
   }

   public static class b {
      private final int a;
      private final int b;
      private final gi c;

      public b(int $$0, int $$1, gi $$2) {
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

      public gi c() {
         return this.c;
      }

      @Nullable
      public wg a(du $$0) throws CommandSyntaxException {
         return gi.a(this.c.b($$0));
      }
   }
}
