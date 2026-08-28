import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duw extends dlq {
   protected static final MapCodec<mb> a = mf.i
      .q()
      .comapFlatMap($$0 -> $$0 instanceof mb $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<duw> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, duw::new));
   protected final mb c;

   @Override
   public MapCodec<? extends duw> a() {
      return b;
   }

   protected duw(mb $$0, dzy.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(lx.ah, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.c, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
