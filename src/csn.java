import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class csn {
   public static final Codec<csn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqm.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, csn::new)
   );
   private final ib<aqm> b;
   private final double c;

   public csn(ib<aqm> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ib<aqm> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
