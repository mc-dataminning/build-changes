import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emh extends emk {
   public static final MapCodec<emh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lq.e.r().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, emh::new)
   );
   private final dff b;
   private final float d;

   public emh(dff $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dsh $$0, aym $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected eml<?> a() {
      return eml.e;
   }
}
