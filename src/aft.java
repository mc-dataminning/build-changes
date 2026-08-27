import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class aft {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(aft.c $$0, aft.f<D> $$1, aft.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<cqu, anm> $$5 = $$0.a.a();
         anm $$6 = (anm)$$5.getSecond();
         hl<afi> $$7 = afi.a();
         hl<afi> $$8 = b($$6, $$7, afi.b, aeu.a);
         hr.b $$9 = $$8.b(afi.c);
         hr.b $$10 = aeu.a($$6, $$9, aeu.b);
         cqu $$11 = (cqu)$$5.getFirst();
         aft.b<D> $$12 = $$1.get(new aft.a($$6, $$11, $$9, $$10));
         hl<afi> $$13 = $$8.a(afi.c, $$12.b);
         hr.b $$14 = $$13.b(afi.d);
         return afj.a($$6, $$14, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   private static hr.b a(anw $$0, hl<afi> $$1, afi $$2, List<aeu.b<?>> $$3) {
      hr.b $$4 = $$1.b($$2);
      return aeu.a($$0, $$4, $$3);
   }

   private static hl<afi> b(anw $$0, hl<afi> $$1, afi $$2, List<aeu.b<?>> $$3) {
      hr.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(anw a, cqu b, hr.b c, hr.b d) {
   }

   public static record b<D>(D a, hr.b b) {
   }

   public static record c(aft.d a, du.a b, int c) {
   }

   public static record d(anh a, cqu b, boolean c, boolean d) {
      public Pair<cqu, anm> a() {
         cei $$0 = this.d ? cek.d.a() : this.b.b();
         cqu $$1 = MinecraftServer.a(this.a, this.b.a(), this.c, $$0);
         if (!this.d) {
            $$1 = $$1.a(this.b.b());
         }

         List<amk> $$2 = this.a.g();
         anm $$3 = new anp(aml.b, $$2);
         return Pair.of($$1, $$3);
      }

      public anh b() {
         return this.a;
      }

      public cqu c() {
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
      R create(anm var1, afj var2, hl<afi> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      aft.b<D> get(aft.a var1);
   }
}
