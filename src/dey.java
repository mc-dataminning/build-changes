import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record dey(String e, jr<cwm> f, Map<aku<det>, String> g, wp h) {
   public static final Codec<dey> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.C.fieldOf("asset_name").forGetter(dey::a),
               cwm.e.fieldOf("ingredient").forGetter(dey::b),
               Codec.unboundedMap(aku.a(deu.a), Codec.STRING).optionalFieldOf("override_armor_assets", Map.of()).forGetter(dey::c),
               wr.a.fieldOf("description").forGetter(dey::d)
            )
            .apply($$0, dey::new)
   );
   public static final yn<wa, dey> b = yn.a(
      yl.o, dey::a, yl.b(mc.K), dey::b, yl.a(Object2ObjectOpenHashMap::new, aku.b(deu.a), yl.o), dey::c, wr.b, dey::d, dey::new
   );
   public static final Codec<jr<dey>> c = akr.a(mc.aZ, a);
   public static final yn<wa, jr<dey>> d = yl.a(mc.aZ, b);

   public static dey a(String $$0, cwm $$1, wp $$2, Map<aku<det>, String> $$3) {
      return new dey($$0, mb.g.e($$1), $$3, $$2);
   }

   public String a() {
      return this.e;
   }

   public jr<cwm> b() {
      return this.f;
   }

   public Map<aku<det>, String> c() {
      return this.g;
   }

   public wp d() {
      return this.h;
   }
}
