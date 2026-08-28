import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqq extends dhy {
   public static final MapCodec<dqq> a = b(dqq::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final fab g = dhy.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final fab h = dhy.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dwd e = dvt.aE;
   public static final dwd f = dvt.aD;

   @Override
   public MapCodec<dqq> a() {
      return a;
   }

   public dqq(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, Integer.valueOf(0)).b(f, Integer.valueOf(1)));
   }

   @Override
   public void a(dev $$0, jg $$1, dvd $$2, btz $$3) {
      if (!$$3.cf()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dev $$0, dvd $$1, jg $$2, btz $$3, float $$4) {
      if (!($$3 instanceof cmf)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(dev $$0, dvd $$1, jg $$2, btz $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.C && $$0.A.a($$4) == 0 && $$1.a(dia.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(dev $$0, jg $$1, dvd $$2) {
      $$0.a(null, $$1, awk.Am, awl.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.b(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(eaa.f, $$1, eaa.a.a($$2));
         $$0.c(2001, $$1, dhy.j($$2));
      }
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, awk.An, awl.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.b(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(eaa.c, $$2, eaa.a.a($$0));
         } else {
            $$1.a(null, $$2, awk.Ao, awl.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(eaa.f, $$2, eaa.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, dhy.j($$0));
               chn $$6 = bug.bh.a($$1, buf.e);
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

   public static boolean a(dea $$0, jg $$1) {
      return b($$0, $$1.e());
   }

   public static boolean b(dea $$0, jg $$1) {
      return $$0.a_($$1).a(awz.I);
   }

   @Override
   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.C) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(dev $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.A.a(500) == 0;
   }

   @Override
   public void a(dev $$0, coh $$1, jg $$2, dvd $$3, @Nullable dsg $$4, cvx $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(dvd $$0, czm $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      dvd $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(e, f);
   }

   private boolean a(dev $$0, btz $$1) {
      if ($$1 instanceof chn || $$1 instanceof cgg) {
         return false;
      } else {
         return !($$1 instanceof buv) ? false : $$1 instanceof coh || $$0.ac().b(der.c);
      }
   }
}
