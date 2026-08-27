import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ald {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(ald.c $$0, ald.f<D> $$1, ald.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<dax, ath> $$5 = $$0.a.a();
         ath $$6 = (ath)$$5.getSecond();
         jd<akq> $$7 = akq.a();
         jd<akq> $$8 = b($$6, $$7, akq.b, akc.a);
         jk.b $$9 = $$8.b(akq.c);
         jk.b $$10 = akc.a($$6, $$9, akc.b);
         dax $$11 = (dax)$$5.getFirst();
         ald.b<D> $$12 = $$1.get(new ald.a($$6, $$11, $$9, $$10));
         jd<akq> $$13 = $$8.a(akq.c, $$12.b);
         return aks.a($$6, $$13, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
            if ($$2x != null) {
               $$6.close();
            }
         }).thenApplyAsync($$4x -> {
            $$4x.g();
            return $$2.create($$6, $$4x, $$13, $$12.a);
         }, $$4);
      } catch (Exception var14) {
         return CompletableFuture.failedFuture(var14);
      }
   }

   private static jk.b a(atr $$0, jd<akq> $$1, akq $$2, List<akc.c<?>> $$3) {
      jk.b $$4 = $$1.b($$2);
      return akc.a($$0, $$4, $$3);
   }

   private static jd<akq> b(atr $$0, jd<akq> $$1, akq $$2, List<akc.c<?>> $$3) {
      jk.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(atr a, dax b, jk.b c, jk.b d) {
   }

   public static record b<D>(D a, jk.b b) {
   }

   public static record c(ald.d a, ee.a b, int c) {
   }

   public static record d(atc a, dax b, boolean c, boolean d) {
      public Pair<dax, ath> a() {
         cnu $$0 = this.d ? cnw.e.a() : this.b.b();
         dax $$1 = MinecraftServer.a(this.a, this.b.a(), this.c, $$0);
         if (!this.d) {
            $$1 = $$1.a(this.b.b());
         }

         List<asd> $$2 = this.a.g();
         ath $$3 = new atk(asf.b, $$2);
         return Pair.of($$1, $$3);
      }

      public atc b() {
         return this.a;
      }

      public dax c() {
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
      R create(ath var1, aks var2, jd<akq> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      ald.b<D> get(ald.a var1);
   }
}
