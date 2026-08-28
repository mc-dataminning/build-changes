import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record daj(Map<String, daj.a> c) {
   public static final daj a = new daj(Map.of());
   public static final Codec<daj> b = Codec.unboundedMap(Codec.STRING, daj.a.a).xmap(daj::new, daj::a);

   public daj a(String $$0, daj.a $$1) {
      return new daj(ae.a(this.c, $$0, $$1));
   }

   public Map<String, daj.a> a() {
      return this.c;
   }

   public static record a(jq<evl> b, double c, double d, float e) {
      public static final Codec<daj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  evl.b.fieldOf("type").forGetter(daj.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(daj.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(daj.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(daj.a::d)
               )
               .apply($$0, daj.a::new)
      );

      public jq<evl> a() {
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
