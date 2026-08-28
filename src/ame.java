import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ame {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(ame.c $$0, ame.f<D> $$1, ame.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<dkk, aus> $$5 = $$0.a.a();
         aus $$6 = (aus)$$5.getSecond();
         jm<alp> $$7 = alp.a();
         List<js.a<?>> $$8 = axs.a($$6, $$7.a(alp.a));
         jt.b $$9 = $$7.b(alp.b);
         List<jh.b<?>> $$10 = axs.a($$9, $$8);
         jt.b $$11 = alb.a($$6, $$10, alb.a);
         List<jh.b<?>> $$12 = Stream.concat($$10.stream(), $$11.c()).toList();
         jt.b $$13 = alb.a($$6, $$12, alb.b);
         dkk $$14 = (dkk)$$5.getFirst();
         jh.a $$15 = jh.a.a($$12.stream());
         ame.b<D> $$16 = $$1.get(new ame.a($$6, $$14, $$15, $$13));
         jm<alp> $$17 = $$7.a(alp.b, $$11, $$16.b);
         return alr.a($$6, $$17, $$8, $$14.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   public static record a(avd a, dkk b, jh.a c, jt.b d) {
   }

   public static record b<D>(D a, jt.b b) {
   }

   public static record c(ame.d a, ek.a b, int c) {
   }

   public static record d(aun a, dkk b, boolean c, boolean d) {
      public Pair<dkk, aus> a() {
         dkk $$0 = MinecraftServer.a(this.a, this.b, this.d, this.c);
         List<atp> $$1 = this.a.h();
         aus $$2 = new auv(atr.b, $$1);
         return Pair.of($$0, $$2);
      }

      public aun b() {
         return this.a;
      }

      public dkk c() {
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
      R create(aus var1, alr var2, jm<alp> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      ame.b<D> get(ame.a var1);
   }
}
