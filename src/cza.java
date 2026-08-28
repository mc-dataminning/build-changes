import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cza(Map<String, cza.a> c) {
   public static final cza a = new cza(Map.of());
   public static final Codec<cza> b = Codec.unboundedMap(Codec.STRING, cza.a.a).xmap(cza::new, cza::a);

   public cza a(String $$0, cza.a $$1) {
      return new cza(ae.a(this.c, $$0, $$1));
   }

   public Map<String, cza.a> a() {
      return this.c;
   }

   public static record a(jq<etd> b, double c, double d, float e) {
      public static final Codec<cza.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  etd.b.fieldOf("type").forGetter(cza.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(cza.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(cza.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(cza.a::d)
               )
               .apply($$0, cza.a::new)
      );

      public jq<etd> a() {
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
