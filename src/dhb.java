import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhb extends cyi {
   protected static final MapCodec<kc> c = kf.j
      .q()
      .comapFlatMap($$0 -> $$0 instanceof kc $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<dhb> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dhb::new));
   protected final kc e;

   @Override
   public MapCodec<? extends dhb> a() {
      return d;
   }

   protected dhb(kc $$0, dli.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void a(dlj $$0, cvr $$1, hz $$2, awp $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(jz.ab, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.e, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
