import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record cli(String c, hg<cja> d, float e, Map<cgr, String> f, tl g) {
   public static final Codec<cli> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arg.x.fieldOf("asset_name").forGetter(cli::a),
               aeu.a(je.D).fieldOf("ingredient").forGetter(cli::b),
               Codec.FLOAT.fieldOf("item_model_index").forGetter(cli::c),
               Codec.unboundedMap(cgr.h, Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cli::d),
               arg.b.fieldOf("description").forGetter(cli::e)
            )
            .apply($$0, cli::new)
   );
   public static final Codec<hg<cli>> b = aet.a(je.aD, a);

   public static cli a(String $$0, cja $$1, float $$2, tl $$3, Map<cgr, String> $$4) {
      return new cli($$0, jd.i.d($$1), $$2, $$4, $$3);
   }

   public String a() {
      return this.c;
   }

   public hg<cja> b() {
      return this.d;
   }

   public float c() {
      return this.e;
   }

   public Map<cgr, String> d() {
      return this.f;
   }

   public tl e() {
      return this.g;
   }
}
