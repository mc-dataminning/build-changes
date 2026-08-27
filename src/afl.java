import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class afl {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(afl.c $$0, afl.f<D> $$1, afl.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<cqe, anc> $$5 = $$0.a.a();
         anc $$6 = (anc)$$5.getSecond();
         hl<afa> $$7 = afa.a();
         hl<afa> $$8 = b($$6, $$7, afa.b, aem.a);
         hs.b $$9 = $$8.b(afa.c);
         hs.b $$10 = aem.a($$6, $$9, aem.b);
         cqe $$11 = (cqe)$$5.getFirst();
         afl.b<D> $$12 = $$1.get(new afl.a($$6, $$11, $$9, $$10));
         hl<afa> $$13 = $$8.a(afa.c, $$12.b);
         hs.b $$14 = $$13.b(afa.d);
         return afb.a($$6, $$14, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   private static hs.b a(anm $$0, hl<afa> $$1, afa $$2, List<aem.b<?>> $$3) {
      hs.b $$4 = $$1.b($$2);
      return aem.a($$0, $$4, $$3);
   }

   private static hl<afa> b(anm $$0, hl<afa> $$1, afa $$2, List<aem.b<?>> $$3) {
      hs.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(anm a, cqe b, hs.b c, hs.b d) {
   }

   public static record b<D>(D a, hs.b b) {
   }

   public static record c(afl.d a, ds.a b, int c) {
   }

   public static record d(amx a, cqe b, boolean c, boolean d) {
      public Pair<cqe, anc> a() {
         cdu $$0 = this.d ? cdw.d.a() : this.b.b();
         cqe $$1 = MinecraftServer.a(this.a, this.b.a(), this.c, $$0);
         if (!this.d) {
            $$1 = $$1.a(this.b.b());
         }

         List<ama> $$2 = this.a.g();
         anc $$3 = new anf(amb.b, $$2);
         return Pair.of($$1, $$3);
      }

      public amx b() {
         return this.a;
      }

      public cqe c() {
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
      R create(anc var1, afb var2, hl<afa> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      afl.b<D> get(afl.a var1);
   }
}
