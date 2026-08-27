import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class eba {
   public static final Codec<eba> c = ki.X.q().dispatch(eba::a, ebb::a);
   private static final int a = 32;
   private static final int b = 24;
   public static final int d = 80;
   protected final int e;
   protected final int f;
   protected final int g;

   protected static <P extends eba> P3<Mu<P>, Integer, Integer, Integer> a(Instance<P> $$0) {
      return $$0.group(
         Codec.intRange(0, 32).fieldOf("base_height").forGetter($$0x -> $$0x.e),
         Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter($$0x -> $$0x.f),
         Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter($$0x -> $$0x.g)
      );
   }

   public eba(int $$0, int $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract ebb<?> a();

   public abstract List<dzi.a> a(cxh var1, BiConsumer<ib, dnb> var2, axd var3, int var4, ib var5, dys var6);

   public int a(axd $$0) {
      return this.e + $$0.a(this.f + 1) + $$0.a(this.g + 1);
   }

   private static boolean c(cxh $$0, ib $$1) {
      return $$0.a($$1, $$0x -> dvs.b($$0x) && !$$0x.a(dae.i) && !$$0x.a(dae.fl));
   }

   protected static void a(cxh $$0, BiConsumer<ib, dnb> $$1, axd $$2, ib $$3, dys $$4) {
      if ($$4.k || !c($$0, $$3)) {
         $$1.accept($$3, $$4.c.a($$2, $$3));
      }
   }

   protected boolean b(cxh $$0, BiConsumer<ib, dnb> $$1, axd $$2, ib $$3, dys $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, Function.identity());
   }

   protected boolean a(cxh $$0, BiConsumer<ib, dnb> $$1, axd $$2, ib $$3, dys $$4, Function<dnb, dnb> $$5) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, $$5.apply($$4.b.a($$2, $$3)));
         return true;
      } else {
         return false;
      }
   }

   protected void a(cxh $$0, BiConsumer<ib, dnb> $$1, axd $$2, ib.a $$3, dys $$4) {
      if (this.b($$0, $$3)) {
         this.b($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected boolean a(cxh $$0, ib $$1) {
      return dxe.c($$0, $$1);
   }

   public boolean b(cxh $$0, ib $$1) {
      return this.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(aun.t));
   }
}
