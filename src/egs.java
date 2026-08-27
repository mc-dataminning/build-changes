import com.mojang.serialization.Codec;

public class egs extends egl {
   public static final Codec<egs> b = dtc.b.fieldOf("state").xmap(dtb.a::b, dfc::n).xmap(egs::new, $$0 -> $$0.c).codec();
   private final dfc c;

   public egs(dfc $$0) {
      this.c = $$0;
   }

   @Override
   protected egm<?> a() {
      return egm.f;
   }

   @Override
   public dtc a(ayt $$0, ir $$1) {
      iw.a $$2 = iw.a.a($$0);
      return this.c.n().a(dmc.i, $$2);
   }
}
