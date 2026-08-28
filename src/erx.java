import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class erx extends erz {
   public static final MapCodec<erx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxo.a.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, erx::new)
   );
   private final dxo b;
   private final float d;

   public erx(dxo $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dxo $$0, bac $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected esa<?> a() {
      return esa.f;
   }
}
