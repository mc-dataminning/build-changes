import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cok(String c, ie<cmc> d, float e, Map<cjt, String> f, vb g) {
   public static final Codec<cok> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atg.x.fieldOf("asset_name").forGetter(cok::a),
               agq.a(kc.F).fieldOf("ingredient").forGetter(cok::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cok::c),
               Codec.unboundedMap(cjt.h, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cok::d),
               vd.a.fieldOf("description").forGetter(cok::e)
            )
            .apply($$0, cok::new)
   );
   public static final Codec<ie<cok>> b = agp.a(kc.aH, a);

   public static cok a(String $$0, cmc $$1, float $$2, vb $$3, Map<cjt, String> $$4) {
      return new cok($$0, kb.h.d($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.c;
   }

   public ie<cmc> b() {
      return this.d;
   }

   public float c() {
      return this.e;
   }

   public Map<cjt, String> d() {
      return this.f;
   }

   public vb e() {
      return this.g;
   }
}
