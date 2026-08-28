import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzi extends dzm {
   private final jm<enu> e;
   public static final MapCodec<dzi> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jx.a(lq.z).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dzi::new)
   );

   public dzi(kd $$0, jm<enu> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dsc $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dzc<?> a() {
      return dzc.c;
   }
}
