import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class alg {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(alg.c $$0, alg.f<D> $$1, alg.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<dda, atm> $$5 = $$0.a.a();
         atm $$6 = (atm)$$5.getSecond();
         jq<akt> $$7 = akt.a();
         jq<akt> $$8 = b($$6, $$7, akt.b, akf.a);
         jx.b $$9 = $$8.b(akt.c);
         jx.b $$10 = akf.a($$6, $$9, akf.b);
         dda $$11 = (dda)$$5.getFirst();
         alg.b<D> $$12 = $$1.get(new alg.a($$6, $$11, $$9, $$10));
         jq<akt> $$13 = $$8.a(akt.c, $$12.b);
         return akv.a($$6, $$13, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   private static jx.b a(atw $$0, jq<akt> $$1, akt $$2, List<akf.c<?>> $$3) {
      jx.b $$4 = $$1.b($$2);
      return akf.a($$0, $$4, $$3);
   }

   private static jq<akt> b(atw $$0, jq<akt> $$1, akt $$2, List<akf.c<?>> $$3) {
      jx.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(atw a, dda b, jx.b c, jx.b d) {
   }

   public static record b<D>(D a, jx.b b) {
   }

   public static record c(alg.d a, er.a b, int c) {
   }

   public static record d(ath a, dda b, boolean c, boolean d) {
      public Pair<dda, atm> a() {
         dda $$0 = MinecraftServer.a(this.a, this.b, this.d, this.c);
         List<asi> $$1 = this.a.g();
         atm $$2 = new atp(ask.b, $$1);
         return Pair.of($$0, $$2);
      }

      public ath b() {
         return this.a;
      }

      public dda c() {
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
      R create(atm var1, akv var2, jq<akt> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      alg.b<D> get(alg.a var1);
   }
}
