import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cxn(Map<String, cxn.a> c) {
   public static final cxn a = new cxn(Map.of());
   public static final Codec<cxn> b = Codec.unboundedMap(Codec.STRING, cxn.a.a).xmap(cxn::new, cxn::a);

   public cxn a(String $$0, cxn.a $$1) {
      return new cxn(ac.a(this.c, $$0, $$1));
   }

   public Map<String, cxn.a> a() {
      return this.c;
   }

   public static record a(ji<epe> b, double c, double d, float e) {
      public static final Codec<cxn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  epe.b.fieldOf("type").forGetter(cxn.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(cxn.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(cxn.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(cxn.a::d)
               )
               .apply($$0, cxn.a::new)
      );

      public ji<epe> a() {
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
