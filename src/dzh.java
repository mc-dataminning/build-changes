import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzh implements dzd {
   public static final MapCodec<dzh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.v(16).optionalFieldOf("offset", iz.c).forGetter($$0x -> $$0x.e)).apply($$0, dzh::new)
   );
   private final kd e;

   public dzh(kd $$0) {
      this.e = $$0;
   }

   public boolean a(dcv $$0, iz $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public dze<?> a() {
      return dze.h;
   }
}
