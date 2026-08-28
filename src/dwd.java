import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwd extends dmu {
   protected static final MapCodec<md> a = mh.i
      .q()
      .comapFlatMap($$0 -> $$0 instanceof md $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<dwd> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, dwd::new));
   protected final md c;

   @Override
   public MapCodec<? extends dwd> a() {
      return b;
   }

   protected dwd(md $$0, ebf.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(lz.ah, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.c, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
