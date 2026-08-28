import java.util.Optional;
import javax.annotation.Nullable;

public abstract class euc extends etu {
   @Override
   public etv d() {
      return etx.b;
   }

   @Override
   public etv e() {
      return etx.c;
   }

   @Override
   public cxd a() {
      return cxl.ri;
   }

   @Override
   public void a(dgz $$0, ji $$1, etw $$2, azh $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awa.Da, awb.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(lt.ao, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public lr h() {
      return lt.l;
   }

   @Override
   protected boolean a(ard $$0) {
      return $$0.O().b(dgv.V);
   }

   @Override
   protected void a(dha $$0, ji $$1, dxq $$2) {
      dus $$3 = $$2.x() ? $$0.c_($$1) : null;
      dke.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dhc $$0) {
      return 4;
   }

   @Override
   public dxq b(etw $$0) {
      return dkg.J.m().b(doy.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(etv $$0) {
      return $$0 == etx.c || $$0 == etx.b;
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
   public boolean a(etw $$0, dgf $$1, ji $$2, etv $$3, jn $$4) {
      return $$4 == jn.a && !$$3.a(awv.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<avz> j() {
      return Optional.of(awa.dj);
   }

   public static class a extends euc {
      @Override
      protected void a(dxr.a<etv, etw> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(etw $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(etw $$0) {
         return false;
      }
   }

   public static class b extends euc {
      @Override
      public int d(etw $$0) {
         return 8;
      }

      @Override
      public boolean c(etw $$0) {
         return true;
      }
   }
}
