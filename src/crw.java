import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class crw {
   public static final Codec<crw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(js.aS.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, crw::new)
   );
   private final jq b;
   private final float c;

   public crw(jq $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public jq a() {
      return this.b;
   }

   public boolean a(ate $$0) {
      return $$0.i() <= this.c;
   }
}
