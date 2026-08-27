import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class cvd extends cza implements cvi, dcf {
   public static final MapCodec<cvd> a = b(cvd::new);
   private static final die f = did.C;
   private static final int g = 6;
   protected static final eks b = cvf.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final eks c = cvf.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final eks d = cvf.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final eks e = cvf.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<cvd> a() {
      return a;
   }

   protected cvd(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, ib.c));
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      switch ((ib)$$0.c(aE)) {
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
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(f, aE);
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(f) ? ecy.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      hx $$3 = $$2.d();
      dhn $$4 = $$1.a_($$3);
      dhn $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(ark.bx)) && ($$5.a(this) || $$5.a(cvh.sD));
   }

   protected static boolean a(csg $$0, hx $$1, ecx $$2, ib $$3) {
      dhn $$4 = cvh.sE.o().a(f, Boolean.valueOf($$2.a(ecy.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if (($$1 == ib.a || $$1 == ib.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(csi $$0, hx $$1, dhn $$2) {
      Optional<hx> $$3 = l.a($$0, $$1, $$2.b(), ib.b, cvh.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         hx $$4 = $$3.get().c();
         dhn $$5 = $$0.a_($$4);
         return cvc.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(csf $$0, atw $$1, hx $$2, dhn $$3) {
      return true;
   }

   @Override
   public void a(ami $$0, atw $$1, hx $$2, dhn $$3) {
      Optional<hx> $$4 = l.a($$0, $$2, $$3.b(), ib.b, cvh.sD);
      if (!$$4.isEmpty()) {
         hx $$5 = $$4.get();
         hx $$6 = $$5.c();
         ib $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         cvc.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public clo a(csi $$0, hx $$1, dhn $$2) {
      return new clo(cvh.sD);
   }
}
