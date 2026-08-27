import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cun {
   public static final Codec<cun> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jx.aX.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, cun::new)
   );
   private final jv b;
   private final float c;

   public cun(jv $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public jv a() {
      return this.b;
   }

   public boolean a(auv $$0) {
      return $$0.i() <= this.c;
   }
}
