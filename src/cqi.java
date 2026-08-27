import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cqi {
   public static final Codec<cqi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iv.aR.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, cqi::new)
   );
   private final it b;
   private final float c;

   public cqi(it $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public it a() {
      return this.b;
   }

   public boolean a(aru $$0) {
      return $$0.i() <= this.c;
   }
}
