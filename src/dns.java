import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dns extends dey {
   protected static final MapCodec<ln> c = lq.i
      .r()
      .comapFlatMap($$0 -> $$0 instanceof ln $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<dns> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dns::new));
   protected final ln e;

   @Override
   public MapCodec<? extends dns> a() {
      return d;
   }

   protected dns(ln $$0, dsk.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void a(dsl $$0, dcg $$1, ja $$2, ayo $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(lj.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.e, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
