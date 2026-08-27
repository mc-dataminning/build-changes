import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class afo {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(afo.c $$0, afo.f<D> $$1, afo.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<cqj, anf> $$5 = $$0.a.a();
         anf $$6 = (anf)$$5.getSecond();
         hn<afd> $$7 = afd.a();
         hn<afd> $$8 = b($$6, $$7, afd.b, aep.a);
         hu.b $$9 = $$8.b(afd.c);
         hu.b $$10 = aep.a($$6, $$9, aep.b);
         cqj $$11 = (cqj)$$5.getFirst();
         afo.b<D> $$12 = $$1.get(new afo.a($$6, $$11, $$9, $$10));
         hn<afd> $$13 = $$8.a(afd.c, $$12.b);
         hu.b $$14 = $$13.b(afd.d);
         return afe.a($$6, $$14, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   private static hu.b a(anp $$0, hn<afd> $$1, afd $$2, List<aep.b<?>> $$3) {
      hu.b $$4 = $$1.b($$2);
      return aep.a($$0, $$4, $$3);
   }

   private static hn<afd> b(anp $$0, hn<afd> $$1, afd $$2, List<aep.b<?>> $$3) {
      hu.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(anp a, cqj b, hu.b c, hu.b d) {
   }

   public static record b<D>(D a, hu.b b) {
   }

   public static record c(afo.d a, du.a b, int c) {
   }

   public static record d(ana a, cqj b, boolean c, boolean d) {
      public Pair<cqj, anf> a() {
         cdx $$0 = this.d ? cdz.d.a() : this.b.b();
         cqj $$1 = MinecraftServer.a(this.a, this.b.a(), this.c, $$0);
         if (!this.d) {
            $$1 = $$1.a(this.b.b());
         }

         List<amd> $$2 = this.a.g();
         anf $$3 = new ani(ame.b, $$2);
         return Pair.of($$1, $$3);
      }

      public ana b() {
         return this.a;
      }

      public cqj c() {
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
      R create(anf var1, afe var2, hn<afd> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      afo.b<D> get(afo.a var1);
   }
}
