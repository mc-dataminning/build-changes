import java.util.Optional;
import javax.annotation.Nullable;

public abstract class etg extends esy {
   @Override
   public esz d() {
      return etb.b;
   }

   @Override
   public esz e() {
      return etb.c;
   }

   @Override
   public cwm a() {
      return cwu.rg;
   }

   @Override
   public void a(dgj $$0, ji $$1, eta $$2, azh $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awa.CQ, awb.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(lt.an, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public lr h() {
      return lt.l;
   }

   @Override
   protected boolean a(ard $$0) {
      return $$0.O().b(dgf.V);
   }

   @Override
   protected void a(dgk $$0, ji $$1, dwy $$2) {
      dua $$3 = $$2.x() ? $$0.c_($$1) : null;
      djn.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dgm $$0) {
      return 4;
   }

   @Override
   public dwy b(eta $$0) {
      return djp.J.m().b(dof.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(esz $$0) {
      return $$0 == etb.c || $$0 == etb.b;
   }

   @Override
   public int c(dgm $$0) {
      return 1;
   }

   @Override
   public int a(dgm $$0) {
      return 5;
   }

   @Override
   public boolean a(eta $$0, dfo $$1, ji $$2, esz $$3, jn $$4) {
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

   public static class a extends etg {
      @Override
      protected void a(dwz.a<esz, eta> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eta $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eta $$0) {
         return false;
      }
   }

   public static class b extends etg {
      @Override
      public int d(eta $$0) {
         return 8;
      }

      @Override
      public boolean c(eta $$0) {
         return true;
      }
   }
}
