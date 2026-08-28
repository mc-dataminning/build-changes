import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record cwp(String e, ji<cuf> f, float g, Map<ji<csa>, String> h, xl i) {
   public static final Codec<cwp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayc.A.fieldOf("asset_name").forGetter(cwp::a),
               aky.a(lq.G).fieldOf("ingredient").forGetter(cwp::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cwp::c),
               Codec.unboundedMap(csa.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cwp::d),
               xn.a.fieldOf("description").forGetter(cwp::e)
            )
            .apply($$0, cwp::new)
   );
   public static final zj<ww, cwp> b = zj.a(
      zh.l, cwp::a, zh.b(lq.G), cwp::b, zh.i, cwp::c, zh.a(Object2ObjectOpenHashMap::new, zh.b(lq.au), zh.l), cwp::d, xn.b, cwp::e, cwp::new
   );
   public static final Codec<ji<cwp>> c = akx.a(lq.aO, a);
   public static final zj<ww, ji<cwp>> d = zh.a(lq.aO, b);

   public static cwp a(String $$0, cuf $$1, float $$2, xl $$3, Map<ji<csa>, String> $$4) {
      return new cwp($$0, lp.h.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.e;
   }

   public ji<cuf> b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public Map<ji<csa>, String> d() {
      return this.h;
   }

   public xl e() {
      return this.i;
   }
}
