import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dja extends diz {
   public static final MapCodec<dja> h = b(dja::new);
   public static final dqs i = dgr.aE;
   public static final dqp j = diz.d;

   @Override
   public MapCodec<dja> a() {
      return h;
   }

   protected dja(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, ir.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String g() {
      return this.p().a();
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return dlx.m($$0);
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      return dlx.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      return $$1.g() == $$0.c(i) && !$$0.a($$3, $$4) ? dcx.a.n() : $$0;
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      dpy $$1 = dcx.cq.a($$0);
      return $$1 == null ? null : this.n().a(i, $$1.c(i));
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      if ($$0.c(j)) {
         ir $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(kq.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(czu $$0, im $$1, dpy $$2) {
      ir $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dpy $$0, cza $$1, im $$2, ir $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(i, j);
   }
}
