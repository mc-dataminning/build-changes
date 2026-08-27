import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cwl {
   public static final Codec<cwl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jz.aX.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, cwl::new)
   );
   private final jx b;
   private final float c;

   public cwl(jx $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public jx a() {
      return this.b;
   }

   public boolean a(awo $$0) {
      return $$0.i() <= this.c;
   }
}
