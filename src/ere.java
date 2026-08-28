import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ere extends erh {
   public static final MapCodec<ere> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mb.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, ere::new)
   );
   private final djl b;
   private final float d;

   public ere(djl $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dww $$0, azh $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected eri<?> a() {
      return eri.e;
   }
}
