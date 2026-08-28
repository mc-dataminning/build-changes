import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record dex(String e, jr<cwl> f, Map<aku<des>, String> g, wp h) {
   public static final Codec<dex> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.C.fieldOf("asset_name").forGetter(dex::a),
               cwl.e.fieldOf("ingredient").forGetter(dex::b),
               Codec.unboundedMap(aku.a(det.a), Codec.STRING).optionalFieldOf("override_armor_assets", Map.of()).forGetter(dex::c),
               wr.a.fieldOf("description").forGetter(dex::d)
            )
            .apply($$0, dex::new)
   );
   public static final yn<wa, dex> b = yn.a(
      yl.o, dex::a, yl.b(mc.K), dex::b, yl.a(Object2ObjectOpenHashMap::new, aku.b(det.a), yl.o), dex::c, wr.b, dex::d, dex::new
   );
   public static final Codec<jr<dex>> c = akr.a(mc.aZ, a);
   public static final yn<wa, jr<dex>> d = yl.a(mc.aZ, b);

   public static dex a(String $$0, cwl $$1, wp $$2, Map<aku<des>, String> $$3) {
      return new dex($$0, mb.g.e($$1), $$3, $$2);
   }

   public String a() {
      return this.e;
   }

   public jr<cwl> b() {
      return this.f;
   }

   public Map<aku<des>, String> c() {
      return this.g;
   }

   public wp d() {
      return this.h;
   }
}
