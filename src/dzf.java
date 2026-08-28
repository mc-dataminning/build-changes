import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzf implements dzb {
   public static final MapCodec<dzf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.v(16).optionalFieldOf("offset", iz.c).forGetter($$0x -> $$0x.e)).apply($$0, dzf::new)
   );
   private final kd e;

   public dzf(kd $$0) {
      this.e = $$0;
   }

   public boolean a(dct $$0, iz $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public dzc<?> a() {
      return dzc.h;
   }
}
