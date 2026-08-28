import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cyq(Map<String, cyq.a> c) {
   public static final cyq a = new cyq(Map.of());
   public static final Codec<cyq> b = Codec.unboundedMap(Codec.STRING, cyq.a.a).xmap(cyq::new, cyq::a);

   public cyq a(String $$0, cyq.a $$1) {
      return new cyq(ad.a(this.c, $$0, $$1));
   }

   public Map<String, cyq.a> a() {
      return this.c;
   }

   public static record a(jp<est> b, double c, double d, float e) {
      public static final Codec<cyq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  est.b.fieldOf("type").forGetter(cyq.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(cyq.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(cyq.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(cyq.a::d)
               )
               .apply($$0, cyq.a::new)
      );

      public jp<est> a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }

      public double c() {
         return this.d;
      }

      public float d() {
         return this.e;
      }
   }
}
