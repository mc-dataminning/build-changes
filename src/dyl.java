import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyl implements dxw {
   public static final Codec<dyl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dnb.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dnb.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bmi.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dyl::new)
   );
   public final dnb b;
   public final dnb c;
   private final bmi d;

   public dyl(dnb $$0, dnb $$1, bmi $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bmi a() {
      return this.d;
   }
}
