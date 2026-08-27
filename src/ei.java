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

public class ei implements ex<ei.a> {
   private static final Collection<String> a = Arrays.asList("Hello world!", "foo", "@e", "Hello @p :)");

   public static ei a() {
      return new ei();
   }

   public static tl a(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      ei.a $$2 = (ei.a)$$0.getArgument($$1, ei.a.class);
      return $$2.a((dt)$$0.getSource());
   }

   public static void a(CommandContext<dt> $$0, String $$1, Consumer<ua> $$2) throws CommandSyntaxException {
      ei.a $$3 = (ei.a)$$0.getArgument($$1, ei.a.class);
      dt $$4 = (dt)$$0.getSource();
      tl $$5 = $$3.a($$4);
      dr $$6 = $$4.n();
      ua $$7 = $$6.a($$1);
      if ($$7 != null) {
         a($$2, $$4, $$7.a($$5));
      } else {
         b($$2, $$4, ua.a($$3.a).a($$5));
      }
   }

   private static void a(Consumer<ua> $$0, dt $$1, ua $$2) {
      MinecraftServer $$3 = $$1.l();
      CompletableFuture<ali> $$4 = a($$1, $$2);
      tl $$5 = $$3.bd().decorate($$1.i(), $$2.c());
      $$1.o().append($$4x -> $$4.thenAcceptAsync($$3xx -> {
            ua $$4xx = $$2.a($$5).a($$3xx.e());
            $$0.accept($$4xx);
         }, $$4x));
   }

   private static void b(Consumer<ua> $$0, dt $$1, ua $$2) {
      tg $$3 = $$1.l().bd();
      tl $$4 = $$3.decorate($$1.i(), $$2.c());
      $$0.accept($$2.a($$4));
   }

   private static CompletableFuture<ali> a(dt $$0, ua $$1) {
      aks $$2 = $$0.i();
      return $$2 != null && $$1.a($$2.cw()) ? $$2.W().a($$1.b()) : CompletableFuture.completedFuture(ali.a($$1.b()));
   }

   public ei.a a(StringReader $$0) throws CommandSyntaxException {
      return ei.a.a($$0, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a {
      final String a;
      private final ei.b[] b;

      public a(String $$0, ei.b[] $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public String a() {
         return this.a;
      }

      public ei.b[] b() {
         return this.b;
      }

      tl a(dt $$0) throws CommandSyntaxException {
         return this.a($$0, $$0.c(2));
      }

      public tl a(dt $$0, boolean $$1) throws CommandSyntaxException {
         if (this.b.length != 0 && $$1) {
            ty $$2 = tl.b(this.a.substring(0, this.b[0].a()));
            int $$3 = this.b[0].a();

            for (ei.b $$4 : this.b) {
               tl $$5 = $$4.a($$0);
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
            return tl.b(this.a);
         }
      }

      public static ei.a a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
         String $$2 = $$0.getString().substring($$0.getCursor(), $$0.getTotalLength());
         if (!$$1) {
            $$0.setCursor($$0.getTotalLength());
            return new ei.a($$2, new ei.b[0]);
         } else {
            List<ei.b> $$3 = Lists.newArrayList();
            int $$4 = $$0.getCursor();

            while (true) {
               int $$5;
               gc $$7;
               while (true) {
                  if (!$$0.canRead()) {
                     return new ei.a($$2, $$3.toArray(new ei.b[0]));
                  }

                  if ($$0.peek() == '@') {
                     $$5 = $$0.getCursor();

                     try {
                        gd $$6 = new gd($$0);
                        $$7 = $$6.t();
                        break;
                     } catch (CommandSyntaxException var8) {
                        if (var8.getType() != gd.h && var8.getType() != gd.f) {
                           throw var8;
                        }

                        $$0.setCursor($$5 + 1);
                     }
                  } else {
                     $$0.skip();
                  }
               }

               $$3.add(new ei.b($$5 - $$4, $$0.getCursor() - $$4, $$7));
            }
         }
      }
   }

   public static class b {
      private final int a;
      private final int b;
      private final gc c;

      public b(int $$0, int $$1, gc $$2) {
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

      public gc c() {
         return this.c;
      }

      @Nullable
      public tl a(dt $$0) throws CommandSyntaxException {
         return gc.a(this.c.b($$0));
      }
   }
}
