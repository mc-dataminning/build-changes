import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class evw extends evz {
   public static final MapCodec<evw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mh.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, evw::new)
   );
   private final dne b;
   private final float d;

   public evw(dne $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(ebg $$0, azz $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected ewa<?> a() {
      return ewa.e;
   }
}
