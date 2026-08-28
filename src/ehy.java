import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehy implements ehu {
   public static final MapCodec<ehy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ka.v(16).optionalFieldOf("offset", iv.c).forGetter($$0x -> $$0x.e)).apply($$0, ehy::new)
   );
   private final ka e;

   public ehy(ka $$0) {
      this.e = $$0;
   }

   public boolean a(dkg $$0, iv $$1) {
      return !$$0.t($$1.a(this.e));
   }

   @Override
   public ehv<?> a() {
      return ehv.h;
   }
}
