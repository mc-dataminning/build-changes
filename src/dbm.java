import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbm(jq<dac> d, int e, int f) implements dbj {
   public static final int b = 10000;
   public static final MapCodec<dbm> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kb.a(lu.aL).fieldOf("enchantments").forGetter(dbm::b),
               axw.a(1, 10000).fieldOf("min_cost").forGetter(dbm::c),
               axw.a(0, 10000).fieldOf("max_cost_span").forGetter(dbm::d)
            )
            .apply($$0, dbm::new)
   );

   @Override
   public void a(cuq $$0, dai.a $$1, ayw $$2, bqp $$3) {
      float $$4 = $$3.d();
      int $$5 = ayo.b($$2, this.e, this.e + (int)($$4 * (float)this.f));

      for (daf $$7 : dae.b($$2, $$0, $$5, this.d.a())) {
         $$1.b($$7.a, $$7.b);
      }
   }

   @Override
   public MapCodec<dbm> a() {
      return c;
   }

   public jq<dac> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }
}
