import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dat(jn<czj> c, int d, int e) implements daq {
   public static final MapCodec<dat> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jy.a(lr.aK).fieldOf("enchantments").forGetter(dat::b),
               axm.l.fieldOf("min_cost").forGetter(dat::c),
               axm.k.fieldOf("max_cost_span").forGetter(dat::d)
            )
            .apply($$0, dat::new)
   );

   @Override
   public void a(cua $$0, czp.a $$1, aym $$2, dcd $$3, ja $$4) {
      float $$5 = $$3.d_($$4).d();
      int $$6 = aye.b($$2, this.d, this.d + (int)($$5 * (float)this.e));

      for (czm $$8 : czl.b($$2, $$0, $$6, this.c.a())) {
         $$1.b($$8.a, $$8.b);
      }
   }

   @Override
   public MapCodec<dat> a() {
      return b;
   }

   public jn<czj> b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
