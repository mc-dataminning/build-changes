import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dii(jk<dgx> d, int e, int f) implements dif {
   public static final int b = 10000;
   public static final MapCodec<dii> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jv.a(mi.aR).fieldOf("enchantments").forGetter(dii::b),
               azg.a(1, 10000).fieldOf("min_cost").forGetter(dii::c),
               azg.a(0, 10000).fieldOf("max_cost_span").forGetter(dii::d)
            )
            .apply($$0, dii::new)
   );

   @Override
   public void a(dak $$0, dhd.a $$1, bai $$2, bva $$3) {
      float $$4 = $$3.d();
      int $$5 = azz.b($$2, this.e, this.e + (int)($$4 * (float)this.f));

      for (dha $$7 : dgz.b($$2, $$0, $$5, this.d.a())) {
         $$1.b($$7.b(), $$7.c());
      }
   }

   @Override
   public MapCodec<dii> a() {
      return c;
   }

   public jk<dgx> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }
}
