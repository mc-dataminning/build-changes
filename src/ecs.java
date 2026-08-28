import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ecs extends ecx {
   private final ju<die> e;
   public static final MapCodec<ecs> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kf.a(lz.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, ecs::new)
   );

   public ecs(kl $$0, ju<die> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dvj $$0) {
      return $$0.a(this.e);
   }

   @Override
   public ecn<?> a() {
      return ecn.a;
   }
}
