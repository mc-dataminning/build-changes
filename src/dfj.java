import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfj {
   public static final Codec<dfj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(lo.bf.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, dfj::new)
   );
   private final lm b;
   private final float c;

   public dfj(lm $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public lm a() {
      return this.b;
   }

   public boolean a(azn $$0) {
      return $$0.i() <= this.c;
   }
}
