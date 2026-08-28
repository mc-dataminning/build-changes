import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record cxv(String e, jo<cvn> f, float g, Map<jo<ctm>, String> h, xe i) {
   public static final Codec<cxv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayo.B.fieldOf("asset_name").forGetter(cxv::a),
               alb.a(lw.K).fieldOf("ingredient").forGetter(cxv::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cxv::c),
               Codec.unboundedMap(ctm.a, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cxv::d),
               xg.a.fieldOf("description").forGetter(cxv::e)
            )
            .apply($$0, cxv::new)
   );
   public static final zc<wp, cxv> b = zc.a(
      za.m, cxv::a, za.b(lw.K), cxv::b, za.j, cxv::c, za.a(Object2ObjectOpenHashMap::new, za.b(lw.az), za.m), cxv::d, xg.b, cxv::e, cxv::new
   );
   public static final Codec<jo<cxv>> c = ala.a(lw.aY, a);
   public static final zc<wp, jo<cxv>> d = za.a(lw.aY, b);

   public static cxv a(String $$0, cvn $$1, float $$2, xe $$3, Map<jo<ctm>, String> $$4) {
      return new cxv($$0, lv.g.e($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.e;
   }

   public jo<cvn> b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public Map<jo<ctm>, String> d() {
      return this.h;
   }

   public xe e() {
      return this.i;
   }
}
