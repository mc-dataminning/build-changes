import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drb extends dij {
   public static final MapCodec<drb> a = b(drb::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final fal g = dij.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final fal h = dij.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dwn e = dwe.aE;
   public static final dwn f = dwe.aD;

   @Override
   public MapCodec<drb> a() {
      return a;
   }

   public drb(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, Integer.valueOf(0)).b(f, Integer.valueOf(1)));
   }

   @Override
   public void a(dff $$0, jh $$1, dvo $$2, bui $$3) {
      if (!$$3.cg()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dff $$0, dvo $$1, jh $$2, bui $$3, float $$4) {
      if (!($$3 instanceof cmo)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(dff $$0, dvo $$1, jh $$2, bui $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.C && $$0.A.a($$4) == 0 && $$1.a(dil.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(dff $$0, jh $$1, dvo $$2) {
      $$0.a(null, $$1, awo.Am, awp.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.b(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(eak.f, $$1, eak.a.a($$2));
         $$0.c(2001, $$1, dij.j($$2));
      }
   }

   @Override
   protected void b(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, awo.An, awp.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.b(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(eak.c, $$2, eak.a.a($$0));
         } else {
            $$1.a(null, $$2, awo.Ao, awp.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(eak.f, $$2, eak.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, dij.j($$0));
               chw $$6 = bup.bh.a($$1, buo.e);
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

   public static boolean a(dek $$0, jh $$1) {
      return b($$0, $$1.e());
   }

   public static boolean b(dek $$0, jh $$1) {
      return $$0.a_($$1).a(axd.I);
   }

   @Override
   protected void b(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.C) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(dff $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.A.a(500) == 0;
   }

   @Override
   public void a(dff $$0, cor $$1, jh $$2, dvo $$3, @Nullable dsr $$4, cwf $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(dvo $$0, czw $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      dvo $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(e, f);
   }

   private boolean a(dff $$0, bui $$1) {
      if ($$1 instanceof chw || $$1 instanceof cgp) {
         return false;
      } else {
         return !($$1 instanceof bve) ? false : $$1 instanceof cor || $$0.ac().b(dfb.c);
      }
   }
}
