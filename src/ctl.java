import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record ctl(String e, il<cre> f, float g, Map<il<coz>, String> h, wg i) {
   public static final Codec<ctl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aws.y.fieldOf("asset_name").forGetter(ctl::a),
               ajq.a(ks.F).fieldOf("ingredient").forGetter(ctl::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(ctl::c),
               Codec.unboundedMap(coz.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(ctl::d),
               wi.a.fieldOf("description").forGetter(ctl::e)
            )
            .apply($$0, ctl::new)
   );
   public static final ye<vr, ctl> b = ye.a(
      yc.k, ctl::a, yc.b(ks.F), ctl::b, yc.h, ctl::c, yc.a(Object2ObjectOpenHashMap::new, yc.b(ks.at), yc.k), ctl::d, wi.b, ctl::e, ctl::new
   );
   public static final Codec<il<ctl>> c = ajp.a(ks.aK, a);
   public static final ye<vr, il<ctl>> d = yc.a(ks.aK, b);

   public static ctl a(String $$0, cre $$1, float $$2, wg $$3, Map<il<coz>, String> $$4) {
      return new ctl($$0, kr.h.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.e;
   }

   public il<cre> b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public Map<il<coz>, String> d() {
      return this.h;
   }

   public wg e() {
      return this.i;
   }
}
