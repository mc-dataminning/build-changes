import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efx extends ega {
   public static final Codec<efx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kh.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, efx::new)
   );
   private final czf b;
   private final float d;

   public efx(czf $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dme $$0, awt $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected egb<?> a() {
      return egb.e;
   }
}
