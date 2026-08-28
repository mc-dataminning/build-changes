import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egy implements egu {
   public static final MapCodec<egy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jz.v(16).optionalFieldOf("offset", iu.c).forGetter($$0x -> $$0x.e)).apply($$0, egy::new)
   );
   private final jz e;

   public egy(jz $$0) {
      this.e = $$0;
   }

   public boolean a(djo $$0, iu $$1) {
      return !$$0.t($$1.a(this.e));
   }

   @Override
   public egv<?> a() {
      return egv.h;
   }
}
