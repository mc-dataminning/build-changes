import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doh extends dfm {
   protected static final MapCodec<lq> c = lt.i
      .r()
      .comapFlatMap($$0 -> $$0 instanceof lq $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<doh> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, doh::new));
   protected final lq e;

   @Override
   public MapCodec<? extends doh> a() {
      return d;
   }

   protected doh(lq $$0, dsz.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(lm.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.e, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
