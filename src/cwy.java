import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cwy(Map<String, cwy.a> c) {
   public static final cwy a = new cwy(Map.of());
   public static final Codec<cwy> b = Codec.unboundedMap(Codec.STRING, cwy.a.a).xmap(cwy::new, cwy::a);

   public cwy a(String $$0, cwy.a $$1) {
      return new cwy(ac.a(this.c, $$0, $$1));
   }

   public Map<String, cwy.a> a() {
      return this.c;
   }

   public static record a(jj<epl> b, double c, double d, float e) {
      public static final Codec<cwy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  epl.b.fieldOf("type").forGetter(cwy.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(cwy.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(cwy.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(cwy.a::d)
               )
               .apply($$0, cwy.a::new)
      );

      public jj<epl> a() {
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
