import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record cxr(String e, jn<cvg> f, float g, Map<jn<ctd>, String> h, xd i) {
   public static final Codec<cxr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayl.A.fieldOf("asset_name").forGetter(cxr::a),
               aky.a(lv.K).fieldOf("ingredient").forGetter(cxr::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cxr::c),
               Codec.unboundedMap(ctd.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cxr::d),
               xf.a.fieldOf("description").forGetter(cxr::e)
            )
            .apply($$0, cxr::new)
   );
   public static final zb<wo, cxr> b = zb.a(
      yz.l, cxr::a, yz.b(lv.K), cxr::b, yz.i, cxr::c, yz.a(Object2ObjectOpenHashMap::new, yz.b(lv.az), yz.l), cxr::d, xf.b, cxr::e, cxr::new
   );
   public static final Codec<jn<cxr>> c = akx.a(lv.aW, a);
   public static final zb<wo, jn<cxr>> d = yz.a(lv.aW, b);

   public static cxr a(String $$0, cvg $$1, float $$2, xd $$3, Map<jn<ctd>, String> $$4) {
      return new cxr($$0, lu.g.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.e;
   }

   public jn<cvg> b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public Map<jn<ctd>, String> d() {
      return this.h;
   }

   public xd e() {
      return this.i;
   }
}
