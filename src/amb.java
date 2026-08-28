import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class amb {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(amb.c $$0, amb.f<D> $$1, amb.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<din, aup> $$5 = $$0.a.a();
         aup $$6 = (aup)$$5.getSecond();
         jz<alm> $$7 = alm.a();
         List<kf.a<?>> $$8 = axq.a($$6, $$7.a(alm.a));
         kg.b $$9 = $$7.b(alm.b);
         List<ju.b<?>> $$10 = axq.a($$9, $$8);
         kg.b $$11 = aky.a($$6, $$10, aky.a);
         List<ju.b<?>> $$12 = Stream.concat($$10.stream(), $$11.c()).toList();
         kg.b $$13 = aky.a($$6, $$12, aky.b);
         din $$14 = (din)$$5.getFirst();
         ju.a $$15 = ju.a.a($$12.stream());
         amb.b<D> $$16 = $$1.get(new amb.a($$6, $$14, $$15, $$13));
         jz<alm> $$17 = $$7.a(alm.b, $$11, $$16.b);
         return alo.a($$6, $$17, $$8, $$14.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
            if ($$2x != null) {
               $$6.close();
            }
         }).thenApplyAsync($$4x -> {
            $$4x.g();
            return $$2.create($$6, $$4x, $$17, $$16.a);
         }, $$4);
      } catch (Exception var18) {
         return CompletableFuture.failedFuture(var18);
      }
   }

   public static record a(ava a, din b, ju.a c, kg.b d) {
   }

   public static record b<D>(D a, kg.b b) {
   }

   public static record c(amb.d a, ey.a b, int c) {
   }

   public static record d(auk a, din b, boolean c, boolean d) {
      public Pair<din, aup> a() {
         din $$0 = MinecraftServer.a(this.a, this.b, this.d, this.c);
         List<atm> $$1 = this.a.h();
         aup $$2 = new aus(ato.b, $$1);
         return Pair.of($$0, $$2);
      }

      public auk b() {
         return this.a;
      }

      public din c() {
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
      R create(aup var1, alo var2, jz<alm> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      amb.b<D> get(amb.a var1);
   }
}
