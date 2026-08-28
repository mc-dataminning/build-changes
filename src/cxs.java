import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record cxs(String e, jn<cvk> f, float g, Map<jn<ctj>, String> h, xd i) {
   public static final Codec<cxs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aym.B.fieldOf("asset_name").forGetter(cxs::a),
               akz.a(lv.K).fieldOf("ingredient").forGetter(cxs::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cxs::c),
               Codec.unboundedMap(ctj.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cxs::d),
               xf.a.fieldOf("description").forGetter(cxs::e)
            )
            .apply($$0, cxs::new)
   );
   public static final zb<wo, cxs> b = zb.a(
      yz.l, cxs::a, yz.b(lv.K), cxs::b, yz.i, cxs::c, yz.a(Object2ObjectOpenHashMap::new, yz.b(lv.az), yz.l), cxs::d, xf.b, cxs::e, cxs::new
   );
   public static final Codec<jn<cxs>> c = aky.a(lv.aX, a);
   public static final zb<wo, jn<cxs>> d = yz.a(lv.aX, b);

   public static cxs a(String $$0, cvk $$1, float $$2, xd $$3, Map<jn<ctj>, String> $$4) {
      return new cxs($$0, lu.g.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.e;
   }

   public jn<cvk> b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public Map<jn<ctj>, String> d() {
      return this.h;
   }

   public xd e() {
      return this.i;
   }
}
