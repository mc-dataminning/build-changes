import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cyr(Map<String, cyr.a> c) {
   public static final cyr a = new cyr(Map.of());
   public static final Codec<cyr> b = Codec.unboundedMap(Codec.STRING, cyr.a.a).xmap(cyr::new, cyr::a);

   public cyr a(String $$0, cyr.a $$1) {
      return new cyr(ad.a(this.c, $$0, $$1));
   }

   public Map<String, cyr.a> a() {
      return this.c;
   }

   public static record a(jo<esi> b, double c, double d, float e) {
      public static final Codec<cyr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  esi.b.fieldOf("type").forGetter(cyr.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(cyr.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(cyr.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(cyr.a::d)
               )
               .apply($$0, cyr.a::new)
      );

      public jo<esi> a() {
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
