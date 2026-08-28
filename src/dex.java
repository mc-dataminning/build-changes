import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record dex(String e, jr<cwl> f, Map<akt<des>, String> g, wo h) {
   public static final Codec<dex> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.C.fieldOf("asset_name").forGetter(dex::a),
               cwl.e.fieldOf("ingredient").forGetter(dex::b),
               Codec.unboundedMap(akt.a(det.a), Codec.STRING).optionalFieldOf("override_armor_assets", Map.of()).forGetter(dex::c),
               wq.a.fieldOf("description").forGetter(dex::d)
            )
            .apply($$0, dex::new)
   );
   public static final ym<vz, dex> b = ym.a(
      yk.o, dex::a, yk.b(mc.K), dex::b, yk.a(Object2ObjectOpenHashMap::new, akt.b(det.a), yk.o), dex::c, wq.b, dex::d, dex::new
   );
   public static final Codec<jr<dex>> c = akq.a(mc.aZ, a);
   public static final ym<vz, jr<dex>> d = yk.a(mc.aZ, b);

   public static dex a(String $$0, cwl $$1, wo $$2, Map<akt<des>, String> $$3) {
      return new dex($$0, mb.g.e($$1), $$3, $$2);
   }

   public String a() {
      return this.e;
   }

   public jr<cwl> b() {
      return this.f;
   }

   public Map<akt<des>, String> c() {
      return this.g;
   }

   public wo d() {
      return this.h;
   }
}
