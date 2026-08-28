import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class amh {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(amh.c $$0, amh.f<D> $$1, amh.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<dgj, aus> $$5 = $$0.a.a();
         aus $$6 = (aus)$$5.getSecond();
         jx<als> $$7 = als.a();
         List<kd.a<?>> $$8 = axt.a($$6, $$7.a(als.a));
         ke.b $$9 = $$7.b(als.b);
         List<js.b<?>> $$10 = axt.a($$9, $$8);
         ke.b $$11 = ale.a($$6, $$10, ale.a);
         List<js.b<?>> $$12 = Stream.concat($$10.stream(), $$11.c()).toList();
         ke.b $$13 = ale.a($$6, $$12, ale.b);
         dgj $$14 = (dgj)$$5.getFirst();
         js.a $$15 = js.a.a($$12.stream());
         amh.b<D> $$16 = $$1.get(new amh.a($$6, $$14, $$15, $$13));
         jx<als> $$17 = $$7.a(als.b, $$11, $$16.b);
         return alu.a($$6, $$17, $$8, $$14.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   public static record a(avd a, dgj b, js.a c, ke.b d) {
   }

   public static record b<D>(D a, ke.b b) {
   }

   public static record c(amh.d a, ex.a b, int c) {
   }

   public static record d(aun a, dgj b, boolean c, boolean d) {
      public Pair<dgj, aus> a() {
         dgj $$0 = MinecraftServer.a(this.a, this.b, this.d, this.c);
         List<ato> $$1 = this.a.h();
         aus $$2 = new auv(atq.b, $$1);
         return Pair.of($$0, $$2);
      }

      public aun b() {
         return this.a;
      }

      public dgj c() {
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
      R create(aus var1, alu var2, jx<als> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      amh.b<D> get(amh.a var1);
   }
}
