import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzj extends dzn {
   private final jm<env> e;
   public static final MapCodec<dzj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jx.a(lq.z).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dzj::new)
   );

   public dzj(kd $$0, jm<env> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dsd $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dzd<?> a() {
      return dzd.c;
   }
}
