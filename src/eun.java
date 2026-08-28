import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eun extends eup {
   public static final MapCodec<eun> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzz.a.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, eun::new)
   );
   private final dzz b;
   private final float d;

   public eun(dzz $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dzz $$0, azv $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected euq<?> a() {
      return euq.f;
   }
}
