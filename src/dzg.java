import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzg implements dzc {
   public static final MapCodec<dzg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.v(16).optionalFieldOf("offset", iz.c).forGetter($$0x -> $$0x.e)).apply($$0, dzg::new)
   );
   private final kd e;

   public dzg(kd $$0) {
      this.e = $$0;
   }

   public boolean a(dcu $$0, iz $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public dzd<?> a() {
      return dzd.h;
   }
}
