import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record dfx(String e, jq<cxl> f, float g, Map<alz, String> h, xv i) {
   public static final Codec<dfx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azn.C.fieldOf("asset_name").forGetter(dfx::a),
               cxl.e.fieldOf("ingredient").forGetter(dfx::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(dfx::c),
               Codec.unboundedMap(alz.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(dfx::d),
               xx.a.fieldOf("description").forGetter(dfx::e)
            )
            .apply($$0, dfx::new)
   );
   public static final zt<xg, dfx> b = zt.a(
      zr.o, dfx::a, zr.b(mb.K), dfx::b, zr.l, dfx::c, zr.a(Object2ObjectOpenHashMap::new, alz.b, zr.o), dfx::d, xx.b, dfx::e, dfx::new
   );
   public static final Codec<jq<dfx>> c = alv.a(mb.aZ, a);
   public static final zt<xg, jq<dfx>> d = zr.a(mb.aZ, b);

   public static dfx a(String $$0, cxl $$1, float $$2, xv $$3, Map<alz, String> $$4) {
      return new dfx($$0, ma.g.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.e;
   }

   public jq<cxl> b() {
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
