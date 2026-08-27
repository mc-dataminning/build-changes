import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class aic {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(aic.c $$0, aic.f<D> $$1, aic.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<cur, apz> $$5 = $$0.a.a();
         apz $$6 = (apz)$$5.getSecond();
         io<ahq> $$7 = ahq.a();
         io<ahq> $$8 = b($$6, $$7, ahq.b, ahc.a);
         iu.b $$9 = $$8.b(ahq.c);
         iu.b $$10 = ahc.a($$6, $$9, ahc.b);
         cur $$11 = (cur)$$5.getFirst();
         aic.b<D> $$12 = $$1.get(new aic.a($$6, $$11, $$9, $$10));
         io<ahq> $$13 = $$8.a(ahq.c, $$12.b);
         iu.b $$14 = $$13.b(ahq.d);
         return ahr.a($$6, $$14, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   private static iu.b a(aqj $$0, io<ahq> $$1, ahq $$2, List<ahc.b<?>> $$3) {
      iu.b $$4 = $$1.b($$2);
      return ahc.a($$0, $$4, $$3);
   }

   private static io<ahq> b(aqj $$0, io<ahq> $$1, ahq $$2, List<ahc.b<?>> $$3) {
      iu.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(aqj a, cur b, iu.b c, iu.b d) {
   }

   public static record b<D>(D a, iu.b b) {
   }

   public static record c(aic.d a, dt.a b, int c) {
   }

   public static record d(apu a, cur b, boolean c, boolean d) {
      public Pair<cur, apz> a() {
         cia $$0 = this.d ? cic.e.a() : this.b.b();
         cur $$1 = MinecraftServer.a(this.a, this.b.a(), this.c, $$0);
         if (!this.d) {
            $$1 = $$1.a(this.b.b());
         }

         List<aox> $$2 = this.a.g();
         apz $$3 = new aqc(aoy.b, $$2);
         return Pair.of($$1, $$3);
      }

      public apu b() {
         return this.a;
      }

      public cur c() {
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
      R create(apz var1, ahr var2, io<ahq> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      aic.b<D> get(aic.a var1);
   }
}
