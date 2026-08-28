import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ama {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(ama.c $$0, ama.f<D> $$1, ama.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<dcr, aue> $$5 = $$0.a.a();
         aue $$6 = (aue)$$5.getSecond();
         jp<aln> $$7 = aln.a();
         jp<aln> $$8 = b($$6, $$7, aln.b, akz.a);
         jw.b $$9 = $$8.b(aln.c);
         jw.b $$10 = akz.a($$6, $$9, akz.b);
         dcr $$11 = (dcr)$$5.getFirst();
         ama.b<D> $$12 = $$1.get(new ama.a($$6, $$11, $$9, $$10));
         jp<aln> $$13 = $$8.a(aln.c, $$12.b);
         return alp.a($$6, $$13, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   private static jw.b a(auo $$0, jp<aln> $$1, aln $$2, List<akz.c<?>> $$3) {
      jw.b $$4 = $$1.b($$2);
      return akz.a($$0, $$4, $$3);
   }

   private static jp<aln> b(auo $$0, jp<aln> $$1, aln $$2, List<akz.c<?>> $$3) {
      jw.b $$4 = a($$0, $$1, $$2, $$3);
      return $$1.a($$2, $$4);
   }

   public static record a(auo a, dcr b, jw.b c, jw.b d) {
   }

   public static record b<D>(D a, jw.b b) {
   }

   public static record c(ama.d a, eq.a b, int c) {
   }

   public static record d(atz a, dcr b, boolean c, boolean d) {
      public Pair<dcr, aue> a() {
         dcr $$0 = MinecraftServer.a(this.a, this.b, this.d, this.c);
         List<ata> $$1 = this.a.g();
         aue $$2 = new auh(atc.b, $$1);
         return Pair.of($$0, $$2);
      }

      public atz b() {
         return this.a;
      }

      public dcr c() {
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
      R create(aue var1, alp var2, jp<aln> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      ama.b<D> get(ama.a var1);
   }
}
