import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;

public class dhi extends dfp {
   public static final MapCodec<dhi> a = b(dhi::new);
   public static final dqp b = dqo.w;
   protected static final int c = 6;
   protected static final int d = 6;
   protected static final int e = 8;
   protected static final ety f = dcv.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final ety g = dcv.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final ety h = dcv.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final ety i = dcv.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final ety j = dcv.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final ety k = dcv.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final ety l = dcv.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final ety m = dcv.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   @Override
   public MapCodec<dhi> a() {
      return a;
   }

   protected dhi(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ir.c).a(b, Boolean.valueOf(false)).a(K, dqj.b));
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      switch ((dqj)$$0.c(K)) {
         case a:
            switch ($$0.c(aE).o()) {
               case a:
                  return k;
               case c:
               default:
                  return j;
            }
         case b:
            switch ((ir)$$0.c(aE)) {
               case f:
                  return i;
               case e:
                  return h;
               case d:
                  return g;
               case c:
               default:
                  return f;
            }
         case c:
         default:
            switch ($$0.c(aE).o()) {
               case a:
                  return m;
               case c:
               default:
                  return l;
            }
      }
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if ($$1.B) {
         dpy $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }

         return boq.a;
      } else {
         dpy $$6 = this.d($$0, $$1, $$2);
         float $$7 = $$6.c(b) ? 0.6F : 0.5F;
         $$1.a(null, $$2, auz.nK, ava.e, 0.3F, $$7);
         $$1.a($$3, $$6.c(b) ? dur.a : dur.e, $$2);
         return boq.b;
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, czm $$3, BiConsumer<csd, im> $$4) {
      if ($$3.j() == czm.a.d && !$$1.x_()) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public dpy d(dpy $$0, czu $$1, im $$2) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      return $$0;
   }

   private static void a(dpy $$0, czv $$1, im $$2, float $$3) {
      ir $$4 = $$0.c(aE).g();
      ir $$5 = m($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new kq(kq.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dpy $$0, cza $$1, im $$2, ir $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dpy $$0, cza $$1, im $$2, ir $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dpy $$0) {
      return true;
   }

   private void e(dpy $$0, czu $$1, im $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(K, aE, b);
   }
}
