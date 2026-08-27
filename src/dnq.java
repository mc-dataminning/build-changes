import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnq implements dnm {
   public static final Codec<dnq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iw.v(16).optionalFieldOf("offset", ht.b).forGetter($$0x -> $$0x.e)).apply($$0, dnq::new)
   );
   private final iw e;

   public dnq(iw $$0) {
      this.e = $$0;
   }

   public boolean a(csm $$0, ht $$1) {
      return !$$0.r($$1.a(this.e));
   }

   @Override
   public dnn<?> a() {
      return dnn.h;
   }
}
