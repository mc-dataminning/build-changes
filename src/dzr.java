import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzr implements dzn {
   public static final MapCodec<dzr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ke.v(16).optionalFieldOf("offset", ja.c).forGetter($$0x -> $$0x.e)).apply($$0, dzr::new)
   );
   private final ke e;

   public dzr(ke $$0) {
      this.e = $$0;
   }

   public boolean a(ddc $$0, ja $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public dzo<?> a() {
      return dzo.h;
   }
}
