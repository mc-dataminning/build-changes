import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record dcv(Map<String, dcv.a> c) {
   public static final dcv a = new dcv(Map.of());
   public static final Codec<dcv> b = Codec.unboundedMap(Codec.STRING, dcv.a.a).xmap(dcv::new, dcv::a);

   public dcv a(String $$0, dcv.a $$1) {
      return new dcv(ag.a(this.c, $$0, $$1));
   }

   public Map<String, dcv.a> a() {
      return this.c;
   }

   public static record a(jg<ezg> b, double c, double d, float e) {
      public static final Codec<dcv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ezg.b.fieldOf("type").forGetter(dcv.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(dcv.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(dcv.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(dcv.a::d)
               )
               .apply($$0, dcv.a::new)
      );

      public jg<ezg> a() {
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
