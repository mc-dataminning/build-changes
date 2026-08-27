import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eai extends eaa {
   @Override
   public eab d() {
      return ead.b;
   }

   @Override
   public eab e() {
      return ead.c;
   }

   @Override
   public cis a() {
      return cja.pL;
   }

   @Override
   public void a(cpl $$0, gu $$1, eac $$2, aru $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aow.zQ, aox.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
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
   protected boolean a(cpl $$0) {
      return $$0.X().b(cph.Q);
   }

   @Override
   protected void a(cpm $$0, gu $$1, dez $$2) {
      dcl $$3 = $$2.t() ? $$0.c_($$1) : null;
      csl.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(cpo $$0) {
      return 4;
   }

   @Override
   public dez b(eac $$0) {
      return csm.G.n().a(cwy.a, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eab $$0) {
      return $$0 == ead.c || $$0 == ead.b;
   }

   @Override
   public int c(cpo $$0) {
      return 1;
   }

   @Override
   public int a(cpo $$0) {
      return 5;
   }

   @Override
   public boolean a(eac $$0, cor $$1, gu $$2, eab $$3, ha $$4) {
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

   public static class a extends eai {
      @Override
      protected void a(dfa.a<eab, eac> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eac $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eac $$0) {
         return false;
      }
   }

   public static class b extends eai {
      @Override
      public int d(eac $$0) {
         return 8;
      }

      @Override
      public boolean c(eac $$0) {
         return true;
      }
   }
}
