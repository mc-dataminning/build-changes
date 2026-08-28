import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record dew(String e, jr<cwk> f, Map<aku<der>, String> g, wp h) {
   public static final Codec<dew> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.C.fieldOf("asset_name").forGetter(dew::a),
               cwk.e.fieldOf("ingredient").forGetter(dew::b),
               Codec.unboundedMap(aku.a(des.a), Codec.STRING).optionalFieldOf("override_armor_assets", Map.of()).forGetter(dew::c),
               wr.a.fieldOf("description").forGetter(dew::d)
            )
            .apply($$0, dew::new)
   );
   public static final yn<wa, dew> b = yn.a(
      yl.o, dew::a, yl.b(mc.K), dew::b, yl.a(Object2ObjectOpenHashMap::new, aku.b(des.a), yl.o), dew::c, wr.b, dew::d, dew::new
   );
   public static final Codec<jr<dew>> c = akr.a(mc.aZ, a);
   public static final yn<wa, jr<dew>> d = yl.a(mc.aZ, b);

   public static dew a(String $$0, cwk $$1, wp $$2, Map<aku<der>, String> $$3) {
      return new dew($$0, mb.g.e($$1), $$3, $$2);
   }

   public String a() {
      return this.e;
   }

   public jr<cwk> b() {
      return this.f;
   }

   public Map<aku<der>, String> c() {
      return this.g;
   }

   public wp d() {
      return this.h;
   }
}
