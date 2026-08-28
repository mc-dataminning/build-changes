import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecq implements ecm {
   public static final MapCodec<ecq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kl.v(16).optionalFieldOf("offset", jh.c).forGetter($$0x -> $$0x.e)).apply($$0, ecq::new)
   );
   private final kl e;

   public ecq(kl $$0) {
      this.e = $$0;
   }

   public boolean a(dfy $$0, jh $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public ecn<?> a() {
      return ecn.h;
   }
}
