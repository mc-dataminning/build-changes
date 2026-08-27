import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ean extends eaf {
   @Override
   public eag d() {
      return eai.b;
   }

   @Override
   public eag e() {
      return eai.c;
   }

   @Override
   public civ a() {
      return cjd.pL;
   }

   @Override
   public void a(cpq $$0, gw $$1, eah $$2, arx $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aoz.zQ, apa.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
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
   protected boolean a(cpq $$0) {
      return $$0.X().b(cpm.Q);
   }

   @Override
   protected void a(cpr $$0, gw $$1, dfe $$2) {
      dcq $$3 = $$2.t() ? $$0.c_($$1) : null;
      csq.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(cpt $$0) {
      return 4;
   }

   @Override
   public dfe b(eah $$0) {
      return csr.G.n().a(cxd.a, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eag $$0) {
      return $$0 == eai.c || $$0 == eai.b;
   }

   @Override
   public int c(cpt $$0) {
      return 1;
   }

   @Override
   public int a(cpt $$0) {
      return 5;
   }

   @Override
   public boolean a(eah $$0, cow $$1, gw $$2, eag $$3, hc $$4) {
      return $$4 == hc.a && !$$3.a(apt.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<aoy> j() {
      return Optional.of(aoz.cB);
   }

   public static class a extends ean {
      @Override
      protected void a(dff.a<eag, eah> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eah $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eah $$0) {
         return false;
      }
   }

   public static class b extends ean {
      @Override
      public int d(eah $$0) {
         return 8;
      }

      @Override
      public boolean c(eah $$0) {
         return true;
      }
   }
}
