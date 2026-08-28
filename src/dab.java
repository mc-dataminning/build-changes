import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record dab(Map<String, dab.a> c) {
   public static final dab a = new dab(Map.of());
   public static final Codec<dab> b = Codec.unboundedMap(Codec.STRING, dab.a.a).xmap(dab::new, dab::a);

   public dab a(String $$0, dab.a $$1) {
      return new dab(ae.a(this.c, $$0, $$1));
   }

   public Map<String, dab.a> a() {
      return this.c;
   }

   public static record a(jq<evf> b, double c, double d, float e) {
      public static final Codec<dab.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  evf.b.fieldOf("type").forGetter(dab.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(dab.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(dab.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(dab.a::d)
               )
               .apply($$0, dab.a::new)
      );

      public jq<evf> a() {
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
