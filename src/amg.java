import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class amg {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(amg.c $$0, amg.f<D> $$1, amg.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<dfx, auq> $$5 = $$0.a.a();
         auq $$6 = (auq)$$5.getSecond();
         jx<alr> $$7 = alr.a();
         List<kd.a<?>> $$8 = axr.a($$6, $$7.a(alr.a));
         ke.b $$9 = $$7.b(alr.b);
         List<js.b<?>> $$10 = axr.a($$9, $$8);
         ke.b $$11 = ald.a($$6, $$10, ald.a);
         List<js.b<?>> $$12 = Stream.concat($$10.stream(), $$11.c()).toList();
         ke.b $$13 = ald.a($$6, $$12, ald.b);
         dfx $$14 = (dfx)$$5.getFirst();
         js.a $$15 = js.a.a($$12.stream());
         amg.b<D> $$16 = $$1.get(new amg.a($$6, $$14, $$15, $$13));
         jx<alr> $$17 = $$7.a(alr.b, $$11, $$16.b);
         return alt.a($$6, $$17, $$8, $$14.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   public static record a(avb a, dfx b, js.a c, ke.b d) {
   }

   public static record b<D>(D a, ke.b b) {
   }

   public static record c(amg.d a, ex.a b, int c) {
   }

   public static record d(aul a, dfx b, boolean c, boolean d) {
      public Pair<dfx, auq> a() {
         dfx $$0 = MinecraftServer.a(this.a, this.b, this.d, this.c);
         List<atm> $$1 = this.a.h();
         auq $$2 = new aut(ato.b, $$1);
         return Pair.of($$0, $$2);
      }

      public aul b() {
         return this.a;
      }

      public dfx c() {
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
      R create(auq var1, alt var2, jx<alr> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      amg.b<D> get(amg.a var1);
   }
}
