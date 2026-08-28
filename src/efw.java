import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efw implements efs {
   public static final MapCodec<efw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kn.v(16).optionalFieldOf("offset", jj.c).forGetter($$0x -> $$0x.e)).apply($$0, efw::new)
   );
   private final kn e;

   public efw(kn $$0) {
      this.e = $$0;
   }

   public boolean a(dio $$0, jj $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public eft<?> a() {
      return eft.h;
   }
}
