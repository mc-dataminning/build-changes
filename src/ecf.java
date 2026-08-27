import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecf extends eci {
   public static final Codec<ecf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kb.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, ecf::new)
   );
   private final cvz b;
   private final float d;

   public ecf(cvz $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dip $$0, auf $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected ecj<?> a() {
      return ecj.e;
   }
}
