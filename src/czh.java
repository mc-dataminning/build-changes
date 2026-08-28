import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record czh(Map<String, czh.a> c) {
   public static final czh a = new czh(Map.of());
   public static final Codec<czh> b = Codec.unboundedMap(Codec.STRING, czh.a.a).xmap(czh::new, czh::a);

   public czh a(String $$0, czh.a $$1) {
      return new czh(ae.a(this.c, $$0, $$1));
   }

   public Map<String, czh.a> a() {
      return this.c;
   }

   public static record a(jq<etk> b, double c, double d, float e) {
      public static final Codec<czh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  etk.b.fieldOf("type").forGetter(czh.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(czh.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(czh.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(czh.a::d)
               )
               .apply($$0, czh.a::new)
      );

      public jq<etk> a() {
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
