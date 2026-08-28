import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecr extends ecx {
   final axq<die> a;
   public static final MapCodec<ecr> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axq.a(lz.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, ecr::new)
   );

   protected ecr(kl $$0, axq<die> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dvj $$0) {
      return $$0.a(this.a);
   }

   @Override
   public ecn<?> a() {
      return ecn.b;
   }
}
