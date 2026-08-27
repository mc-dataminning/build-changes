import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class akc {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(akc.c $$0, akc.f<D> $$1, akc.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<cxt, ase> $$5 = $$0.a.a();
         ase $$6 = (ase)$$5.getSecond();
         is<ajq> $$7 = ajq.a();
         is<ajq> $$8 = b($$6, $$7, ajq.b, ajc.a);
         iz.b $$9 = $$8.b(ajq.c);
         iz.b $$10 = ajc.a($$6, $$9, ajc.b);
         cxt $$11 = (cxt)$$5.getFirst();
         akc.b<D> $$12 = $$1.get(new akc.a($$6, $$11, $$9, $$10));
         is<ajq> $$13 = $$8.a(ajq.c, $$12.b);
         iz.b $$14 = $$13.b(ajq.d);
         return ajr.a($$6, $$14, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   private static iz.b a(aso $$0, is<ajq> $$1, ajq $$2, List<ajc.c<?>> $$3) {
      iz.b $$4 = $$1.b($$2);
      return ajc.a($$0, $$4, $$3);
   }

   private static is<ajq> b(aso $$0, is<ajq> $$1, ajq $$2, List<ajc.c<?>> $$3) {
      iz.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(aso a, cxt b, iz.b c, iz.b d) {
   }

   public static record b<D>(D a, iz.b b) {
   }

   public static record c(akc.d a, dv.a b, int c) {
   }

   public static record d(arz a, cxt b, boolean c, boolean d) {
      public Pair<cxt, ase> a() {
         clf $$0 = this.d ? clh.e.a() : this.b.b();
         cxt $$1 = MinecraftServer.a(this.a, this.b.a(), this.c, $$0);
         if (!this.d) {
            $$1 = $$1.a(this.b.b());
         }

         List<ara> $$2 = this.a.g();
         ase $$3 = new ash(arc.b, $$2);
         return Pair.of($$1, $$3);
      }

      public arz b() {
         return this.a;
      }

      public cxt c() {
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
      R create(ase var1, ajr var2, is<ajq> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      akc.b<D> get(akc.a var1);
   }
}
