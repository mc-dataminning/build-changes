import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record dfw(String e, jq<cxk> f, float g, Map<alz, String> h, xv i) {
   public static final Codec<dfw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azn.C.fieldOf("asset_name").forGetter(dfw::a),
               cxk.e.fieldOf("ingredient").forGetter(dfw::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(dfw::c),
               Codec.unboundedMap(alz.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(dfw::d),
               xx.a.fieldOf("description").forGetter(dfw::e)
            )
            .apply($$0, dfw::new)
   );
   public static final zt<xg, dfw> b = zt.a(
      zr.o, dfw::a, zr.b(mb.K), dfw::b, zr.l, dfw::c, zr.a(Object2ObjectOpenHashMap::new, alz.b, zr.o), dfw::d, xx.b, dfw::e, dfw::new
   );
   public static final Codec<jq<dfw>> c = alv.a(mb.aZ, a);
   public static final zt<xg, jq<dfw>> d = zr.a(mb.aZ, b);

   public static dfw a(String $$0, cxk $$1, float $$2, xv $$3, Map<alz, String> $$4) {
      return new dfw($$0, ma.g.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.e;
   }

   public jq<cxk> b() {
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
