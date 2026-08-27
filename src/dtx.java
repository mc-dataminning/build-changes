import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtx implements dtt {
   public static final Codec<dtx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jg.v(16).optionalFieldOf("offset", ib.c).forGetter($$0x -> $$0x.e)).apply($$0, dtx::new)
   );
   private final jg e;

   public dtx(jg $$0) {
      this.e = $$0;
   }

   public boolean a(cxu $$0, ib $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public dtu<?> a() {
      return dtu.h;
   }
}
