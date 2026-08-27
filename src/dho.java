import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dho extends cyv {
   protected static final MapCodec<ke> c = kh.j
      .q()
      .comapFlatMap($$0 -> $$0 instanceof ke $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<dho> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dho::new));
   protected final ke e;

   @Override
   public MapCodec<? extends dho> a() {
      return d;
   }

   protected dho(ke $$0, dmd.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, awt $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(kb.ab, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.e, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
