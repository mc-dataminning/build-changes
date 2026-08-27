import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cwp(Map<String, cwp.a> c) {
   public static final cwp a = new cwp(Map.of());
   public static final Codec<cwp> b = Codec.unboundedMap(Codec.STRING, cwp.a.a).xmap(cwp::new, cwp::a);

   public cwp a(String $$0, cwp.a $$1) {
      return new cwp(ac.a(this.c, $$0, $$1));
   }

   public Map<String, cwp.a> a() {
      return this.c;
   }

   public static record a(ix<eog> b, double c, double d, float e) {
      public static final Codec<cwp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  eog.b.fieldOf("type").forGetter(cwp.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(cwp.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(cwp.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(cwp.a::d)
               )
               .apply($$0, cwp.a::new)
      );

      public ix<eog> a() {
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
