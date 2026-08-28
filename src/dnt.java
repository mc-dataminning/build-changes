import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnt extends dfb {
   public static final MapCodec<dnt> a = b(dnt::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final ewm g = dfb.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final ewm h = dfb.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dte e = dsu.aE;
   public static final dte f = dsu.aD;

   @Override
   public MapCodec<dnt> a() {
      return a;
   }

   public dnt(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(f, Integer.valueOf(1)));
   }

   @Override
   public void a(dca $$0, iz $$1, dse $$2, bsw $$3) {
      if (!$$3.bW()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dca $$0, dse $$1, iz $$2, bsw $$3, float $$4) {
      if (!($$3 instanceof cky)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(dca $$0, dse $$1, iz $$2, bsw $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(dfd.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(dca $$0, iz $$1, dse $$2) {
      $$0.a(null, $$1, awa.Af, awb.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.a(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(dwx.f, $$1, dwx.a.a($$2));
         $$0.c(2001, $$1, dfb.i($$2));
      }
   }

   @Override
   protected void b(dse $$0, arf $$1, iz $$2, azh $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, awa.Ag, awb.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.a(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(dwx.c, $$2, dwx.a.a($$0));
         } else {
            $$1.a(null, $$2, awa.Ah, awb.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(dwx.f, $$2, dwx.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, dfb.i($$0));
               cgi $$6 = btc.bh.a((dca)$$1);
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

   public static boolean a(dbg $$0, iz $$1) {
      return b($$0, $$1.d());
   }

   public static boolean b(dbg $$0, iz $$1) {
      return $$0.a_($$1).a(awp.H);
   }

   @Override
   protected void b(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(dca $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(dca $$0, cmz $$1, iz $$2, dse $$3, @Nullable dpj $$4, cur $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(dse $$0, cyc $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      dse $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(e, f);
   }

   private boolean a(dca $$0, bsw $$1) {
      if ($$1 instanceof cgi || $$1 instanceof cfc) {
         return false;
      } else {
         return !($$1 instanceof btr) ? false : $$1 instanceof cmz || $$0.ab().b(dbw.c);
      }
   }
}
