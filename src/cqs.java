import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cqs {
   public static final Codec<cqs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ix.aR.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, cqs::new)
   );
   private final iv b;
   private final float c;

   public cqs(iv $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public iv a() {
      return this.b;
   }

   public boolean a(asc $$0) {
      return $$0.i() <= this.c;
   }
}
