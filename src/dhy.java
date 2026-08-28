import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhy(jk<dgn> d, int e, int f) implements dhv {
   public static final int b = 10000;
   public static final MapCodec<dhy> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jv.a(mi.aR).fieldOf("enchantments").forGetter(dhy::b),
               ayy.a(1, 10000).fieldOf("min_cost").forGetter(dhy::c),
               ayy.a(0, 10000).fieldOf("max_cost_span").forGetter(dhy::d)
            )
            .apply($$0, dhy::new)
   );

   @Override
   public void a(daa $$0, dgt.a $$1, azz $$2, bur $$3) {
      float $$4 = $$3.d();
      int $$5 = azq.b($$2, this.e, this.e + (int)($$4 * (float)this.f));

      for (dgq $$7 : dgp.b($$2, $$0, $$5, this.d.a())) {
         $$1.b($$7.b(), $$7.c());
      }
   }

   @Override
   public MapCodec<dhy> a() {
      return c;
   }

   public jk<dgn> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }
}
