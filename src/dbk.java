import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbk extends css {
   protected static final MapCodec<iy> c = jb.k
      .q()
      .comapFlatMap($$0 -> $$0 instanceof iy $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<dbk> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), t()).apply($$0, dbk::new));
   protected final iy e;

   @Override
   public MapCodec<? extends dbk> a() {
      return d;
   }

   protected dbk(iy $$0, dfc.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(iv.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.e, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
