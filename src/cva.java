import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cva(Map<String, cva.a> c) {
   public static final cva a = new cva(Map.of());
   public static final Codec<cva> b = Codec.unboundedMap(Codec.STRING, cva.a.a).xmap(cva::new, cva::a);

   public cva a(String $$0, cva.a $$1) {
      return new cva(ac.a(this.c, $$0, $$1));
   }

   public Map<String, cva.a> a() {
      return this.c;
   }

   public static record a(ena.a b, double c, double d, float e) {
      public static final Codec<cva.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ena.a.J.fieldOf("type").forGetter(cva.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(cva.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(cva.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(cva.a::d)
               )
               .apply($$0, cva.a::new)
      );

      public ena.a a() {
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
