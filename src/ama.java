import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ama {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(ama.c $$0, ama.f<D> $$1, ama.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<dfc, auj> $$5 = $$0.a.a();
         auj $$6 = (auj)$$5.getSecond();
         ju<all> $$7 = all.a();
         List<ka.a<?>> $$8 = axk.a($$6, $$7.a(all.a));
         kb.b $$9 = $$7.b(all.b);
         List<jp.b<?>> $$10 = axk.a($$9, $$8);
         kb.b $$11 = akx.a($$6, $$10, akx.a);
         List<jp.b<?>> $$12 = Stream.concat($$10.stream(), $$11.b()).toList();
         kb.b $$13 = akx.a($$6, $$12, akx.b);
         dfc $$14 = (dfc)$$5.getFirst();
         jp.a $$15 = jp.a.a($$12.stream());
         ama.b<D> $$16 = $$1.get(new ama.a($$6, $$14, $$15, $$13));
         ju<all> $$17 = $$7.a(all.b, $$11, $$16.b);
         return aln.a($$6, $$17, $$8, $$14.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   public static record a(aut a, dfc b, jp.a c, kb.b d) {
   }

   public static record b<D>(D a, kb.b b) {
   }

   public static record c(ama.d a, eu.a b, int c) {
   }

   public static record d(aue a, dfc b, boolean c, boolean d) {
      public Pair<dfc, auj> a() {
         dfc $$0 = MinecraftServer.a(this.a, this.b, this.d, this.c);
         List<atf> $$1 = this.a.g();
         auj $$2 = new aum(ath.b, $$1);
         return Pair.of($$0, $$2);
      }

      public aue b() {
         return this.a;
      }

      public dfc c() {
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
      R create(auj var1, aln var2, ju<all> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      ama.b<D> get(ama.a var1);
   }
}
