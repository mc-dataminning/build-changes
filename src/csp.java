import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record csp(String c, il<cqh> d, float e, Map<il<cnz>, String> f, vu g) {
   public static final Codec<csp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awe.y.fieldOf("asset_name").forGetter(csp::a),
               aje.a(kj.F).fieldOf("ingredient").forGetter(csp::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(csp::c),
               Codec.unboundedMap(cnz.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(csp::d),
               vw.a.fieldOf("description").forGetter(csp::e)
            )
            .apply($$0, csp::new)
   );
   public static final Codec<il<csp>> b = ajd.a(kj.aJ, a);

   public static csp a(String $$0, cqh $$1, float $$2, vu $$3, Map<il<cnz>, String> $$4) {
      return new csp($$0, ki.h.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.c;
   }

   public il<cqh> b() {
      return this.d;
   }

   public float c() {
      return this.e;
   }

   public Map<il<cnz>, String> d() {
      return this.f;
   }

   public vu e() {
      return this.g;
   }
}
