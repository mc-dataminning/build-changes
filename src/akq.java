import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class akq {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(akq.c $$0, akq.f<D> $$1, akq.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<daa, asu> $$5 = $$0.a.a();
         asu $$6 = (asu)$$5.getSecond();
         iu<ake> $$7 = ake.a();
         iu<ake> $$8 = b($$6, $$7, ake.b, ajq.a);
         jb.b $$9 = $$8.b(ake.c);
         jb.b $$10 = ajq.a($$6, $$9, ajq.b);
         daa $$11 = (daa)$$5.getFirst();
         akq.b<D> $$12 = $$1.get(new akq.a($$6, $$11, $$9, $$10));
         iu<ake> $$13 = $$8.a(ake.c, $$12.b);
         jb.b $$14 = $$13.b(ake.d);
         return akf.a($$6, $$14, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   private static jb.b a(ate $$0, iu<ake> $$1, ake $$2, List<ajq.c<?>> $$3) {
      jb.b $$4 = $$1.b($$2);
      return ajq.a($$0, $$4, $$3);
   }

   private static iu<ake> b(ate $$0, iu<ake> $$1, ake $$2, List<ajq.c<?>> $$3) {
      jb.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(ate a, daa b, jb.b c, jb.b d) {
   }

   public static record b<D>(D a, jb.b b) {
   }

   public static record c(akq.d a, dw.a b, int c) {
   }

   public static record d(asp a, daa b, boolean c, boolean d) {
      public Pair<daa, asu> a() {
         cmn $$0 = this.d ? cmp.e.a() : this.b.b();
         daa $$1 = MinecraftServer.a(this.a, this.b.a(), this.c, $$0);
         if (!this.d) {
            $$1 = $$1.a(this.b.b());
         }

         List<arq> $$2 = this.a.g();
         asu $$3 = new asx(ars.b, $$2);
         return Pair.of($$1, $$3);
      }

      public asp b() {
         return this.a;
      }

      public daa c() {
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
      R create(asu var1, akf var2, iu<ake> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      akq.b<D> get(akq.a var1);
   }
}
