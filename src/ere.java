import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ere extends erg {
   public static final MapCodec<ere> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwv.a.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, ere::new)
   );
   private final dwv b;
   private final float d;

   public ere(dwv $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dwv $$0, azg $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected erh<?> a() {
      return erh.f;
   }
}
