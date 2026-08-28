import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsy extends dkb {
   protected static final MapCodec<lw> c = ma.i
      .q()
      .comapFlatMap($$0 -> $$0 instanceof lw $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<dsy> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), t()).apply($$0, dsy::new));
   protected final lw e;

   @Override
   public MapCodec<? extends dsy> a() {
      return d;
   }

   protected dsy(lw $$0, dxt.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, bam $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(ls.af, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.e, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
