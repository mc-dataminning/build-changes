import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dko {
   public static final Codec<dko> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ly.bk.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, dko::new)
   );
   private final lw b;
   private final float c;

   public dko(lw $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public lw a() {
      return this.b;
   }

   public boolean a(azv $$0) {
      return $$0.i() <= this.c;
   }
}
