import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcx(jt<dbm> d, int e, int f) implements dcu {
   public static final int b = 10000;
   public static final MapCodec<dcx> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ke.a(ly.aM).fieldOf("enchantments").forGetter(dcx::b),
               ays.a(1, 10000).fieldOf("min_cost").forGetter(dcx::c),
               ays.a(0, 10000).fieldOf("max_cost_span").forGetter(dcx::d)
            )
            .apply($$0, dcx::new)
   );

   @Override
   public void a(cvx $$0, dbs.a $$1, azr $$2, brw $$3) {
      float $$4 = $$3.d();
      int $$5 = azj.b($$2, this.e, this.e + (int)($$4 * (float)this.f));

      for (dbp $$7 : dbo.b($$2, $$0, $$5, this.d.a())) {
         $$1.b($$7.a, $$7.b);
      }
   }

   @Override
   public MapCodec<dcx> a() {
      return c;
   }

   public jt<dbm> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }
}
