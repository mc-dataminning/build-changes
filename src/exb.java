import java.util.Optional;
import javax.annotation.Nullable;

public abstract class exb extends ewt {
   @Override
   public ewu d() {
      return eww.b;
   }

   @Override
   public ewu e() {
      return eww.c;
   }

   @Override
   public czg a() {
      return czo.rp;
   }

   @Override
   public void a(djh $$0, iv $$1, ewv $$2, azv $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awn.Dg, awo.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(ly.ao, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public lw h() {
      return ly.l;
   }

   @Override
   protected boolean a(arq $$0) {
      return $$0.O().c(djd.W);
   }

   @Override
   protected void a(dji $$0, iv $$1, eao $$2) {
      dxm $$3 = $$2.x() ? $$0.c_($$1) : null;
      dmm.a($$2, $$0, $$1, $$3);
   }

   @Override
   protected void a(djh $$0, iv $$1, bwi $$2, bxb $$3) {
      $$3.a(bxc.d);
   }

   @Override
   public int b(djk $$0) {
      return 4;
   }

   @Override
   public eao b(ewv $$0) {
      return dmo.J.m().b(dri.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ewu $$0) {
      return $$0 == eww.c || $$0 == eww.b;
   }

   @Override
   public int c(djk $$0) {
      return 1;
   }

   @Override
   public int a(djk $$0) {
      return 5;
   }

   @Override
   public boolean a(ewv $$0, din $$1, iv $$2, ewu $$3, jb $$4) {
      return $$4 == jb.a && !$$3.a(axh.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<awm> j() {
      return Optional.of(awn.dj);
   }

   public static class a extends exb {
      @Override
      protected void a(eap.a<ewu, ewv> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(ewv $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(ewv $$0) {
         return false;
      }
   }

   public static class b extends exb {
      @Override
      public int d(ewv $$0) {
         return 8;
      }

      @Override
      public boolean c(ewv $$0) {
         return true;
      }
   }
}
