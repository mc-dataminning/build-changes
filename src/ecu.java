import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecu implements ecq {
   public static final MapCodec<ecu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kl.v(16).optionalFieldOf("offset", jh.c).forGetter($$0x -> $$0x.e)).apply($$0, ecu::new)
   );
   private final kl e;

   public ecu(kl $$0) {
      this.e = $$0;
   }

   public boolean a(dgd $$0, jh $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public ecr<?> a() {
      return ecr.h;
   }
}
