import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cud(Map<String, cud.a> c) {
   public static final cud a = new cud(Map.of());
   public static final Codec<cud> b = Codec.unboundedMap(Codec.STRING, cud.a.a).xmap(cud::new, cud::a);

   public cud a(String $$0, cud.a $$1) {
      return new cud(ac.a(this.c, $$0, $$1));
   }

   public Map<String, cud.a> a() {
      return this.c;
   }

   public static record a(emb.a b, double c, double d, float e) {
      public static final Codec<cud.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  emb.a.J.fieldOf("type").forGetter(cud.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(cud.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(cud.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(cud.a::d)
               )
               .apply($$0, cud.a::new)
      );

      public emb.a a() {
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
