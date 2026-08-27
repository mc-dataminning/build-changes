import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record cvt(String e, ix<ctj> f, float g, Map<ix<cre>, String> h, wx i) {
   public static final Codec<cvt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axm.y.fieldOf("asset_name").forGetter(cvt::a),
               akj.a(lf.G).fieldOf("ingredient").forGetter(cvt::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cvt::c),
               Codec.unboundedMap(cre.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cvt::d),
               wz.a.fieldOf("description").forGetter(cvt::e)
            )
            .apply($$0, cvt::new)
   );
   public static final yv<wi, cvt> b = yv.a(
      yt.k, cvt::a, yt.b(lf.G), cvt::b, yt.h, cvt::c, yt.a(Object2ObjectOpenHashMap::new, yt.b(lf.au), yt.k), cvt::d, wz.b, cvt::e, cvt::new
   );
   public static final Codec<ix<cvt>> c = aki.a(lf.aO, a);
   public static final yv<wi, ix<cvt>> d = yt.a(lf.aO, b);

   public static cvt a(String $$0, ctj $$1, float $$2, wx $$3, Map<ix<cre>, String> $$4) {
      return new cvt($$0, le.h.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.e;
   }

   public ix<ctj> b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public Map<ix<cre>, String> d() {
      return this.h;
   }

   public wx e() {
      return this.i;
   }
}
