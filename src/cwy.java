import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record cwy(String e, jm<cul> f, float g, Map<jm<csg>, String> h, wz i) {
   public static final Codec<cwy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axw.A.fieldOf("asset_name").forGetter(cwy::a),
               ako.a(lu.K).fieldOf("ingredient").forGetter(cwy::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cwy::c),
               Codec.unboundedMap(csg.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cwy::d),
               xb.a.fieldOf("description").forGetter(cwy::e)
            )
            .apply($$0, cwy::new)
   );
   public static final yx<wk, cwy> b = yx.a(
      yv.l, cwy::a, yv.b(lu.K), cwy::b, yv.i, cwy::c, yv.a(Object2ObjectOpenHashMap::new, yv.b(lu.az), yv.l), cwy::d, xb.b, cwy::e, cwy::new
   );
   public static final Codec<jm<cwy>> c = akn.a(lu.aW, a);
   public static final yx<wk, jm<cwy>> d = yv.a(lu.aW, b);

   public static cwy a(String $$0, cul $$1, float $$2, wz $$3, Map<jm<csg>, String> $$4) {
      return new cwy($$0, lt.g.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.e;
   }

   public jm<cul> b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public Map<jm<csg>, String> d() {
      return this.h;
   }

   public wz e() {
      return this.i;
   }
}
