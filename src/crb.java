import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record crb(String c, ij<cou> d, float e, Map<cml, String> f, vq g) {
   public static final Codec<crb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avp.x.fieldOf("asset_name").forGetter(crb::a),
               aiv.a(kg.F).fieldOf("ingredient").forGetter(crb::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(crb::c),
               Codec.unboundedMap(cml.h, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(crb::d),
               vs.a.fieldOf("description").forGetter(crb::e)
            )
            .apply($$0, crb::new)
   );
   public static final Codec<ij<crb>> b = aiu.a(kg.aI, a);

   public static crb a(String $$0, cou $$1, float $$2, vq $$3, Map<cml, String> $$4) {
      return new crb($$0, kf.h.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.c;
   }

   public ij<cou> b() {
      return this.d;
   }

   public float c() {
      return this.e;
   }

   public Map<cml, String> d() {
      return this.f;
   }

   public vq e() {
      return this.g;
   }
}
