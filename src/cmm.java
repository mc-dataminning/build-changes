import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cmm(String c, ib<cke> d, float e, Map<chv, String> f, ui g) {
   public static final Codec<cmm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asg.x.fieldOf("asset_name").forGetter(cmm::a),
               aft.a(jz.E).fieldOf("ingredient").forGetter(cmm::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cmm::c),
               Codec.unboundedMap(chv.h, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cmm::d),
               uk.a.fieldOf("description").forGetter(cmm::e)
            )
            .apply($$0, cmm::new)
   );
   public static final Codec<ib<cmm>> b = afs.a(jz.aE, a);

   public static cmm a(String $$0, cke $$1, float $$2, ui $$3, Map<chv, String> $$4) {
      return new cmm($$0, jy.i.d($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.c;
   }

   public ib<cke> b() {
      return this.d;
   }

   public float c() {
      return this.e;
   }

   public Map<chv, String> d() {
      return this.f;
   }

   public ui e() {
      return this.g;
   }
}
