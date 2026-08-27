import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cvx(akn e, ix<ctl> f, wx g, boolean h) {
   public static final Codec<cvx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akn.a.fieldOf("asset_id").forGetter(cvx::a),
               akk.a(lf.G).fieldOf("template_item").forGetter(cvx::b),
               wz.a.fieldOf("description").forGetter(cvx::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(cvx::d)
            )
            .apply($$0, cvx::new)
   );
   public static final yv<wi, cvx> b = yv.a(akn.b, cvx::a, yt.b(lf.G), cvx::b, wz.b, cvx::c, yt.b, cvx::d, cvx::new);
   public static final Codec<ix<cvx>> c = akj.a(lf.aP, a);
   public static final yv<wi, ix<cvx>> d = yt.a(lf.aP, b);

   public wx a(ix<cvv> $$0) {
      return this.g.f().c($$0.a().e().a());
   }

   public akn a() {
      return this.e;
   }

   public ix<ctl> b() {
      return this.f;
   }

   public wx c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
