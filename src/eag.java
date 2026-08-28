import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eag implements eac {
   public static final MapCodec<eag> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kh.v(16).optionalFieldOf("offset", jd.c).forGetter($$0x -> $$0x.e)).apply($$0, eag::new)
   );
   private final kh e;

   public eag(kh $$0) {
      this.e = $$0;
   }

   public boolean a(ddq $$0, jd $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public ead<?> a() {
      return ead.h;
   }
}
