import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record clo(String c, he<cjg> d, float e, Map<cgx, String> f, tl g) {
   public static final Codec<clo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arj.x.fieldOf("asset_name").forGetter(clo::a),
               aew.a(jc.E).fieldOf("ingredient").forGetter(clo::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(clo::c),
               Codec.unboundedMap(cgx.h, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(clo::d),
               tn.a.fieldOf("description").forGetter(clo::e)
            )
            .apply($$0, clo::new)
   );
   public static final Codec<he<clo>> b = aev.a(jc.aE, a);

   public static clo a(String $$0, cjg $$1, float $$2, tl $$3, Map<cgx, String> $$4) {
      return new clo($$0, jb.i.d($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.c;
   }

   public he<cjg> b() {
      return this.d;
   }

   public float c() {
      return this.e;
   }

   public Map<cgx, String> d() {
      return this.f;
   }

   public tl e() {
      return this.g;
   }
}
