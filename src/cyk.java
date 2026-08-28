import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cyk(Map<String, cyk.a> c) {
   public static final cyk a = new cyk(Map.of());
   public static final Codec<cyk> b = Codec.unboundedMap(Codec.STRING, cyk.a.a).xmap(cyk::new, cyk::a);

   public cyk a(String $$0, cyk.a $$1) {
      return new cyk(ad.a(this.c, $$0, $$1));
   }

   public Map<String, cyk.a> a() {
      return this.c;
   }

   public static record a(jn<erq> b, double c, double d, float e) {
      public static final Codec<cyk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  erq.b.fieldOf("type").forGetter(cyk.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(cyk.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(cyk.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(cyk.a::d)
               )
               .apply($$0, cyk.a::new)
      );

      public jn<erq> a() {
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
