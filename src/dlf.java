import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlf extends dcl {
   protected static final MapCodec<kz> c = lc.j
      .q()
      .comapFlatMap($$0 -> $$0 instanceof kz $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<dlf> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dlf::new));
   protected final kz e;

   @Override
   public MapCodec<? extends dlf> a() {
      return d;
   }

   protected dlf(kz $$0, dpx.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(kw.ab, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.e, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
