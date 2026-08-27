import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record ctu(String e, in<crn> f, float g, Map<in<cpi>, String> h, wi i) {
   public static final Codec<ctu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awu.y.fieldOf("asset_name").forGetter(ctu::a),
               ajs.a(ku.G).fieldOf("ingredient").forGetter(ctu::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(ctu::c),
               Codec.unboundedMap(cpi.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(ctu::d),
               wk.a.fieldOf("description").forGetter(ctu::e)
            )
            .apply($$0, ctu::new)
   );
   public static final yg<vt, ctu> b = yg.a(
      ye.k, ctu::a, ye.b(ku.G), ctu::b, ye.h, ctu::c, ye.a(Object2ObjectOpenHashMap::new, ye.b(ku.au), ye.k), ctu::d, wk.b, ctu::e, ctu::new
   );
   public static final Codec<in<ctu>> c = ajr.a(ku.aL, a);
   public static final yg<vt, in<ctu>> d = ye.a(ku.aL, b);

   public static ctu a(String $$0, crn $$1, float $$2, wi $$3, Map<in<cpi>, String> $$4) {
      return new ctu($$0, kt.h.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.e;
   }

   public in<crn> b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public Map<in<cpi>, String> d() {
      return this.h;
   }

   public wi e() {
      return this.i;
   }
}
