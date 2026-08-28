import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record cwv(String e, ji<cul> f, float g, Map<ji<csg>, String> h, xp i) {
   public static final Codec<cwv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.A.fieldOf("asset_name").forGetter(cwv::a),
               alc.a(lq.G).fieldOf("ingredient").forGetter(cwv::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cwv::c),
               Codec.unboundedMap(csg.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cwv::d),
               xr.a.fieldOf("description").forGetter(cwv::e)
            )
            .apply($$0, cwv::new)
   );
   public static final zn<xa, cwv> b = zn.a(
      zl.l, cwv::a, zl.b(lq.G), cwv::b, zl.i, cwv::c, zl.a(Object2ObjectOpenHashMap::new, zl.b(lq.au), zl.l), cwv::d, xr.b, cwv::e, cwv::new
   );
   public static final Codec<ji<cwv>> c = alb.a(lq.aO, a);
   public static final zn<xa, ji<cwv>> d = zl.a(lq.aO, b);

   public static cwv a(String $$0, cul $$1, float $$2, xp $$3, Map<ji<csg>, String> $$4) {
      return new cwv($$0, lp.h.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.e;
   }

   public ji<cul> b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public Map<ji<csg>, String> d() {
      return this.h;
   }

   public xp e() {
      return this.i;
   }
}
