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

public class ek implements ez<ek.a> {
   private static final Collection<String> a = Arrays.asList("Hello world!", "foo", "@e", "Hello @p :)");

   public static ek a() {
      return new ek();
   }

   public static ui a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      ek.a $$2 = (ek.a)$$0.getArgument($$1, ek.a.class);
      return $$2.a((du)$$0.getSource());
   }

   public static void a(CommandContext<du> $$0, String $$1, Consumer<uy> $$2) throws CommandSyntaxException {
      ek.a $$3 = (ek.a)$$0.getArgument($$1, ek.a.class);
      du $$4 = (du)$$0.getSource();
      ui $$5 = $$3.a($$4);
      ds $$6 = $$4.o();
      uy $$7 = $$6.a($$1);
      if ($$7 != null) {
         a($$2, $$4, $$7.a($$5));
      } else {
         b($$2, $$4, uy.a($$3.a).a($$5));
      }
   }

   private static void a(Consumer<uy> $$0, du $$1, uy $$2) {
      MinecraftServer $$3 = $$1.m();
      CompletableFuture<amh> $$4 = a($$1, $$2);
      ui $$5 = $$3.bd().decorate($$1.j(), $$2.c());
      $$1.p().append($$4x -> $$4.thenAcceptAsync($$3xx -> {
            uy $$4xx = $$2.a($$5).a($$3xx.e());
            $$0.accept($$4xx);
         }, $$4x));
   }

   private static void b(Consumer<uy> $$0, du $$1, uy $$2) {
      ud $$3 = $$1.m().bd();
      ui $$4 = $$3.decorate($$1.j(), $$2.c());
      $$0.accept($$2.a($$4));
   }

   private static CompletableFuture<amh> a(du $$0, uy $$1) {
      alr $$2 = $$0.j();
      return $$2 != null && $$1.a($$2.cv()) ? $$2.V().a($$1.b()) : CompletableFuture.completedFuture(amh.a($$1.b()));
   }

   public ek.a a(StringReader $$0) throws CommandSyntaxException {
      return ek.a.a($$0, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a {
      final String a;
      private final ek.b[] b;

      public a(String $$0, ek.b[] $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public String a() {
         return this.a;
      }

      public ek.b[] b() {
         return this.b;
      }

      ui a(du $$0) throws CommandSyntaxException {
         return this.a($$0, $$0.c(2));
      }

      public ui a(du $$0, boolean $$1) throws CommandSyntaxException {
         if (this.b.length != 0 && $$1) {
            uw $$2 = ui.b(this.a.substring(0, this.b[0].a()));
            int $$3 = this.b[0].a();

            for (ek.b $$4 : this.b) {
               ui $$5 = $$4.a($$0);
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
            return ui.b(this.a);
         }
      }

      public static ek.a a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
         String $$2 = $$0.getString().substring($$0.getCursor(), $$0.getTotalLength());
         if (!$$1) {
            $$0.setCursor($$0.getTotalLength());
            return new ek.a($$2, new ek.b[0]);
         } else {
            List<ek.b> $$3 = Lists.newArrayList();
            int $$4 = $$0.getCursor();

            while (true) {
               int $$5;
               ge $$7;
               while (true) {
                  if (!$$0.canRead()) {
                     return new ek.a($$2, $$3.toArray(new ek.b[0]));
                  }

                  if ($$0.peek() == '@') {
                     $$5 = $$0.getCursor();

                     try {
                        gf $$6 = new gf($$0);
                        $$7 = $$6.t();
                        break;
                     } catch (CommandSyntaxException var8) {
                        if (var8.getType() != gf.h && var8.getType() != gf.f) {
                           throw var8;
                        }

                        $$0.setCursor($$5 + 1);
                     }
                  } else {
                     $$0.skip();
                  }
               }

               $$3.add(new ek.b($$5 - $$4, $$0.getCursor() - $$4, $$7));
            }
         }
      }
   }

   public static class b {
      private final int a;
      private final int b;
      private final ge c;

      public b(int $$0, int $$1, ge $$2) {
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

      public ge c() {
         return this.c;
      }

      @Nullable
      public ui a(du $$0) throws CommandSyntaxException {
         return ge.a(this.c.b($$0));
      }
   }
}
