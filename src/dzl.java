import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzl extends dzn {
   public static final Codec<dzl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dgb.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, dzl::new)
   );
   private final dgb b;
   private final float d;

   public dzl(dgb $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dgb $$0, ate $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected dzo<?> a() {
      return dzo.f;
   }
}
