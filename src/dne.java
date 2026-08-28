import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dne extends dek {
   protected static final MapCodec<lm> c = lp.j
      .q()
      .comapFlatMap($$0 -> $$0 instanceof lm $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<dne> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dne::new));
   protected final lm e;

   @Override
   public MapCodec<? extends dne> a() {
      return d;
   }

   protected dne(lm $$0, drw.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, azc $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(lj.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.e, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
