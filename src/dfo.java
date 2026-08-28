import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record dfo(String e, jq<cxc> f, float g, Map<alp, String> h, xk i) {
   public static final Codec<dfo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azd.C.fieldOf("asset_name").forGetter(dfo::a),
               cxc.e.fieldOf("ingredient").forGetter(dfo::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(dfo::c),
               Codec.unboundedMap(alp.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(dfo::d),
               xm.a.fieldOf("description").forGetter(dfo::e)
            )
            .apply($$0, dfo::new)
   );
   public static final zi<wv, dfo> b = zi.a(
      zg.o, dfo::a, zg.b(mb.K), dfo::b, zg.l, dfo::c, zg.a(Object2ObjectOpenHashMap::new, alp.b, zg.o), dfo::d, xm.b, dfo::e, dfo::new
   );
   public static final Codec<jq<dfo>> c = all.a(mb.aZ, a);
   public static final zi<wv, jq<dfo>> d = zg.a(mb.aZ, b);

   public static dfo a(String $$0, cxc $$1, float $$2, xk $$3, Map<alp, String> $$4) {
      return new dfo($$0, ma.g.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.e;
   }

   public jq<cxc> b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public Map<alp, String> d() {
      return this.h;
   }

   public xk e() {
      return this.i;
   }
}
