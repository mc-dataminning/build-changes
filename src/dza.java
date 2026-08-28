import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dza implements dyw {
   public static final MapCodec<dza> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.v(16).optionalFieldOf("offset", iz.c).forGetter($$0x -> $$0x.e)).apply($$0, dza::new)
   );
   private final kd e;

   public dza(kd $$0) {
      this.e = $$0;
   }

   public boolean a(dco $$0, iz $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public dyx<?> a() {
      return dyx.h;
   }
}
