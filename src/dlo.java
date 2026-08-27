import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlo extends dcu {
   protected static final MapCodec<la> c = ld.j
      .q()
      .comapFlatMap($$0 -> $$0 instanceof la $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<dlo> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dlo::new));
   protected final la e;

   @Override
   public MapCodec<? extends dlo> a() {
      return d;
   }

   protected dlo(la $$0, dqg.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(kx.ab, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.e, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
