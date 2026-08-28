import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfq(alp e, jq<cxc> f, xk g, boolean h) {
   public static final Codec<dfq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alp.a.fieldOf("asset_id").forGetter(dfq::a),
               cxc.e.fieldOf("template_item").forGetter(dfq::b),
               xm.a.fieldOf("description").forGetter(dfq::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(dfq::d)
            )
            .apply($$0, dfq::new)
   );
   public static final zi<wv, dfq> b = zi.a(alp.b, dfq::a, zg.b(mb.K), dfq::b, xm.b, dfq::c, zg.b, dfq::d, dfq::new);
   public static final Codec<jq<dfq>> c = all.a(mb.ba, a);
   public static final zi<wv, jq<dfq>> d = zg.a(mb.ba, b);

   public xk a(jq<dfo> $$0) {
      return this.g.f().c($$0.a().e().a());
   }

   public alp a() {
      return this.e;
   }

   public jq<cxc> b() {
      return this.f;
   }

   public xk c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
