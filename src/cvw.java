import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cvw(Map<String, cvw.a> c) {
   public static final cvw a = new cvw(Map.of());
   public static final Codec<cvw> b = Codec.unboundedMap(Codec.STRING, cvw.a.a).xmap(cvw::new, cvw::a);

   public cvw a(String $$0, cvw.a $$1) {
      return new cvw(ac.a(this.c, $$0, $$1));
   }

   public Map<String, cvw.a> a() {
      return this.c;
   }

   public static record a(iw<enk> b, double c, double d, float e) {
      public static final Codec<cvw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  enk.b.fieldOf("type").forGetter(cvw.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(cvw.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(cvw.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(cvw.a::d)
               )
               .apply($$0, cvw.a::new)
      );

      public iw<enk> a() {
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
