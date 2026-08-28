import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dze implements dza {
   public static final MapCodec<dze> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.v(16).optionalFieldOf("offset", iz.c).forGetter($$0x -> $$0x.e)).apply($$0, dze::new)
   );
   private final kd e;

   public dze(kd $$0) {
      this.e = $$0;
   }

   public boolean a(dcs $$0, iz $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public dzb<?> a() {
      return dzb.h;
   }
}
