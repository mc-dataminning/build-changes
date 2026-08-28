import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddo(ju<dcd> d, int e, int f) implements ddl {
   public static final int b = 10000;
   public static final MapCodec<ddo> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kf.a(ma.aM).fieldOf("enchantments").forGetter(ddo::b),
               ayv.a(1, 10000).fieldOf("min_cost").forGetter(ddo::c),
               ayv.a(0, 10000).fieldOf("max_cost_span").forGetter(ddo::d)
            )
            .apply($$0, ddo::new)
   );

   @Override
   public void a(cwm $$0, dcj.a $$1, azu $$2, bsi $$3) {
      float $$4 = $$3.d();
      int $$5 = azm.b($$2, this.e, this.e + (int)($$4 * (float)this.f));

      for (dcg $$7 : dcf.b($$2, $$0, $$5, this.d.a())) {
         $$1.b($$7.a, $$7.b);
      }
   }

   @Override
   public MapCodec<ddo> a() {
      return c;
   }

   public ju<dcd> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }
}
