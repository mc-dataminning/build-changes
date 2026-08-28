import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ami {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(ami.c $$0, ami.f<D> $$1, ami.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<dkx, auw> $$5 = $$0.a.a();
         auw $$6 = (auw)$$5.getSecond();
         jn<alt> $$7 = alt.a();
         List<jt.a<?>> $$8 = axw.a($$6, $$7.a(alt.a));
         ju.b $$9 = $$7.b(alt.b);
         List<ji.b<?>> $$10 = axw.a($$9, $$8);
         ju.b $$11 = alf.a($$6, $$10, alf.a);
         List<ji.b<?>> $$12 = Stream.concat($$10.stream(), $$11.c()).toList();
         ju.b $$13 = alf.a($$6, $$12, alf.b);
         dkx $$14 = (dkx)$$5.getFirst();
         ji.a $$15 = ji.a.a($$12.stream());
         ami.b<D> $$16 = $$1.get(new ami.a($$6, $$14, $$15, $$13));
         jn<alt> $$17 = $$7.a(alt.b, $$11, $$16.b);
         return alv.a($$6, $$17, $$8, $$14.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   public static record a(avh a, dkx b, ji.a c, ju.b d) {
   }

   public static record b<D>(D a, ju.b b) {
   }

   public static record c(ami.d a, el.a b, int c) {
   }

   public static record d(aur a, dkx b, boolean c, boolean d) {
      public Pair<dkx, auw> a() {
         dkx $$0 = MinecraftServer.a(this.a, this.b, this.d, this.c);
         List<att> $$1 = this.a.h();
         auw $$2 = new ava(atv.b, $$1);
         return Pair.of($$0, $$2);
      }

      public aur b() {
         return this.a;
      }

      public dkx c() {
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
      R create(auw var1, alv var2, jn<alt> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      ami.b<D> get(ami.a var1);
   }
}
