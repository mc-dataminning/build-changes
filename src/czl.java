import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record czl(Map<String, czl.a> c) {
   public static final czl a = new czl(Map.of());
   public static final Codec<czl> b = Codec.unboundedMap(Codec.STRING, czl.a.a).xmap(czl::new, czl::a);

   public czl a(String $$0, czl.a $$1) {
      return new czl(af.a(this.c, $$0, $$1));
   }

   public Map<String, czl.a> a() {
      return this.c;
   }

   public static record a(jr<eup> b, double c, double d, float e) {
      public static final Codec<czl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  eup.b.fieldOf("type").forGetter(czl.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(czl.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(czl.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(czl.a::d)
               )
               .apply($$0, czl.a::new)
      );

      public jr<eup> a() {
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
