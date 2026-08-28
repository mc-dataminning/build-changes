import java.util.Optional;
import javax.annotation.Nullable;

public abstract class etv extends etn {
   @Override
   public eto d() {
      return etq.b;
   }

   @Override
   public eto e() {
      return etq.c;
   }

   @Override
   public cxg a() {
      return cxo.qX;
   }

   @Override
   public void a(dha $$0, jh $$1, etp $$2, bam $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, axf.CA, axg.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(ls.am, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public lq h() {
      return ls.l;
   }

   @Override
   protected boolean a(ash $$0) {
      return $$0.N().b(dgw.U);
   }

   @Override
   protected void a(dhb $$0, jh $$1, dxn $$2) {
      dup $$3 = $$2.x() ? $$0.c_($$1) : null;
      dke.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dhd $$0) {
      return 4;
   }

   @Override
   public dxn b(etp $$0) {
      return dkg.J.m().b(dow.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eto $$0) {
      return $$0 == etq.c || $$0 == etq.b;
   }

   @Override
   public int c(dhd $$0) {
      return 1;
   }

   @Override
   public int a(dhd $$0) {
      return 5;
   }

   @Override
   public boolean a(etp $$0, dgf $$1, jh $$2, eto $$3, jm $$4) {
      return $$4 == jm.a && !$$3.a(aya.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<axe> j() {
      return Optional.of(axf.di);
   }

   public static class a extends etv {
      @Override
      protected void a(dxo.a<eto, etp> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(etp $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(etp $$0) {
         return false;
      }
   }

   public static class b extends etv {
      @Override
      public int d(etp $$0) {
         return 8;
      }

      @Override
      public boolean c(etp $$0) {
         return true;
      }
   }
}
