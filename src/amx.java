import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class amx {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(amx.c $$0, amx.f<D> $$1, amx.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<dif, avl> $$5 = $$0.a.a();
         avl $$6 = (avl)$$5.getSecond();
         jx<ami> $$7 = ami.a();
         List<kd.a<?>> $$8 = ayl.a($$6, $$7.a(ami.a));
         ke.b $$9 = $$7.b(ami.b);
         List<js.b<?>> $$10 = ayl.a($$9, $$8);
         ke.b $$11 = alu.a($$6, $$10, alu.a);
         List<js.b<?>> $$12 = Stream.concat($$10.stream(), $$11.c()).toList();
         ke.b $$13 = alu.a($$6, $$12, alu.b);
         dif $$14 = (dif)$$5.getFirst();
         js.a $$15 = js.a.a($$12.stream());
         amx.b<D> $$16 = $$1.get(new amx.a($$6, $$14, $$15, $$13));
         jx<ami> $$17 = $$7.a(ami.b, $$11, $$16.b);
         return amk.a($$6, $$17, $$8, $$14.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
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

   public static record a(avv a, dif b, js.a c, ke.b d) {
   }

   public static record b<D>(D a, ke.b b) {
   }

   public static record c(amx.d a, ex.a b, int c) {
   }

   public static record d(avg a, dif b, boolean c, boolean d) {
      public Pair<dif, avl> a() {
         dif $$0 = MinecraftServer.a(this.a, this.b, this.d, this.c);
         List<aug> $$1 = this.a.h();
         avl $$2 = new avo(aui.b, $$1);
         return Pair.of($$0, $$2);
      }

      public avg b() {
         return this.a;
      }

      public dif c() {
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
      R create(avl var1, amk var2, jx<ami> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      amx.b<D> get(amx.a var1);
   }
}
