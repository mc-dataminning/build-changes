import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehj implements ehf {
   public static final MapCodec<ehj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jz.v(16).optionalFieldOf("offset", iu.c).forGetter($$0x -> $$0x.e)).apply($$0, ehj::new)
   );
   private final jz e;

   public ehj(jz $$0) {
      this.e = $$0;
   }

   public boolean a(dju $$0, iu $$1) {
      return !$$0.t($$1.a(this.e));
   }

   @Override
   public ehg<?> a() {
      return ehg.h;
   }
}
