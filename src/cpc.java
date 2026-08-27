import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cpc(String c, ih<cmt> d, float e, Map<ckk, String> f, vf g) {
   public static final Codec<cpc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atw.x.fieldOf("asset_name").forGetter(cpc::a),
               ahd.a(ke.F).fieldOf("ingredient").forGetter(cpc::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cpc::c),
               Codec.unboundedMap(ckk.h, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cpc::d),
               vh.a.fieldOf("description").forGetter(cpc::e)
            )
            .apply($$0, cpc::new)
   );
   public static final Codec<ih<cpc>> b = ahc.a(ke.aI, a);

   public static cpc a(String $$0, cmt $$1, float $$2, vf $$3, Map<ckk, String> $$4) {
      return new cpc($$0, kd.h.d($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.c;
   }

   public ih<cmt> b() {
      return this.d;
   }

   public float c() {
      return this.e;
   }

   public Map<ckk, String> d() {
      return this.f;
   }

   public vf e() {
      return this.g;
   }
}
