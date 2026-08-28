import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eud extends etv {
   @Override
   public etw d() {
      return ety.b;
   }

   @Override
   public etw e() {
      return ety.c;
   }

   @Override
   public cxl a() {
      return cxt.qX;
   }

   @Override
   public void a(dhi $$0, jh $$1, etx $$2, bam $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, axf.CB, axg.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(ls.am, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public lq h() {
      return ls.l;
   }

   @Override
   protected boolean a(ash $$0) {
      return $$0.N().b(dhe.V);
   }

   @Override
   protected void a(dhj $$0, jh $$1, dxv $$2) {
      dux $$3 = $$2.x() ? $$0.c_($$1) : null;
      dkm.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dhl $$0) {
      return 4;
   }

   @Override
   public dxv b(etx $$0) {
      return dko.J.m().b(dpe.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(etw $$0) {
      return $$0 == ety.c || $$0 == ety.b;
   }

   @Override
   public int c(dhl $$0) {
      return 1;
   }

   @Override
   public int a(dhl $$0) {
      return 5;
   }

   @Override
   public boolean a(etx $$0, dgn $$1, jh $$2, etw $$3, jm $$4) {
      return $$4 == jm.a && !$$3.a(aya.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<axe> j() {
      return Optional.of(axf.dj);
   }

   public static class a extends eud {
      @Override
      protected void a(dxw.a<etw, etx> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(etx $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(etx $$0) {
         return false;
      }
   }

   public static class b extends eud {
      @Override
      public int d(etx $$0) {
         return 8;
      }

      @Override
      public boolean c(etx $$0) {
         return true;
      }
   }
}
