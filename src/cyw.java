import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cyw(Map<String, cyw.a> c) {
   public static final cyw a = new cyw(Map.of());
   public static final Codec<cyw> b = Codec.unboundedMap(Codec.STRING, cyw.a.a).xmap(cyw::new, cyw::a);

   public cyw a(String $$0, cyw.a $$1) {
      return new cyw(ae.a(this.c, $$0, $$1));
   }

   public Map<String, cyw.a> a() {
      return this.c;
   }

   public static record a(jq<esz> b, double c, double d, float e) {
      public static final Codec<cyw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  esz.b.fieldOf("type").forGetter(cyw.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(cyw.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(cyw.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(cyw.a::d)
               )
               .apply($$0, cyw.a::new)
      );

      public jq<esz> a() {
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
