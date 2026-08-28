import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpg extends dgl {
   protected static final MapCodec<lr> c = lu.i
      .q()
      .comapFlatMap($$0 -> $$0 instanceof lr $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<dpg> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dpg::new));
   protected final lr e;

   @Override
   public MapCodec<? extends dpg> a() {
      return d;
   }

   protected dpg(lr $$0, dtz.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(ln.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.e, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
