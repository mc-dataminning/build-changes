import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eed implements edz {
   public static final MapCodec<eed> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(km.v(16).optionalFieldOf("offset", ji.c).forGetter($$0x -> $$0x.e)).apply($$0, eed::new)
   );
   private final km e;

   public eed(km $$0) {
      this.e = $$0;
   }

   public boolean a(dhg $$0, ji $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public eea<?> a() {
      return eea.h;
   }
}
