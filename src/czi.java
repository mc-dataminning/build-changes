import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record czi(Map<String, czi.a> c) {
   public static final czi a = new czi(Map.of());
   public static final Codec<czi> b = Codec.unboundedMap(Codec.STRING, czi.a.a).xmap(czi::new, czi::a);

   public czi a(String $$0, czi.a $$1) {
      return new czi(af.a(this.c, $$0, $$1));
   }

   public Map<String, czi.a> a() {
      return this.c;
   }

   public static record a(jr<eum> b, double c, double d, float e) {
      public static final Codec<czi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  eum.b.fieldOf("type").forGetter(czi.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(czi.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(czi.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(czi.a::d)
               )
               .apply($$0, czi.a::new)
      );

      public jr<eum> a() {
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
