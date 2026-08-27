import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddo extends cuv {
   protected static final MapCodec<jz> c = kc.k
      .q()
      .comapFlatMap($$0 -> $$0 instanceof jz $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<ddo> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, ddo::new));
   protected final jz e;

   @Override
   public MapCodec<? extends ddo> a() {
      return d;
   }

   protected ddo(jz $$0, dhm.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(jw.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.e, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
