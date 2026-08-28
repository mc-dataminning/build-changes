import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record dgf(String e, js<cxu> f, Map<alc<dga>, String> g, wv h) {
   public static final Codec<dgf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.C.fieldOf("asset_name").forGetter(dgf::a),
               cxu.e.fieldOf("ingredient").forGetter(dgf::b),
               Codec.unboundedMap(alc.a(dgb.a), Codec.STRING).optionalFieldOf("override_armor_assets", Map.of()).forGetter(dgf::c),
               wx.a.fieldOf("description").forGetter(dgf::d)
            )
            .apply($$0, dgf::new)
   );
   public static final yt<wg, dgf> b = yt.a(
      yr.o, dgf::a, cxu.f, dgf::b, yr.a(Object2ObjectOpenHashMap::new, alc.b(dgb.a), yr.o), dgf::c, wx.b, dgf::d, dgf::new
   );
   public static final Codec<js<dgf>> c = akz.a(me.bg, a);
   public static final yt<wg, js<dgf>> d = yr.a(me.bg, b);

   public static dgf a(String $$0, cxu $$1, wv $$2, Map<alc<dga>, String> $$3) {
      return new dgf($$0, md.g.e($$1), $$3, $$2);
   }

   public String a() {
      return this.e;
   }

   public js<cxu> b() {
      return this.f;
   }

   public Map<alc<dga>, String> c() {
      return this.g;
   }

   public wv d() {
      return this.h;
   }
}
