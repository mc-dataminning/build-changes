import com.mojang.serialization.MapCodec;

public class djc extends dex {
   public static final MapCodec<djc> a = b(djc::new);
   public static final dqp b = dqo.s;
   public static final dqy e = dqo.aA;

   @Override
   public MapCodec<djc> a() {
      return a;
   }

   protected djc(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ir.c).a(e, Integer.valueOf(1)).a(b, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if (!$$3.gb().e) {
         return boq.d;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return boq.a($$1.B);
      }
   }

   @Override
   protected int g(dpy $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public dpy a(cvl $$0) {
      dpy $$1 = super.a($$0);
      return $$1.a(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$1 == ir.a && !this.b($$3, $$5, $$2)) {
         return dcx.a.n();
      } else {
         return !$$3.x_() && $$1.o() != $$0.c(aE).o() ? $$0.a(b, Boolean.valueOf(this.c($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean c(czx $$0, im $$1, dpy $$2) {
      return this.a((dak)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      if ($$0.c(d)) {
         ir $$4 = $$0.c(aE);
         double $$5 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.v() + 0.4 + ($$3.j() - 0.5) * 0.2;
         double $$7 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         float $$8 = -5.0F;
         if ($$3.h()) {
            $$8 = (float)($$0.c(e) * 2 - 1);
         }

         $$8 /= 16.0F;
         double $$9 = (double)($$8 * (float)$$4.j());
         double $$10 = (double)($$8 * (float)$$4.l());
         $$1.a(kq.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(aE, e, b, d);
   }
}
