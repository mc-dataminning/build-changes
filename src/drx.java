import com.mojang.serialization.Codec;

public class drx extends drq {
   public static final Codec<drx> b = dey.b.fieldOf("state").xmap(dex.a::b, csk::n).xmap(drx::new, $$0 -> $$0.c).codec();
   private final csk c;

   public drx(csk $$0) {
      this.c = $$0;
   }

   @Override
   protected drr<?> a() {
      return drr.f;
   }

   @Override
   public dey a(art $$0, gv $$1) {
      hb.a $$2 = hb.a.a($$0);
      return this.c.n().a(cyv.g, $$2);
   }
}
