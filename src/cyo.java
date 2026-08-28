import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cyo(Map<String, cyo.a> c) {
   public static final cyo a = new cyo(Map.of());
   public static final Codec<cyo> b = Codec.unboundedMap(Codec.STRING, cyo.a.a).xmap(cyo::new, cyo::a);

   public cyo a(String $$0, cyo.a $$1) {
      return new cyo(ad.a(this.c, $$0, $$1));
   }

   public Map<String, cyo.a> a() {
      return this.c;
   }

   public static record a(jn<ese> b, double c, double d, float e) {
      public static final Codec<cyo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ese.b.fieldOf("type").forGetter(cyo.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(cyo.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(cyo.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(cyo.a::d)
               )
               .apply($$0, cyo.a::new)
      );

      public jn<ese> a() {
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
