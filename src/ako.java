import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ako {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(ako.c $$0, ako.f<D> $$1, ako.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<czr, ass> $$5 = $$0.a.a();
         ass $$6 = (ass)$$5.getSecond();
         is<akc> $$7 = akc.a();
         is<akc> $$8 = b($$6, $$7, akc.b, ajo.a);
         iz.b $$9 = $$8.b(akc.c);
         iz.b $$10 = ajo.a($$6, $$9, ajo.b);
         czr $$11 = (czr)$$5.getFirst();
         ako.b<D> $$12 = $$1.get(new ako.a($$6, $$11, $$9, $$10));
         is<akc> $$13 = $$8.a(akc.c, $$12.b);
         iz.b $$14 = $$13.b(akc.d);
         return akd.a($$6, $$14, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   private static iz.b a(atc $$0, is<akc> $$1, akc $$2, List<ajo.c<?>> $$3) {
      iz.b $$4 = $$1.b($$2);
      return ajo.a($$0, $$4, $$3);
   }

   private static is<akc> b(atc $$0, is<akc> $$1, akc $$2, List<ajo.c<?>> $$3) {
      iz.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(atc a, czr b, iz.b c, iz.b d) {
   }

   public static record b<D>(D a, iz.b b) {
   }

   public static record c(ako.d a, dv.a b, int c) {
   }

   public static record d(asn a, czr b, boolean c, boolean d) {
      public Pair<czr, ass> a() {
         cmg $$0 = this.d ? cmi.e.a() : this.b.b();
         czr $$1 = MinecraftServer.a(this.a, this.b.a(), this.c, $$0);
         if (!this.d) {
            $$1 = $$1.a(this.b.b());
         }

         List<aro> $$2 = this.a.g();
         ass $$3 = new asv(arq.b, $$2);
         return Pair.of($$1, $$3);
      }

      public asn b() {
         return this.a;
      }

      public czr c() {
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
      R create(ass var1, akd var2, is<akc> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      ako.b<D> get(ako.a var1);
   }
}
