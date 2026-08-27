import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddi extends djo {
   public static final MapCodec<ddi> a = b(ddi::new);
   public static final dqs b = dqo.R;

   @Override
   public MapCodec<ddi> a() {
      return a;
   }

   public ddi(dpx.d $$0) {
      super($$0);
      this.k(this.n().a(b, ir.c));
   }

   @Nullable
   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dni($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnd> dne<T> a(czu $$0, dpy $$1, dnf<T> $$2) {
      return !$$0.B ? a($$2, dnf.J, ($$0x, $$1x, $$2x, $$3) -> dva.c.a($$0x, $$3.gr(), $$3.gs())) : null;
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(dpy $$0, cza $$1, im $$2, ir $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dpy a(dpy $$0, dji $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
