import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cwn(Map<String, cwn.a> c) {
   public static final cwn a = new cwn(Map.of());
   public static final Codec<cwn> b = Codec.unboundedMap(Codec.STRING, cwn.a.a).xmap(cwn::new, cwn::a);

   public cwn a(String $$0, cwn.a $$1) {
      return new cwn(ac.a(this.c, $$0, $$1));
   }

   public Map<String, cwn.a> a() {
      return this.c;
   }

   public static record a(ix<eoe> b, double c, double d, float e) {
      public static final Codec<cwn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  eoe.b.fieldOf("type").forGetter(cwn.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(cwn.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(cwn.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(cwn.a::d)
               )
               .apply($$0, cwn.a::new)
      );

      public ix<eoe> a() {
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
