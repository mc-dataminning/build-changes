import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record clb(String c, he<cit> d, float e, Map<cgk, String> f, tf g) {
   public static final Codec<clb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqy.w.fieldOf("asset_name").forGetter(clb::a),
               aeo.a(jc.D).fieldOf("ingredient").forGetter(clb::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(clb::c),
               Codec.unboundedMap(cgk.h, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(clb::d),
               aqy.b.fieldOf("description").forGetter(clb::e)
            )
            .apply($$0, clb::new)
   );
   public static final Codec<he<clb>> b = aen.a(jc.aD, a);

   public static clb a(String $$0, cit $$1, float $$2, tf $$3, Map<cgk, String> $$4) {
      return new clb($$0, jb.i.d($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.c;
   }

   public he<cit> b() {
      return this.d;
   }

   public float c() {
      return this.e;
   }

   public Map<cgk, String> d() {
      return this.f;
   }

   public tf e() {
      return this.g;
   }
}
