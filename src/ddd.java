import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddd(ju<dbs> d, int e, int f) implements dda {
   public static final int b = 10000;
   public static final MapCodec<ddd> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kf.a(lz.aM).fieldOf("enchantments").forGetter(ddd::b),
               ayt.a(1, 10000).fieldOf("min_cost").forGetter(ddd::c),
               ayt.a(0, 10000).fieldOf("max_cost_span").forGetter(ddd::d)
            )
            .apply($$0, ddd::new)
   );

   @Override
   public void a(cwb $$0, dby.a $$1, azs $$2, bsb $$3) {
      float $$4 = $$3.d();
      int $$5 = azk.b($$2, this.e, this.e + (int)($$4 * (float)this.f));

      for (dbv $$7 : dbu.b($$2, $$0, $$5, this.d.a())) {
         $$1.b($$7.a, $$7.b);
      }
   }

   @Override
   public MapCodec<ddd> a() {
      return c;
   }

   public ju<dbs> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }
}
