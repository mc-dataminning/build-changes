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

public class eg implements ev<eg.a> {
   private static final Collection<String> a = Arrays.asList("Hello world!", "foo", "@e", "Hello @p :)");

   public static eg a() {
      return new eg();
   }

   public static sw a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      eg.a $$2 = (eg.a)$$0.getArgument($$1, eg.a.class);
      return $$2.a((ds)$$0.getSource());
   }

   public static void a(CommandContext<ds> $$0, String $$1, Consumer<tl> $$2) throws CommandSyntaxException {
      eg.a $$3 = (eg.a)$$0.getArgument($$1, eg.a.class);
      ds $$4 = (ds)$$0.getSource();
      sw $$5 = $$3.a($$4);
      dq $$6 = $$4.n();
      tl $$7 = $$6.a($$1);
      if ($$7 != null) {
         a($$2, $$4, $$7.a($$5));
      } else {
         b($$2, $$4, tl.a($$3.a).a($$5));
      }
   }

   private static void a(Consumer<tl> $$0, ds $$1, tl $$2) {
      MinecraftServer $$3 = $$1.l();
      CompletableFuture<aiu> $$4 = a($$1, $$2);
      CompletableFuture<sw> $$5 = $$3.be().decorate($$1.i(), $$2.c());
      $$1.o().append($$4x -> CompletableFuture.allOf($$4, $$5).thenAcceptAsync($$4xx -> {
            tl $$5x = $$2.a($$5.join()).a($$4.join().e());
            $$0.accept($$5x);
         }, $$4x));
   }

   private static void b(Consumer<tl> $$0, ds $$1, tl $$2) {
      MinecraftServer $$3 = $$1.l();
      CompletableFuture<sw> $$4 = $$3.be().decorate($$1.i(), $$2.c());
      $$1.o().append($$3x -> $$4.thenAcceptAsync($$2xx -> $$0.accept($$2.a($$2xx)), $$3x));
   }

   private static CompletableFuture<aiu> a(ds $$0, tl $$1) {
      aig $$2 = $$0.i();
      return $$2 != null && $$1.a($$2.ct()) ? $$2.T().a($$1.b()) : CompletableFuture.completedFuture(aiu.a($$1.b()));
   }

   public eg.a a(StringReader $$0) throws CommandSyntaxException {
      return eg.a.a($$0, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a {
      final String a;
      private final eg.b[] b;

      public a(String $$0, eg.b[] $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public String a() {
         return this.a;
      }

      public eg.b[] b() {
         return this.b;
      }

      sw a(ds $$0) throws CommandSyntaxException {
         return this.a($$0, $$0.c(2));
      }

      public sw a(ds $$0, boolean $$1) throws CommandSyntaxException {
         if (this.b.length != 0 && $$1) {
            tj $$2 = sw.b(this.a.substring(0, this.b[0].a()));
            int $$3 = this.b[0].a();

            for (eg.b $$4 : this.b) {
               sw $$5 = $$4.a($$0);
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
            return sw.b(this.a);
         }
      }

      public static eg.a a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
         String $$2 = $$0.getString().substring($$0.getCursor(), $$0.getTotalLength());
         if (!$$1) {
            $$0.setCursor($$0.getTotalLength());
            return new eg.a($$2, new eg.b[0]);
         } else {
            List<eg.b> $$3 = Lists.newArrayList();
            int $$4 = $$0.getCursor();

            while (true) {
               int $$5;
               ga $$7;
               while (true) {
                  if (!$$0.canRead()) {
                     return new eg.a($$2, $$3.toArray(new eg.b[0]));
                  }

                  if ($$0.peek() == '@') {
                     $$5 = $$0.getCursor();

                     try {
                        gb $$6 = new gb($$0);
                        $$7 = $$6.t();
                        break;
                     } catch (CommandSyntaxException var8) {
                        if (var8.getType() != gb.h && var8.getType() != gb.f) {
                           throw var8;
                        }

                        $$0.setCursor($$5 + 1);
                     }
                  } else {
                     $$0.skip();
                  }
               }

               $$3.add(new eg.b($$5 - $$4, $$0.getCursor() - $$4, $$7));
            }
         }
      }
   }

   public static class b {
      private final int a;
      private final int b;
      private final ga c;

      public b(int $$0, int $$1, ga $$2) {
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

      public ga c() {
         return this.c;
      }

      @Nullable
      public sw a(ds $$0) throws CommandSyntaxException {
         return ga.a(this.c.b($$0));
      }
   }
}
