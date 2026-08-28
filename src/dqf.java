import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqf extends dhm {
   public static final MapCodec<dqf> a = b(dqf::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final ezq g = dhm.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final ezq h = dhm.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dvs e = dvi.aE;
   public static final dvs f = dvi.aD;

   @Override
   public MapCodec<dqf> a() {
      return a;
   }

   public dqf(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, Integer.valueOf(0)).b(f, Integer.valueOf(1)));
   }

   @Override
   public void a(dej $$0, jf $$1, dus $$2, btr $$3) {
      if (!$$3.cb()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dej $$0, dus $$1, jf $$2, btr $$3, float $$4) {
      if (!($$3 instanceof clw)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(dej $$0, dus $$1, jf $$2, btr $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(dho.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(dej $$0, jf $$1, dus $$2) {
      $$0.a(null, $$1, awg.Ao, awh.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.b(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(dzp.f, $$1, dzp.a.a($$2));
         $$0.c(2001, $$1, dhm.j($$2));
      }
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, awg.Ap, awh.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.b(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(dzp.c, $$2, dzp.a.a($$0));
         } else {
            $$1.a(null, $$2, awg.Aq, awh.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(dzp.f, $$2, dzp.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, dhm.j($$0));
               che $$6 = bty.bh.a($$1, btx.e);
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

   public static boolean a(ddo $$0, jf $$1) {
      return b($$0, $$1.e());
   }

   public static boolean b(ddo $$0, jf $$1) {
      return $$0.a_($$1).a(awv.I);
   }

   @Override
   protected void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(dej $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(dej $$0, cnx $$1, jf $$2, dus $$3, @Nullable drv $$4, cvs $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(dus $$0, czn $$1) {
      return !$$1.h() && $$1.n().a(this.q()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      dus $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(e, f);
   }

   private boolean a(dej $$0, btr $$1) {
      if ($$1 instanceof che || $$1 instanceof cfx) {
         return false;
      } else {
         return !($$1 instanceof bun) ? false : $$1 instanceof cnx || $$0.ac().b(def.c);
      }
   }
}
