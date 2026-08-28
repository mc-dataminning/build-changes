import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cxj(Map<String, cxj.a> c) {
   public static final cxj a = new cxj(Map.of());
   public static final Codec<cxj> b = Codec.unboundedMap(Codec.STRING, cxj.a.a).xmap(cxj::new, cxj::a);

   public cxj a(String $$0, cxj.a $$1) {
      return new cxj(ac.a(this.c, $$0, $$1));
   }

   public Map<String, cxj.a> a() {
      return this.c;
   }

   public static record a(ji<epa> b, double c, double d, float e) {
      public static final Codec<cxj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  epa.b.fieldOf("type").forGetter(cxj.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(cxj.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(cxj.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(cxj.a::d)
               )
               .apply($$0, cxj.a::new)
      );

      public ji<epa> a() {
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
