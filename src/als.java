import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class als {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(als.c $$0, als.f<D> $$1, als.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<dhx, auf> $$5 = $$0.a.a();
         auf $$6 = (auf)$$5.getSecond();
         jy<ald> $$7 = ald.a();
         List<ke.a<?>> $$8 = axg.a($$6, $$7.a(ald.a));
         kf.b $$9 = $$7.b(ald.b);
         List<jt.b<?>> $$10 = axg.a($$9, $$8);
         kf.b $$11 = akp.a($$6, $$10, akp.a);
         List<jt.b<?>> $$12 = Stream.concat($$10.stream(), $$11.c()).toList();
         kf.b $$13 = akp.a($$6, $$12, akp.b);
         dhx $$14 = (dhx)$$5.getFirst();
         jt.a $$15 = jt.a.a($$12.stream());
         als.b<D> $$16 = $$1.get(new als.a($$6, $$14, $$15, $$13));
         jy<ald> $$17 = $$7.a(ald.b, $$11, $$16.b);
         return alf.a($$6, $$17, $$8, $$14.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   public static record a(aup a, dhx b, jt.a c, kf.b d) {
   }

   public static record b<D>(D a, kf.b b) {
   }

   public static record c(als.d a, ey.a b, int c) {
   }

   public static record d(aua a, dhx b, boolean c, boolean d) {
      public Pair<dhx, auf> a() {
         dhx $$0 = MinecraftServer.a(this.a, this.b, this.d, this.c);
         List<atc> $$1 = this.a.h();
         auf $$2 = new aui(ate.b, $$1);
         return Pair.of($$0, $$2);
      }

      public aua b() {
         return this.a;
      }

      public dhx c() {
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
      R create(auf var1, alf var2, jy<ald> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      als.b<D> get(als.a var1);
   }
}
