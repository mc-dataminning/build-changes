import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record ckz(String c, hf<cir> d, float e, Map<cgi, String> f, te g) {
   public static final Codec<ckz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqw.w.fieldOf("asset_name").forGetter(ckz::a),
               aem.a(jd.D).fieldOf("ingredient").forGetter(ckz::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(ckz::c),
               Codec.unboundedMap(cgi.h, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(ckz::d),
               aqw.b.fieldOf("description").forGetter(ckz::e)
            )
            .apply($$0, ckz::new)
   );
   public static final Codec<hf<ckz>> b = ael.a(jd.aD, a);

   public static ckz a(String $$0, cir $$1, float $$2, te $$3, Map<cgi, String> $$4) {
      return new ckz($$0, jc.i.d($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.c;
   }

   public hf<cir> b() {
      return this.d;
   }

   public float c() {
      return this.e;
   }

   public Map<cgi, String> d() {
      return this.f;
   }

   public te e() {
      return this.g;
   }
}
