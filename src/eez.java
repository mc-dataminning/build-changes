import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eez implements eev {
   public static final MapCodec<eez> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(km.v(16).optionalFieldOf("offset", ji.c).forGetter($$0x -> $$0x.e)).apply($$0, eez::new)
   );
   private final km e;

   public eez(km $$0) {
      this.e = $$0;
   }

   public boolean a(dhy $$0, ji $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public eew<?> a() {
      return eew.h;
   }
}
