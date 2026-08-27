import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record cug(String e, iv<cry> f, float g, Map<iv<cpt>, String> h, ws i) {
   public static final Codec<cug> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axe.y.fieldOf("asset_name").forGetter(cug::a),
               akc.a(ld.G).fieldOf("ingredient").forGetter(cug::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cug::c),
               Codec.unboundedMap(cpt.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cug::d),
               wu.a.fieldOf("description").forGetter(cug::e)
            )
            .apply($$0, cug::new)
   );
   public static final yq<wd, cug> b = yq.a(
      yo.k, cug::a, yo.b(ld.G), cug::b, yo.h, cug::c, yo.a(Object2ObjectOpenHashMap::new, yo.b(ld.au), yo.k), cug::d, wu.b, cug::e, cug::new
   );
   public static final Codec<iv<cug>> c = akb.a(ld.aN, a);
   public static final yq<wd, iv<cug>> d = yo.a(ld.aN, b);

   public static cug a(String $$0, cry $$1, float $$2, ws $$3, Map<iv<cpt>, String> $$4) {
      return new cug($$0, lc.h.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.e;
   }

   public iv<cry> b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public Map<iv<cpt>, String> d() {
      return this.h;
   }

   public ws e() {
      return this.i;
   }
}
