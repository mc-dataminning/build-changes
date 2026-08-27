import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ahy {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(ahy.c $$0, ahy.f<D> $$1, ahy.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<cuc, aps> $$5 = $$0.a.a();
         aps $$6 = (aps)$$5.getSecond();
         io<ahm> $$7 = ahm.a();
         io<ahm> $$8 = b($$6, $$7, ahm.b, agy.a);
         iu.b $$9 = $$8.b(ahm.c);
         iu.b $$10 = agy.a($$6, $$9, agy.b);
         cuc $$11 = (cuc)$$5.getFirst();
         ahy.b<D> $$12 = $$1.get(new ahy.a($$6, $$11, $$9, $$10));
         io<ahm> $$13 = $$8.a(ahm.c, $$12.b);
         iu.b $$14 = $$13.b(ahm.d);
         return ahn.a($$6, $$14, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   private static iu.b a(aqc $$0, io<ahm> $$1, ahm $$2, List<agy.b<?>> $$3) {
      iu.b $$4 = $$1.b($$2);
      return agy.a($$0, $$4, $$3);
   }

   private static io<ahm> b(aqc $$0, io<ahm> $$1, ahm $$2, List<agy.b<?>> $$3) {
      iu.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(aqc a, cuc b, iu.b c, iu.b d) {
   }

   public static record b<D>(D a, iu.b b) {
   }

   public static record c(ahy.d a, dt.a b, int c) {
   }

   public static record d(apn a, cuc b, boolean c, boolean d) {
      public Pair<cuc, aps> a() {
         chl $$0 = this.d ? chn.e.a() : this.b.b();
         cuc $$1 = MinecraftServer.a(this.a, this.b.a(), this.c, $$0);
         if (!this.d) {
            $$1 = $$1.a(this.b.b());
         }

         List<aoq> $$2 = this.a.g();
         aps $$3 = new apv(aor.b, $$2);
         return Pair.of($$1, $$3);
      }

      public apn b() {
         return this.a;
      }

      public cuc c() {
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
      R create(aps var1, ahn var2, io<ahm> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      ahy.b<D> get(ahy.a var1);
   }
}
