import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record crf(String c, ij<coy> d, float e, Map<cmp, String> f, vq g) {
   public static final Codec<crf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avq.x.fieldOf("asset_name").forGetter(crf::a),
               aiv.a(kg.F).fieldOf("ingredient").forGetter(crf::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(crf::c),
               Codec.unboundedMap(cmp.h, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(crf::d),
               vs.a.fieldOf("description").forGetter(crf::e)
            )
            .apply($$0, crf::new)
   );
   public static final Codec<ij<crf>> b = aiu.a(kg.aI, a);

   public static crf a(String $$0, coy $$1, float $$2, vq $$3, Map<cmp, String> $$4) {
      return new crf($$0, kf.h.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.c;
   }

   public ij<coy> b() {
      return this.d;
   }

   public float c() {
      return this.e;
   }

   public Map<cmp, String> d() {
      return this.f;
   }

   public vq e() {
      return this.g;
   }
}
