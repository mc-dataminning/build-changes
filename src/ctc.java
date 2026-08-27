import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ctc {
   public static final Codec<ctc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jw.aT.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, ctc::new)
   );
   private final ju b;
   private final float c;

   public ctc(ju $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ju a() {
      return this.b;
   }

   public boolean a(atw $$0) {
      return $$0.i() <= this.c;
   }
}
