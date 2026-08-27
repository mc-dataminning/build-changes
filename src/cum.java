import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cum(Map<String, cum.a> c) {
   public static final cum a = new cum(Map.of());
   public static final Codec<cum> b = Codec.unboundedMap(Codec.STRING, cum.a.a).xmap(cum::new, cum::a);

   public cum a(String $$0, cum.a $$1) {
      return new cum(ac.a(this.c, $$0, $$1));
   }

   public Map<String, cum.a> a() {
      return this.c;
   }

   public static record a(emk.a b, double c, double d, float e) {
      public static final Codec<cum.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  emk.a.J.fieldOf("type").forGetter(cum.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(cum.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(cum.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(cum.a::d)
               )
               .apply($$0, cum.a::new)
      );

      public emk.a a() {
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
