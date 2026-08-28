import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record dak(Map<String, dak.a> c) {
   public static final dak a = new dak(Map.of());
   public static final Codec<dak> b = Codec.unboundedMap(Codec.STRING, dak.a.a).xmap(dak::new, dak::a);

   public dak a(String $$0, dak.a $$1) {
      return new dak(ae.a(this.c, $$0, $$1));
   }

   public Map<String, dak.a> a() {
      return this.c;
   }

   public static record a(jq<evm> b, double c, double d, float e) {
      public static final Codec<dak.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  evm.b.fieldOf("type").forGetter(dak.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(dak.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(dak.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(dak.a::d)
               )
               .apply($$0, dak.a::new)
      );

      public jq<evm> a() {
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
