import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class alo {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(alo.c $$0, alo.f<D> $$1, alo.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<ddr, atu> $$5 = $$0.a.a();
         atu $$6 = (atu)$$5.getSecond();
         jt<ala> $$7 = ala.a();
         jt<ala> $$8 = b($$6, $$7, ala.b, akm.a);
         ka.b $$9 = $$8.b(ala.c);
         ka.b $$10 = akm.a($$6, $$9, akm.b);
         ddr $$11 = (ddr)$$5.getFirst();
         alo.b<D> $$12 = $$1.get(new alo.a($$6, $$11, $$9, $$10));
         jt<ala> $$13 = $$8.a(ala.c, $$12.b);
         return alc.a($$6, $$13, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   private static ka.b a(aue $$0, jt<ala> $$1, ala $$2, List<akm.c<?>> $$3) {
      ka.b $$4 = $$1.b($$2);
      return akm.a($$0, $$4, $$3);
   }

   private static jt<ala> b(aue $$0, jt<ala> $$1, ala $$2, List<akm.c<?>> $$3) {
      ka.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(aue a, ddr b, ka.b c, ka.b d) {
   }

   public static record b<D>(D a, ka.b b) {
   }

   public static record c(alo.d a, eu.a b, int c) {
   }

   public static record d(atp a, ddr b, boolean c, boolean d) {
      public Pair<ddr, atu> a() {
         ddr $$0 = MinecraftServer.a(this.a, this.b, this.d, this.c);
         List<asq> $$1 = this.a.g();
         atu $$2 = new atx(ass.b, $$1);
         return Pair.of($$0, $$2);
      }

      public atp b() {
         return this.a;
      }

      public ddr c() {
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
      R create(atu var1, alc var2, jt<ala> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      alo.b<D> get(alo.a var1);
   }
}
