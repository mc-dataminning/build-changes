import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvl extends dvn {
   public static final Codec<dvl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dcb.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, dvl::new)
   );
   private final dcb b;
   private final float d;

   public dvl(dcb $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dcb $$0, apf $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected dvo<?> a() {
      return dvo.f;
   }
}
