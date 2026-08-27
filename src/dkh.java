import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkh extends dbo {
   protected static final MapCodec<ko> c = kr.j
      .q()
      .comapFlatMap($$0 -> $$0 instanceof ko $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<dkh> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dkh::new));
   protected final ko e;

   @Override
   public MapCodec<? extends dkh> a() {
      return d;
   }

   protected dkh(ko $$0, doy.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(kl.ac, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.e, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
