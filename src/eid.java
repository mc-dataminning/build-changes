import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eid implements ehz {
   public static final MapCodec<eid> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ka.v(16).optionalFieldOf("offset", iv.c).forGetter($$0x -> $$0x.e)).apply($$0, eid::new)
   );
   private final ka e;

   public eid(ka $$0) {
      this.e = $$0;
   }

   public boolean a(dkl $$0, iv $$1) {
      return !$$0.t($$1.a(this.e));
   }

   @Override
   public eia<?> a() {
      return eia.h;
   }
}
