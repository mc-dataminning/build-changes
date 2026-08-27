import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cqu {
   public static final Codec<cqu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ix.aR.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, cqu::new)
   );
   private final iv b;
   private final float c;

   public cqu(iv $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public iv a() {
      return this.b;
   }

   public boolean a(ase $$0) {
      return $$0.i() <= this.c;
   }
}
