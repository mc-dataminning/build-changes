import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cnm(String c, ib<cle> d, float e, Map<civ, String> f, ur g) {
   public static final Codec<cnm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asu.x.fieldOf("asset_name").forGetter(cnm::a),
               agf.a(jz.E).fieldOf("ingredient").forGetter(cnm::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cnm::c),
               Codec.unboundedMap(civ.h, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cnm::d),
               ut.a.fieldOf("description").forGetter(cnm::e)
            )
            .apply($$0, cnm::new)
   );
   public static final Codec<ib<cnm>> b = age.a(jz.aF, a);

   public static cnm a(String $$0, cle $$1, float $$2, ur $$3, Map<civ, String> $$4) {
      return new cnm($$0, jy.i.d($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.c;
   }

   public ib<cle> b() {
      return this.d;
   }

   public float c() {
      return this.e;
   }

   public Map<civ, String> d() {
      return this.f;
   }

   public ur e() {
      return this.g;
   }
}
