import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpj implements dpf {
   public static final Codec<dpj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iz.v(16).optionalFieldOf("offset", hv.b).forGetter($$0x -> $$0x.e)).apply($$0, dpj::new)
   );
   private final iz e;

   public dpj(iz $$0) {
      this.e = $$0;
   }

   public boolean a(ctt $$0, hv $$1) {
      return !$$0.r($$1.a(this.e));
   }

   @Override
   public dpg<?> a() {
      return dpg.h;
   }
}
