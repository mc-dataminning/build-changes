import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class efc extends efg {
   private final jv<etv> e;
   public static final MapCodec<efc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kg.a(mc.D).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, efc::new)
   );

   public efc(km $$0, jv<etv> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dxq $$0) {
      return $$0.y().a(this.e);
   }

   @Override
   public eew<?> a() {
      return eew.c;
   }
}
