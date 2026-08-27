import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ajt {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(ajt.c $$0, ajt.f<D> $$1, ajt.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<cwl, arr> $$5 = $$0.a.a();
         arr $$6 = (arr)$$5.getSecond();
         iq<ajh> $$7 = ajh.a();
         iq<ajh> $$8 = b($$6, $$7, ajh.b, ait.a);
         iw.b $$9 = $$8.b(ajh.c);
         iw.b $$10 = ait.a($$6, $$9, ait.b);
         cwl $$11 = (cwl)$$5.getFirst();
         ajt.b<D> $$12 = $$1.get(new ajt.a($$6, $$11, $$9, $$10));
         iq<ajh> $$13 = $$8.a(ajh.c, $$12.b);
         iw.b $$14 = $$13.b(ajh.d);
         return aji.a($$6, $$14, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   private static iw.b a(asb $$0, iq<ajh> $$1, ajh $$2, List<ait.c<?>> $$3) {
      iw.b $$4 = $$1.b($$2);
      return ait.a($$0, $$4, $$3);
   }

   private static iq<ajh> b(asb $$0, iq<ajh> $$1, ajh $$2, List<ait.c<?>> $$3) {
      iw.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(asb a, cwl b, iw.b c, iw.b d) {
   }

   public static record b<D>(D a, iw.b b) {
   }

   public static record c(ajt.d a, dv.a b, int c) {
   }

   public static record d(arm a, cwl b, boolean c, boolean d) {
      public Pair<cwl, arr> a() {
         cjw $$0 = this.d ? cjy.e.a() : this.b.b();
         cwl $$1 = MinecraftServer.a(this.a, this.b.a(), this.c, $$0);
         if (!this.d) {
            $$1 = $$1.a(this.b.b());
         }

         List<aqp> $$2 = this.a.g();
         arr $$3 = new aru(aqq.b, $$2);
         return Pair.of($$1, $$3);
      }

      public arm b() {
         return this.a;
      }

      public cwl c() {
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
      R create(arr var1, aji var2, iq<ajh> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      ajt.b<D> get(ajt.a var1);
   }
}
