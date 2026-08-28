import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record daa(Map<String, daa.a> c) {
   public static final daa a = new daa(Map.of());
   public static final Codec<daa> b = Codec.unboundedMap(Codec.STRING, daa.a.a).xmap(daa::new, daa::a);

   public daa a(String $$0, daa.a $$1) {
      return new daa(af.a(this.c, $$0, $$1));
   }

   public Map<String, daa.a> a() {
      return this.c;
   }

   public static record a(jr<evl> b, double c, double d, float e) {
      public static final Codec<daa.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  evl.b.fieldOf("type").forGetter(daa.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(daa.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(daa.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(daa.a::d)
               )
               .apply($$0, daa.a::new)
      );

      public jr<evl> a() {
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
