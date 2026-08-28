import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehe implements egp {
   public static final Codec<ehe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvj.a.fieldOf("target").forGetter($$0x -> $$0x.b),
               dvj.a.fieldOf("state").forGetter($$0x -> $$0x.c),
               bri.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ehe::new)
   );
   public final dvj b;
   public final dvj c;
   private final bri d;

   public ehe(dvj $$0, dvj $$1, bri $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bri a() {
      return this.d;
   }
}
