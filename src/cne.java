import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cne(String c, ib<ckw> d, float e, Map<cin, String> f, ur g) {
   public static final Codec<cne> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asq.x.fieldOf("asset_name").forGetter(cne::a),
               agd.a(jz.E).fieldOf("ingredient").forGetter(cne::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cne::c),
               Codec.unboundedMap(cin.h, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cne::d),
               ut.a.fieldOf("description").forGetter(cne::e)
            )
            .apply($$0, cne::new)
   );
   public static final Codec<ib<cne>> b = agc.a(jz.aF, a);

   public static cne a(String $$0, ckw $$1, float $$2, ur $$3, Map<cin, String> $$4) {
      return new cne($$0, jy.i.d($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.c;
   }

   public ib<ckw> b() {
      return this.d;
   }

   public float c() {
      return this.e;
   }

   public Map<cin, String> d() {
      return this.f;
   }

   public ur e() {
      return this.g;
   }
}
