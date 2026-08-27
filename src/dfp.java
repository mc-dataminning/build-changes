import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfp extends cwy {
   public static final MapCodec<dfp> a = b(dfp::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final emv g = cwy.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final emv h = cwy.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dkp e = dkf.aE;
   public static final dkp f = dkf.aD;

   @Override
   public MapCodec<dfp> a() {
      return a;
   }

   public dfp(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(f, Integer.valueOf(1)));
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, blw $$3) {
      if (!$$3.bT()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ctx $$0, djp $$1, hx $$2, blw $$3, float $$4) {
      if (!($$3 instanceof cdp)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(ctx $$0, djp $$1, hx $$2, blw $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(cxa.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(ctx $$0, hx $$1, djp $$2) {
      $$0.a(null, $$1, art.zA, aru.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.a(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(dnz.f, $$1, dnz.a.a($$2));
         $$0.c(2001, $$1, cwy.i($$2));
      }
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, art.zB, aru.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.a(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(dnz.c, $$2, dnz.a.a($$0));
         } else {
            $$1.a(null, $$2, art.zC, aru.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(dnz.f, $$2, dnz.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, cwy.i($$0));
               bzd $$6 = bmc.bf.a((ctx)$$1);
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

   public static boolean a(ctd $$0, hx $$1) {
      return b($$0, $$1.d());
   }

   public static boolean b(ctd $$0, hx $$1) {
      return $$0.a_($$1).a(asi.H);
   }

   @Override
   public void b(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(ctx $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(ctx $$0, cfq $$1, hx $$2, djp $$3, @Nullable dhd $$4, cng $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   public boolean a(djp $$0, cpp $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      djp $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(e, f);
   }

   private boolean a(ctx $$0, blw $$1) {
      if ($$1 instanceof bzd || $$1 instanceof bxx) {
         return false;
      } else {
         return !($$1 instanceof bmo) ? false : $$1 instanceof cfq || $$0.Z().b(ctt.c);
      }
   }
}
