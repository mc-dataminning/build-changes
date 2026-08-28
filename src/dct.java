import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record dct(Map<String, dct.a> c) {
   public static final dct a = new dct(Map.of());
   public static final Codec<dct> b = Codec.unboundedMap(Codec.STRING, dct.a.a).xmap(dct::new, dct::a);

   public dct a(String $$0, dct.a $$1) {
      return new dct(ag.a(this.c, $$0, $$1));
   }

   public Map<String, dct.a> a() {
      return this.c;
   }

   public static record a(jf<eze> b, double c, double d, float e) {
      public static final Codec<dct.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  eze.b.fieldOf("type").forGetter(dct.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(dct.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(dct.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(dct.a::d)
               )
               .apply($$0, dct.a::new)
      );

      public jf<eze> a() {
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
