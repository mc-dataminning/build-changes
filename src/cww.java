import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record cww(String e, ji<cum> f, float g, Map<ji<csh>, String> h, xp i) {
   public static final Codec<cww> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.A.fieldOf("asset_name").forGetter(cww::a),
               alc.a(lq.G).fieldOf("ingredient").forGetter(cww::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cww::c),
               Codec.unboundedMap(csh.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cww::d),
               xr.a.fieldOf("description").forGetter(cww::e)
            )
            .apply($$0, cww::new)
   );
   public static final zn<xa, cww> b = zn.a(
      zl.l, cww::a, zl.b(lq.G), cww::b, zl.i, cww::c, zl.a(Object2ObjectOpenHashMap::new, zl.b(lq.au), zl.l), cww::d, xr.b, cww::e, cww::new
   );
   public static final Codec<ji<cww>> c = alb.a(lq.aO, a);
   public static final zn<xa, ji<cww>> d = zl.a(lq.aO, b);

   public static cww a(String $$0, cum $$1, float $$2, xp $$3, Map<ji<csh>, String> $$4) {
      return new cww($$0, lp.h.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.e;
   }

   public ji<cum> b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public Map<ji<csh>, String> d() {
      return this.h;
   }

   public xp e() {
      return this.i;
   }
}
