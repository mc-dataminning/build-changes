import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record cwf(String e, jj<ctv> f, float g, Map<jj<crq>, String> h, wu i) {
   public static final Codec<cwf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axm.A.fieldOf("asset_name").forGetter(cwf::a),
               akh.a(lr.K).fieldOf("ingredient").forGetter(cwf::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cwf::c),
               Codec.unboundedMap(crq.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cwf::d),
               ww.a.fieldOf("description").forGetter(cwf::e)
            )
            .apply($$0, cwf::new)
   );
   public static final ys<wf, cwf> b = ys.a(
      yq.l, cwf::a, yq.b(lr.K), cwf::b, yq.i, cwf::c, yq.a(Object2ObjectOpenHashMap::new, yq.b(lr.ay), yq.l), cwf::d, ww.b, cwf::e, cwf::new
   );
   public static final Codec<jj<cwf>> c = akg.a(lr.aV, a);
   public static final ys<wf, jj<cwf>> d = yq.a(lr.aV, b);

   public static cwf a(String $$0, ctv $$1, float $$2, wu $$3, Map<jj<crq>, String> $$4) {
      return new cwf($$0, lq.g.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.e;
   }

   public jj<ctv> b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public Map<jj<crq>, String> d() {
      return this.h;
   }

   public wu e() {
      return this.i;
   }
}
