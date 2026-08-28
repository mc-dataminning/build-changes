import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class erw extends erz {
   public static final MapCodec<erw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ma.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, erw::new)
   );
   private final dkd b;
   private final float d;

   public erw(dkd $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dxo $$0, bac $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected esa<?> a() {
      return esa.e;
   }
}
