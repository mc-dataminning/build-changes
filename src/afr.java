import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class afr {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(afr.c $$0, afr.f<D> $$1, afr.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<cqo, ank> $$5 = $$0.a.a();
         ank $$6 = (ank)$$5.getSecond();
         hn<afg> $$7 = afg.a();
         hn<afg> $$8 = b($$6, $$7, afg.b, aes.a);
         hu.b $$9 = $$8.b(afg.c);
         hu.b $$10 = aes.a($$6, $$9, aes.b);
         cqo $$11 = (cqo)$$5.getFirst();
         afr.b<D> $$12 = $$1.get(new afr.a($$6, $$11, $$9, $$10));
         hn<afg> $$13 = $$8.a(afg.c, $$12.b);
         hu.b $$14 = $$13.b(afg.d);
         return afh.a($$6, $$14, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   private static hu.b a(anu $$0, hn<afg> $$1, afg $$2, List<aes.b<?>> $$3) {
      hu.b $$4 = $$1.b($$2);
      return aes.a($$0, $$4, $$3);
   }

   private static hn<afg> b(anu $$0, hn<afg> $$1, afg $$2, List<aes.b<?>> $$3) {
      hu.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(anu a, cqo b, hu.b c, hu.b d) {
   }

   public static record b<D>(D a, hu.b b) {
   }

   public static record c(afr.d a, du.a b, int c) {
   }

   public static record d(anf a, cqo b, boolean c, boolean d) {
      public Pair<cqo, ank> a() {
         cec $$0 = this.d ? cee.d.a() : this.b.b();
         cqo $$1 = MinecraftServer.a(this.a, this.b.a(), this.c, $$0);
         if (!this.d) {
            $$1 = $$1.a(this.b.b());
         }

         List<ami> $$2 = this.a.g();
         ank $$3 = new ann(amj.b, $$2);
         return Pair.of($$1, $$3);
      }

      public anf b() {
         return this.a;
      }

      public cqo c() {
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
      R create(ank var1, afh var2, hn<afg> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      afr.b<D> get(afr.a var1);
   }
}
