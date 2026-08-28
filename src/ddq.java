import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record ddq(String e, jq<cvx> f, float g, Map<ali, String> h, xi i) {
   public static final Codec<ddq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayt.C.fieldOf("asset_name").forGetter(ddq::a),
               alf.a(lz.K).fieldOf("ingredient").forGetter(ddq::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(ddq::c),
               Codec.unboundedMap(ali.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(ddq::d),
               xk.a.fieldOf("description").forGetter(ddq::e)
            )
            .apply($$0, ddq::new)
   );
   public static final zg<wt, ddq> b = zg.a(
      ze.m, ddq::a, ze.b(lz.K), ddq::b, ze.j, ddq::c, ze.a(Object2ObjectOpenHashMap::new, ali.b, ze.m), ddq::d, xk.b, ddq::e, ddq::new
   );
   public static final Codec<jq<ddq>> c = ale.a(lz.aX, a);
   public static final zg<wt, jq<ddq>> d = ze.a(lz.aX, b);

   public static ddq a(String $$0, cvx $$1, float $$2, xi $$3, Map<ali, String> $$4) {
      return new ddq($$0, ly.g.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.e;
   }

   public jq<cvx> b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public Map<ali, String> d() {
      return this.h;
   }

   public xi e() {
      return this.i;
   }
}
