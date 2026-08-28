import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record dfp(String e, jr<cxd> f, Map<akt<dfk>, String> g, wp h) {
   public static final Codec<dfp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.C.fieldOf("asset_name").forGetter(dfp::a),
               cxd.e.fieldOf("ingredient").forGetter(dfp::b),
               Codec.unboundedMap(akt.a(dfl.a), Codec.STRING).optionalFieldOf("override_armor_assets", Map.of()).forGetter(dfp::c),
               wr.a.fieldOf("description").forGetter(dfp::d)
            )
            .apply($$0, dfp::new)
   );
   public static final yn<wa, dfp> b = yn.a(
      yl.o, dfp::a, cxd.f, dfp::b, yl.a(Object2ObjectOpenHashMap::new, akt.b(dfl.a), yl.o), dfp::c, wr.b, dfp::d, dfp::new
   );
   public static final Codec<jr<dfp>> c = akq.a(mc.bb, a);
   public static final yn<wa, jr<dfp>> d = yl.a(mc.bb, b);

   public static dfp a(String $$0, cxd $$1, wp $$2, Map<akt<dfk>, String> $$3) {
      return new dfp($$0, mb.g.e($$1), $$3, $$2);
   }

   public String a() {
      return this.e;
   }

   public jr<cxd> b() {
      return this.f;
   }

   public Map<akt<dfk>, String> c() {
      return this.g;
   }

   public wp d() {
      return this.h;
   }
}
