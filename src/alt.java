import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class alt {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(alt.c $$0, alt.f<D> $$1, alt.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<dhg, auf> $$5 = $$0.a.a();
         auf $$6 = (auf)$$5.getSecond();
         jy<ale> $$7 = ale.a();
         List<ke.a<?>> $$8 = axg.a($$6, $$7.a(ale.a));
         kf.b $$9 = $$7.b(ale.b);
         List<jt.b<?>> $$10 = axg.a($$9, $$8);
         kf.b $$11 = akq.a($$6, $$10, akq.a);
         List<jt.b<?>> $$12 = Stream.concat($$10.stream(), $$11.c()).toList();
         kf.b $$13 = akq.a($$6, $$12, akq.b);
         dhg $$14 = (dhg)$$5.getFirst();
         jt.a $$15 = jt.a.a($$12.stream());
         alt.b<D> $$16 = $$1.get(new alt.a($$6, $$14, $$15, $$13));
         jy<ale> $$17 = $$7.a(ale.b, $$11, $$16.b);
         return alg.a($$6, $$17, $$8, $$14.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   public static record a(aup a, dhg b, jt.a c, kf.b d) {
   }

   public static record b<D>(D a, kf.b b) {
   }

   public static record c(alt.d a, ey.a b, int c) {
   }

   public static record d(aua a, dhg b, boolean c, boolean d) {
      public Pair<dhg, auf> a() {
         dhg $$0 = MinecraftServer.a(this.a, this.b, this.d, this.c);
         List<atc> $$1 = this.a.h();
         auf $$2 = new aui(ate.b, $$1);
         return Pair.of($$0, $$2);
      }

      public aua b() {
         return this.a;
      }

      public dhg c() {
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
      R create(auf var1, alg var2, jy<ale> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      alt.b<D> get(alt.a var1);
   }
}
