import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record cvc(String e, iw<csu> f, float g, Map<iw<cqp>, String> h, wu i) {
   public static final Codec<cvc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axh.y.fieldOf("asset_name").forGetter(cvc::a),
               ake.a(le.G).fieldOf("ingredient").forGetter(cvc::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cvc::c),
               Codec.unboundedMap(cqp.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cvc::d),
               ww.a.fieldOf("description").forGetter(cvc::e)
            )
            .apply($$0, cvc::new)
   );
   public static final ys<wf, cvc> b = ys.a(
      yq.k, cvc::a, yq.b(le.G), cvc::b, yq.h, cvc::c, yq.a(Object2ObjectOpenHashMap::new, yq.b(le.au), yq.k), cvc::d, ww.b, cvc::e, cvc::new
   );
   public static final Codec<iw<cvc>> c = akd.a(le.aO, a);
   public static final ys<wf, iw<cvc>> d = yq.a(le.aO, b);

   public static cvc a(String $$0, csu $$1, float $$2, wu $$3, Map<iw<cqp>, String> $$4) {
      return new cvc($$0, ld.h.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.e;
   }

   public iw<csu> b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public Map<iw<cqp>, String> d() {
      return this.h;
   }

   public wu e() {
      return this.i;
   }
}
