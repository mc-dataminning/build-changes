import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cxq(Map<String, cxq.a> c) {
   public static final cxq a = new cxq(Map.of());
   public static final Codec<cxq> b = Codec.unboundedMap(Codec.STRING, cxq.a.a).xmap(cxq::new, cxq::a);

   public cxq a(String $$0, cxq.a $$1) {
      return new cxq(ac.a(this.c, $$0, $$1));
   }

   public Map<String, cxq.a> a() {
      return this.c;
   }

   public static record a(ji<eph> b, double c, double d, float e) {
      public static final Codec<cxq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  eph.b.fieldOf("type").forGetter(cxq.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(cxq.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(cxq.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(cxq.a::d)
               )
               .apply($$0, cxq.a::new)
      );

      public ji<eph> a() {
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
