import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dxt(eaf b, dtv c, bmi d, int e) implements dxw {
   public static final Codec<dxt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eaf.a.fieldOf("state_provider").forGetter(dxt::a),
               dtv.b.fieldOf("target").forGetter(dxt::b),
               bmi.b(0, 8).fieldOf("radius").forGetter(dxt::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(dxt::d)
            )
            .apply($$0, dxt::new)
   );

   public eaf a() {
      return this.b;
   }

   public dtv b() {
      return this.c;
   }

   public bmi c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
