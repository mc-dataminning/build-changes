import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cxp(Map<String, cxp.a> c) {
   public static final cxp a = new cxp(Map.of());
   public static final Codec<cxp> b = Codec.unboundedMap(Codec.STRING, cxp.a.a).xmap(cxp::new, cxp::a);

   public cxp a(String $$0, cxp.a $$1) {
      return new cxp(ad.a(this.c, $$0, $$1));
   }

   public Map<String, cxp.a> a() {
      return this.c;
   }

   public static record a(ja<eqo> b, double c, double d, float e) {
      public static final Codec<cxp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  eqo.b.fieldOf("type").forGetter(cxp.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(cxp.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(cxp.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(cxp.a::d)
               )
               .apply($$0, cxp.a::new)
      );

      public ja<eqo> a() {
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
