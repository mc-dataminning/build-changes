import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgq(ji<dff> d, int e, int f) implements dgn {
   public static final int b = 10000;
   public static final MapCodec<dgq> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jt.a(mg.aP).fieldOf("enchantments").forGetter(dgq::b),
               ays.a(1, 10000).fieldOf("min_cost").forGetter(dgq::c),
               ays.a(0, 10000).fieldOf("max_cost_span").forGetter(dgq::d)
            )
            .apply($$0, dgq::new)
   );

   @Override
   public void a(cys $$0, dfl.a $$1, azt $$2, btw $$3) {
      float $$4 = $$3.d();
      int $$5 = azk.b($$2, this.e, this.e + (int)($$4 * (float)this.f));

      for (dfi $$7 : dfh.b($$2, $$0, $$5, this.d.a())) {
         $$1.b($$7.b(), $$7.c());
      }
   }

   @Override
   public MapCodec<dgq> a() {
      return c;
   }

   public ji<dff> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }
}
