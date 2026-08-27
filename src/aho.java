import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class aho {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(aho.c $$0, aho.f<D> $$1, aho.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<cts, api> $$5 = $$0.a.a();
         api $$6 = (api)$$5.getSecond();
         im<ahc> $$7 = ahc.a();
         im<ahc> $$8 = b($$6, $$7, ahc.b, ago.a);
         is.b $$9 = $$8.b(ahc.c);
         is.b $$10 = ago.a($$6, $$9, ago.b);
         cts $$11 = (cts)$$5.getFirst();
         aho.b<D> $$12 = $$1.get(new aho.a($$6, $$11, $$9, $$10));
         im<ahc> $$13 = $$8.a(ahc.c, $$12.b);
         is.b $$14 = $$13.b(ahc.d);
         return ahd.a($$6, $$14, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   private static is.b a(aps $$0, im<ahc> $$1, ahc $$2, List<ago.b<?>> $$3) {
      is.b $$4 = $$1.b($$2);
      return ago.a($$0, $$4, $$3);
   }

   private static im<ahc> b(aps $$0, im<ahc> $$1, ahc $$2, List<ago.b<?>> $$3) {
      is.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(aps a, cts b, is.b c, is.b d) {
   }

   public static record b<D>(D a, is.b b) {
   }

   public static record c(aho.d a, dt.a b, int c) {
   }

   public static record d(apd a, cts b, boolean c, boolean d) {
      public Pair<cts, api> a() {
         chb $$0 = this.d ? chd.e.a() : this.b.b();
         cts $$1 = MinecraftServer.a(this.a, this.b.a(), this.c, $$0);
         if (!this.d) {
            $$1 = $$1.a(this.b.b());
         }

         List<aog> $$2 = this.a.g();
         api $$3 = new apl(aoh.b, $$2);
         return Pair.of($$1, $$3);
      }

      public apd b() {
         return this.a;
      }

      public cts c() {
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
      R create(api var1, ahd var2, im<ahc> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      aho.b<D> get(aho.a var1);
   }
}
