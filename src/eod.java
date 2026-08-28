import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eod extends env {
   @Override
   public enw d() {
      return eny.b;
   }

   @Override
   public enw e() {
      return eny.c;
   }

   @Override
   public cum a() {
      return cuu.qz;
   }

   @Override
   public void a(dca $$0, iz $$1, enx $$2, azh $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awa.BY, awb.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(li.al, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public lg h() {
      return li.l;
   }

   @Override
   protected boolean a(dca $$0) {
      return $$0.ab().b(dbw.U);
   }

   @Override
   protected void a(dcb $$0, iz $$1, dse $$2) {
      dpj $$3 = $$2.t() ? $$0.c_($$1) : null;
      dfb.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dcd $$0) {
      return 4;
   }

   @Override
   public dse b(enx $$0) {
      return dfd.G.o().a(djr.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(enw $$0) {
      return $$0 == eny.c || $$0 == eny.b;
   }

   @Override
   public int c(dcd $$0) {
      return 1;
   }

   @Override
   public int a(dcd $$0) {
      return 5;
   }

   @Override
   public boolean a(enx $$0, dbg $$1, iz $$2, enw $$3, je $$4) {
      return $$4 == je.a && !$$3.a(awv.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<avz> j() {
      return Optional.of(awa.di);
   }

   public static class a extends eod {
      @Override
      protected void a(dsf.a<enw, enx> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(enx $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(enx $$0) {
         return false;
      }
   }

   public static class b extends eod {
      @Override
      public int d(enx $$0) {
         return 8;
      }

      @Override
      public boolean c(enx $$0) {
         return true;
      }
   }
}
