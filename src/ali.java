import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ali {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(ali.c $$0, ali.f<D> $$1, ali.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<dbr, atm> $$5 = $$0.a.a();
         atm $$6 = (atm)$$5.getSecond();
         je<akv> $$7 = akv.a();
         je<akv> $$8 = b($$6, $$7, akv.b, akh.a);
         jl.b $$9 = $$8.b(akv.c);
         jl.b $$10 = akh.a($$6, $$9, akh.b);
         dbr $$11 = (dbr)$$5.getFirst();
         ali.b<D> $$12 = $$1.get(new ali.a($$6, $$11, $$9, $$10));
         je<akv> $$13 = $$8.a(akv.c, $$12.b);
         return akx.a($$6, $$13, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
            if ($$2x != null) {
               $$6.close();
            }
         }).thenApplyAsync($$4x -> {
            $$4x.g();
            return $$2.create($$6, $$4x, $$13, $$12.a);
         }, $$4);
      } catch (Exception var14) {
         return CompletableFuture.failedFuture(var14);
      }
   }

   private static jl.b a(atw $$0, je<akv> $$1, akv $$2, List<akh.c<?>> $$3) {
      jl.b $$4 = $$1.b($$2);
      return akh.a($$0, $$4, $$3);
   }

   private static je<akv> b(atw $$0, je<akv> $$1, akv $$2, List<akh.c<?>> $$3) {
      jl.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(atw a, dbr b, jl.b c, jl.b d) {
   }

   public static record b<D>(D a, jl.b b) {
   }

   public static record c(ali.d a, ef.a b, int c) {
   }

   public static record d(ath a, dbr b, boolean c, boolean d) {
      public Pair<dbr, atm> a() {
         coj $$0 = this.d ? col.e.a() : this.b.b();
         dbr $$1 = MinecraftServer.a(this.a, this.b.a(), this.c, $$0);
         if (!this.d) {
            $$1 = $$1.a(this.b.b());
         }

         List<asi> $$2 = this.a.g();
         atm $$3 = new atp(ask.b, $$2);
         return Pair.of($$1, $$3);
      }

      public ath b() {
         return this.a;
      }

      public dbr c() {
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
      R create(atm var1, akx var2, je<akv> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      ali.b<D> get(ali.a var1);
   }
}
