import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ecc extends ecg {
   private final js<eqs> e;
   public static final MapCodec<ecc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kd.a(lw.D).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, ecc::new)
   );

   public ecc(kj $$0, js<eqs> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dus $$0) {
      return $$0.y().a(this.e);
   }

   @Override
   public ebw<?> a() {
      return ebw.c;
   }
}
