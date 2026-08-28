import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeb implements edx {
   public static final MapCodec<eeb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(km.v(16).optionalFieldOf("offset", ji.c).forGetter($$0x -> $$0x.e)).apply($$0, eeb::new)
   );
   private final km e;

   public eeb(km $$0) {
      this.e = $$0;
   }

   public boolean a(dhe $$0, ji $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public edy<?> a() {
      return edy.h;
   }
}
