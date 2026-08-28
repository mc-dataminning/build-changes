import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzk extends dzo {
   private final jm<enw> e;
   public static final MapCodec<dzk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jx.a(lq.z).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dzk::new)
   );

   public dzk(kd $$0, jm<enw> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dse $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dze<?> a() {
      return dze.c;
   }
}
