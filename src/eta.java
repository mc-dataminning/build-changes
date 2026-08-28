import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eta extends etc {
   public static final MapCodec<eta> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dym.a.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, eta::new)
   );
   private final dym b;
   private final float d;

   public eta(dym $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dym $$0, azs $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected etd<?> a() {
      return etd.f;
   }
}
