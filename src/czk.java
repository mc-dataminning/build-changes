import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record czk(Map<String, czk.a> c) {
   public static final czk a = new czk(Map.of());
   public static final Codec<czk> b = Codec.unboundedMap(Codec.STRING, czk.a.a).xmap(czk::new, czk::a);

   public czk a(String $$0, czk.a $$1) {
      return new czk(af.a(this.c, $$0, $$1));
   }

   public Map<String, czk.a> a() {
      return this.c;
   }

   public static record a(jr<euo> b, double c, double d, float e) {
      public static final Codec<czk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  euo.b.fieldOf("type").forGetter(czk.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(czk.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(czk.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(czk.a::d)
               )
               .apply($$0, czk.a::new)
      );

      public jr<euo> a() {
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
