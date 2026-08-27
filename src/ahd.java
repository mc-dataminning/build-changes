import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ahd {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(ahd.c $$0, ahd.f<D> $$1, ahd.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<cst, aox> $$5 = $$0.a.a();
         aox $$6 = (aox)$$5.getSecond();
         ij<agr> $$7 = agr.a();
         ij<agr> $$8 = b($$6, $$7, agr.b, agd.a);
         ip.b $$9 = $$8.b(agr.c);
         ip.b $$10 = agd.a($$6, $$9, agd.b);
         cst $$11 = (cst)$$5.getFirst();
         ahd.b<D> $$12 = $$1.get(new ahd.a($$6, $$11, $$9, $$10));
         ij<agr> $$13 = $$8.a(agr.c, $$12.b);
         ip.b $$14 = $$13.b(agr.d);
         return ags.a($$6, $$14, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   private static ip.b a(aph $$0, ij<agr> $$1, agr $$2, List<agd.b<?>> $$3) {
      ip.b $$4 = $$1.b($$2);
      return agd.a($$0, $$4, $$3);
   }

   private static ij<agr> b(aph $$0, ij<agr> $$1, agr $$2, List<agd.b<?>> $$3) {
      ip.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(aph a, cst b, ip.b c, ip.b d) {
   }

   public static record b<D>(D a, ip.b b) {
   }

   public static record c(ahd.d a, dv.a b, int c) {
   }

   public static record d(aos a, cst b, boolean c, boolean d) {
      public Pair<cst, aox> a() {
         cgd $$0 = this.d ? cgf.e.a() : this.b.b();
         cst $$1 = MinecraftServer.a(this.a, this.b.a(), this.c, $$0);
         if (!this.d) {
            $$1 = $$1.a(this.b.b());
         }

         List<anv> $$2 = this.a.g();
         aox $$3 = new apa(anw.b, $$2);
         return Pair.of($$1, $$3);
      }

      public aos b() {
         return this.a;
      }

      public cst c() {
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
      R create(aox var1, ags var2, ij<agr> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      ahd.b<D> get(ahd.a var1);
   }
}
