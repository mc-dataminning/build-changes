import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgh(ald e, js<cxu> f, wv g, boolean h) {
   public static final Codec<dgh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ald.a.fieldOf("asset_id").forGetter(dgh::a),
               cxu.e.fieldOf("template_item").forGetter(dgh::b),
               wx.a.fieldOf("description").forGetter(dgh::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(dgh::d)
            )
            .apply($$0, dgh::new)
   );
   public static final yt<wg, dgh> b = yt.a(ald.b, dgh::a, cxu.f, dgh::b, wx.b, dgh::c, yr.b, dgh::d, dgh::new);
   public static final Codec<js<dgh>> c = akz.a(me.bh, a);
   public static final yt<wg, js<dgh>> d = yr.a(me.bh, b);

   public wv a(js<dgf> $$0) {
      return this.g.f().c($$0.a().d().a());
   }

   public ald a() {
      return this.e;
   }

   public js<cxu> b() {
      return this.f;
   }

   public wv c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
