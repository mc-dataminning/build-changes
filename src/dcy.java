import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcy(js<dbn> d, int e, int f) implements dcv {
   public static final int b = 10000;
   public static final MapCodec<dcy> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kd.a(lw.aN).fieldOf("enchantments").forGetter(dcy::b),
               ayo.a(1, 10000).fieldOf("min_cost").forGetter(dcy::c),
               ayo.a(0, 10000).fieldOf("max_cost_span").forGetter(dcy::d)
            )
            .apply($$0, dcy::new)
   );

   @Override
   public void a(cvs $$0, dbt.a $$1, azn $$2, brq $$3) {
      float $$4 = $$3.d();
      int $$5 = azf.b($$2, this.e, this.e + (int)($$4 * (float)this.f));

      for (dbq $$7 : dbp.b($$2, $$0, $$5, this.d.a())) {
         $$1.b($$7.a, $$7.b);
      }
   }

   @Override
   public MapCodec<dcy> a() {
      return c;
   }

   public js<dbn> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }
}
