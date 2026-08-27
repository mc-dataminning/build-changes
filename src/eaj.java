import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eaj extends eab {
   @Override
   public eac d() {
      return eae.b;
   }

   @Override
   public eac e() {
      return eae.c;
   }

   @Override
   public cit a() {
      return cjb.pL;
   }

   @Override
   public void a(cpm $$0, gu $$1, ead $$2, aru $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aow.zL, aox.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(iv.af, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public it h() {
      return iv.m;
   }

   @Override
   protected boolean a(cpm $$0) {
      return $$0.X().b(cpi.Q);
   }

   @Override
   protected void a(cpn $$0, gu $$1, dfa $$2) {
      dcm $$3 = $$2.t() ? $$0.c_($$1) : null;
      csm.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(cpp $$0) {
      return 4;
   }

   @Override
   public dfa b(ead $$0) {
      return csn.G.n().a(cwz.a, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eac $$0) {
      return $$0 == eae.c || $$0 == eae.b;
   }

   @Override
   public int c(cpp $$0) {
      return 1;
   }

   @Override
   public int a(cpp $$0) {
      return 5;
   }

   @Override
   public boolean a(ead $$0, cos $$1, gu $$2, eac $$3, ha $$4) {
      return $$4 == ha.a && !$$3.a(apq.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<aov> j() {
      return Optional.of(aow.cB);
   }

   public static class a extends eaj {
      @Override
      protected void a(dfb.a<eac, ead> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(ead $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(ead $$0) {
         return false;
      }
   }

   public static class b extends eaj {
      @Override
      public int d(ead $$0) {
         return 8;
      }

      @Override
      public boolean c(ead $$0) {
         return true;
      }
   }
}
