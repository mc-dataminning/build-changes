import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record csn(String c, il<cqf> d, float e, Map<il<cnx>, String> f, vu g) {
   public static final Codec<csn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awe.y.fieldOf("asset_name").forGetter(csn::a),
               aje.a(kj.F).fieldOf("ingredient").forGetter(csn::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(csn::c),
               Codec.unboundedMap(cnx.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(csn::d),
               vw.a.fieldOf("description").forGetter(csn::e)
            )
            .apply($$0, csn::new)
   );
   public static final Codec<il<csn>> b = ajd.a(kj.aJ, a);

   public static csn a(String $$0, cqf $$1, float $$2, vu $$3, Map<il<cnx>, String> $$4) {
      return new csn($$0, ki.h.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.c;
   }

   public il<cqf> b() {
      return this.d;
   }

   public float c() {
      return this.e;
   }

   public Map<il<cnx>, String> d() {
      return this.f;
   }

   public vu e() {
      return this.g;
   }
}
