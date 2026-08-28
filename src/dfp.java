import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record dfp(String e, jq<cxg> f, float g, Map<alz, String> h, xv i) {
   public static final Codec<dfp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azn.C.fieldOf("asset_name").forGetter(dfp::a),
               alw.a(mb.K).fieldOf("ingredient").forGetter(dfp::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(dfp::c),
               Codec.unboundedMap(alz.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(dfp::d),
               xx.a.fieldOf("description").forGetter(dfp::e)
            )
            .apply($$0, dfp::new)
   );
   public static final zt<xg, dfp> b = zt.a(
      zr.o, dfp::a, zr.b(mb.K), dfp::b, zr.l, dfp::c, zr.a(Object2ObjectOpenHashMap::new, alz.b, zr.o), dfp::d, xx.b, dfp::e, dfp::new
   );
   public static final Codec<jq<dfp>> c = alv.a(mb.aY, a);
   public static final zt<xg, jq<dfp>> d = zr.a(mb.aY, b);

   public static dfp a(String $$0, cxg $$1, float $$2, xv $$3, Map<alz, String> $$4) {
      return new dfp($$0, ma.g.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.e;
   }

   public jq<cxg> b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public Map<alz, String> d() {
      return this.h;
   }

   public xv e() {
      return this.i;
   }
}
