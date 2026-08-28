import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnj extends dep {
   protected static final MapCodec<lm> c = lp.j
      .q()
      .comapFlatMap($$0 -> $$0 instanceof lm $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<dnj> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dnj::new));
   protected final lm e;

   @Override
   public MapCodec<? extends dnj> a() {
      return d;
   }

   protected dnj(lm $$0, dsb.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void a(dsc $$0, dby $$1, iz $$2, azh $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(li.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.e, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
