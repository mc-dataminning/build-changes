import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class afj {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(afj.c $$0, afj.f<D> $$1, afj.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<cqd, ana> $$5 = $$0.a.a();
         ana $$6 = (ana)$$5.getSecond();
         hm<aey> $$7 = aey.a();
         hm<aey> $$8 = b($$6, $$7, aey.b, aek.a);
         ht.b $$9 = $$8.b(aey.c);
         ht.b $$10 = aek.a($$6, $$9, aek.b);
         cqd $$11 = (cqd)$$5.getFirst();
         afj.b<D> $$12 = $$1.get(new afj.a($$6, $$11, $$9, $$10));
         hm<aey> $$13 = $$8.a(aey.c, $$12.b);
         ht.b $$14 = $$13.b(aey.d);
         return aez.a($$6, $$14, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   private static ht.b a(ank $$0, hm<aey> $$1, aey $$2, List<aek.b<?>> $$3) {
      ht.b $$4 = $$1.b($$2);
      return aek.a($$0, $$4, $$3);
   }

   private static hm<aey> b(ank $$0, hm<aey> $$1, aey $$2, List<aek.b<?>> $$3) {
      ht.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(ank a, cqd b, ht.b c, ht.b d) {
   }

   public static record b<D>(D a, ht.b b) {
   }

   public static record c(afj.d a, dt.a b, int c) {
   }

   public static record d(amv a, cqd b, boolean c, boolean d) {
      public Pair<cqd, ana> a() {
         cdt $$0 = this.d ? cdv.d.a() : this.b.b();
         cqd $$1 = MinecraftServer.a(this.a, this.b.a(), this.c, $$0);
         if (!this.d) {
            $$1 = $$1.a(this.b.b());
         }

         List<aly> $$2 = this.a.g();
         ana $$3 = new and(alz.b, $$2);
         return Pair.of($$1, $$3);
      }

      public amv b() {
         return this.a;
      }

      public cqd c() {
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
      R create(ana var1, aez var2, hm<aey> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      afj.b<D> get(afj.a var1);
   }
}
