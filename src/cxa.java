import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cxa(Map<String, cxa.a> c) {
   public static final cxa a = new cxa(Map.of());
   public static final Codec<cxa> b = Codec.unboundedMap(Codec.STRING, cxa.a.a).xmap(cxa::new, cxa::a);

   public cxa a(String $$0, cxa.a $$1) {
      return new cxa(ac.a(this.c, $$0, $$1));
   }

   public Map<String, cxa.a> a() {
      return this.c;
   }

   public static record a(jj<epr> b, double c, double d, float e) {
      public static final Codec<cxa.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  epr.b.fieldOf("type").forGetter(cxa.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(cxa.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(cxa.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(cxa.a::d)
               )
               .apply($$0, cxa.a::new)
      );

      public jj<epr> a() {
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
