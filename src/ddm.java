import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddm(alh e, jp<cvt> f, xh g, boolean h) {
   public static final Codec<ddm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alh.a.fieldOf("asset_id").forGetter(ddm::a),
               ale.a(ly.K).fieldOf("template_item").forGetter(ddm::b),
               xj.a.fieldOf("description").forGetter(ddm::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(ddm::d)
            )
            .apply($$0, ddm::new)
   );
   public static final zf<ws, ddm> b = zf.a(alh.b, ddm::a, zd.b(ly.K), ddm::b, xj.b, ddm::c, zd.b, ddm::d, ddm::new);
   public static final Codec<jp<ddm>> c = ald.a(ly.aY, a);
   public static final zf<ws, jp<ddm>> d = zd.a(ly.aY, b);

   public xh a(jp<ddk> $$0) {
      return this.g.f().c($$0.a().e().a());
   }

   public alh a() {
      return this.e;
   }

   public jp<cvt> b() {
      return this.f;
   }

   public xh c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
