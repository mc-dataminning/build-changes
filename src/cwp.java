import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cwp {
   public static final Codec<cwp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jz.aW.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, cwp::new)
   );
   private final jx b;
   private final float c;

   public cwp(jx $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public jx a() {
      return this.b;
   }

   public boolean a(awp $$0) {
      return $$0.i() <= this.c;
   }
}
