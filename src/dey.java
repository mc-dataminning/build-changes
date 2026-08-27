import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dey extends cwf {
   protected static final MapCodec<ka> c = kd.j
      .q()
      .comapFlatMap($$0 -> $$0 instanceof ka $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<dey> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dey::new));
   protected final ka e;

   @Override
   public MapCodec<? extends dey> a() {
      return d;
   }

   protected dey(ka $$0, djf.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, auu $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(jx.ab, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.e, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
