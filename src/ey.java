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

public class ey implements fo<ey.a> {
   private static final Collection<String> a = Arrays.asList("Hello world!", "foo", "@e", "Hello @p :)");

   public static ey a() {
      return new ey();
   }

   public static xe a(CommandContext<eh> $$0, String $$1) throws CommandSyntaxException {
      ey.a $$2 = (ey.a)$$0.getArgument($$1, ey.a.class);
      return $$2.a((eh)$$0.getSource());
   }

   public static void a(CommandContext<eh> $$0, String $$1, Consumer<xu> $$2) throws CommandSyntaxException {
      ey.a $$3 = (ey.a)$$0.getArgument($$1, ey.a.class);
      eh $$4 = (eh)$$0.getSource();
      xe $$5 = $$3.a($$4);
      ef $$6 = $$4.n();
      xu $$7 = $$6.a($$1);
      if ($$7 != null) {
         a($$2, $$4, $$7.a($$5));
      } else {
         b($$2, $$4, xu.a($$3.a).a($$5));
      }
   }

   private static void a(Consumer<xu> $$0, eh $$1, xu $$2) {
      MinecraftServer $$3 = $$1.l();
      CompletableFuture<arl> $$4 = a($$1, $$2);
      xe $$5 = $$3.bm().decorate($$1.i(), $$2.d());
      $$1.o().append($$4, $$3x -> {
         xu $$4x = $$2.a($$5).a($$3x.e());
         $$0.accept($$4x);
      });
   }

   private static void b(Consumer<xu> $$0, eh $$1, xu $$2) {
      wz $$3 = $$1.l().bm();
      xe $$4 = $$3.decorate($$1.i(), $$2.d());
      $$0.accept($$2.a($$4));
   }

   private static CompletableFuture<arl> a(eh $$0, xu $$1) {
      aqu $$2 = $$0.i();
      return $$2 != null && $$1.a($$2.cE()) ? $$2.Z().a($$1.c()) : CompletableFuture.completedFuture(arl.a($$1.c()));
   }

   public ey.a a(StringReader $$0) throws CommandSyntaxException {
      return ey.a.a($$0, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a {
      final String a;
      private final ey.b[] b;

      public a(String $$0, ey.b[] $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public String a() {
         return this.a;
      }

      public ey.b[] b() {
         return this.b;
      }

      xe a(eh $$0) throws CommandSyntaxException {
         return this.a($$0, $$0.c(2));
      }

      public xe a(eh $$0, boolean $$1) throws CommandSyntaxException {
         if (this.b.length != 0 && $$1) {
            xs $$2 = xe.b(this.a.substring(0, this.b[0].a()));
            int $$3 = this.b[0].a();

            for (ey.b $$4 : this.b) {
               xe $$5 = $$4.a($$0);
               if ($$3 < $$4.a()) {
                  $$2.f(this.a.substring($$3, $$4.a()));
               }

               if ($$5 != null) {
                  $$2.a($$5);
               }

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

      public static ey.a a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
         String $$2 = $$0.getString().substring($$0.getCursor(), $$0.getTotalLength());
         if (!$$1) {
            $$0.setCursor($$0.getTotalLength());
            return new ey.a($$2, new ey.b[0]);
         } else {
            List<ey.b> $$3 = Lists.newArrayList();
            int $$4 = $$0.getCursor();

            while (true) {
               int $$5;
               gw $$7;
               while (true) {
                  if (!$$0.canRead()) {
                     return new ey.a($$2, $$3.toArray(new ey.b[0]));
                  }

                  if ($$0.peek() == '@') {
                     $$5 = $$0.getCursor();

                     try {
                        gx $$6 = new gx($$0);
                        $$7 = $$6.t();
                        break;
                     } catch (CommandSyntaxException var8) {
                        if (var8.getType() != gx.h && var8.getType() != gx.f) {
                           throw var8;
                        }

                        $$0.setCursor($$5 + 1);
                     }
                  } else {
                     $$0.skip();
                  }
               }

               $$3.add(new ey.b($$5 - $$4, $$0.getCursor() - $$4, $$7));
            }
         }
      }
   }

   public static class b {
      private final int a;
      private final int b;
      private final gw c;

      public b(int $$0, int $$1, gw $$2) {
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

      public gw c() {
         return this.c;
      }

      @Nullable
      public xe a(eh $$0) throws CommandSyntaxException {
         return gw.a(this.c.b($$0));
      }
   }
}
