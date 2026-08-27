import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhw extends czf {
   public static final MapCodec<dhw> a = b(dhw::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final epo g = czf.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final epo h = czf.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dne e = dmu.aE;
   public static final dne f = dmu.aD;

   @Override
   public MapCodec<dhw> a() {
      return a;
   }

   public dhw(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(f, Integer.valueOf(1)));
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, bof $$3) {
      if (!$$3.bQ()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cwe $$0, dme $$1, ib $$2, bof $$3, float $$4) {
      if (!($$3 instanceof cfz)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(cwe $$0, dme $$1, ib $$2, bof $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(czh.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(cwe $$0, ib $$1, dme $$2) {
      $$0.a(null, $$1, atp.zB, atq.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.a(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(dqr.f, $$1, dqr.a.a($$2));
         $$0.c(2001, $$1, czf.i($$2));
      }
   }

   @Override
   protected void b(dme $$0, apa $$1, ib $$2, awt $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, atp.zC, atq.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.a(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(dqr.c, $$2, dqr.a.a($$0));
         } else {
            $$1.a(null, $$2, atp.zD, atq.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(dqr.f, $$2, dqr.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, czf.i($$0));
               cbn $$6 = bol.bf.a((cwe)$$1);
               if ($$6 != null) {
                  $$6.c_(-24000);
                  $$6.i($$2);
                  $$6.b((double)$$2.u() + 0.3 + (double)$$5 * 0.2, (double)$$2.v(), (double)$$2.w() + 0.3, 0.0F, 0.0F);
                  $$1.b($$6);
               }
            }
         }
      }
   }

   public static boolean a(cvk $$0, ib $$1) {
      return b($$0, $$1.d());
   }

   public static boolean b(cvk $$0, ib $$1) {
      return $$0.a_($$1).a(aue.H);
   }

   @Override
   protected void b(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(cwe $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(cwe $$0, cia $$1, ib $$2, dme $$3, @Nullable djl $$4, cpq $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(dme $$0, crx $$1) {
      return !$$1.h() && $$1.n().a(this.l()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      dme $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(e, f);
   }

   private boolean a(cwe $$0, bof $$1) {
      if ($$1 instanceof cbn || $$1 instanceof cah) {
         return false;
      } else {
         return !($$1 instanceof box) ? false : $$1 instanceof cia || $$0.Z().b(cwa.c);
      }
   }
}
