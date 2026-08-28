import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record daf(Map<String, daf.a> c) {
   public static final daf a = new daf(Map.of());
   public static final Codec<daf> b = Codec.unboundedMap(Codec.STRING, daf.a.a).xmap(daf::new, daf::a);

   public daf a(String $$0, daf.a $$1) {
      return new daf(ae.a(this.c, $$0, $$1));
   }

   public Map<String, daf.a> a() {
      return this.c;
   }

   public static record a(jq<eve> b, double c, double d, float e) {
      public static final Codec<daf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  eve.b.fieldOf("type").forGetter(daf.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(daf.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(daf.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(daf.a::d)
               )
               .apply($$0, daf.a::new)
      );

      public jq<eve> a() {
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
