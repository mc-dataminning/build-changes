import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ewu extends ewm {
   @Override
   public ewn d() {
      return ewp.b;
   }

   @Override
   public ewn e() {
      return ewp.c;
   }

   @Override
   public cyz a() {
      return czh.rp;
   }

   @Override
   public void a(dja $$0, iu $$1, ewo $$2, azv $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awn.Dg, awo.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(lx.ao, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public lv h() {
      return lx.l;
   }

   @Override
   protected boolean a(arq $$0) {
      return $$0.O().c(diw.W);
   }

   @Override
   protected void a(djb $$0, iu $$1, eah $$2) {
      dxf $$3 = $$2.x() ? $$0.c_($$1) : null;
      dmf.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(djd $$0) {
      return 4;
   }

   @Override
   public eah b(ewo $$0) {
      return dmh.J.m().b(drb.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ewn $$0) {
      return $$0 == ewp.c || $$0 == ewp.b;
   }

   @Override
   public int c(djd $$0) {
      return 1;
   }

   @Override
   public int a(djd $$0) {
      return 5;
   }

   @Override
   public boolean a(ewo $$0, dig $$1, iu $$2, ewn $$3, ja $$4) {
      return $$4 == ja.a && !$$3.a(axh.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<awm> j() {
      return Optional.of(awn.dj);
   }

   public static class a extends ewu {
      @Override
      protected void a(eai.a<ewn, ewo> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(ewo $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(ewo $$0) {
         return false;
      }
   }

   public static class b extends ewu {
      @Override
      public int d(ewo $$0) {
         return 8;
      }

      @Override
      public boolean c(ewo $$0) {
         return true;
      }
   }
}
