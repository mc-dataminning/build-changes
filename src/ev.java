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

public class ev implements fl<ev.a> {
   private static final Collection<String> a = Arrays.asList("Hello world!", "foo", "@e", "Hello @p :)");

   public static ev a() {
      return new ev();
   }

   public static wx a(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      ev.a $$2 = (ev.a)$$0.getArgument($$1, ev.a.class);
      return $$2.a((ee)$$0.getSource());
   }

   public static void a(CommandContext<ee> $$0, String $$1, Consumer<xn> $$2) throws CommandSyntaxException {
      ev.a $$3 = (ev.a)$$0.getArgument($$1, ev.a.class);
      ee $$4 = (ee)$$0.getSource();
      wx $$5 = $$3.a($$4);
      ec $$6 = $$4.n();
      xn $$7 = $$6.a($$1);
      if ($$7 != null) {
         a($$2, $$4, $$7.a($$5));
      } else {
         b($$2, $$4, xn.a($$3.a).a($$5));
      }
   }

   private static void a(Consumer<xn> $$0, ee $$1, xn $$2) {
      MinecraftServer $$3 = $$1.l();
      CompletableFuture<are> $$4 = a($$1, $$2);
      wx $$5 = $$3.bm().decorate($$1.i(), $$2.d());
      $$1.o().append($$4, $$3x -> {
         xn $$4x = $$2.a($$5).a($$3x.e());
         $$0.accept($$4x);
      });
   }

   private static void b(Consumer<xn> $$0, ee $$1, xn $$2) {
      ws $$3 = $$1.l().bm();
      wx $$4 = $$3.decorate($$1.i(), $$2.d());
      $$0.accept($$2.a($$4));
   }

   private static CompletableFuture<are> a(ee $$0, xn $$1) {
      aqn $$2 = $$0.i();
      return $$2 != null && $$1.a($$2.cz()) ? $$2.X().a($$1.c()) : CompletableFuture.completedFuture(are.a($$1.c()));
   }

   public ev.a a(StringReader $$0) throws CommandSyntaxException {
      return ev.a.a($$0, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a {
      final String a;
      private final ev.b[] b;

      public a(String $$0, ev.b[] $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public String a() {
         return this.a;
      }

      public ev.b[] b() {
         return this.b;
      }

      wx a(ee $$0) throws CommandSyntaxException {
         return this.a($$0, $$0.c(2));
      }

      public wx a(ee $$0, boolean $$1) throws CommandSyntaxException {
         if (this.b.length != 0 && $$1) {
            xl $$2 = wx.b(this.a.substring(0, this.b[0].a()));
            int $$3 = this.b[0].a();

            for (ev.b $$4 : this.b) {
               wx $$5 = $$4.a($$0);
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
            return wx.b(this.a);
         }
      }

      public static ev.a a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
         String $$2 = $$0.getString().substring($$0.getCursor(), $$0.getTotalLength());
         if (!$$1) {
            $$0.setCursor($$0.getTotalLength());
            return new ev.a($$2, new ev.b[0]);
         } else {
            List<ev.b> $$3 = Lists.newArrayList();
            int $$4 = $$0.getCursor();

            while (true) {
               int $$5;
               gt $$7;
               while (true) {
                  if (!$$0.canRead()) {
                     return new ev.a($$2, $$3.toArray(new ev.b[0]));
                  }

                  if ($$0.peek() == '@') {
                     $$5 = $$0.getCursor();

                     try {
                        gu $$6 = new gu($$0);
                        $$7 = $$6.t();
                        break;
                     } catch (CommandSyntaxException var8) {
                        if (var8.getType() != gu.h && var8.getType() != gu.f) {
                           throw var8;
                        }

                        $$0.setCursor($$5 + 1);
                     }
                  } else {
                     $$0.skip();
                  }
               }

               $$3.add(new ev.b($$5 - $$4, $$0.getCursor() - $$4, $$7));
            }
         }
      }
   }

   public static class b {
      private final int a;
      private final int b;
      private final gt c;

      public b(int $$0, int $$1, gt $$2) {
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

      public gt c() {
         return this.c;
      }

      @Nullable
      public wx a(ee $$0) throws CommandSyntaxException {
         return gt.a(this.c.b($$0));
      }
   }
}
