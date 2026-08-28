import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class amg {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(amg.c $$0, amg.f<D> $$1, amg.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<dkv, auu> $$5 = $$0.a.a();
         auu $$6 = (auu)$$5.getSecond();
         jm<alr> $$7 = alr.a();
         List<js.a<?>> $$8 = axu.a($$6, $$7.a(alr.a));
         jt.b $$9 = $$7.b(alr.b);
         List<jh.b<?>> $$10 = axu.a($$9, $$8);
         jt.b $$11 = ald.a($$6, $$10, ald.a);
         List<jh.b<?>> $$12 = Stream.concat($$10.stream(), $$11.c()).toList();
         jt.b $$13 = ald.a($$6, $$12, ald.b);
         dkv $$14 = (dkv)$$5.getFirst();
         jh.a $$15 = jh.a.a($$12.stream());
         amg.b<D> $$16 = $$1.get(new amg.a($$6, $$14, $$15, $$13));
         jm<alr> $$17 = $$7.a(alr.b, $$11, $$16.b);
         return alt.a($$6, $$17, $$8, $$14.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   public static record a(avf a, dkv b, jh.a c, jt.b d) {
   }

   public static record b<D>(D a, jt.b b) {
   }

   public static record c(amg.d a, ek.a b, int c) {
   }

   public static record d(aup a, dkv b, boolean c, boolean d) {
      public Pair<dkv, auu> a() {
         dkv $$0 = MinecraftServer.a(this.a, this.b, this.d, this.c);
         List<atr> $$1 = this.a.h();
         auu $$2 = new auy(att.b, $$1);
         return Pair.of($$0, $$2);
      }

      public aup b() {
         return this.a;
      }

      public dkv c() {
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
      R create(auu var1, alt var2, jm<alr> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      amg.b<D> get(amg.a var1);
   }
}
