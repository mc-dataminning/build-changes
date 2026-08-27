import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eau extends eam {
   @Override
   public ean d() {
      return eap.b;
   }

   @Override
   public ean e() {
      return eap.c;
   }

   @Override
   public cjc a() {
      return cjk.pL;
   }

   @Override
   public void a(cpx $$0, gw $$1, eao $$2, ase $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, apf.zQ, apg.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(ix.af, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public iv h() {
      return ix.m;
   }

   @Override
   protected boolean a(cpx $$0) {
      return $$0.X().b(cpt.Q);
   }

   @Override
   protected void a(cpy $$0, gw $$1, dfl $$2) {
      dcx $$3 = $$2.t() ? $$0.c_($$1) : null;
      csx.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(cqa $$0) {
      return 4;
   }

   @Override
   public dfl b(eao $$0) {
      return csy.G.n().a(cxk.a, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ean $$0) {
      return $$0 == eap.c || $$0 == eap.b;
   }

   @Override
   public int c(cqa $$0) {
      return 1;
   }

   @Override
   public int a(cqa $$0) {
      return 5;
   }

   @Override
   public boolean a(eao $$0, cpd $$1, gw $$2, ean $$3, hc $$4) {
      return $$4 == hc.a && !$$3.a(apz.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<ape> j() {
      return Optional.of(apf.cB);
   }

   public static class a extends eau {
      @Override
      protected void a(dfm.a<ean, eao> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eao $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eao $$0) {
         return false;
      }
   }

   public static class b extends eau {
      @Override
      public int d(eao $$0) {
         return 8;
      }

      @Override
      public boolean c(eao $$0) {
         return true;
      }
   }
}
