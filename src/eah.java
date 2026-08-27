import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eah extends dzz {
   @Override
   public eaa d() {
      return eac.b;
   }

   @Override
   public eaa e() {
      return eac.c;
   }

   @Override
   public cir a() {
      return ciz.pL;
   }

   @Override
   public void a(cpk $$0, gv $$1, eab $$2, art $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aou.zL, aov.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(iw.af, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public iu h() {
      return iw.m;
   }

   @Override
   protected boolean a(cpk $$0) {
      return $$0.X().b(cpg.Q);
   }

   @Override
   protected void a(cpl $$0, gv $$1, dey $$2) {
      dck $$3 = $$2.t() ? $$0.c_($$1) : null;
      csk.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(cpn $$0) {
      return 4;
   }

   @Override
   public dey b(eab $$0) {
      return csl.G.n().a(cwx.a, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eaa $$0) {
      return $$0 == eac.c || $$0 == eac.b;
   }

   @Override
   public int c(cpn $$0) {
      return 1;
   }

   @Override
   public int a(cpn $$0) {
      return 5;
   }

   @Override
   public boolean a(eab $$0, coq $$1, gv $$2, eaa $$3, hb $$4) {
      return $$4 == hb.a && !$$3.a(apo.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<aot> j() {
      return Optional.of(aou.cB);
   }

   public static class a extends eah {
      @Override
      protected void a(dez.a<eaa, eab> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eab $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eab $$0) {
         return false;
      }
   }

   public static class b extends eah {
      @Override
      public int d(eab $$0) {
         return 8;
      }

      @Override
      public boolean c(eab $$0) {
         return true;
      }
   }
}
