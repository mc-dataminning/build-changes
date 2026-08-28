import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drz extends dja {
   protected static final MapCodec<lx> c = mb.i
      .q()
      .comapFlatMap($$0 -> $$0 instanceof lx $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<drz> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), t()).apply($$0, drz::new));
   protected final lx e;

   @Override
   public MapCodec<? extends drz> a() {
      return d;
   }

   protected drz(lx $$0, dwu.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(lt.ag, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.e, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
