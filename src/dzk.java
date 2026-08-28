import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzk implements dzg {
   public static final MapCodec<dzk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ke.v(16).optionalFieldOf("offset", ja.c).forGetter($$0x -> $$0x.e)).apply($$0, dzk::new)
   );
   private final ke e;

   public dzk(ke $$0) {
      this.e = $$0;
   }

   public boolean a(dcz $$0, ja $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public dzh<?> a() {
      return dzh.h;
   }
}
