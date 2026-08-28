import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehr implements ehn {
   public static final MapCodec<ehr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jz.v(16).optionalFieldOf("offset", iu.c).forGetter($$0x -> $$0x.e)).apply($$0, ehr::new)
   );
   private final jz e;

   public ehr(jz $$0) {
      this.e = $$0;
   }

   public boolean a(djz $$0, iu $$1) {
      return !$$0.t($$1.a(this.e));
   }

   @Override
   public eho<?> a() {
      return eho.h;
   }
}
