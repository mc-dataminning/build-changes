import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmi extends ddo {
   protected static final MapCodec<lb> c = le.j
      .q()
      .comapFlatMap($$0 -> $$0 instanceof lb $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<dmi> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dmi::new));
   protected final lb e;

   @Override
   public MapCodec<? extends dmi> a() {
      return d;
   }

   protected dmi(lb $$0, dra.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, ayk $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(ky.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.e, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
