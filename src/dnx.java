import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnx extends dff {
   public static final MapCodec<dnx> a = b(dnx::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final ews g = dff.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final ews h = dff.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dth e = dsx.aE;
   public static final dth f = dsx.aD;

   @Override
   public MapCodec<dnx> a() {
      return a;
   }

   public dnx(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(f, Integer.valueOf(1)));
   }

   @Override
   public void a(dcd $$0, ja $$1, dsh $$2, bsd $$3) {
      if (!$$3.bW()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dcd $$0, dsh $$1, ja $$2, bsd $$3, float $$4) {
      if (!($$3 instanceof ckg)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(dcd $$0, dsh $$1, ja $$2, bsd $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(dfh.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(dcd $$0, ja $$1, dsh $$2) {
      $$0.a(null, $$1, avf.Ai, avg.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.a(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(dxa.f, $$1, dxa.a.a($$2));
         $$0.c(2001, $$1, dff.i($$2));
      }
   }

   @Override
   protected void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, avf.Aj, avg.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.a(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(dxa.c, $$2, dxa.a.a($$0));
         } else {
            $$1.a(null, $$2, avf.Ak, avg.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(dxa.f, $$2, dxa.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, dff.i($$0));
               cfp $$6 = bsj.bh.a((dcd)$$1);
               if ($$6 != null) {
                  $$6.c_(-24000);
                  $$6.h($$2);
                  $$6.b((double)$$2.u() + 0.3 + (double)$$5 * 0.2, (double)$$2.v(), (double)$$2.w() + 0.3, 0.0F, 0.0F);
                  $$1.b($$6);
               }
            }
         }
      }
   }

   public static boolean a(dbj $$0, ja $$1) {
      return b($$0, $$1.d());
   }

   public static boolean b(dbj $$0, ja $$1) {
      return $$0.a_($$1).a(avu.H);
   }

   @Override
   protected void b(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(dcd $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(dcd $$0, cmh $$1, ja $$2, dsh $$3, @Nullable dpn $$4, cua $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(dsh $$0, cxk $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      dsh $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(e, f);
   }

   private boolean a(dcd $$0, bsd $$1) {
      if ($$1 instanceof cfp || $$1 instanceof cej) {
         return false;
      } else {
         return !($$1 instanceof bsy) ? false : $$1 instanceof cmh || $$0.ab().b(dbz.c);
      }
   }
}
