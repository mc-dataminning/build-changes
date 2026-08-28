import java.util.Optional;
import javax.annotation.Nullable;

public abstract class epe extends eow {
   @Override
   public eox d() {
      return eoz.b;
   }

   @Override
   public eox e() {
      return eoz.c;
   }

   @Override
   public cuj a() {
      return cur.qz;
   }

   @Override
   public void a(dcu $$0, jd $$1, eoy $$2, ayv $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avo.Cc, avp.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(lm.al, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public lk h() {
      return lm.l;
   }

   @Override
   protected boolean a(dcu $$0) {
      return $$0.ab().b(dcq.U);
   }

   @Override
   protected void a(dcv $$0, jd $$1, dta $$2) {
      dqf $$3 = $$2.t() ? $$0.c_($$1) : null;
      dfw.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dcx $$0) {
      return 4;
   }

   @Override
   public dta b(eoy $$0) {
      return dfy.G.o().a(dkm.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eox $$0) {
      return $$0 == eoz.c || $$0 == eoz.b;
   }

   @Override
   public int c(dcx $$0) {
      return 1;
   }

   @Override
   public int a(dcx $$0) {
      return 5;
   }

   @Override
   public boolean a(eoy $$0, dca $$1, jd $$2, eox $$3, ji $$4) {
      return $$4 == ji.a && !$$3.a(awj.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<avn> j() {
      return Optional.of(avo.di);
   }

   public static class a extends epe {
      @Override
      protected void a(dtb.a<eox, eoy> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eoy $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eoy $$0) {
         return false;
      }
   }

   public static class b extends epe {
      @Override
      public int d(eoy $$0) {
         return 8;
      }

      @Override
      public boolean c(eoy $$0) {
         return true;
      }
   }
}
