import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cxb(Map<String, cxb.a> c) {
   public static final cxb a = new cxb(Map.of());
   public static final Codec<cxb> b = Codec.unboundedMap(Codec.STRING, cxb.a.a).xmap(cxb::new, cxb::a);

   public cxb a(String $$0, cxb.a $$1) {
      return new cxb(ac.a(this.c, $$0, $$1));
   }

   public Map<String, cxb.a> a() {
      return this.c;
   }

   public static record a(jj<ept> b, double c, double d, float e) {
      public static final Codec<cxb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ept.b.fieldOf("type").forGetter(cxb.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(cxb.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(cxb.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(cxb.a::d)
               )
               .apply($$0, cxb.a::new)
      );

      public jj<ept> a() {
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
