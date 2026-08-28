import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eeh extends eel {
   private final jv<esz> e;
   public static final MapCodec<eeh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kg.a(mc.D).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, eeh::new)
   );

   public eeh(km $$0, jv<esz> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dwy $$0) {
      return $$0.y().a(this.e);
   }

   @Override
   public eeb<?> a() {
      return eeb.c;
   }
}
