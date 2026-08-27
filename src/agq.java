import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class agq {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(agq.c $$0, agq.f<D> $$1, agq.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<crs, aoj> $$5 = $$0.a.a();
         aoj $$6 = (aoj)$$5.getSecond();
         ij<agf> $$7 = agf.a();
         ij<agf> $$8 = b($$6, $$7, agf.b, afr.a);
         ip.b $$9 = $$8.b(agf.c);
         ip.b $$10 = afr.a($$6, $$9, afr.b);
         crs $$11 = (crs)$$5.getFirst();
         agq.b<D> $$12 = $$1.get(new agq.a($$6, $$11, $$9, $$10));
         ij<agf> $$13 = $$8.a(agf.c, $$12.b);
         ip.b $$14 = $$13.b(agf.d);
         return agg.a($$6, $$14, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   private static ip.b a(aot $$0, ij<agf> $$1, agf $$2, List<afr.b<?>> $$3) {
      ip.b $$4 = $$1.b($$2);
      return afr.a($$0, $$4, $$3);
   }

   private static ij<agf> b(aot $$0, ij<agf> $$1, agf $$2, List<afr.b<?>> $$3) {
      ip.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(aot a, crs b, ip.b c, ip.b d) {
   }

   public static record b<D>(D a, ip.b b) {
   }

   public static record c(agq.d a, dv.a b, int c) {
   }

   public static record d(aoe a, crs b, boolean c, boolean d) {
      public Pair<crs, aoj> a() {
         cfg $$0 = this.d ? cfi.d.a() : this.b.b();
         crs $$1 = MinecraftServer.a(this.a, this.b.a(), this.c, $$0);
         if (!this.d) {
            $$1 = $$1.a(this.b.b());
         }

         List<anh> $$2 = this.a.g();
         aoj $$3 = new aom(ani.b, $$2);
         return Pair.of($$1, $$3);
      }

      public aoe b() {
         return this.a;
      }

      public crs c() {
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
      R create(aoj var1, agg var2, ij<agf> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      agq.b<D> get(agq.a var1);
   }
}
