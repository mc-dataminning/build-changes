import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ewh extends ewj {
   public static final MapCodec<ewh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebq.a.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, ewh::new)
   );
   private final ebq b;
   private final float d;

   public ewh(ebq $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(ebq $$0, bai $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected ewk<?> a() {
      return ewk.f;
   }
}
