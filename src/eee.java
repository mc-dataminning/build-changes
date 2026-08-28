import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eee extends eei {
   private final jv<esw> e;
   public static final MapCodec<eee> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kg.a(mc.D).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, eee::new)
   );

   public eee(km $$0, jv<esw> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dwv $$0) {
      return $$0.y().a(this.e);
   }

   @Override
   public edy<?> a() {
      return edy.c;
   }
}
