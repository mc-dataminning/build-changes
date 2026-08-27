import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkq extends dbx {
   protected static final MapCodec<kq> c = kt.j
      .q()
      .comapFlatMap($$0 -> $$0 instanceof kq $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<dkq> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dkq::new));
   protected final kq e;

   @Override
   public MapCodec<? extends dkq> a() {
      return d;
   }

   protected dkq(kq $$0, dph.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(kn.ac, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.e, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
