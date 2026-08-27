import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class csp {
   public static final Codec<csp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(js.aT.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, csp::new)
   );
   private final jq b;
   private final float c;

   public csp(jq $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public jq a() {
      return this.b;
   }

   public boolean a(ato $$0) {
      return $$0.i() <= this.c;
   }
}
