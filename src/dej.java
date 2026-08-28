import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dej(jv<dcy> d, int e, int f) implements deg {
   public static final int b = 10000;
   public static final MapCodec<dej> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kg.a(mc.aO).fieldOf("enchantments").forGetter(dej::b),
               ayi.a(1, 10000).fieldOf("min_cost").forGetter(dej::c),
               ayi.a(0, 10000).fieldOf("max_cost_span").forGetter(dej::d)
            )
            .apply($$0, dej::new)
   );

   @Override
   public void a(cwo $$0, dde.a $$1, azh $$2, bsh $$3) {
      float $$4 = $$3.d();
      int $$5 = ayz.b($$2, this.e, this.e + (int)($$4 * (float)this.f));

      for (ddb $$7 : dda.b($$2, $$0, $$5, this.d.a())) {
         $$1.b($$7.a, $$7.b);
      }
   }

   @Override
   public MapCodec<dej> a() {
      return c;
   }

   public jv<dcy> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }
}
