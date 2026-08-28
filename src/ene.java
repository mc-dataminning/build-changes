import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ene extends enh {
   public static final MapCodec<ene> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lt.e.r().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, ene::new)
   );
   private final dfw b;
   private final float d;

   public ene(dfw $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dta $$0, ayv $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected eni<?> a() {
      return eni.e;
   }
}
