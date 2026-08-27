import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cld(String c, hg<civ> d, float e, Map<cgm, String> f, ti g) {
   public static final Codec<cld> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arb.w.fieldOf("asset_name").forGetter(cld::a),
               aer.a(je.D).fieldOf("ingredient").forGetter(cld::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cld::c),
               Codec.unboundedMap(cgm.h, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cld::d),
               arb.b.fieldOf("description").forGetter(cld::e)
            )
            .apply($$0, cld::new)
   );
   public static final Codec<hg<cld>> b = aeq.a(je.aD, a);

   public static cld a(String $$0, civ $$1, float $$2, ti $$3, Map<cgm, String> $$4) {
      return new cld($$0, jd.i.d($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.c;
   }

   public hg<civ> b() {
      return this.d;
   }

   public float c() {
      return this.e;
   }

   public Map<cgm, String> d() {
      return this.f;
   }

   public ti e() {
      return this.g;
   }
}
