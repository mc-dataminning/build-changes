import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class alj {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(alj.c $$0, alj.f<D> $$1, alj.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<dbt, atn> $$5 = $$0.a.a();
         atn $$6 = (atn)$$5.getSecond();
         je<akw> $$7 = akw.a();
         je<akw> $$8 = b($$6, $$7, akw.b, aki.a);
         jl.b $$9 = $$8.b(akw.c);
         jl.b $$10 = aki.a($$6, $$9, aki.b);
         dbt $$11 = (dbt)$$5.getFirst();
         alj.b<D> $$12 = $$1.get(new alj.a($$6, $$11, $$9, $$10));
         je<akw> $$13 = $$8.a(akw.c, $$12.b);
         return aky.a($$6, $$13, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   private static jl.b a(atx $$0, je<akw> $$1, akw $$2, List<aki.c<?>> $$3) {
      jl.b $$4 = $$1.b($$2);
      return aki.a($$0, $$4, $$3);
   }

   private static je<akw> b(atx $$0, je<akw> $$1, akw $$2, List<aki.c<?>> $$3) {
      jl.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(atx a, dbt b, jl.b c, jl.b d) {
   }

   public static record b<D>(D a, jl.b b) {
   }

   public static record c(alj.d a, ef.a b, int c) {
   }

   public static record d(ati a, dbt b, boolean c, boolean d) {
      public Pair<dbt, atn> a() {
         col $$0 = this.d ? coo.e.a() : this.b.b();
         dbt $$1 = MinecraftServer.a(this.a, this.b.a(), this.c, $$0);
         if (!this.d) {
            $$1 = $$1.a(this.b.b());
         }

         List<asj> $$2 = this.a.g();
         atn $$3 = new atq(asl.b, $$2);
         return Pair.of($$1, $$3);
      }

      public ati b() {
         return this.a;
      }

      public dbt c() {
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
      R create(atn var1, aky var2, je<akw> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      alj.b<D> get(alj.a var1);
   }
}
