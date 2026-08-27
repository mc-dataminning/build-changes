import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dob extends der {
   protected static final MapCodec<le> c = lh.j
      .q()
      .comapFlatMap($$0 -> $$0 instanceof le $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<dob> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dob::new));
   protected final le e;

   @Override
   public MapCodec<? extends dob> a() {
      return d;
   }

   protected dob(le $$0, dtb.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(lb.ac, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.e, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
