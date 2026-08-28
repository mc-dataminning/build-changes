import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfr(aku e, jr<cxd> f, wp g, boolean h) {
   public static final Codec<dfr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aku.a.fieldOf("asset_id").forGetter(dfr::a),
               cxd.e.fieldOf("template_item").forGetter(dfr::b),
               wr.a.fieldOf("description").forGetter(dfr::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(dfr::d)
            )
            .apply($$0, dfr::new)
   );
   public static final yn<wa, dfr> b = yn.a(aku.b, dfr::a, cxd.f, dfr::b, wr.b, dfr::c, yl.b, dfr::d, dfr::new);
   public static final Codec<jr<dfr>> c = akq.a(mc.bc, a);
   public static final yn<wa, jr<dfr>> d = yl.a(mc.bc, b);

   public wp a(jr<dfp> $$0) {
      return this.g.f().c($$0.a().d().a());
   }

   public aku a() {
      return this.e;
   }

   public jr<cxd> b() {
      return this.f;
   }

   public wp c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
