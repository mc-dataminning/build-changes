import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eoh extends eok {
   public static final MapCodec<eoh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lu.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, eoh::new)
   );
   private final dgv b;
   private final float d;

   public eoh(dgv $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dua $$0, azk $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected eol<?> a() {
      return eol.e;
   }
}
