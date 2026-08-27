import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dit extends dac {
   public static final MapCodec<dit> a = b(dit::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final eqm g = dac.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final eqm h = dac.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dob e = dnr.aE;
   public static final dob f = dnr.aD;

   @Override
   public MapCodec<dit> a() {
      return a;
   }

   public dit(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(f, Integer.valueOf(1)));
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, box $$3) {
      if (!$$3.bT()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cxb $$0, dnb $$1, ib $$2, box $$3, float $$4) {
      if (!($$3 instanceof cgt)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(cxb $$0, dnb $$1, ib $$2, box $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(dae.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(cxb $$0, ib $$1, dnb $$2) {
      $$0.a(null, $$1, aty.zJ, atz.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.a(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(drp.f, $$1, drp.a.a($$2));
         $$0.c(2001, $$1, dac.i($$2));
      }
   }

   @Override
   protected void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, aty.zK, atz.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.a(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(drp.c, $$2, drp.a.a($$0));
         } else {
            $$1.a(null, $$2, aty.zL, atz.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(drp.f, $$2, drp.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, dac.i($$0));
               ccf $$6 = bpd.bh.a((cxb)$$1);
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

   public static boolean a(cwh $$0, ib $$1) {
      return b($$0, $$1.d());
   }

   public static boolean b(cwh $$0, ib $$1) {
      return $$0.a_($$1).a(aun.H);
   }

   @Override
   protected void b(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(cxb $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(cxb $$0, ciu $$1, ib $$2, dnb $$3, @Nullable dki $$4, cqm $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(dnb $$0, csu $$1) {
      return !$$1.h() && $$1.n().a(this.l()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      dnb $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(e, f);
   }

   private boolean a(cxb $$0, box $$1) {
      if ($$1 instanceof ccf || $$1 instanceof caz) {
         return false;
      } else {
         return !($$1 instanceof bpp) ? false : $$1 instanceof ciu || $$0.Z().b(cwx.c);
      }
   }
}
