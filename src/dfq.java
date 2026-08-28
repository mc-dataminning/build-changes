import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dfq extends dfi {
   public static final MapCodec<dfq> a = b(dfq::new);
   public static final dtu b = djs.aE;
   public static final dua c = dtq.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dfq> a() {
      return a;
   }

   public dfq(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, ji.c));
   }

   @Override
   protected boolean c_(dta $$0) {
      return true;
   }

   @Override
   protected int a(dta $$0, dcu $$1, jd $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dcu $$0, cmv $$1, jd $$2, dta $$3, @Nullable dqf $$4, cuo $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dqc $$6) {
         if (!dac.a($$5, awg.q)) {
            $$6.a($$1, $$3, dqc.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         an.L.a((aqu)$$1, $$3, $$5, $$6.f());
      }
   }

   private void b(dcu $$0, jd $$1) {
      ewr $$2 = new ewr($$1).c(8.0, 6.0, 8.0);
      List<cfd> $$3 = $$0.a(cfd.class, $$2);
      if (!$$3.isEmpty()) {
         List<cmv> $$4 = $$0.a(cmv.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cfd $$5 : $$3) {
            if ($$5.p() == null) {
               cmv $$6 = ad.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dcu $$0, jd $$1) {
      a($$0, $$1, new cuo(cur.wz, 3));
   }

   @Override
   protected bqs a(cuo $$0, dta $$1, dcu $$2, jd $$3, cmv $$4, bqp $$5, ews $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cuj $$9 = $$0.g();
         if ($$0.a(cur.rV)) {
            $$2.a($$4, $$4.dv(), $$4.dx(), $$4.dB(), avo.bX, avp.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, btl.d($$5));
            $$8 = true;
            $$2.a($$4, dxw.M, $$3);
         } else if ($$0.a(cur.sl)) {
            $$0.h(1);
            $$2.a($$4, $$4.dv(), $$4.dx(), $$4.dB(), avo.cC, avp.e, 1.0F, 1.0F);
            if ($$0.e()) {
               $$4.a($$5, new cuo(cur.wC));
            } else if (!$$4.fZ().f(new cuo(cur.wC))) {
               $$4.a(new cuo(cur.wC), false);
            }

            $$8 = true;
            $$2.a($$4, dxw.y, $$3);
         }

         if (!$$2.x_() && $$8) {
            $$4.b(avy.c.b($$9));
         }
      }

      if ($$8) {
         if (!dgk.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dqc.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bqs.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dcu $$0, jd $$1) {
      return $$0.c_($$1) instanceof dqc $$3 ? !$$3.c() : false;
   }

   public void a(dcu $$0, dta $$1, jd $$2, @Nullable cmv $$3, dqc.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dqc $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dcu $$0, dta $$1, jd $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dcu $$0, jd $$1, dta $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         exp $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(ji.a.b);
         if ($$4 >= 1.0 && !$$2.a(awd.ao)) {
            double $$5 = $$3.b(ji.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               jd $$6 = $$1.d();
               dta $$7 = $$0.a_($$6);
               exp $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(ji.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dcu $$0, jd $$1, exp $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(ji.a.a), (double)$$1.u() + $$2.c(ji.a.a), (double)$$1.w() + $$2.b(ji.a.c), (double)$$1.w() + $$2.c(ji.a.c), $$3);
   }

   private void a(dcu $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(lm.av, ayn.d($$0.z.j(), $$1, $$2), $$5, ayn.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dta a(cyb $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.c;
   }

   @Nullable
   @Override
   public dqf a(jd $$0, dta $$1) {
      return new dqc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqf> dqg<T> a(dcu $$0, dta $$1, dqh<T> $$2) {
      return $$0.B ? null : a($$2, dqh.H, dqc::a);
   }

   @Override
   public dta a(dcu $$0, jd $$1, dta $$2, cmv $$3) {
      if (!$$0.B && $$3.f() && $$0.ab().b(dcq.h) && $$0.c_($$1) instanceof dqc $$5) {
         int $$6 = $$2.c(c);
         boolean $$7 = !$$5.c();
         if ($$7 || $$6 > 0) {
            cuo $$8 = new cuo(this);
            $$8.b($$5.s());
            $$8.b(kq.ac, cxb.a.a(c, $$6));
            cjf $$9 = new cjf($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
            $$9.v();
            $$0.b($$9);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cuo> a(dta $$0, ero.a $$1) {
      bsq $$2 = $$1.b(euh.a);
      if ($$2 instanceof cjg || $$2 instanceof cjn || $$2 instanceof cob || $$2 instanceof cis || $$2 instanceof cpd) {
         dqf $$3 = $$1.b(euh.h);
         if ($$3 instanceof dqc $$4) {
            $$4.a(null, $$0, dqc.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$3.a_($$5).b() instanceof diw && $$3.c_($$4) instanceof dqc $$7) {
         $$7.a(null, $$0, dqc.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dta a(dta $$0, dmk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
