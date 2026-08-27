import com.mojang.serialization.Codec;

public class edg extends ecz {
   public static final Codec<edg> b = dpy.b.fieldOf("state").xmap(dpx.a::b, dcv::n).xmap(edg::new, $$0 -> $$0.c).codec();
   private final dcv c;

   public edg(dcv $$0) {
      this.c = $$0;
   }

   @Override
   protected eda<?> a() {
      return eda.f;
   }

   @Override
   public dpy a(ayd $$0, im $$1) {
      ir.a $$2 = ir.a.a($$0);
      return this.c.n().a(djh.i, $$2);
   }
}
