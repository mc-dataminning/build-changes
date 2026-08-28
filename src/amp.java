import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class amp {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(amp.c $$0, amp.f<D> $$1, amp.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<dlh, ave> $$5 = $$0.a.a();
         ave $$6 = (ave)$$5.getSecond();
         jn<ama> $$7 = ama.a();
         List<jt.a<?>> $$8 = ayd.a($$6, $$7.a(ama.a));
         ju.b $$9 = $$7.b(ama.b);
         List<ji.b<?>> $$10 = ayd.a($$9, $$8);
         ju.b $$11 = alm.a($$6, $$10, alm.a);
         List<ji.b<?>> $$12 = Stream.concat($$10.stream(), $$11.c()).toList();
         ju.b $$13 = alm.a($$6, $$12, alm.b);
         dlh $$14 = (dlh)$$5.getFirst();
         ji.a $$15 = ji.a.a($$12.stream());
         amp.b<D> $$16 = $$1.get(new amp.a($$6, $$14, $$15, $$13));
         jn<ama> $$17 = $$7.a(ama.b, $$11, $$16.b);
         return amc.a($$6, $$17, $$8, $$14.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   public static record a(avo a, dlh b, ji.a c, ju.b d) {
   }

   public static record b<D>(D a, ju.b b) {
   }

   public static record c(amp.d a, el.a b, int c) {
   }

   public static record d(auz a, dlh b, boolean c, boolean d) {
      public Pair<dlh, ave> a() {
         dlh $$0 = MinecraftServer.a(this.a, this.b, this.d, this.c);
         List<aua> $$1 = this.a.h();
         ave $$2 = new avh(auc.b, $$1);
         return Pair.of($$0, $$2);
      }

      public auz b() {
         return this.a;
      }

      public dlh c() {
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
      R create(ave var1, amc var2, jn<ama> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      amp.b<D> get(amp.a var1);
   }
}
