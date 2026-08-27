import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cum {
   public static final Codec<cum> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jx.aX.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, cum::new)
   );
   private final jv b;
   private final float c;

   public cum(jv $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public jv a() {
      return this.b;
   }

   public boolean a(auu $$0) {
      return $$0.i() <= this.c;
   }
}
