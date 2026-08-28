import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record dbt(Map<String, dbt.a> c) {
   public static final dbt a = new dbt(Map.of());
   public static final Codec<dbt> b = Codec.unboundedMap(Codec.STRING, dbt.a.a).xmap(dbt::new, dbt::a);

   public dbt a(String $$0, dbt.a $$1) {
      return new dbt(af.a(this.c, $$0, $$1));
   }

   public Map<String, dbt.a> a() {
      return this.c;
   }

   public static record a(je<exw> b, double c, double d, float e) {
      public static final Codec<dbt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  exw.b.fieldOf("type").forGetter(dbt.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(dbt.a::b),
                  Codec.DOUBLE.fieldOf("z").forGetter(dbt.a::c),
                  Codec.FLOAT.fieldOf("rotation").forGetter(dbt.a::d)
               )
               .apply($$0, dbt.a::new)
      );

      public je<exw> a() {
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
