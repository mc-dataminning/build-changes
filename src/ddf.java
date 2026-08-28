import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddf {
   public static final Codec<ddf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(lj.bf.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, ddf::new)
   );
   private final lh b;
   private final float c;

   public ddf(lh $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public lh a() {
      return this.b;
   }

   public boolean a(ayo $$0) {
      return $$0.i() <= this.c;
   }
}
