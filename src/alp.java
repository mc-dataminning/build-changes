import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class alp {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(alp.c $$0, alp.f<D> $$1, alp.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<dcu, att> $$5 = $$0.a.a();
         att $$6 = (att)$$5.getSecond();
         jh<alc> $$7 = alc.a();
         jh<alc> $$8 = b($$6, $$7, alc.b, ako.a);
         jo.b $$9 = $$8.b(alc.c);
         jo.b $$10 = ako.a($$6, $$9, ako.b);
         dcu $$11 = (dcu)$$5.getFirst();
         alp.b<D> $$12 = $$1.get(new alp.a($$6, $$11, $$9, $$10));
         jh<alc> $$13 = $$8.a(alc.c, $$12.b);
         return ale.a($$6, $$13, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   private static jo.b a(aud $$0, jh<alc> $$1, alc $$2, List<ako.c<?>> $$3) {
      jo.b $$4 = $$1.b($$2);
      return ako.a($$0, $$4, $$3);
   }

   private static jh<alc> b(aud $$0, jh<alc> $$1, alc $$2, List<ako.c<?>> $$3) {
      jo.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(aud a, dcu b, jo.b c, jo.b d) {
   }

   public static record b<D>(D a, jo.b b) {
   }

   public static record c(alp.d a, ei.a b, int c) {
   }

   public static record d(ato a, dcu b, boolean c, boolean d) {
      public Pair<dcu, att> a() {
         cop $$0 = this.d ? cor.e.a() : this.b.b();
         dcu $$1 = MinecraftServer.a(this.a, this.b.a(), this.c, $$0);
         if (!this.d) {
            $$1 = $$1.a(this.b.b());
         }

         List<asp> $$2 = this.a.g();
         att $$3 = new atw(asr.b, $$2);
         return Pair.of($$1, $$3);
      }

      public ato b() {
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
      R create(att var1, ale var2, jh<alc> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      alp.b<D> get(alp.a var1);
   }
}
