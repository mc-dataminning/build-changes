import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfb(ju<ddq> d, int e, int f) implements dey {
   public static final int b = 10000;
   public static final MapCodec<dfb> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kf.a(mb.aO).fieldOf("enchantments").forGetter(dfb::b),
               azd.a(1, 10000).fieldOf("min_cost").forGetter(dfb::c),
               azd.a(0, 10000).fieldOf("max_cost_span").forGetter(dfb::d)
            )
            .apply($$0, dfb::new)
   );

   @Override
   public void a(cxg $$0, ddw.a $$1, bac $$2, bsy $$3) {
      float $$4 = $$3.d();
      int $$5 = azu.b($$2, this.e, this.e + (int)($$4 * (float)this.f));

      for (ddt $$7 : dds.b($$2, $$0, $$5, this.d.a())) {
         $$1.b($$7.a, $$7.b);
      }
   }

   @Override
   public MapCodec<dfb> a() {
      return c;
   }

   public ju<ddq> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }
}
