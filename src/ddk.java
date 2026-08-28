import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record ddk(String e, jp<cvt> f, float g, Map<alh, String> h, xh i) {
   public static final Codec<ddk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.C.fieldOf("asset_name").forGetter(ddk::a),
               ale.a(ly.K).fieldOf("ingredient").forGetter(ddk::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(ddk::c),
               Codec.unboundedMap(alh.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(ddk::d),
               xj.a.fieldOf("description").forGetter(ddk::e)
            )
            .apply($$0, ddk::new)
   );
   public static final zf<ws, ddk> b = zf.a(
      zd.m, ddk::a, zd.b(ly.K), ddk::b, zd.j, ddk::c, zd.a(Object2ObjectOpenHashMap::new, alh.b, zd.m), ddk::d, xj.b, ddk::e, ddk::new
   );
   public static final Codec<jp<ddk>> c = ald.a(ly.aX, a);
   public static final zf<ws, jp<ddk>> d = zd.a(ly.aX, b);

   public static ddk a(String $$0, cvt $$1, float $$2, xh $$3, Map<alh, String> $$4) {
      return new ddk($$0, lx.g.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.e;
   }

   public jp<cvt> b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public Map<alh, String> d() {
      return this.h;
   }

   public xh e() {
      return this.i;
   }
}
