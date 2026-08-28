import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cxm(Map<String, cxm.a> c) {
   public static final cxm a = new cxm(Map.of());
   public static final Codec<cxm> b = Codec.unboundedMap(Codec.STRING, cxm.a.a).xmap(cxm::new, cxm::a);

   public cxm a(String $$0, cxm.a $$1) {
      return new cxm(ac.a(this.c, $$0, $$1));
   }

   public Map<String, cxm.a> a() {
      return this.c;
   }

   public static record a(ji<epd> b, double c, double d, float e) {
      public static final Codec<cxm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  epd.b.fieldOf("type").forGetter(cxm.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(cxm.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(cxm.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(cxm.a::d)
               )
               .apply($$0, cxm.a::new)
      );

      public ji<epd> a() {
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
