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
         Pair<djn, auq> $$5 = $$0.a.a();
         auq $$6 = (auq)$$5.getSecond();
         jl<aln> $$7 = aln.a();
         List<jr.a<?>> $$8 = axq.a($$6, $$7.a(aln.a));
         js.b $$9 = $$7.b(aln.b);
         List<jg.b<?>> $$10 = axq.a($$9, $$8);
         js.b $$11 = akz.a($$6, $$10, akz.a);
         List<jg.b<?>> $$12 = Stream.concat($$10.stream(), $$11.c()).toList();
         js.b $$13 = akz.a($$6, $$12, akz.b);
         djn $$14 = (djn)$$5.getFirst();
         jg.a $$15 = jg.a.a($$12.stream());
         amc.b<D> $$16 = $$1.get(new amc.a($$6, $$14, $$15, $$13));
         jl<aln> $$17 = $$7.a(aln.b, $$11, $$16.b);
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

   public static record a(avb a, djn b, jg.a c, js.b d) {
   }

   public static record b<D>(D a, js.b b) {
   }

   public static record c(amc.d a, ej.a b, int c) {
   }

   public static record d(aul a, djn b, boolean c, boolean d) {
      public Pair<djn, auq> a() {
         djn $$0 = MinecraftServer.a(this.a, this.b, this.d, this.c);
         List<atn> $$1 = this.a.h();
         auq $$2 = new aut(atp.b, $$1);
         return Pair.of($$0, $$2);
      }

      public aul b() {
         return this.a;
      }

      public djn c() {
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
      R create(auq var1, alp var2, jl<aln> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      amc.b<D> get(amc.a var1);
   }
}
