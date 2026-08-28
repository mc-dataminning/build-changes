import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eee implements eea {
   public static final MapCodec<eee> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(km.v(16).optionalFieldOf("offset", ji.c).forGetter($$0x -> $$0x.e)).apply($$0, eee::new)
   );
   private final km e;

   public eee(km $$0) {
      this.e = $$0;
   }

   public boolean a(dhh $$0, ji $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public eeb<?> a() {
      return eeb.h;
   }
}
