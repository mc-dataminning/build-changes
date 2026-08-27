import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class dct extends dgr implements dcy, djw {
   public static final MapCodec<dct> a = b(dct::new);
   private static final dqp f = dqo.C;
   private static final int g = 6;
   protected static final ety b = dcv.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final ety c = dcv.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final ety d = dcv.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final ety e = dcv.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<dct> a() {
      return a;
   }

   protected dct(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, ir.c));
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      switch ((ir)$$0.c(aE)) {
         case d:
            return c;
         case c:
         default:
            return b;
         case e:
            return e;
         case f:
            return d;
      }
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(f, aE);
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(f) ? els.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      im $$3 = $$2.d();
      dpy $$4 = $$1.a_($$3);
      dpy $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(avo.by)) && ($$5.a(this) || $$5.a(dcx.sD));
   }

   protected static boolean a(czv $$0, im $$1, elr $$2, ir $$3) {
      dpy $$4 = dcx.sE.n().a(f, Boolean.valueOf($$2.a(els.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if (($$1 == ir.a || $$1 == ir.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(czx $$0, im $$1, dpy $$2) {
      Optional<im> $$3 = l.a($$0, $$1, $$2.b(), ir.b, dcx.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         im $$4 = $$3.get().c();
         dpy $$5 = $$0.a_($$4);
         return dcs.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(czu $$0, ayd $$1, im $$2, dpy $$3) {
      return true;
   }

   @Override
   public void a(aqe $$0, ayd $$1, im $$2, dpy $$3) {
      Optional<im> $$4 = l.a($$0, $$2, $$3.b(), ir.b, dcx.sD);
      if (!$$4.isEmpty()) {
         im $$5 = $$4.get();
         im $$6 = $$5.c();
         ir $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         dcs.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public csd a(czx $$0, im $$1, dpy $$2) {
      return new csd(dcx.sD);
   }
}
