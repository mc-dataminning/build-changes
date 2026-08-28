import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class amb {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(amb.c $$0, amb.f<D> $$1, amb.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<dcu, auf> $$5 = $$0.a.a();
         auf $$6 = (auf)$$5.getSecond();
         jp<alo> $$7 = alo.a();
         jp<alo> $$8 = b($$6, $$7, alo.b, ala.a);
         jw.b $$9 = $$8.b(alo.c);
         jw.b $$10 = ala.a($$6, $$9, ala.b);
         dcu $$11 = (dcu)$$5.getFirst();
         amb.b<D> $$12 = $$1.get(new amb.a($$6, $$11, $$9, $$10));
         jp<alo> $$13 = $$8.a(alo.c, $$12.b);
         return alq.a($$6, $$13, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
            if ($$2x != null) {
               $$6.close();
            }
         }).thenApplyAsync($$4x -> {
            $$4x.g();
            return $$2.create($$6, $$4x, $$13, $$12.a);
         }, $$4);
      } catch (Exception var14) {
         return CompletableFuture.failedFuture(var14);
      }
   }

   private static jw.b a(aup $$0, jp<alo> $$1, alo $$2, List<ala.c<?>> $$3) {
      jw.b $$4 = $$1.b($$2);
      return ala.a($$0, $$4, $$3);
   }

   private static jp<alo> b(aup $$0, jp<alo> $$1, alo $$2, List<ala.c<?>> $$3) {
      jw.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(aup a, dcu b, jw.b c, jw.b d) {
   }

   public static record b<D>(D a, jw.b b) {
   }

   public static record c(amb.d a, eq.a b, int c) {
   }

   public static record d(aua a, dcu b, boolean c, boolean d) {
      public Pair<dcu, auf> a() {
         dcu $$0 = MinecraftServer.a(this.a, this.b, this.d, this.c);
         List<atb> $$1 = this.a.g();
         auf $$2 = new aui(atd.b, $$1);
         return Pair.of($$0, $$2);
      }

      public aua b() {
         return this.a;
      }

      public dcu c() {
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
      R create(auf var1, alq var2, jp<alo> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      amb.b<D> get(amb.a var1);
   }
}
