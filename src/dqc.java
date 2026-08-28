import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqc extends dhj {
   public static final MapCodec<dqc> a = b(dqc::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final ezm g = dhj.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final ezm h = dhj.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dvo e = dve.aE;
   public static final dvo f = dve.aD;

   @Override
   public MapCodec<dqc> a() {
      return a;
   }

   public dqc(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, Integer.valueOf(0)).b(f, Integer.valueOf(1)));
   }

   @Override
   public void a(deg $$0, je $$1, duo $$2, bto $$3) {
      if (!$$3.cb()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(deg $$0, duo $$1, je $$2, bto $$3, float $$4) {
      if (!($$3 instanceof clt)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(deg $$0, duo $$1, je $$2, bto $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(dhl.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(deg $$0, je $$1, duo $$2) {
      $$0.a(null, $$1, awe.Ao, awf.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.b(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(dzl.f, $$1, dzl.a.a($$2));
         $$0.c(2001, $$1, dhj.j($$2));
      }
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, awe.Ap, awf.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.b(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(dzl.c, $$2, dzl.a.a($$0));
         } else {
            $$1.a(null, $$2, awe.Aq, awf.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(dzl.f, $$2, dzl.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, dhj.j($$0));
               chb $$6 = btv.bh.a($$1, btu.e);
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

   public static boolean a(ddl $$0, je $$1) {
      return b($$0, $$1.e());
   }

   public static boolean b(ddl $$0, je $$1) {
      return $$0.a_($$1).a(awt.I);
   }

   @Override
   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(deg $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(deg $$0, cnu $$1, je $$2, duo $$3, @Nullable drs $$4, cvp $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(duo $$0, czk $$1) {
      return !$$1.h() && $$1.n().a(this.q()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      duo $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(e, f);
   }

   private boolean a(deg $$0, bto $$1) {
      if ($$1 instanceof chb || $$1 instanceof cfu) {
         return false;
      } else {
         return !($$1 instanceof buk) ? false : $$1 instanceof cnu || $$0.ac().b(dec.c);
      }
   }
}
