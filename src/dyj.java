import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyj extends dyl {
   public static final Codec<dyj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dez.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, dyj::new)
   );
   private final dez b;
   private final float d;

   public dyj(dez $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dez $$0, aru $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected dym<?> a() {
      return dym.f;
   }
}
