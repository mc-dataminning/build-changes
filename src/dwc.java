import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwc implements dvy {
   public static final Codec<dwc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jg.v(16).optionalFieldOf("offset", ib.c).forGetter($$0x -> $$0x.e)).apply($$0, dwc::new)
   );
   private final jg e;

   public dwc(jg $$0) {
      this.e = $$0;
   }

   public boolean a(czs $$0, ib $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public dvz<?> a() {
      return dvz.h;
   }
}
