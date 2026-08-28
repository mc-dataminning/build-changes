import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class erw extends ery {
   public static final MapCodec<erw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxn.a.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, erw::new)
   );
   private final dxn b;
   private final float d;

   public erw(dxn $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dxn $$0, bam $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected erz<?> a() {
      return erz.f;
   }
}
