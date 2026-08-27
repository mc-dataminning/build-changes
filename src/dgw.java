import com.mojang.serialization.MapCodec;

public class dgw extends der {
   public static final MapCodec<dgw> i = b(dgw::new);

   @Override
   public MapCodec<? extends dgw> a() {
      return i;
   }

   protected dgw(dpx.d $$0) {
      super(1.0F, 1.0F, 16.0F, 16.0F, 16.0F, $$0);
      this.k(
         this.E
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
      );
   }

   @Override
   public dpy a(cvl $$0) {
      cza $$1 = $$0.q();
      im $$2 = $$0.a();
      elr $$3 = $$0.q().b_($$0.a());
      im $$4 = $$2.e();
      im $$5 = $$2.f();
      im $$6 = $$2.g();
      im $$7 = $$2.h();
      dpy $$8 = $$1.a_($$4);
      dpy $$9 = $$1.a_($$5);
      dpy $$10 = $$1.a_($$6);
      dpy $$11 = $$1.a_($$7);
      return this.n()
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ir.d))))
         .a(c, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ir.c))))
         .a(d, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ir.f))))
         .a(b, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ir.e))))
         .a(e, Boolean.valueOf($$3.a() == els.c));
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ety c(dpy $$0, cza $$1, im $$2, etk $$3) {
      return etv.a();
   }

   @Override
   protected boolean a(dpy $$0, dpy $$1, ir $$2) {
      if ($$1.a(this)) {
         if (!$$2.o().d()) {
            return true;
         }

         if ($$0.c(f.get($$2)) && $$1.c(f.get($$2.g()))) {
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   public final boolean a(dpy $$0, boolean $$1) {
      return !j($$0) && $$1 || $$0.b() instanceof dgw || $$0.a(avo.L);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
