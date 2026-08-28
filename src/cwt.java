import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record cwt(String e, ji<cuj> f, float g, Map<ji<cse>, String> h, xo i) {
   public static final Codec<cwt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayg.A.fieldOf("asset_name").forGetter(cwt::a),
               alb.a(lq.G).fieldOf("ingredient").forGetter(cwt::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cwt::c),
               Codec.unboundedMap(cse.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cwt::d),
               xq.a.fieldOf("description").forGetter(cwt::e)
            )
            .apply($$0, cwt::new)
   );
   public static final zm<wz, cwt> b = zm.a(
      zk.l, cwt::a, zk.b(lq.G), cwt::b, zk.i, cwt::c, zk.a(Object2ObjectOpenHashMap::new, zk.b(lq.au), zk.l), cwt::d, xq.b, cwt::e, cwt::new
   );
   public static final Codec<ji<cwt>> c = ala.a(lq.aO, a);
   public static final zm<wz, ji<cwt>> d = zk.a(lq.aO, b);

   public static cwt a(String $$0, cuj $$1, float $$2, xo $$3, Map<ji<cse>, String> $$4) {
      return new cwt($$0, lp.h.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.e;
   }

   public ji<cuj> b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public Map<ji<cse>, String> d() {
      return this.h;
   }

   public xo e() {
      return this.i;
   }
}
