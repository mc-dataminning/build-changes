import java.util.Optional;
import javax.annotation.Nullable;

public abstract class etw extends eto {
   @Override
   public etp d() {
      return etr.b;
   }

   @Override
   public etp e() {
      return etr.c;
   }

   @Override
   public cxc a() {
      return cxk.rg;
   }

   @Override
   public void a(dgz $$0, jh $$1, etq $$2, bac $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awv.CR, aww.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(ls.an, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public lq h() {
      return ls.l;
   }

   @Override
   protected boolean a(arx $$0) {
      return $$0.O().b(dgv.V);
   }

   @Override
   protected void a(dha $$0, jh $$1, dxo $$2) {
      duq $$3 = $$2.x() ? $$0.c_($$1) : null;
      dkd.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dhc $$0) {
      return 4;
   }

   @Override
   public dxo b(etq $$0) {
      return dkf.J.m().b(dov.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(etp $$0) {
      return $$0 == etr.c || $$0 == etr.b;
   }

   @Override
   public int c(dhc $$0) {
      return 1;
   }

   @Override
   public int a(dhc $$0) {
      return 5;
   }

   @Override
   public boolean a(etq $$0, dge $$1, jh $$2, etp $$3, jm $$4) {
      return $$4 == jm.a && !$$3.a(axq.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<awu> j() {
      return Optional.of(awv.dj);
   }

   public static class a extends etw {
      @Override
      protected void a(dxp.a<etp, etq> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(etq $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(etq $$0) {
         return false;
      }
   }

   public static class b extends etw {
      @Override
      public int d(etq $$0) {
         return 8;
      }

      @Override
      public boolean c(etq $$0) {
         return true;
      }
   }
}
