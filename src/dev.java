import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record dev(String e, jr<cwj> f, Map<akt<deq>, String> g, wo h) {
   public static final Codec<dev> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.C.fieldOf("asset_name").forGetter(dev::a),
               cwj.e.fieldOf("ingredient").forGetter(dev::b),
               Codec.unboundedMap(akt.a(der.a), Codec.STRING).optionalFieldOf("override_armor_assets", Map.of()).forGetter(dev::c),
               wq.a.fieldOf("description").forGetter(dev::d)
            )
            .apply($$0, dev::new)
   );
   public static final ym<vz, dev> b = ym.a(
      yk.o, dev::a, yk.b(mc.K), dev::b, yk.a(Object2ObjectOpenHashMap::new, akt.b(der.a), yk.o), dev::c, wq.b, dev::d, dev::new
   );
   public static final Codec<jr<dev>> c = akq.a(mc.aZ, a);
   public static final ym<vz, jr<dev>> d = yk.a(mc.aZ, b);

   public static dev a(String $$0, cwj $$1, wo $$2, Map<akt<deq>, String> $$3) {
      return new dev($$0, mb.g.e($$1), $$3, $$2);
   }

   public String a() {
      return this.e;
   }

   public jr<cwj> b() {
      return this.f;
   }

   public Map<akt<deq>, String> c() {
      return this.g;
   }

   public wo d() {
      return this.h;
   }
}
