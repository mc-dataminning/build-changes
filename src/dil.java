import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dil extends czs {
   protected static final MapCodec<kf> c = ki.j
      .q()
      .comapFlatMap($$0 -> $$0 instanceof kf $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<dil> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dil::new));
   protected final kf e;

   @Override
   public MapCodec<? extends dil> a() {
      return d;
   }

   protected dil(kf $$0, dna.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(kc.ac, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.e, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
