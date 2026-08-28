import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record cwu(String e, ji<cuk> f, float g, Map<ji<csf>, String> h, xp i) {
   public static final Codec<cwu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.A.fieldOf("asset_name").forGetter(cwu::a),
               alc.a(lq.G).fieldOf("ingredient").forGetter(cwu::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cwu::c),
               Codec.unboundedMap(csf.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cwu::d),
               xr.a.fieldOf("description").forGetter(cwu::e)
            )
            .apply($$0, cwu::new)
   );
   public static final zn<xa, cwu> b = zn.a(
      zl.l, cwu::a, zl.b(lq.G), cwu::b, zl.i, cwu::c, zl.a(Object2ObjectOpenHashMap::new, zl.b(lq.au), zl.l), cwu::d, xr.b, cwu::e, cwu::new
   );
   public static final Codec<ji<cwu>> c = alb.a(lq.aO, a);
   public static final zn<xa, ji<cwu>> d = zl.a(lq.aO, b);

   public static cwu a(String $$0, cuk $$1, float $$2, xp $$3, Map<ji<csf>, String> $$4) {
      return new cwu($$0, lp.h.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.e;
   }

   public ji<cuk> b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public Map<ji<csf>, String> d() {
      return this.h;
   }

   public xp e() {
      return this.i;
   }
}
