import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cic(String c, he<cfu> d, float e, Map<cdl, String> f, sw g) {
   public static final Codec<cic> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("asset_name").forGetter(cic::a),
               acn.a(jc.D).fieldOf("ingredient").forGetter(cic::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cic::c),
               Codec.unboundedMap(cdl.h, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cic::d),
               aoi.b.fieldOf("description").forGetter(cic::e)
            )
            .apply($$0, cic::new)
   );
   public static final Codec<he<cic>> b = acm.a(jc.aD, a);

   public static cic a(String $$0, cfu $$1, float $$2, sw $$3, Map<cdl, String> $$4) {
      return new cic($$0, jb.i.d($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.c;
   }

   public he<cfu> b() {
      return this.d;
   }

   public float c() {
      return this.e;
   }

   public Map<cdl, String> d() {
      return this.f;
   }

   public sw e() {
      return this.g;
   }
}
