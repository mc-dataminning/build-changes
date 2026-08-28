import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhl(jj<dga> d, int e, int f) implements dhi {
   public static final int b = 10000;
   public static final MapCodec<dhl> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ju.a(mh.aR).fieldOf("enchantments").forGetter(dhl::b),
               ayu.a(1, 10000).fieldOf("min_cost").forGetter(dhl::c),
               ayu.a(0, 10000).fieldOf("max_cost_span").forGetter(dhl::d)
            )
            .apply($$0, dhl::new)
   );

   @Override
   public void a(czn $$0, dgg.a $$1, azv $$2, bue $$3) {
      float $$4 = $$3.d();
      int $$5 = azm.b($$2, this.e, this.e + (int)($$4 * (float)this.f));

      for (dgd $$7 : dgc.b($$2, $$0, $$5, this.d.a())) {
         $$1.b($$7.b(), $$7.c());
      }
   }

   @Override
   public MapCodec<dhl> a() {
      return c;
   }

   public jj<dga> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }
}
