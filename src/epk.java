import java.util.Optional;
import javax.annotation.Nullable;

public abstract class epk extends epc {
   @Override
   public epd d() {
      return epf.b;
   }

   @Override
   public epd e() {
      return epf.c;
   }

   @Override
   public cuc a() {
      return cuk.rW;
   }

   @Override
   public void a(dca $$0, ir $$1, epe $$2, ayt $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avo.Cw, avq.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(lb.aj, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public kz h() {
      return lb.l;
   }

   @Override
   protected boolean a(dca $$0) {
      return $$0.ab().b(dbw.V);
   }

   @Override
   protected void a(dcb $$0, ir $$1, dtc $$2) {
      dqc $$3 = $$2.t() ? $$0.c_($$1) : null;
      dfc.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dcd $$0) {
      return 4;
   }

   @Override
   public dtc b(epe $$0) {
      return dfe.al.n().a(djw.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(epd $$0) {
      return $$0 == epf.c || $$0 == epf.b;
   }

   @Override
   public int c(dcd $$0) {
      return 1;
   }

   @Override
   public int a(dcd $$0) {
      return 5;
   }

   @Override
   public boolean a(epe $$0, dbg $$1, ir $$2, epd $$3, iw $$4) {
      return $$4 == iw.a && !$$3.a(awj.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<avn> j() {
      return Optional.of(avo.dn);
   }

   public static class a extends epk {
      @Override
      protected void a(dtd.a<epd, epe> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(epe $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(epe $$0) {
         return false;
      }
   }

   public static class b extends epk {
      @Override
      public int d(epe $$0) {
         return 8;
      }

      @Override
      public boolean c(epe $$0) {
         return true;
      }
   }
}
