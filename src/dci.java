import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record dci(Map<String, dci.a> c) {
   public static final dci a = new dci(Map.of());
   public static final Codec<dci> b = Codec.unboundedMap(Codec.STRING, dci.a.a).xmap(dci::new, dci::a);

   public dci a(String $$0, dci.a $$1) {
      return new dci(ag.a(this.c, $$0, $$1));
   }

   public Map<String, dci.a> a() {
      return this.c;
   }

   public static record a(jf<eyq> b, double c, double d, float e) {
      public static final Codec<dci.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  eyq.b.fieldOf("type").forGetter(dci.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(dci.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(dci.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(dci.a::d)
               )
               .apply($$0, dci.a::new)
      );

      public jf<eyq> a() {
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
