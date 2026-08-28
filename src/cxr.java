import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cxr(Map<String, cxr.a> c) {
   public static final cxr a = new cxr(Map.of());
   public static final Codec<cxr> b = Codec.unboundedMap(Codec.STRING, cxr.a.a).xmap(cxr::new, cxr::a);

   public cxr a(String $$0, cxr.a $$1) {
      return new cxr(ad.a(this.c, $$0, $$1));
   }

   public Map<String, cxr.a> a() {
      return this.c;
   }

   public static record a(jm<eqm> b, double c, double d, float e) {
      public static final Codec<cxr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  eqm.b.fieldOf("type").forGetter(cxr.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(cxr.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(cxr.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(cxr.a::d)
               )
               .apply($$0, cxr.a::new)
      );

      public jm<eqm> a() {
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
