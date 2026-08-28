import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elz extends emc {
   public static final MapCodec<elz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, elz::new)
   );
   private final dex b;
   private final float d;

   public elz(dex $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dsa $$0, azf $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected emd<?> a() {
      return emd.e;
   }
}
