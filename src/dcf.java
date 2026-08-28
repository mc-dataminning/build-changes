import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record dcf(Map<String, dcf.a> c) {
   public static final dcf a = new dcf(Map.of());
   public static final Codec<dcf> b = Codec.unboundedMap(Codec.STRING, dcf.a.a).xmap(dcf::new, dcf::a);

   public dcf a(String $$0, dcf.a $$1) {
      return new dcf(ag.a(this.c, $$0, $$1));
   }

   public Map<String, dcf.a> a() {
      return this.c;
   }

   public static record a(jf<eyl> b, double c, double d, float e) {
      public static final Codec<dcf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  eyl.b.fieldOf("type").forGetter(dcf.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(dcf.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(dcf.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(dcf.a::d)
               )
               .apply($$0, dcf.a::new)
      );

      public jf<eyl> a() {
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
