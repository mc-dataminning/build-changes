import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record del(jv<dda> d, int e, int f) implements dei {
   public static final int b = 10000;
   public static final MapCodec<del> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kg.a(mc.aO).fieldOf("enchantments").forGetter(del::b),
               ayi.a(1, 10000).fieldOf("min_cost").forGetter(del::c),
               ayi.a(0, 10000).fieldOf("max_cost_span").forGetter(del::d)
            )
            .apply($$0, del::new)
   );

   @Override
   public void a(cwq $$0, ddg.a $$1, azh $$2, bsj $$3) {
      float $$4 = $$3.d();
      int $$5 = ayz.b($$2, this.e, this.e + (int)($$4 * (float)this.f));

      for (ddd $$7 : ddc.b($$2, $$0, $$5, this.d.a())) {
         $$1.b($$7.a, $$7.b);
      }
   }

   @Override
   public MapCodec<del> a() {
      return c;
   }

   public jv<dda> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }
}
