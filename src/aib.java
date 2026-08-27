import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class aib {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(aib.c $$0, aib.f<D> $$1, aib.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<cuj, apy> $$5 = $$0.a.a();
         apy $$6 = (apy)$$5.getSecond();
         io<ahp> $$7 = ahp.a();
         io<ahp> $$8 = b($$6, $$7, ahp.b, ahb.a);
         iu.b $$9 = $$8.b(ahp.c);
         iu.b $$10 = ahb.a($$6, $$9, ahb.b);
         cuj $$11 = (cuj)$$5.getFirst();
         aib.b<D> $$12 = $$1.get(new aib.a($$6, $$11, $$9, $$10));
         io<ahp> $$13 = $$8.a(ahp.c, $$12.b);
         iu.b $$14 = $$13.b(ahp.d);
         return ahq.a($$6, $$14, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   private static iu.b a(aqi $$0, io<ahp> $$1, ahp $$2, List<ahb.b<?>> $$3) {
      iu.b $$4 = $$1.b($$2);
      return ahb.a($$0, $$4, $$3);
   }

   private static io<ahp> b(aqi $$0, io<ahp> $$1, ahp $$2, List<ahb.b<?>> $$3) {
      iu.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(aqi a, cuj b, iu.b c, iu.b d) {
   }

   public static record b<D>(D a, iu.b b) {
   }

   public static record c(aib.d a, dt.a b, int c) {
   }

   public static record d(apt a, cuj b, boolean c, boolean d) {
      public Pair<cuj, apy> a() {
         chs $$0 = this.d ? chu.e.a() : this.b.b();
         cuj $$1 = MinecraftServer.a(this.a, this.b.a(), this.c, $$0);
         if (!this.d) {
            $$1 = $$1.a(this.b.b());
         }

         List<aow> $$2 = this.a.g();
         apy $$3 = new aqb(aox.b, $$2);
         return Pair.of($$1, $$3);
      }

      public apt b() {
         return this.a;
      }

      public cuj c() {
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
      R create(apy var1, ahq var2, io<ahp> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      aib.b<D> get(aib.a var1);
   }
}
