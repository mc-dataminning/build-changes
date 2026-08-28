import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eby extends ecc {
   private final jr<eqo> e;
   public static final MapCodec<eby> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kc.a(lv.D).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, eby::new)
   );

   public eby(ki $$0, jr<eqo> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(duo $$0) {
      return $$0.y().a(this.e);
   }

   @Override
   public ebs<?> a() {
      return ebs.c;
   }
}
