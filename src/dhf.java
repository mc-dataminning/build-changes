import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhf extends cyo {
   public static final MapCodec<dhf> a = b(dhf::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final eol g = cyo.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final eol h = cyo.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dmf e = dlv.aE;
   public static final dmf f = dlv.aD;

   @Override
   public MapCodec<dhf> a() {
      return a;
   }

   public dhf(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(f, Integer.valueOf(1)));
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, bno $$3) {
      if (!$$3.bT()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cvn $$0, dlf $$1, hz $$2, bno $$3, float $$4) {
      if (!($$3 instanceof cfg)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(cvn $$0, dlf $$1, hz $$2, bno $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(cyq.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(cvn $$0, hz $$1, dlf $$2) {
      $$0.a(null, $$1, atk.zA, atl.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.a(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(dpp.f, $$1, dpp.a.a($$2));
         $$0.c(2001, $$1, cyo.i($$2));
      }
   }

   @Override
   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, atk.zB, atl.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.a(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(dpp.c, $$2, dpp.a.a($$0));
         } else {
            $$1.a(null, $$2, atk.zC, atl.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(dpp.f, $$2, dpp.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, cyo.i($$0));
               cau $$6 = bnu.bf.a((cvn)$$1);
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

   public static boolean a(cut $$0, hz $$1) {
      return b($$0, $$1.d());
   }

   public static boolean b(cut $$0, hz $$1) {
      return $$0.a_($$1).a(atz.H);
   }

   @Override
   protected void b(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(cvn $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(cvn $$0, chh $$1, hz $$2, dlf $$3, @Nullable dit $$4, coz $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(dlf $$0, crg $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      dlf $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(e, f);
   }

   private boolean a(cvn $$0, bno $$1) {
      if ($$1 instanceof cau || $$1 instanceof bzo) {
         return false;
      } else {
         return !($$1 instanceof bog) ? false : $$1 instanceof chh || $$0.Z().b(cvj.c);
      }
   }
}
