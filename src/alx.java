import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class alx {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(alx.c $$0, alx.f<D> $$1, alx.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<dcn, aub> $$5 = $$0.a.a();
         aub $$6 = (aub)$$5.getSecond();
         jp<alk> $$7 = alk.a();
         jp<alk> $$8 = b($$6, $$7, alk.b, akw.a);
         jw.b $$9 = $$8.b(alk.c);
         jw.b $$10 = akw.a($$6, $$9, akw.b);
         dcn $$11 = (dcn)$$5.getFirst();
         alx.b<D> $$12 = $$1.get(new alx.a($$6, $$11, $$9, $$10));
         jp<alk> $$13 = $$8.a(alk.c, $$12.b);
         return alm.a($$6, $$13, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   private static jw.b a(aul $$0, jp<alk> $$1, alk $$2, List<akw.c<?>> $$3) {
      jw.b $$4 = $$1.b($$2);
      return akw.a($$0, $$4, $$3);
   }

   private static jp<alk> b(aul $$0, jp<alk> $$1, alk $$2, List<akw.c<?>> $$3) {
      jw.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(aul a, dcn b, jw.b c, jw.b d) {
   }

   public static record b<D>(D a, jw.b b) {
   }

   public static record c(alx.d a, eq.a b, int c) {
   }

   public static record d(atw a, dcn b, boolean c, boolean d) {
      public Pair<dcn, aub> a() {
         cpg $$0 = this.d ? cpi.e.a() : this.b.b();
         dcn $$1 = MinecraftServer.a(this.a, this.b.a(), this.c, $$0);
         if (!this.d) {
            $$1 = $$1.a(this.b.b());
         }

         List<asx> $$2 = this.a.g();
         aub $$3 = new aue(asz.b, $$2);
         return Pair.of($$1, $$3);
      }

      public atw b() {
         return this.a;
      }

      public dcn c() {
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
      R create(aub var1, alm var2, jp<alk> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      alx.b<D> get(alx.a var1);
   }
}
