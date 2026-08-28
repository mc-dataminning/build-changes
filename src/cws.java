import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record cws(String e, ji<cui> f, float g, Map<ji<csd>, String> h, xo i) {
   public static final Codec<cws> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayf.A.fieldOf("asset_name").forGetter(cws::a),
               alb.a(lq.G).fieldOf("ingredient").forGetter(cws::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cws::c),
               Codec.unboundedMap(csd.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cws::d),
               xq.a.fieldOf("description").forGetter(cws::e)
            )
            .apply($$0, cws::new)
   );
   public static final zm<wz, cws> b = zm.a(
      zk.l, cws::a, zk.b(lq.G), cws::b, zk.i, cws::c, zk.a(Object2ObjectOpenHashMap::new, zk.b(lq.au), zk.l), cws::d, xq.b, cws::e, cws::new
   );
   public static final Codec<ji<cws>> c = ala.a(lq.aO, a);
   public static final zm<wz, ji<cws>> d = zk.a(lq.aO, b);

   public static cws a(String $$0, cui $$1, float $$2, xo $$3, Map<ji<csd>, String> $$4) {
      return new cws($$0, lp.h.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.e;
   }

   public ji<cui> b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public Map<ji<csd>, String> d() {
      return this.h;
   }

   public xo e() {
      return this.i;
   }
}
