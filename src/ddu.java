import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record ddu(String e, jq<cwb> f, float g, Map<all, String> h, xl i) {
   public static final Codec<ddu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayw.C.fieldOf("asset_name").forGetter(ddu::a),
               ali.a(ma.K).fieldOf("ingredient").forGetter(ddu::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(ddu::c),
               Codec.unboundedMap(all.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(ddu::d),
               xn.a.fieldOf("description").forGetter(ddu::e)
            )
            .apply($$0, ddu::new)
   );
   public static final zj<ww, ddu> b = zj.a(
      zh.m, ddu::a, zh.b(ma.K), ddu::b, zh.j, ddu::c, zh.a(Object2ObjectOpenHashMap::new, all.b, zh.m), ddu::d, xn.b, ddu::e, ddu::new
   );
   public static final Codec<jq<ddu>> c = alh.a(ma.aX, a);
   public static final zj<ww, jq<ddu>> d = zh.a(ma.aX, b);

   public static ddu a(String $$0, cwb $$1, float $$2, xl $$3, Map<all, String> $$4) {
      return new ddu($$0, lz.g.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.e;
   }

   public jq<cwb> b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public Map<all, String> d() {
      return this.h;
   }

   public xl e() {
      return this.i;
   }
}
