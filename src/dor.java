import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dor extends dfy {
   public static final MapCodec<dor> a = b(dor::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final ext g = dfy.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final ext h = dfy.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final duc e = dts.aE;
   public static final duc f = dts.aD;

   @Override
   public MapCodec<dor> a() {
      return a;
   }

   public dor(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(f, Integer.valueOf(1)));
   }

   @Override
   public void a(dcw $$0, jd $$1, dtc $$2, bsr $$3) {
      if (!$$3.bX()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dcw $$0, dtc $$1, jd $$2, bsr $$3, float $$4) {
      if (!($$3 instanceof ckw)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(dcw $$0, dtc $$1, jd $$2, bsr $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(dga.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(dcw $$0, jd $$1, dtc $$2) {
      $$0.a(null, $$1, avp.Ai, avq.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.a(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(dxz.f, $$1, dxz.a.a($$2));
         $$0.c(2001, $$1, dfy.i($$2));
      }
   }

   @Override
   protected void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, avp.Aj, avq.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.a(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(dxz.c, $$2, dxz.a.a($$0));
         } else {
            $$1.a(null, $$2, avp.Ak, avq.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(dxz.f, $$2, dxz.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, dfy.i($$0));
               cgf $$6 = bsx.bh.a((dcw)$$1);
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

   public static boolean a(dcc $$0, jd $$1) {
      return b($$0, $$1.e());
   }

   public static boolean b(dcc $$0, jd $$1) {
      return $$0.a_($$1).a(awe.H);
   }

   @Override
   protected void b(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(dcw $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(dcw $$0, cmx $$1, jd $$2, dtc $$3, @Nullable dqh $$4, cuq $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(dtc $$0, cyd $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(e, f);
   }

   private boolean a(dcw $$0, bsr $$1) {
      if ($$1 instanceof cgf || $$1 instanceof cez) {
         return false;
      } else {
         return !($$1 instanceof btn) ? false : $$1 instanceof cmx || $$0.ab().b(dcs.c);
      }
   }
}
