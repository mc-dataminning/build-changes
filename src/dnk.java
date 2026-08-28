import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnk extends deq {
   protected static final MapCodec<lm> c = lp.j
      .q()
      .comapFlatMap($$0 -> $$0 instanceof lm $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<dnk> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dnk::new));
   protected final lm e;

   @Override
   public MapCodec<? extends dnk> a() {
      return d;
   }

   protected dnk(lm $$0, dsc.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void a(dsd $$0, dbz $$1, iz $$2, azh $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(li.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.e, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
