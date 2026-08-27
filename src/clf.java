import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record clf(aeu c, hg<civ> d, ti e, boolean f) {
   public static final Codec<clf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aeu.a.fieldOf("asset_id").forGetter(clf::a),
               aer.a(je.D).fieldOf("template_item").forGetter(clf::b),
               arb.b.fieldOf("description").forGetter(clf::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(clf::d)
            )
            .apply($$0, clf::new)
   );
   public static final Codec<hg<clf>> b = aeq.a(je.aE, a);

   public ti a(hg<cld> $$0) {
      return this.e.e().c($$0.a().e().a());
   }

   public aeu a() {
      return this.c;
   }

   public hg<civ> b() {
      return this.d;
   }

   public ti c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }
}
