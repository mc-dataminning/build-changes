import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eec implements edy {
   public static final MapCodec<eec> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(km.v(16).optionalFieldOf("offset", ji.c).forGetter($$0x -> $$0x.e)).apply($$0, eec::new)
   );
   private final km e;

   public eec(km $$0) {
      this.e = $$0;
   }

   public boolean a(dhf $$0, ji $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public edz<?> a() {
      return edz.h;
   }
}
