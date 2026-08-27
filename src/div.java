import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class div implements dir {
   public static final Codec<div> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hz.v(16).optionalFieldOf("offset", gu.b).forGetter($$0x -> $$0x.e)).apply($$0, div::new)
   );
   private final hz e;

   public div(hz $$0) {
      this.e = $$0;
   }

   public boolean a(cng $$0, gu $$1) {
      return !$$0.r($$1.a(this.e));
   }

   @Override
   public dis<?> a() {
      return dis.h;
   }
}
