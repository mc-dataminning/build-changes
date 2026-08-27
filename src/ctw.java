import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ctw {
   public static final Codec<ctw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jv.aX.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, ctw::new)
   );
   private final jt b;
   private final float c;

   public ctw(jt $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public jt a() {
      return this.b;
   }

   public boolean a(auf $$0) {
      return $$0.i() <= this.c;
   }
}
