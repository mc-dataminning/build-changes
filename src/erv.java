import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class erv extends ery {
   public static final MapCodec<erv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ma.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, erv::new)
   );
   private final dke b;
   private final float d;

   public erv(dke $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dxn $$0, bam $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected erz<?> a() {
      return erz.e;
   }
}
