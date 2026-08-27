import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cqy {
   public static final Codec<cqy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iv.aR.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, cqy::new)
   );
   private final it b;
   private final float c;

   public cqy(it $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public it a() {
      return this.b;
   }

   public boolean a(ash $$0) {
      return $$0.i() <= this.c;
   }
}
