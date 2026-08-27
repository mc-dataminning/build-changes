import java.util.Optional;
import javax.annotation.Nullable;

public abstract class edd extends ecv {
   @Override
   public ecw d() {
      return ecy.b;
   }

   @Override
   public ecw e() {
      return ecy.c;
   }

   @Override
   public clj a() {
      return clr.qw;
   }

   @Override
   public void a(csf $$0, hx $$1, ecx $$2, atw $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aqv.Aw, aqw.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(jw.ag, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public ju h() {
      return jw.m;
   }

   @Override
   protected boolean a(csf $$0) {
      return $$0.Y().b(csb.U);
   }

   @Override
   protected void a(csg $$0, hx $$1, dhn $$2) {
      dfi $$3 = $$2.t() ? $$0.c_($$1) : null;
      cvf.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(csi $$0) {
      return 4;
   }

   @Override
   public dhn b(ecx $$0) {
      return cvh.G.o().a(czu.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ecw $$0) {
      return $$0 == ecy.c || $$0 == ecy.b;
   }

   @Override
   public int c(csi $$0) {
      return 1;
   }

   @Override
   public int a(csi $$0) {
      return 5;
   }

   @Override
   public boolean a(ecx $$0, crl $$1, hx $$2, ecw $$3, ib $$4) {
      return $$4 == ib.a && !$$3.a(arp.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<aqu> j() {
      return Optional.of(aqv.cB);
   }

   public static class a extends edd {
      @Override
      protected void a(dho.a<ecw, ecx> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(ecx $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(ecx $$0) {
         return false;
      }
   }

   public static class b extends edd {
      @Override
      public int d(ecx $$0) {
         return 8;
      }

      @Override
      public boolean c(ecx $$0) {
         return true;
      }
   }
}
