import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class alz {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(alz.c $$0, alz.f<D> $$1, alz.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<deo, aui> $$5 = $$0.a.a();
         aui $$6 = (aui)$$5.getSecond();
         ju<alk> $$7 = alk.a();
         List<ka.a<?>> $$8 = axj.a($$6, $$7.a(alk.a));
         kb.b $$9 = $$7.b(alk.b);
         List<jp.b<?>> $$10 = axj.a($$9, $$8);
         kb.b $$11 = akw.a($$6, $$10, akw.a);
         List<jp.b<?>> $$12 = Stream.concat($$10.stream(), $$11.b()).toList();
         kb.b $$13 = akw.a($$6, $$12, akw.b);
         deo $$14 = (deo)$$5.getFirst();
         jp.a $$15 = jp.a.a($$12.stream());
         alz.b<D> $$16 = $$1.get(new alz.a($$6, $$14, $$15, $$13));
         ju<alk> $$17 = $$7.a(alk.b, $$11, $$16.b);
         return alm.a($$6, $$17, $$8, $$14.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   public static record a(aus a, deo b, jp.a c, kb.b d) {
   }

   public static record b<D>(D a, kb.b b) {
   }

   public static record c(alz.d a, eu.a b, int c) {
   }

   public static record d(aud a, deo b, boolean c, boolean d) {
      public Pair<deo, aui> a() {
         deo $$0 = MinecraftServer.a(this.a, this.b, this.d, this.c);
         List<ate> $$1 = this.a.g();
         aui $$2 = new aul(atg.b, $$1);
         return Pair.of($$0, $$2);
      }

      public aud b() {
         return this.a;
      }

      public deo c() {
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
      R create(aui var1, alm var2, ju<alk> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      alz.b<D> get(alz.a var1);
   }
}
