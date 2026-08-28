import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record daw(jn<czm> c, int d, int e) implements dat {
   public static final MapCodec<daw> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jy.a(lr.aK).fieldOf("enchantments").forGetter(daw::b),
               axo.l.fieldOf("min_cost").forGetter(daw::c),
               axo.k.fieldOf("max_cost_span").forGetter(daw::d)
            )
            .apply($$0, daw::new)
   );

   @Override
   public void a(cud $$0, czs.a $$1, ayo $$2, bqf $$3) {
      float $$4 = $$3.d();
      int $$5 = ayg.b($$2, this.d, this.d + (int)($$4 * (float)this.e));

      for (czp $$7 : czo.b($$2, $$0, $$5, this.c.a())) {
         $$1.b($$7.a, $$7.b);
      }
   }

   @Override
   public MapCodec<daw> a() {
      return b;
   }

   public jn<czm> b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
