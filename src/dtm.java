import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtm extends dkk {
   protected static final MapCodec<lz> a = md.i
      .q()
      .comapFlatMap($$0 -> $$0 instanceof lz $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<dtm> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, dtm::new));
   protected final lz c;

   @Override
   public MapCodec<? extends dtm> a() {
      return b;
   }

   protected dtm(lz $$0, dyl.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(lv.ah, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.c, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
