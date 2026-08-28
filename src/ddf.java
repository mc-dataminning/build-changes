import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record ddf(Map<String, ddf.a> c) {
   public static final ddf a = new ddf(Map.of());
   public static final Codec<ddf> b = Codec.unboundedMap(Codec.STRING, ddf.a.a).xmap(ddf::new, ddf::a);

   public ddf a(String $$0, ddf.a $$1) {
      return new ddf(ag.a(this.c, $$0, $$1));
   }

   public Map<String, ddf.a> a() {
      return this.c;
   }

   public static record a(jg<ezq> b, double c, double d, float e) {
      public static final Codec<ddf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ezq.b.fieldOf("type").forGetter(ddf.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(ddf.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(ddf.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(ddf.a::d)
               )
               .apply($$0, ddf.a::new)
      );

      public jg<ezq> a() {
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
