import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cpb(String c, ih<cms> d, float e, Map<ckj, String> f, vf g) {
   public static final Codec<cpb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atv.x.fieldOf("asset_name").forGetter(cpb::a),
               ahd.a(ke.F).fieldOf("ingredient").forGetter(cpb::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cpb::c),
               Codec.unboundedMap(ckj.h, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cpb::d),
               vh.a.fieldOf("description").forGetter(cpb::e)
            )
            .apply($$0, cpb::new)
   );
   public static final Codec<ih<cpb>> b = ahc.a(ke.aI, a);

   public static cpb a(String $$0, cms $$1, float $$2, vf $$3, Map<ckj, String> $$4) {
      return new cpb($$0, kd.h.d($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.c;
   }

   public ih<cms> b() {
      return this.d;
   }

   public float c() {
      return this.e;
   }

   public Map<ckj, String> d() {
      return this.f;
   }

   public vf e() {
      return this.g;
   }
}
