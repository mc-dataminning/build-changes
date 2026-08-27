import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eas extends eak {
   @Override
   public eal d() {
      return ean.b;
   }

   @Override
   public eal e() {
      return ean.c;
   }

   @Override
   public cja a() {
      return cji.pL;
   }

   @Override
   public void a(cpv $$0, gw $$1, eam $$2, asc $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, ape.zQ, apf.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
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
   protected boolean a(cpv $$0) {
      return $$0.X().b(cpr.Q);
   }

   @Override
   protected void a(cpw $$0, gw $$1, dfj $$2) {
      dcv $$3 = $$2.t() ? $$0.c_($$1) : null;
      csv.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(cpy $$0) {
      return 4;
   }

   @Override
   public dfj b(eam $$0) {
      return csw.G.n().a(cxi.a, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eal $$0) {
      return $$0 == ean.c || $$0 == ean.b;
   }

   @Override
   public int c(cpy $$0) {
      return 1;
   }

   @Override
   public int a(cpy $$0) {
      return 5;
   }

   @Override
   public boolean a(eam $$0, cpb $$1, gw $$2, eal $$3, hc $$4) {
      return $$4 == hc.a && !$$3.a(apy.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<apd> j() {
      return Optional.of(ape.cB);
   }

   public static class a extends eas {
      @Override
      protected void a(dfk.a<eal, eam> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eam $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eam $$0) {
         return false;
      }
   }

   public static class b extends eas {
      @Override
      public int d(eam $$0) {
         return 8;
      }

      @Override
      public boolean c(eam $$0) {
         return true;
      }
   }
}
