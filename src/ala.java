import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ala {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(ala.c $$0, ala.f<D> $$1, ala.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<dao, ate> $$5 = $$0.a.a();
         ate $$6 = (ate)$$5.getSecond();
         jc<ako> $$7 = ako.a();
         jc<ako> $$8 = b($$6, $$7, ako.b, aka.a);
         jj.b $$9 = $$8.b(ako.c);
         jj.b $$10 = aka.a($$6, $$9, aka.b);
         dao $$11 = (dao)$$5.getFirst();
         ala.b<D> $$12 = $$1.get(new ala.a($$6, $$11, $$9, $$10));
         jc<ako> $$13 = $$8.a(ako.c, $$12.b);
         jj.b $$14 = $$13.b(ako.d);
         return akp.a($$6, $$14, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   private static jj.b a(ato $$0, jc<ako> $$1, ako $$2, List<aka.c<?>> $$3) {
      jj.b $$4 = $$1.b($$2);
      return aka.a($$0, $$4, $$3);
   }

   private static jc<ako> b(ato $$0, jc<ako> $$1, ako $$2, List<aka.c<?>> $$3) {
      jj.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(ato a, dao b, jj.b c, jj.b d) {
   }

   public static record b<D>(D a, jj.b b) {
   }

   public static record c(ala.d a, ed.a b, int c) {
   }

   public static record d(asz a, dao b, boolean c, boolean d) {
      public Pair<dao, ate> a() {
         cmy $$0 = this.d ? cna.e.a() : this.b.b();
         dao $$1 = MinecraftServer.a(this.a, this.b.a(), this.c, $$0);
         if (!this.d) {
            $$1 = $$1.a(this.b.b());
         }

         List<asa> $$2 = this.a.g();
         ate $$3 = new ath(asc.b, $$2);
         return Pair.of($$1, $$3);
      }

      public asz b() {
         return this.a;
      }

      public dao c() {
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
      R create(ate var1, akp var2, jc<ako> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      ala.b<D> get(ala.a var1);
   }
}
