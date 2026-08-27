import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddc extends cuj {
   protected static final MapCodec<jv> c = jy.k
      .q()
      .comapFlatMap($$0 -> $$0 instanceof jv $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<ddc> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), t()).apply($$0, ddc::new));
   protected final jv e;

   @Override
   public MapCodec<? extends ddc> a() {
      return d;
   }

   protected ddc(jv $$0, dgv.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, ato $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(js.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.e, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
