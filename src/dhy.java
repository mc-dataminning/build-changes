import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhy {
   public static final Codec<dhy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awu.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, dhy::new)
   );
   private final jq<awu> b;
   private final double c;

   public dhy(jq<awu> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public jq<awu> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
