import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record clk(String c, hg<cjc> d, float e, Map<cgt, String> f, tn g) {
   public static final Codec<clk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arh.x.fieldOf("asset_name").forGetter(clk::a),
               aev.a(je.D).fieldOf("ingredient").forGetter(clk::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(clk::c),
               Codec.unboundedMap(cgt.h, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(clk::d),
               arh.b.fieldOf("description").forGetter(clk::e)
            )
            .apply($$0, clk::new)
   );
   public static final Codec<hg<clk>> b = aeu.a(je.aD, a);

   public static clk a(String $$0, cjc $$1, float $$2, tn $$3, Map<cgt, String> $$4) {
      return new clk($$0, jd.i.d($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.c;
   }

   public hg<cjc> b() {
      return this.d;
   }

   public float c() {
      return this.e;
   }

   public Map<cgt, String> d() {
      return this.f;
   }

   public tn e() {
      return this.g;
   }
}
