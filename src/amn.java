import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class amn {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(amn.c $$0, amn.f<D> $$1, amn.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<dhw, avb> $$5 = $$0.a.a();
         avb $$6 = (avb)$$5.getSecond();
         jx<aly> $$7 = aly.a();
         List<kd.a<?>> $$8 = ayb.a($$6, $$7.a(aly.a));
         ke.b $$9 = $$7.b(aly.b);
         List<js.b<?>> $$10 = ayb.a($$9, $$8);
         ke.b $$11 = alk.a($$6, $$10, alk.a);
         List<js.b<?>> $$12 = Stream.concat($$10.stream(), $$11.c()).toList();
         ke.b $$13 = alk.a($$6, $$12, alk.b);
         dhw $$14 = (dhw)$$5.getFirst();
         js.a $$15 = js.a.a($$12.stream());
         amn.b<D> $$16 = $$1.get(new amn.a($$6, $$14, $$15, $$13));
         jx<aly> $$17 = $$7.a(aly.b, $$11, $$16.b);
         return ama.a($$6, $$17, $$8, $$14.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   public static record a(avl a, dhw b, js.a c, ke.b d) {
   }

   public static record b<D>(D a, ke.b b) {
   }

   public static record c(amn.d a, ex.a b, int c) {
   }

   public static record d(auv a, dhw b, boolean c, boolean d) {
      public Pair<dhw, avb> a() {
         dhw $$0 = MinecraftServer.a(this.a, this.b, this.d, this.c);
         List<atw> $$1 = this.a.h();
         avb $$2 = new ave(aty.b, $$1);
         return Pair.of($$0, $$2);
      }

      public auv b() {
         return this.a;
      }

      public dhw c() {
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
      R create(avb var1, ama var2, jx<aly> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      amn.b<D> get(amn.a var1);
   }
}
