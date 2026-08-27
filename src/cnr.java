import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cnr(String c, ig<clj> d, float e, Map<cja, String> f, uv g) {
   public static final Codec<cnr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asy.x.fieldOf("asset_name").forGetter(cnr::a),
               agj.a(kd.E).fieldOf("ingredient").forGetter(cnr::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cnr::c),
               Codec.unboundedMap(cja.h, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cnr::d),
               ux.a.fieldOf("description").forGetter(cnr::e)
            )
            .apply($$0, cnr::new)
   );
   public static final Codec<ig<cnr>> b = agi.a(kd.aF, a);

   public static cnr a(String $$0, clj $$1, float $$2, uv $$3, Map<cja, String> $$4) {
      return new cnr($$0, kc.i.d($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.c;
   }

   public ig<clj> b() {
      return this.d;
   }

   public float c() {
      return this.e;
   }

   public Map<cja, String> d() {
      return this.f;
   }

   public uv e() {
      return this.g;
   }
}
