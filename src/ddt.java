import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddt {
   public static final Codec<ddt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(lm.bf.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, ddt::new)
   );
   private final lk b;
   private final float c;

   public ddt(lk $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public lk a() {
      return this.b;
   }

   public boolean a(ayv $$0) {
      return $$0.i() <= this.c;
   }
}
