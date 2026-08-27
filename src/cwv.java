import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record cwv(String e, ja<cuc> f, float g, Map<ja<cru>, String> h, xe i) {
   public static final Codec<cwv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axu.z.fieldOf("asset_name").forGetter(cwv::a),
               akq.a(li.G).fieldOf("ingredient").forGetter(cwv::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cwv::c),
               Codec.unboundedMap(cru.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cwv::d),
               xg.a.fieldOf("description").forGetter(cwv::e)
            )
            .apply($$0, cwv::new)
   );
   public static final zc<wp, cwv> b = zc.a(
      za.l, cwv::a, za.b(li.G), cwv::b, za.i, cwv::c, za.a(Object2ObjectOpenHashMap::new, za.b(li.au), za.l), cwv::d, xg.b, cwv::e, cwv::new
   );
   public static final Codec<ja<cwv>> c = akp.a(li.aO, a);
   public static final zc<wp, ja<cwv>> d = za.a(li.aO, b);

   public static cwv a(String $$0, cuc $$1, float $$2, xe $$3, Map<ja<cru>, String> $$4) {
      return new cwv($$0, lh.h.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.e;
   }

   public ja<cuc> b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public Map<ja<cru>, String> d() {
      return this.h;
   }

   public xe e() {
      return this.i;
   }
}
