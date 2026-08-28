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
         Pair<djy, aus> $$5 = $$0.a.a();
         aus $$6 = (aus)$$5.getSecond();
         jl<alp> $$7 = alp.a();
         List<jr.a<?>> $$8 = axs.a($$6, $$7.a(alp.a));
         js.b $$9 = $$7.b(alp.b);
         List<jg.b<?>> $$10 = axs.a($$9, $$8);
         js.b $$11 = alb.a($$6, $$10, alb.a);
         List<jg.b<?>> $$12 = Stream.concat($$10.stream(), $$11.c()).toList();
         js.b $$13 = alb.a($$6, $$12, alb.b);
         djy $$14 = (djy)$$5.getFirst();
         jg.a $$15 = jg.a.a($$12.stream());
         ame.b<D> $$16 = $$1.get(new ame.a($$6, $$14, $$15, $$13));
         jl<alp> $$17 = $$7.a(alp.b, $$11, $$16.b);
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

   public static record a(avd a, djy b, jg.a c, js.b d) {
   }

   public static record b<D>(D a, js.b b) {
   }

   public static record c(ame.d a, ej.a b, int c) {
   }

   public static record d(aun a, djy b, boolean c, boolean d) {
      public Pair<djy, aus> a() {
         djy $$0 = MinecraftServer.a(this.a, this.b, this.d, this.c);
         List<atp> $$1 = this.a.h();
         aus $$2 = new auv(atr.b, $$1);
         return Pair.of($$0, $$2);
      }

      public aun b() {
         return this.a;
      }

      public djy c() {
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
      R create(aus var1, alr var2, jl<alp> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      ame.b<D> get(ame.a var1);
   }
}
