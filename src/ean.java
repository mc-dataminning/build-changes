import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ean extends eap {
   public static final Codec<ean> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dgw.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, ean::new)
   );
   private final dgw b;
   private final float d;

   public ean(dgw $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dgw $$0, ato $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected eaq<?> a() {
      return eaq.f;
   }
}
