import com.mojang.serialization.MapCodec;

public class dft extends der {
   public static final MapCodec<dft> i = b(dft::new);
   private final ety[] j;

   @Override
   public MapCodec<dft> a() {
      return i;
   }

   public dft(dpx.d $$0) {
      super(2.0F, 2.0F, 16.0F, 16.0F, 24.0F, $$0);
      this.k(
         this.E
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
      );
      this.j = this.a(2.0F, 1.0F, 16.0F, 6.0F, 15.0F);
   }

   @Override
   protected ety f(dpy $$0, cza $$1, im $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   protected ety c(dpy $$0, cza $$1, im $$2, etk $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }

   public boolean a(dpy $$0, boolean $$1, ir $$2) {
      dcv $$3 = $$0.b();
      boolean $$4 = this.m($$0);
      boolean $$5 = $$3 instanceof dfu && dfu.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean m(dpy $$0) {
      return $$0.a(avo.S) && $$0.a(avo.k) == this.n().a(avo.k);
   }

   @Override
   protected bos a(csd $$0, dpy $$1, czu $$2, im $$3, ckl $$4, bop $$5, etb $$6) {
      if ($$2.B) {
         return $$0.a(csg.uK) ? bos.a : bos.e;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      return !$$1.x_() ? csi.a($$3, $$1, $$2) : boq.d;
   }

   @Override
   public dpy a(cvl $$0) {
      cza $$1 = $$0.q();
      im $$2 = $$0.a();
      elr $$3 = $$0.q().b_($$0.a());
      im $$4 = $$2.e();
      im $$5 = $$2.h();
      im $$6 = $$2.f();
      im $$7 = $$2.g();
      dpy $$8 = $$1.a_($$4);
      dpy $$9 = $$1.a_($$5);
      dpy $$10 = $$1.a_($$6);
      dpy $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ir.d), ir.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ir.e), ir.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ir.c), ir.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ir.f), ir.f)))
         .a(e, Boolean.valueOf($$3.a() == els.c));
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      return $$1.o().e() == ir.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
