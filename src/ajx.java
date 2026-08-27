import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ajx {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(ajx.c $$0, ajx.f<D> $$1, ajx.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<cwy, arv> $$5 = $$0.a.a();
         arv $$6 = (arv)$$5.getSecond();
         is<ajl> $$7 = ajl.a();
         is<ajl> $$8 = b($$6, $$7, ajl.b, aix.a);
         iy.b $$9 = $$8.b(ajl.c);
         iy.b $$10 = aix.a($$6, $$9, aix.b);
         cwy $$11 = (cwy)$$5.getFirst();
         ajx.b<D> $$12 = $$1.get(new ajx.a($$6, $$11, $$9, $$10));
         is<ajl> $$13 = $$8.a(ajl.c, $$12.b);
         iy.b $$14 = $$13.b(ajl.d);
         return ajm.a($$6, $$14, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   private static iy.b a(asf $$0, is<ajl> $$1, ajl $$2, List<aix.c<?>> $$3) {
      iy.b $$4 = $$1.b($$2);
      return aix.a($$0, $$4, $$3);
   }

   private static is<ajl> b(asf $$0, is<ajl> $$1, ajl $$2, List<aix.c<?>> $$3) {
      iy.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(asf a, cwy b, iy.b c, iy.b d) {
   }

   public static record b<D>(D a, iy.b b) {
   }

   public static record c(ajx.d a, dv.a b, int c) {
   }

   public static record d(arq a, cwy b, boolean c, boolean d) {
      public Pair<cwy, arv> a() {
         ckl $$0 = this.d ? ckn.e.a() : this.b.b();
         cwy $$1 = MinecraftServer.a(this.a, this.b.a(), this.c, $$0);
         if (!this.d) {
            $$1 = $$1.a(this.b.b());
         }

         List<aqt> $$2 = this.a.g();
         arv $$3 = new ary(aqu.b, $$2);
         return Pair.of($$1, $$3);
      }

      public arq b() {
         return this.a;
      }

      public cwy c() {
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
      R create(arv var1, ajm var2, is<ajl> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      ajx.b<D> get(ajx.a var1);
   }
}
