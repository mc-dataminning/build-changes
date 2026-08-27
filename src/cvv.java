import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cvv(akm e, ix<ctj> f, wx g, boolean h) {
   public static final Codec<cvv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akm.a.fieldOf("asset_id").forGetter(cvv::a),
               akj.a(lf.G).fieldOf("template_item").forGetter(cvv::b),
               wz.a.fieldOf("description").forGetter(cvv::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(cvv::d)
            )
            .apply($$0, cvv::new)
   );
   public static final yv<wi, cvv> b = yv.a(akm.b, cvv::a, yt.b(lf.G), cvv::b, wz.b, cvv::c, yt.b, cvv::d, cvv::new);
   public static final Codec<ix<cvv>> c = aki.a(lf.aP, a);
   public static final yv<wi, ix<cvv>> d = yt.a(lf.aP, b);

   public wx a(ix<cvt> $$0) {
      return this.g.f().c($$0.a().e().a());
   }

   public akm a() {
      return this.e;
   }

   public ix<ctj> b() {
      return this.f;
   }

   public wx c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
