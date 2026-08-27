import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class dsy {
   public static final Codec<dsy> c = jb.Y.q().dispatch(dsy::a, dsz::a);
   private static final int a = 32;
   private static final int b = 24;
   public static final int d = 80;
   protected final int e;
   protected final int f;
   protected final int g;

   protected static <P extends dsy> P3<Mu<P>, Integer, Integer, Integer> a(Instance<P> $$0) {
      return $$0.group(
         Codec.intRange(0, 32).fieldOf("base_height").forGetter($$0x -> $$0x.e),
         Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter($$0x -> $$0x.f),
         Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter($$0x -> $$0x.g)
      );
   }

   public dsy(int $$0, int $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract dsz<?> a();

   public abstract List<drg.a> a(cqh var1, BiConsumer<gw, dfd> var2, ash var3, int var4, gw var5, dqq var6);

   public int a(ash $$0) {
      return this.e + $$0.a(this.f + 1) + $$0.a(this.g + 1);
   }

   private static boolean c(cqh $$0, gw $$1) {
      return $$0.a($$1, $$0x -> dnq.b($$0x) && !$$0x.a(cte.i) && !$$0x.a(cte.fl));
   }

   protected static void a(cqh $$0, BiConsumer<gw, dfd> $$1, ash $$2, gw $$3, dqq $$4) {
      if ($$4.k || !c($$0, $$3)) {
         $$1.accept($$3, $$4.c.a($$2, $$3));
      }
   }

   protected boolean b(cqh $$0, BiConsumer<gw, dfd> $$1, ash $$2, gw $$3, dqq $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, Function.identity());
   }

   protected boolean a(cqh $$0, BiConsumer<gw, dfd> $$1, ash $$2, gw $$3, dqq $$4, Function<dfd, dfd> $$5) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, $$5.apply($$4.b.a($$2, $$3)));
         return true;
      } else {
         return false;
      }
   }

   protected void a(cqh $$0, BiConsumer<gw, dfd> $$1, ash $$2, gw.a $$3, dqq $$4) {
      if (this.b($$0, $$3)) {
         this.b($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected boolean a(cqh $$0, gw $$1) {
      return dpc.c($$0, $$1);
   }

   public boolean b(cqh $$0, gw $$1) {
      return this.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(apv.t));
   }
}
