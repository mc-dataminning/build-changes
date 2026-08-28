import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ecb extends ecg {
   private final js<dhm> e;
   public static final MapCodec<ecb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kd.a(lw.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, ecb::new)
   );

   public ecb(kj $$0, js<dhm> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dus $$0) {
      return $$0.a(this.e);
   }

   @Override
   public ebw<?> a() {
      return ebw.a;
   }
}
