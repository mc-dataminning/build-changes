import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class elz {
   public static final Codec<elz> c = ma.V.q().dispatch(elz::a, ema::a);
   private static final int a = 32;
   private static final int b = 24;
   public static final int d = 80;
   protected final int e;
   protected final int f;
   protected final int g;

   protected static <P extends elz> P3<Mu<P>, Integer, Integer, Integer> a(Instance<P> $$0) {
      return $$0.group(
         Codec.intRange(0, 32).fieldOf("base_height").forGetter($$0x -> $$0x.e),
         Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter($$0x -> $$0x.f),
         Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter($$0x -> $$0x.g)
      );
   }

   public elz(int $$0, int $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract ema<?> a();

   public abstract List<ekf.a> a(dhf var1, BiConsumer<jh, dxo> var2, bac var3, int var4, jh var5, ejp var6);

   public int a(bac $$0) {
      return this.e + $$0.a(this.f + 1) + $$0.a(this.g + 1);
   }

   private static boolean c(dhf $$0, jh $$1) {
      return $$0.a($$1, $$0x -> egp.b($$0x) && !$$0x.a(dkf.i) && !$$0x.a(dkf.fA));
   }

   protected static void a(dhf $$0, BiConsumer<jh, dxo> $$1, bac $$2, jh $$3, ejp $$4) {
      if ($$4.k || !c($$0, $$3)) {
         $$1.accept($$3, $$4.c.a($$2, $$3));
      }
   }

   protected boolean b(dhf $$0, BiConsumer<jh, dxo> $$1, bac $$2, jh $$3, ejp $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, Function.identity());
   }

   protected boolean a(dhf $$0, BiConsumer<jh, dxo> $$1, bac $$2, jh $$3, ejp $$4, Function<dxo, dxo> $$5) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, $$5.apply($$4.b.a($$2, $$3)));
         return true;
      } else {
         return false;
      }
   }

   protected void a(dhf $$0, BiConsumer<jh, dxo> $$1, bac $$2, jh.a $$3, ejp $$4) {
      if (this.b($$0, $$3)) {
         this.b($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected boolean a(dhf $$0, jh $$1) {
      return eib.c($$0, $$1);
   }

   public boolean b(dhf $$0, jh $$1) {
      return this.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(axk.u));
   }
}
