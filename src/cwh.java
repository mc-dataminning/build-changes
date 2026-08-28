import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record cwh(String e, jj<ctx> f, float g, Map<jj<crt>, String> h, wu i) {
   public static final Codec<cwh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axo.A.fieldOf("asset_name").forGetter(cwh::a),
               akh.a(lr.K).fieldOf("ingredient").forGetter(cwh::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cwh::c),
               Codec.unboundedMap(crt.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cwh::d),
               ww.a.fieldOf("description").forGetter(cwh::e)
            )
            .apply($$0, cwh::new)
   );
   public static final ys<wf, cwh> b = ys.a(
      yq.l, cwh::a, yq.b(lr.K), cwh::b, yq.i, cwh::c, yq.a(Object2ObjectOpenHashMap::new, yq.b(lr.ay), yq.l), cwh::d, ww.b, cwh::e, cwh::new
   );
   public static final Codec<jj<cwh>> c = akg.a(lr.aV, a);
   public static final ys<wf, jj<cwh>> d = yq.a(lr.aV, b);

   public static cwh a(String $$0, ctx $$1, float $$2, wu $$3, Map<jj<crt>, String> $$4) {
      return new cwh($$0, lq.g.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.e;
   }

   public jj<ctx> b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public Map<jj<crt>, String> d() {
      return this.h;
   }

   public wu e() {
      return this.i;
   }
}
