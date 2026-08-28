import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record cwi(String e, jj<cty> f, float g, Map<jj<cru>, String> h, wu i) {
   public static final Codec<cwi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axo.A.fieldOf("asset_name").forGetter(cwi::a),
               akh.a(lr.K).fieldOf("ingredient").forGetter(cwi::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cwi::c),
               Codec.unboundedMap(cru.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cwi::d),
               ww.a.fieldOf("description").forGetter(cwi::e)
            )
            .apply($$0, cwi::new)
   );
   public static final ys<wf, cwi> b = ys.a(
      yq.l, cwi::a, yq.b(lr.K), cwi::b, yq.i, cwi::c, yq.a(Object2ObjectOpenHashMap::new, yq.b(lr.ay), yq.l), cwi::d, ww.b, cwi::e, cwi::new
   );
   public static final Codec<jj<cwi>> c = akg.a(lr.aV, a);
   public static final ys<wf, jj<cwi>> d = yq.a(lr.aV, b);

   public static cwi a(String $$0, cty $$1, float $$2, wu $$3, Map<jj<cru>, String> $$4) {
      return new cwi($$0, lq.g.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.e;
   }

   public jj<cty> b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public Map<jj<cru>, String> d() {
      return this.h;
   }

   public wu e() {
      return this.i;
   }
}
