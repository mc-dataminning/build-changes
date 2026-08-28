import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eem implements edy {
   public static final MapCodec<eem> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(km.v(16).optionalFieldOf("offset", km.h).forGetter($$0x -> $$0x.e), dww.a.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, eem::new)
   );
   private final km e;
   private final dww f;

   protected eem(km $$0, dww $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dhf $$0, ji $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public edz<?> a() {
      return edz.g;
   }
}
