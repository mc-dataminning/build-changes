import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class aha {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(aha.c $$0, aha.f<D> $$1, aha.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<csl, aot> $$5 = $$0.a.a();
         aot $$6 = (aot)$$5.getSecond();
         ij<agp> $$7 = agp.a();
         ij<agp> $$8 = b($$6, $$7, agp.b, agb.a);
         ip.b $$9 = $$8.b(agp.c);
         ip.b $$10 = agb.a($$6, $$9, agb.b);
         csl $$11 = (csl)$$5.getFirst();
         aha.b<D> $$12 = $$1.get(new aha.a($$6, $$11, $$9, $$10));
         ij<agp> $$13 = $$8.a(agp.c, $$12.b);
         ip.b $$14 = $$13.b(agp.d);
         return agq.a($$6, $$14, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   private static ip.b a(apd $$0, ij<agp> $$1, agp $$2, List<agb.b<?>> $$3) {
      ip.b $$4 = $$1.b($$2);
      return agb.a($$0, $$4, $$3);
   }

   private static ij<agp> b(apd $$0, ij<agp> $$1, agp $$2, List<agb.b<?>> $$3) {
      ip.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(apd a, csl b, ip.b c, ip.b d) {
   }

   public static record b<D>(D a, ip.b b) {
   }

   public static record c(aha.d a, dv.a b, int c) {
   }

   public static record d(aoo a, csl b, boolean c, boolean d) {
      public Pair<csl, aot> a() {
         cfv $$0 = this.d ? cfx.e.a() : this.b.b();
         csl $$1 = MinecraftServer.a(this.a, this.b.a(), this.c, $$0);
         if (!this.d) {
            $$1 = $$1.a(this.b.b());
         }

         List<anr> $$2 = this.a.g();
         aot $$3 = new aow(ans.b, $$2);
         return Pair.of($$1, $$3);
      }

      public aoo b() {
         return this.a;
      }

      public csl c() {
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
      R create(aot var1, agq var2, ij<agp> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      aha.b<D> get(aha.a var1);
   }
}
