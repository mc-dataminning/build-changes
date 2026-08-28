import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwb extends dms {
   protected static final MapCodec<mc> a = mg.i
      .q()
      .comapFlatMap($$0 -> $$0 instanceof mc $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<dwb> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, dwb::new));
   protected final mc c;

   @Override
   public MapCodec<? extends dwb> a() {
      return b;
   }

   protected dwb(mc $$0, ebd.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(ly.ah, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.c, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
