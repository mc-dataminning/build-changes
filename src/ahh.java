import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ahh {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(ahh.c $$0, ahh.f<D> $$1, ahh.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<csy, apb> $$5 = $$0.a.a();
         apb $$6 = (apb)$$5.getSecond();
         in<agv> $$7 = agv.a();
         in<agv> $$8 = b($$6, $$7, agv.b, agh.a);
         it.b $$9 = $$8.b(agv.c);
         it.b $$10 = agh.a($$6, $$9, agh.b);
         csy $$11 = (csy)$$5.getFirst();
         ahh.b<D> $$12 = $$1.get(new ahh.a($$6, $$11, $$9, $$10));
         in<agv> $$13 = $$8.a(agv.c, $$12.b);
         it.b $$14 = $$13.b(agv.d);
         return agw.a($$6, $$14, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   private static it.b a(apl $$0, in<agv> $$1, agv $$2, List<agh.b<?>> $$3) {
      it.b $$4 = $$1.b($$2);
      return agh.a($$0, $$4, $$3);
   }

   private static in<agv> b(apl $$0, in<agv> $$1, agv $$2, List<agh.b<?>> $$3) {
      it.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(apl a, csy b, it.b c, it.b d) {
   }

   public static record b<D>(D a, it.b b) {
   }

   public static record c(ahh.d a, dv.a b, int c) {
   }

   public static record d(aow a, csy b, boolean c, boolean d) {
      public Pair<csy, apb> a() {
         cgi $$0 = this.d ? cgk.e.a() : this.b.b();
         csy $$1 = MinecraftServer.a(this.a, this.b.a(), this.c, $$0);
         if (!this.d) {
            $$1 = $$1.a(this.b.b());
         }

         List<anz> $$2 = this.a.g();
         apb $$3 = new ape(aoa.b, $$2);
         return Pair.of($$1, $$3);
      }

      public aow b() {
         return this.a;
      }

      public csy c() {
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
      R create(apb var1, agw var2, in<agv> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      ahh.b<D> get(ahh.a var1);
   }
}
