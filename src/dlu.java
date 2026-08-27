import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlu implements dlq {
   public static final Codec<dlu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hz.v(16).optionalFieldOf("offset", gu.b).forGetter($$0x -> $$0x.e)).apply($$0, dlu::new)
   );
   private final hz e;

   public dlu(hz $$0) {
      this.e = $$0;
   }

   public boolean a(cqg $$0, gu $$1) {
      return !$$0.r($$1.a(this.e));
   }

   @Override
   public dlr<?> a() {
      return dlr.h;
   }
}
