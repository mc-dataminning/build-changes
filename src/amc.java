import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class amc {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(amc.c $$0, amc.f<D> $$1, amc.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<dff, aul> $$5 = $$0.a.a();
         aul $$6 = (aul)$$5.getSecond();
         jv<aln> $$7 = aln.a();
         List<kb.a<?>> $$8 = axm.a($$6, $$7.a(aln.a));
         kc.b $$9 = $$7.b(aln.b);
         List<jq.b<?>> $$10 = axm.a($$9, $$8);
         kc.b $$11 = akz.a($$6, $$10, akz.a);
         List<jq.b<?>> $$12 = Stream.concat($$10.stream(), $$11.b()).toList();
         kc.b $$13 = akz.a($$6, $$12, akz.b);
         dff $$14 = (dff)$$5.getFirst();
         jq.a $$15 = jq.a.a($$12.stream());
         amc.b<D> $$16 = $$1.get(new amc.a($$6, $$14, $$15, $$13));
         jv<aln> $$17 = $$7.a(aln.b, $$11, $$16.b);
         return alp.a($$6, $$17, $$8, $$14.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   public static record a(auv a, dff b, jq.a c, kc.b d) {
   }

   public static record b<D>(D a, kc.b b) {
   }

   public static record c(amc.d a, ev.a b, int c) {
   }

   public static record d(aug a, dff b, boolean c, boolean d) {
      public Pair<dff, aul> a() {
         dff $$0 = MinecraftServer.a(this.a, this.b, this.d, this.c);
         List<ath> $$1 = this.a.g();
         aul $$2 = new auo(atj.b, $$1);
         return Pair.of($$0, $$2);
      }

      public aug b() {
         return this.a;
      }

      public dff c() {
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
      R create(aul var1, alp var2, jv<aln> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      amc.b<D> get(amc.a var1);
   }
}
