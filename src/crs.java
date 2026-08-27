import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record crs(String c, il<cpl> d, float e, Map<il<cnd>, String> f, vs g) {
   public static final Codec<crs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avu.x.fieldOf("asset_name").forGetter(crs::a),
               aiz.a(ki.F).fieldOf("ingredient").forGetter(crs::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(crs::c),
               Codec.unboundedMap(cnd.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(crs::d),
               vu.a.fieldOf("description").forGetter(crs::e)
            )
            .apply($$0, crs::new)
   );
   public static final Codec<il<crs>> b = aiy.a(ki.aJ, a);

   public static crs a(String $$0, cpl $$1, float $$2, vs $$3, Map<il<cnd>, String> $$4) {
      return new crs($$0, kh.h.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.c;
   }

   public il<cpl> b() {
      return this.d;
   }

   public float c() {
      return this.e;
   }

   public Map<il<cnd>, String> d() {
      return this.f;
   }

   public vs e() {
      return this.g;
   }
}
