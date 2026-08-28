import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cxo(Map<String, cxo.a> c) {
   public static final cxo a = new cxo(Map.of());
   public static final Codec<cxo> b = Codec.unboundedMap(Codec.STRING, cxo.a.a).xmap(cxo::new, cxo::a);

   public cxo a(String $$0, cxo.a $$1) {
      return new cxo(ac.a(this.c, $$0, $$1));
   }

   public Map<String, cxo.a> a() {
      return this.c;
   }

   public static record a(ji<epf> b, double c, double d, float e) {
      public static final Codec<cxo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  epf.b.fieldOf("type").forGetter(cxo.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(cxo.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(cxo.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(cxo.a::d)
               )
               .apply($$0, cxo.a::new)
      );

      public ji<epf> a() {
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
