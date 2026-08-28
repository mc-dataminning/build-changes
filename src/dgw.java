import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgw(ji<dfl> d, int e, int f) implements dgt {
   public static final int b = 10000;
   public static final MapCodec<dgw> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jt.a(mg.aQ).fieldOf("enchantments").forGetter(dgw::b),
               ayu.a(1, 10000).fieldOf("min_cost").forGetter(dgw::c),
               ayu.a(0, 10000).fieldOf("max_cost_span").forGetter(dgw::d)
            )
            .apply($$0, dgw::new)
   );

   @Override
   public void a(cyy $$0, dfr.a $$1, azv $$2, btz $$3) {
      float $$4 = $$3.d();
      int $$5 = azm.b($$2, this.e, this.e + (int)($$4 * (float)this.f));

      for (dfo $$7 : dfn.b($$2, $$0, $$5, this.d.a())) {
         $$1.b($$7.b(), $$7.c());
      }
   }

   @Override
   public MapCodec<dgw> a() {
      return c;
   }

   public ji<dfl> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }
}
