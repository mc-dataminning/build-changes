import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnz implements dnm {
   public static final Codec<dnz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iw.v(16).optionalFieldOf("offset", iw.g).forGetter($$0x -> $$0x.e), dgw.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dnz::new)
   );
   private final iw e;
   private final dgw f;

   protected dnz(iw $$0, dgw $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(csm $$0, ht $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dnn<?> a() {
      return dnn.g;
   }
}
