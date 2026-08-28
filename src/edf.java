import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edf(efr b, dzg c, bpi d, int e) implements edi {
   public static final Codec<edf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efr.a.fieldOf("state_provider").forGetter(edf::a),
               dzg.b.fieldOf("target").forGetter(edf::b),
               bpi.b(0, 8).fieldOf("radius").forGetter(edf::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(edf::d)
            )
            .apply($$0, edf::new)
   );

   public efr a() {
      return this.b;
   }

   public dzg b() {
      return this.c;
   }

   public bpi c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
