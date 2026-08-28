import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record czj(Map<String, czj.a> c) {
   public static final czj a = new czj(Map.of());
   public static final Codec<czj> b = Codec.unboundedMap(Codec.STRING, czj.a.a).xmap(czj::new, czj::a);

   public czj a(String $$0, czj.a $$1) {
      return new czj(af.a(this.c, $$0, $$1));
   }

   public Map<String, czj.a> a() {
      return this.c;
   }

   public static record a(jr<eun> b, double c, double d, float e) {
      public static final Codec<czj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  eun.b.fieldOf("type").forGetter(czj.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(czj.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(czj.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(czj.a::d)
               )
               .apply($$0, czj.a::new)
      );

      public jr<eun> a() {
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
