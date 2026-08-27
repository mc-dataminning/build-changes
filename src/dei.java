import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dei extends cvp {
   protected static final MapCodec<jy> c = kb.j
      .q()
      .comapFlatMap($$0 -> $$0 instanceof jy $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<dei> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dei::new));
   protected final jy e;

   @Override
   public MapCodec<? extends dei> a() {
      return d;
   }

   protected dei(jy $$0, dio.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(jv.ab, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.e, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
