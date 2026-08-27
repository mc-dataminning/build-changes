import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class adj {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(adj.c $$0, adj.f<D> $$1, adj.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<cnf, akn> $$5 = $$0.a.a();
         akn $$6 = (akn)$$5.getSecond();
         hl<acz> $$7 = acz.a();
         hl<acz> $$8 = b($$6, $$7, acz.b, acl.a);
         hs.b $$9 = $$8.b(acz.c);
         hs.b $$10 = acl.a($$6, $$9, acl.b);
         cnf $$11 = (cnf)$$5.getFirst();
         adj.b<D> $$12 = $$1.get(new adj.a($$6, $$11, $$9, $$10));
         hl<acz> $$13 = $$8.a(acz.c, $$12.b);
         hs.b $$14 = $$13.b(acz.d);
         return ada.a($$6, $$14, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
            if ($$2x != null) {
               $$6.close();
            }
         }).thenApplyAsync($$5x -> {
            $$5x.a($$14);
            return $$2.create($$6, $$5x, $$13, $$12.a);
         }, $$4);
      } catch (Exception var15) {
         return CompletableFuture.failedFuture(var15);
      }
   }

   private static hs.b a(akx $$0, hl<acz> $$1, acz $$2, List<acl.b<?>> $$3) {
      hs.b $$4 = $$1.b($$2);
      return acl.a($$0, $$4, $$3);
   }

   private static hl<acz> b(akx $$0, hl<acz> $$1, acz $$2, List<acl.b<?>> $$3) {
      hs.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(akx a, cnf b, hs.b c, hs.b d) {
   }

   public static record b<D>(D a, hs.b b) {
   }

   public static record c(adj.d a, dt.a b, int c) {
   }

   public static record d(aki a, cnf b, boolean c, boolean d) {
      public Pair<cnf, akn> a() {
         caw $$0 = this.d ? cay.c.a() : this.b.b();
         cnf $$1 = MinecraftServer.a(this.a, this.b.a(), this.c, $$0);
         if (!this.d) {
            $$1 = $$1.a(this.b.b());
         }

         List<ajl> $$2 = this.a.g();
         akn $$3 = new akq(ajm.b, $$2);
         return Pair.of($$1, $$3);
      }

      public aki b() {
         return this.a;
      }

      public cnf c() {
         return this.b;
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }

   @FunctionalInterface
   public interface e<D, R> {
      R create(akn var1, ada var2, hl<acz> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      adj.b<D> get(adj.a var1);
   }
}
