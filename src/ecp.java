import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecp {
   private static final Codec<Double> f = Codec.doubleRange(0.01, 50.0);
   public static final Codec<ecp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               f.fieldOf("filling").orElse(1.7).forGetter($$0x -> $$0x.b),
               f.fieldOf("inner_layer").orElse(2.2).forGetter($$0x -> $$0x.c),
               f.fieldOf("middle_layer").orElse(3.2).forGetter($$0x -> $$0x.d),
               f.fieldOf("outer_layer").orElse(4.2).forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ecp::new)
   );
   public final double b;
   public final double c;
   public final double d;
   public final double e;

   public ecp(double $$0, double $$1, double $$2, double $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }
}
