import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cxc {
   public static final Codec<cxc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kb.aX.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, cxc::new)
   );
   private final jz b;
   private final float c;

   public cxc(jz $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public jz a() {
      return this.b;
   }

   public boolean a(awt $$0) {
      return $$0.i() <= this.c;
   }
}
