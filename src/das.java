import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class das {
   public static final Codec<das> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kw.aX.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, das::new)
   );
   private final ku b;
   private final float c;

   public das(ku $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ku a() {
      return this.b;
   }

   public boolean a(ayd $$0) {
      return $$0.i() <= this.c;
   }
}
