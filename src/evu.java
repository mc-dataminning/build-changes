import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class evu extends evx {
   public static final MapCodec<evu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mg.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, evu::new)
   );
   private final dnc b;
   private final float d;

   public evu(dnc $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(ebe $$0, azx $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected evy<?> a() {
      return evy.e;
   }
}
