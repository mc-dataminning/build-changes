import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record cvv(String e, ix<ctl> f, float g, Map<ix<crg>, String> h, wx i) {
   public static final Codec<cvv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axn.y.fieldOf("asset_name").forGetter(cvv::a),
               akk.a(lf.G).fieldOf("ingredient").forGetter(cvv::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cvv::c),
               Codec.unboundedMap(crg.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cvv::d),
               wz.a.fieldOf("description").forGetter(cvv::e)
            )
            .apply($$0, cvv::new)
   );
   public static final yv<wi, cvv> b = yv.a(
      yt.k, cvv::a, yt.b(lf.G), cvv::b, yt.h, cvv::c, yt.a(Object2ObjectOpenHashMap::new, yt.b(lf.au), yt.k), cvv::d, wz.b, cvv::e, cvv::new
   );
   public static final Codec<ix<cvv>> c = akj.a(lf.aO, a);
   public static final yv<wi, ix<cvv>> d = yt.a(lf.aO, b);

   public static cvv a(String $$0, ctl $$1, float $$2, wx $$3, Map<ix<crg>, String> $$4) {
      return new cvv($$0, le.h.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.e;
   }

   public ix<ctl> b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public Map<ix<crg>, String> d() {
      return this.h;
   }

   public wx e() {
      return this.i;
   }
}
