import java.util.List;
import javax.annotation.Nullable;

public class cvd extends csi {
   protected static final eig a = csv.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<gw> b = gw.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(gw::i).toList();

   protected cvd(dfi.d $$0) {
      super($$0);
   }

   public static boolean a(cpv $$0, gw $$1, gw $$2) {
      return $$0.a_($$1.a((ib)$$2)).a(apt.cn) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(apt.co);
   }

   @Override
   public boolean g_(dfj $$0) {
      return true;
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return a;
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, asc $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (gw $$4 : b) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               ix.t,
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
   public cza b_(dfj $$0) {
      return cza.c;
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new ddo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcv> dcw<T> a(cpv $$0, dfj $$1, dcx<T> $$2) {
      return $$0.B ? a($$2, dcx.m, ddo::a) : null;
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if ($$1.B) {
         return bgy.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bgy.b;
      }
   }

   @Nullable
   @Override
   public bhb b(dfj $$0, cpv $$1, gw $$2) {
      dcv $$3 = $$1.c_($$2);
      if ($$3 instanceof ddo) {
         tm $$4 = ((bhc)$$3).N_();
         return new bhg(($$2x, $$3x, $$4x) -> new cfd($$2x, $$3x, cew.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, bjg $$3, cjf $$4) {
      if ($$4.A()) {
         dcv $$5 = $$0.c_($$1);
         if ($$5 instanceof ddo) {
            ((ddo)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }
}
