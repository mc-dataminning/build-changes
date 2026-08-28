import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ete extends esw {
   @Override
   public esx d() {
      return esz.b;
   }

   @Override
   public esx e() {
      return esz.c;
   }

   @Override
   public cwk a() {
      return cws.rg;
   }

   @Override
   public void a(dgh $$0, ji $$1, esy $$2, azh $$3) {
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
      return $$0.O().b(dgd.V);
   }

   @Override
   protected void a(dgi $$0, ji $$1, dww $$2) {
      dty $$3 = $$2.x() ? $$0.c_($$1) : null;
      djl.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dgk $$0) {
      return 4;
   }

   @Override
   public dww b(esy $$0) {
      return djn.J.m().b(dod.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(esx $$0) {
      return $$0 == esz.c || $$0 == esz.b;
   }

   @Override
   public int c(dgk $$0) {
      return 1;
   }

   @Override
   public int a(dgk $$0) {
      return 5;
   }

   @Override
   public boolean a(esy $$0, dfm $$1, ji $$2, esx $$3, jn $$4) {
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

   public static class a extends ete {
      @Override
      protected void a(dwx.a<esx, esy> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(esy $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(esy $$0) {
         return false;
      }
   }

   public static class b extends ete {
      @Override
      public int d(esy $$0) {
         return 8;
      }

      @Override
      public boolean c(esy $$0) {
         return true;
      }
   }
}
