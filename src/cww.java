import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record cww(String e, jm<cuj> f, float g, Map<jm<cse>, String> h, wy i) {
   public static final Codec<cww> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axv.A.fieldOf("asset_name").forGetter(cww::a),
               akn.a(lu.K).fieldOf("ingredient").forGetter(cww::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cww::c),
               Codec.unboundedMap(cse.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cww::d),
               xa.a.fieldOf("description").forGetter(cww::e)
            )
            .apply($$0, cww::new)
   );
   public static final yw<wj, cww> b = yw.a(
      yu.l, cww::a, yu.b(lu.K), cww::b, yu.i, cww::c, yu.a(Object2ObjectOpenHashMap::new, yu.b(lu.az), yu.l), cww::d, xa.b, cww::e, cww::new
   );
   public static final Codec<jm<cww>> c = akm.a(lu.aW, a);
   public static final yw<wj, jm<cww>> d = yu.a(lu.aW, b);

   public static cww a(String $$0, cuj $$1, float $$2, wy $$3, Map<jm<cse>, String> $$4) {
      return new cww($$0, lt.g.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.e;
   }

   public jm<cuj> b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public Map<jm<cse>, String> d() {
      return this.h;
   }

   public wy e() {
      return this.i;
   }
}
