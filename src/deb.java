import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record deb(String e, jq<cwi> f, float g, Map<alj, String> h, xj i) {
   public static final Codec<deb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayv.C.fieldOf("asset_name").forGetter(deb::a),
               alg.a(ma.K).fieldOf("ingredient").forGetter(deb::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(deb::c),
               Codec.unboundedMap(alj.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(deb::d),
               xl.a.fieldOf("description").forGetter(deb::e)
            )
            .apply($$0, deb::new)
   );
   public static final zh<wu, deb> b = zh.a(
      zf.n, deb::a, zf.b(ma.K), deb::b, zf.k, deb::c, zf.a(Object2ObjectOpenHashMap::new, alj.b, zf.n), deb::d, xl.b, deb::e, deb::new
   );
   public static final Codec<jq<deb>> c = alf.a(ma.aX, a);
   public static final zh<wu, jq<deb>> d = zf.a(ma.aX, b);

   public static deb a(String $$0, cwi $$1, float $$2, xj $$3, Map<alj, String> $$4) {
      return new deb($$0, lz.g.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.e;
   }

   public jq<cwi> b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public Map<alj, String> d() {
      return this.h;
   }

   public xj e() {
      return this.i;
   }
}
