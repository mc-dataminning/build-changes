import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cov(String c, ih<cmm> d, float e, Map<ckd, String> f, vd g) {
   public static final Codec<cov> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atq.x.fieldOf("asset_name").forGetter(cov::a),
               aha.a(ke.F).fieldOf("ingredient").forGetter(cov::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cov::c),
               Codec.unboundedMap(ckd.h, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cov::d),
               vf.a.fieldOf("description").forGetter(cov::e)
            )
            .apply($$0, cov::new)
   );
   public static final Codec<ih<cov>> b = agz.a(ke.aI, a);

   public static cov a(String $$0, cmm $$1, float $$2, vd $$3, Map<ckd, String> $$4) {
      return new cov($$0, kd.h.d($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.c;
   }

   public ih<cmm> b() {
      return this.d;
   }

   public float c() {
      return this.e;
   }

   public Map<ckd, String> d() {
      return this.f;
   }

   public vd e() {
      return this.g;
   }
}
