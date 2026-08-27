import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class afs {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(afs.c $$0, afs.f<D> $$1, afs.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<cqq, anl> $$5 = $$0.a.a();
         anl $$6 = (anl)$$5.getSecond();
         hn<afh> $$7 = afh.a();
         hn<afh> $$8 = b($$6, $$7, afh.b, aet.a);
         hu.b $$9 = $$8.b(afh.c);
         hu.b $$10 = aet.a($$6, $$9, aet.b);
         cqq $$11 = (cqq)$$5.getFirst();
         afs.b<D> $$12 = $$1.get(new afs.a($$6, $$11, $$9, $$10));
         hn<afh> $$13 = $$8.a(afh.c, $$12.b);
         hu.b $$14 = $$13.b(afh.d);
         return afi.a($$6, $$14, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   private static hu.b a(anv $$0, hn<afh> $$1, afh $$2, List<aet.b<?>> $$3) {
      hu.b $$4 = $$1.b($$2);
      return aet.a($$0, $$4, $$3);
   }

   private static hn<afh> b(anv $$0, hn<afh> $$1, afh $$2, List<aet.b<?>> $$3) {
      hu.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(anv a, cqq b, hu.b c, hu.b d) {
   }

   public static record b<D>(D a, hu.b b) {
   }

   public static record c(afs.d a, du.a b, int c) {
   }

   public static record d(ang a, cqq b, boolean c, boolean d) {
      public Pair<cqq, anl> a() {
         cee $$0 = this.d ? ceg.d.a() : this.b.b();
         cqq $$1 = MinecraftServer.a(this.a, this.b.a(), this.c, $$0);
         if (!this.d) {
            $$1 = $$1.a(this.b.b());
         }

         List<amj> $$2 = this.a.g();
         anl $$3 = new ano(amk.b, $$2);
         return Pair.of($$1, $$3);
      }

      public ang b() {
         return this.a;
      }

      public cqq c() {
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
      R create(anl var1, afi var2, hn<afh> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      afs.b<D> get(afs.a var1);
   }
}
