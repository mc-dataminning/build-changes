import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eea implements edx {
   private final km e;
   private final jn f;
   public static final MapCodec<eea> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(km.v(16).optionalFieldOf("offset", km.h).forGetter($$0x -> $$0x.e), jn.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, eea::new)
   );

   public eea(km $$0, jn $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dhe $$0, ji $$1) {
      ji $$2 = $$1.a(this.e);
      return $$0.a_($$2).c($$0, $$2, this.f);
   }

   @Override
   public edy<?> a() {
      return edy.d;
   }
}
