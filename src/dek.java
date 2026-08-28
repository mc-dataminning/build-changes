import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dek(jv<dcz> d, int e, int f) implements deh {
   public static final int b = 10000;
   public static final MapCodec<dek> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kg.a(mc.aO).fieldOf("enchantments").forGetter(dek::b),
               ayi.a(1, 10000).fieldOf("min_cost").forGetter(dek::c),
               ayi.a(0, 10000).fieldOf("max_cost_span").forGetter(dek::d)
            )
            .apply($$0, dek::new)
   );

   @Override
   public void a(cwp $$0, ddf.a $$1, azh $$2, bsi $$3) {
      float $$4 = $$3.d();
      int $$5 = ayz.b($$2, this.e, this.e + (int)($$4 * (float)this.f));

      for (ddc $$7 : ddb.b($$2, $$0, $$5, this.d.a())) {
         $$1.b($$7.a, $$7.b);
      }
   }

   @Override
   public MapCodec<dek> a() {
      return c;
   }

   public jv<dcz> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }
}
