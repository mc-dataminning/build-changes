import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class aln {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(aln.c $$0, aln.f<D> $$1, aln.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<ddp, att> $$5 = $$0.a.a();
         att $$6 = (att)$$5.getSecond();
         jt<akz> $$7 = akz.a();
         jt<akz> $$8 = b($$6, $$7, akz.b, akl.a);
         ka.b $$9 = $$8.b(akz.c);
         ka.b $$10 = akl.a($$6, $$9, akl.b);
         ddp $$11 = (ddp)$$5.getFirst();
         aln.b<D> $$12 = $$1.get(new aln.a($$6, $$11, $$9, $$10));
         jt<akz> $$13 = $$8.a(akz.c, $$12.b);
         return alb.a($$6, $$13, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   private static ka.b a(aud $$0, jt<akz> $$1, akz $$2, List<akl.c<?>> $$3) {
      ka.b $$4 = $$1.b($$2);
      return akl.a($$0, $$4, $$3);
   }

   private static jt<akz> b(aud $$0, jt<akz> $$1, akz $$2, List<akl.c<?>> $$3) {
      ka.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(aud a, ddp b, ka.b c, ka.b d) {
   }

   public static record b<D>(D a, ka.b b) {
   }

   public static record c(aln.d a, eu.a b, int c) {
   }

   public static record d(ato a, ddp b, boolean c, boolean d) {
      public Pair<ddp, att> a() {
         ddp $$0 = MinecraftServer.a(this.a, this.b, this.d, this.c);
         List<asp> $$1 = this.a.g();
         att $$2 = new atw(asr.b, $$1);
         return Pair.of($$0, $$2);
      }

      public ato b() {
         return this.a;
      }

      public ddp c() {
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
      R create(att var1, alb var2, jt<akz> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      aln.b<D> get(aln.a var1);
   }
}
