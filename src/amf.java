import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class amf {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(amf.c $$0, amf.f<D> $$1, amf.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<dfr, aup> $$5 = $$0.a.a();
         aup $$6 = (aup)$$5.getSecond();
         jw<alq> $$7 = alq.a();
         List<kc.a<?>> $$8 = axq.a($$6, $$7.a(alq.a));
         kd.b $$9 = $$7.b(alq.b);
         List<jr.b<?>> $$10 = axq.a($$9, $$8);
         kd.b $$11 = alc.a($$6, $$10, alc.a);
         List<jr.b<?>> $$12 = Stream.concat($$10.stream(), $$11.b()).toList();
         kd.b $$13 = alc.a($$6, $$12, alc.b);
         dfr $$14 = (dfr)$$5.getFirst();
         jr.a $$15 = jr.a.a($$12.stream());
         amf.b<D> $$16 = $$1.get(new amf.a($$6, $$14, $$15, $$13));
         jw<alq> $$17 = $$7.a(alq.b, $$11, $$16.b);
         return als.a($$6, $$17, $$8, $$14.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   public static record a(ava a, dfr b, jr.a c, kd.b d) {
   }

   public static record b<D>(D a, kd.b b) {
   }

   public static record c(amf.d a, ew.a b, int c) {
   }

   public static record d(auk a, dfr b, boolean c, boolean d) {
      public Pair<dfr, aup> a() {
         dfr $$0 = MinecraftServer.a(this.a, this.b, this.d, this.c);
         List<atl> $$1 = this.a.h();
         aup $$2 = new aus(atn.b, $$1);
         return Pair.of($$0, $$2);
      }

      public auk b() {
         return this.a;
      }

      public dfr c() {
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
      R create(aup var1, als var2, jw<alq> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      amf.b<D> get(amf.a var1);
   }
}
