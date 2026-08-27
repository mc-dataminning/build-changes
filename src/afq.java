import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class afq {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(afq.c $$0, afq.f<D> $$1, afq.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<cqo, anj> $$5 = $$0.a.a();
         anj $$6 = (anj)$$5.getSecond();
         hl<aff> $$7 = aff.a();
         hl<aff> $$8 = b($$6, $$7, aff.b, aer.a);
         hr.b $$9 = $$8.b(aff.c);
         hr.b $$10 = aer.a($$6, $$9, aer.b);
         cqo $$11 = (cqo)$$5.getFirst();
         afq.b<D> $$12 = $$1.get(new afq.a($$6, $$11, $$9, $$10));
         hl<aff> $$13 = $$8.a(aff.c, $$12.b);
         hr.b $$14 = $$13.b(aff.d);
         return afg.a($$6, $$14, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   private static hr.b a(ant $$0, hl<aff> $$1, aff $$2, List<aer.b<?>> $$3) {
      hr.b $$4 = $$1.b($$2);
      return aer.a($$0, $$4, $$3);
   }

   private static hl<aff> b(ant $$0, hl<aff> $$1, aff $$2, List<aer.b<?>> $$3) {
      hr.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(ant a, cqo b, hr.b c, hr.b d) {
   }

   public static record b<D>(D a, hr.b b) {
   }

   public static record c(afq.d a, du.a b, int c) {
   }

   public static record d(ane a, cqo b, boolean c, boolean d) {
      public Pair<cqo, anj> a() {
         cec $$0 = this.d ? cee.d.a() : this.b.b();
         cqo $$1 = MinecraftServer.a(this.a, this.b.a(), this.c, $$0);
         if (!this.d) {
            $$1 = $$1.a(this.b.b());
         }

         List<amh> $$2 = this.a.g();
         anj $$3 = new anm(ami.b, $$2);
         return Pair.of($$1, $$3);
      }

      public ane b() {
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
      R create(anj var1, afg var2, hl<aff> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      afq.b<D> get(afq.a var1);
   }
}
