import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eiq implements eim {
   public static final MapCodec<eiq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kb.v(16).optionalFieldOf("offset", iw.c).forGetter($$0x -> $$0x.e)).apply($$0, eiq::new)
   );
   private final kb e;

   public eiq(kb $$0) {
      this.e = $$0;
   }

   public boolean a(dky $$0, iw $$1) {
      return !$$0.t($$1.a(this.e));
   }

   @Override
   public ein<?> a() {
      return ein.h;
   }
}
