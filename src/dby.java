import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record dby(Map<String, dby.a> c) {
   public static final dby a = new dby(Map.of());
   public static final Codec<dby> b = Codec.unboundedMap(Codec.STRING, dby.a.a).xmap(dby::new, dby::a);

   public dby a(String $$0, dby.a $$1) {
      return new dby(af.a(this.c, $$0, $$1));
   }

   public Map<String, dby.a> a() {
      return this.c;
   }

   public static record a(je<eye> b, double c, double d, float e) {
      public static final Codec<dby.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  eye.b.fieldOf("type").forGetter(dby.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(dby.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(dby.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(dby.a::d)
               )
               .apply($$0, dby.a::new)
      );

      public je<eye> a() {
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
