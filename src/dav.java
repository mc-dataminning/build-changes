import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dav(jn<czl> c, int d, int e) implements das {
   public static final MapCodec<dav> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jy.a(lr.aK).fieldOf("enchantments").forGetter(dav::b),
               axo.l.fieldOf("min_cost").forGetter(dav::c),
               axo.k.fieldOf("max_cost_span").forGetter(dav::d)
            )
            .apply($$0, dav::new)
   );

   @Override
   public void a(cuc $$0, czr.a $$1, ayo $$2, dcf $$3, ja $$4) {
      float $$5 = $$3.d_($$4).d();
      int $$6 = ayg.b($$2, this.d, this.d + (int)($$5 * (float)this.e));

      for (czo $$8 : czn.b($$2, $$0, $$6, this.c.a())) {
         $$1.b($$8.a, $$8.b);
      }
   }

   @Override
   public MapCodec<dav> a() {
      return b;
   }

   public jn<czl> b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
