import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eoi extends eok {
   public static final MapCodec<eoi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dua.a.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, eoi::new)
   );
   private final dua b;
   private final float d;

   public eoi(dua $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dua $$0, azk $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected eol<?> a() {
      return eol.f;
   }
}
