import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpx extends dhc {
   protected static final MapCodec<ls> c = lv.i
      .q()
      .comapFlatMap($$0 -> $$0 instanceof ls $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<dpx> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), t()).apply($$0, dpx::new));
   protected final ls e;

   @Override
   public MapCodec<? extends dpx> a() {
      return d;
   }

   protected dpx(ls $$0, dur.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(lo.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.e, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
