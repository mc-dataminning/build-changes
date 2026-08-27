import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cpk(String c, ih<cnb> d, float e, Map<ckt, String> f, vg g) {
   public static final Codec<cpk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atx.x.fieldOf("asset_name").forGetter(cpk::a),
               ahe.a(ke.F).fieldOf("ingredient").forGetter(cpk::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cpk::c),
               Codec.unboundedMap(ckt.h, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cpk::d),
               vi.a.fieldOf("description").forGetter(cpk::e)
            )
            .apply($$0, cpk::new)
   );
   public static final Codec<ih<cpk>> b = ahd.a(ke.aI, a);

   public static cpk a(String $$0, cnb $$1, float $$2, vg $$3, Map<ckt, String> $$4) {
      return new cpk($$0, kd.h.d($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.c;
   }

   public ih<cnb> b() {
      return this.d;
   }

   public float c() {
      return this.e;
   }

   public Map<ckt, String> d() {
      return this.f;
   }

   public vg e() {
      return this.g;
   }
}
