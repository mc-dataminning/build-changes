import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eel implements edx {
   public static final MapCodec<eel> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(km.v(16).optionalFieldOf("offset", km.h).forGetter($$0x -> $$0x.e), dwv.a.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, eel::new)
   );
   private final km e;
   private final dwv f;

   protected eel(km $$0, dwv $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dhe $$0, ji $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public edy<?> a() {
      return edy.g;
   }
}
