import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record dbn(Map<String, dbn.a> c) {
   public static final dbn a = new dbn(Map.of());
   public static final Codec<dbn> b = Codec.unboundedMap(Codec.STRING, dbn.a.a).xmap(dbn::new, dbn::a);

   public dbn a(String $$0, dbn.a $$1) {
      return new dbn(af.a(this.c, $$0, $$1));
   }

   public Map<String, dbn.a> a() {
      return this.c;
   }

   public static record a(je<exk> b, double c, double d, float e) {
      public static final Codec<dbn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  exk.b.fieldOf("type").forGetter(dbn.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(dbn.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(dbn.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(dbn.a::d)
               )
               .apply($$0, dbn.a::new)
      );

      public je<exk> a() {
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
