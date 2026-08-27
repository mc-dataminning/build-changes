import java.util.List;
import javax.annotation.Nullable;

public class cus extends crx {
   protected static final ehy a = csk.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<gv> b = gv.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(gv::i).toList();

   protected cus(dex.d $$0) {
      super($$0);
   }

   public static boolean a(cpk $$0, gv $$1, gv $$2) {
      return $$0.a_($$1.a((ia)$$2)).a(apj.cn) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(apj.co);
   }

   @Override
   public boolean g_(dey $$0) {
      return true;
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return a;
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (gv $$4 : b) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               iw.t,
               (double)$$2.u() + 0.5,
               (double)$$2.v() + 2.0,
               (double)$$2.w() + 0.5,
               (double)((float)$$4.u() + $$3.i()) - 0.5,
               (double)((float)$$4.v() - $$3.i() - 1.0F),
               (double)((float)$$4.w() + $$3.i()) - 0.5
            );
         }
      }
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.c;
   }

   @Override
   public dck a(gv $$0, dey $$1) {
      return new ddd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dck> dcl<T> a(cpk $$0, dey $$1, dcm<T> $$2) {
      return $$0.B ? a($$2, dcm.m, ddd::a) : null;
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if ($$1.B) {
         return bgo.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bgo.b;
      }
   }

   @Nullable
   @Override
   public bgr b(dey $$0, cpk $$1, gv $$2) {
      dck $$3 = $$1.c_($$2);
      if ($$3 instanceof ddd) {
         te $$4 = ((bgs)$$3).H_();
         return new bgw(($$2x, $$3x, $$4x) -> new ceu($$2x, $$3x, cen.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, biw $$3, ciw $$4) {
      if ($$4.A()) {
         dck $$5 = $$0.c_($$1);
         if ($$5 instanceof ddd) {
            ((ddd)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }
}
