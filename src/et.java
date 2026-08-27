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

public class et implements fi<et.a> {
   private static final Collection<String> a = Arrays.asList("Hello world!", "foo", "@e", "Hello @p :)");

   public static et a() {
      return new et();
   }

   public static ws a(CommandContext<ec> $$0, String $$1) throws CommandSyntaxException {
      et.a $$2 = (et.a)$$0.getArgument($$1, et.a.class);
      return $$2.a((ec)$$0.getSource());
   }

   public static void a(CommandContext<ec> $$0, String $$1, Consumer<xi> $$2) throws CommandSyntaxException {
      et.a $$3 = (et.a)$$0.getArgument($$1, et.a.class);
      ec $$4 = (ec)$$0.getSource();
      ws $$5 = $$3.a($$4);
      ea $$6 = $$4.n();
      xi $$7 = $$6.a($$1);
      if ($$7 != null) {
         a($$2, $$4, $$7.a($$5));
      } else {
         b($$2, $$4, xi.a($$3.a).a($$5));
      }
   }

   private static void a(Consumer<xi> $$0, ec $$1, xi $$2) {
      MinecraftServer $$3 = $$1.l();
      CompletableFuture<aqw> $$4 = a($$1, $$2);
      ws $$5 = $$3.bm().decorate($$1.i(), $$2.d());
      $$1.o().append($$4, $$3x -> {
         xi $$4x = $$2.a($$5).a($$3x.e());
         $$0.accept($$4x);
      });
   }

   private static void b(Consumer<xi> $$0, ec $$1, xi $$2) {
      wn $$3 = $$1.l().bm();
      ws $$4 = $$3.decorate($$1.i(), $$2.d());
      $$0.accept($$2.a($$4));
   }

   private static CompletableFuture<aqw> a(ec $$0, xi $$1) {
      aqf $$2 = $$0.i();
      return $$2 != null && $$1.a($$2.cx()) ? $$2.X().a($$1.c()) : CompletableFuture.completedFuture(aqw.a($$1.c()));
   }

   public et.a a(StringReader $$0) throws CommandSyntaxException {
      return et.a.a($$0, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a {
      final String a;
      private final et.b[] b;

      public a(String $$0, et.b[] $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public String a() {
         return this.a;
      }

      public et.b[] b() {
         return this.b;
      }

      ws a(ec $$0) throws CommandSyntaxException {
         return this.a($$0, $$0.c(2));
      }

      public ws a(ec $$0, boolean $$1) throws CommandSyntaxException {
         if (this.b.length != 0 && $$1) {
            xg $$2 = ws.b(this.a.substring(0, this.b[0].a()));
            int $$3 = this.b[0].a();

            for (et.b $$4 : this.b) {
               ws $$5 = $$4.a($$0);
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
            return ws.b(this.a);
         }
      }

      public static et.a a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
         String $$2 = $$0.getString().substring($$0.getCursor(), $$0.getTotalLength());
         if (!$$1) {
            $$0.setCursor($$0.getTotalLength());
            return new et.a($$2, new et.b[0]);
         } else {
            List<et.b> $$3 = Lists.newArrayList();
            int $$4 = $$0.getCursor();

            while (true) {
               int $$5;
               gr $$7;
               while (true) {
                  if (!$$0.canRead()) {
                     return new et.a($$2, $$3.toArray(new et.b[0]));
                  }

                  if ($$0.peek() == '@') {
                     $$5 = $$0.getCursor();

                     try {
                        gs $$6 = new gs($$0);
                        $$7 = $$6.t();
                        break;
                     } catch (CommandSyntaxException var8) {
                        if (var8.getType() != gs.h && var8.getType() != gs.f) {
                           throw var8;
                        }

                        $$0.setCursor($$5 + 1);
                     }
                  } else {
                     $$0.skip();
                  }
               }

               $$3.add(new et.b($$5 - $$4, $$0.getCursor() - $$4, $$7));
            }
         }
      }
   }

   public static class b {
      private final int a;
      private final int b;
      private final gr c;

      public b(int $$0, int $$1, gr $$2) {
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

      public gr c() {
         return this.c;
      }

      @Nullable
      public ws a(ec $$0) throws CommandSyntaxException {
         return gr.a(this.c.b($$0));
      }
   }
}
