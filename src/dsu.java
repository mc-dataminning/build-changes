import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsu extends dju {
   protected static final MapCodec<lx> a = mb.i
      .q()
      .comapFlatMap($$0 -> $$0 instanceof lx $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<dsu> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, dsu::new));
   protected final lx c;

   @Override
   public MapCodec<? extends dsu> a() {
      return b;
   }

   protected dsu(lx $$0, dxp.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(lt.ah, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.c, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
