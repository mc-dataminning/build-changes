import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzd implements dyz {
   public static final MapCodec<dzd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.v(16).optionalFieldOf("offset", iz.c).forGetter($$0x -> $$0x.e)).apply($$0, dzd::new)
   );
   private final kd e;

   public dzd(kd $$0) {
      this.e = $$0;
   }

   public boolean a(dcr $$0, iz $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public dza<?> a() {
      return dza.h;
   }
}
