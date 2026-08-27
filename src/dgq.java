import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgq extends dch {
   public static final MapCodec<dgq> a = b(dgq::new);
   public static final dqs b = dqo.Q;
   public static final dqp c = dqo.f;
   private static final ety d = dcv.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final ety e = dcv.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final ety f = etv.a(e, d);
   private static final ety g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final ety h = etv.a(f, g, etj.e);
   private static final ety i = etv.a(h, dcv.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final ety j = etv.a(h, dcv.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final ety k = etv.a(h, dcv.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final ety l = etv.a(h, dcv.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final ety m = etv.a(h, dcv.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final ety n = g;
   private static final ety o = etv.a(g, dcv.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final ety F = etv.a(g, dcv.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final ety G = etv.a(g, dcv.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final ety H = etv.a(g, dcv.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<dgq> a() {
      return a;
   }

   public dgq(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ir.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      switch ((ir)$$0.c(b)) {
         case a:
            return i;
         case c:
            return k;
         case d:
            return l;
         case e:
            return m;
         case f:
            return j;
         default:
            return h;
      }
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2) {
      switch ((ir)$$0.c(b)) {
         case a:
            return n;
         case c:
            return F;
         case d:
            return G;
         case e:
            return H;
         case f:
            return o;
         default:
            return g;
      }
   }

   @Override
   public dpy a(cvl $$0) {
      ir $$1 = $$0.k().g();
      return this.n().a(b, $$1.o() == ir.a.b ? ir.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      return new doc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnd> dne<T> a(czu $$0, dpy $$1, dnf<T> $$2) {
      return $$0.B ? null : a($$2, dnf.r, doc::a);
   }

   @Override
   protected void b(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if ($$1.B) {
         return boq.a;
      } else {
         dnd $$5 = $$1.c_($$2);
         if ($$5 instanceof doc) {
            $$3.a((doc)$$5);
            $$3.a(avj.ad);
         }

         return boq.b;
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dcv $$3, im $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(czu $$0, im $$1, dpy $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      bom.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.c;
   }

   @Override
   protected boolean d_(dpy $$0) {
      return true;
   }

   @Override
   protected int a(dpy $$0, czu $$1, im $$2) {
      return cnh.a($$1.c_($$2));
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, bql $$3) {
      dnd $$4 = $$1.c_($$2);
      if ($$4 instanceof doc) {
         doc.a($$1, $$2, $$0, $$3, (doc)$$4);
      }
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }
}
