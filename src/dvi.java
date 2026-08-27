import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class dvi {
   public static final Codec<dvi> c = kc.Y.q().dispatch(dvi::a, dvj::a);
   private static final int a = 32;
   private static final int b = 24;
   public static final int d = 80;
   protected final int e;
   protected final int f;
   protected final int g;

   protected static <P extends dvi> P3<Mu<P>, Integer, Integer, Integer> a(Instance<P> $$0) {
      return $$0.group(
         Codec.intRange(0, 32).fieldOf("base_height").forGetter($$0x -> $$0x.e),
         Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter($$0x -> $$0x.f),
         Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter($$0x -> $$0x.g)
      );
   }

   public dvi(int $$0, int $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract dvj<?> a();

   public abstract List<dtq.a> a(csl var1, BiConsumer<hx, dhn> var2, atw var3, int var4, hx var5, dta var6);

   public int a(atw $$0) {
      return this.e + $$0.a(this.f + 1) + $$0.a(this.g + 1);
   }

   private static boolean c(csl $$0, hx $$1) {
      return $$0.a($$1, $$0x -> dqa.b($$0x) && !$$0x.a(cvh.i) && !$$0x.a(cvh.fl));
   }

   protected static void a(csl $$0, BiConsumer<hx, dhn> $$1, atw $$2, hx $$3, dta $$4) {
      if ($$4.k || !c($$0, $$3)) {
         $$1.accept($$3, $$4.c.a($$2, $$3));
      }
   }

   protected boolean b(csl $$0, BiConsumer<hx, dhn> $$1, atw $$2, hx $$3, dta $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, Function.identity());
   }

   protected boolean a(csl $$0, BiConsumer<hx, dhn> $$1, atw $$2, hx $$3, dta $$4, Function<dhn, dhn> $$5) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, $$5.apply($$4.b.a($$2, $$3)));
         return true;
      } else {
         return false;
      }
   }

   protected void a(csl $$0, BiConsumer<hx, dhn> $$1, atw $$2, hx.a $$3, dta $$4) {
      if (this.b($$0, $$3)) {
         this.b($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected boolean a(csl $$0, hx $$1) {
      return drm.c($$0, $$1);
   }

   public boolean b(csl $$0, hx $$1) {
      return this.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(ark.t));
   }
}
