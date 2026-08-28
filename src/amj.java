import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class amj {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(amj.c $$0, amj.f<D> $$1, amj.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<dgc, aut> $$5 = $$0.a.a();
         aut $$6 = (aut)$$5.getSecond();
         jx<alu> $$7 = alu.a();
         List<kd.a<?>> $$8 = axu.a($$6, $$7.a(alu.a));
         ke.b $$9 = $$7.b(alu.b);
         List<js.b<?>> $$10 = axu.a($$9, $$8);
         ke.b $$11 = alg.a($$6, $$10, alg.a);
         List<js.b<?>> $$12 = Stream.concat($$10.stream(), $$11.c()).toList();
         ke.b $$13 = alg.a($$6, $$12, alg.b);
         dgc $$14 = (dgc)$$5.getFirst();
         js.a $$15 = js.a.a($$12.stream());
         amj.b<D> $$16 = $$1.get(new amj.a($$6, $$14, $$15, $$13));
         jx<alu> $$17 = $$7.a(alu.b, $$11, $$16.b);
         return alw.a($$6, $$17, $$8, $$14.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   public static record a(ave a, dgc b, js.a c, ke.b d) {
   }

   public static record b<D>(D a, ke.b b) {
   }

   public static record c(amj.d a, ex.a b, int c) {
   }

   public static record d(auo a, dgc b, boolean c, boolean d) {
      public Pair<dgc, aut> a() {
         dgc $$0 = MinecraftServer.a(this.a, this.b, this.d, this.c);
         List<atp> $$1 = this.a.h();
         aut $$2 = new auw(atr.b, $$1);
         return Pair.of($$0, $$2);
      }

      public auo b() {
         return this.a;
      }

      public dgc c() {
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
      R create(aut var1, alw var2, jx<alu> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      amj.b<D> get(amj.a var1);
   }
}
