import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cla(String c, he<cis> d, float e, Map<cgj, String> f, tf g) {
   public static final Codec<cla> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqy.w.fieldOf("asset_name").forGetter(cla::a),
               aeo.a(jc.D).fieldOf("ingredient").forGetter(cla::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cla::c),
               Codec.unboundedMap(cgj.h, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cla::d),
               aqy.b.fieldOf("description").forGetter(cla::e)
            )
            .apply($$0, cla::new)
   );
   public static final Codec<he<cla>> b = aen.a(jc.aD, a);

   public static cla a(String $$0, cis $$1, float $$2, tf $$3, Map<cgj, String> $$4) {
      return new cla($$0, jb.i.d($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.c;
   }

   public he<cis> b() {
      return this.d;
   }

   public float c() {
      return this.e;
   }

   public Map<cgj, String> d() {
      return this.f;
   }

   public tf e() {
      return this.g;
   }
}
