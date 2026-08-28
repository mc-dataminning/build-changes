import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emo extends emq {
   public static final MapCodec<emo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsk.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, emo::new)
   );
   private final dsk b;
   private final float d;

   public emo(dsk $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dsk $$0, ayo $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected emr<?> a() {
      return emr.f;
   }
}
