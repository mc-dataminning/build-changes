import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dev extends den {
   public static final MapCodec<dev> a = b(dev::new);
   public static final dtw b = djc.aE;
   public static final duc c = dts.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dev> a() {
      return a;
   }

   public dev(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, iw.c));
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dca $$1, ir $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dca $$0, cly $$1, ir $$2, dtc $$3, @Nullable dqc $$4, cuh $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.C && $$4 instanceof dpy $$6) {
         if (dae.a(dag.v, $$5) == 0) {
            $$6.a($$1, $$3, dpy.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         an.L.a((aqu)$$1, $$3, $$5, $$6.f());
      }
   }

   private void b(dca $$0, ir $$1) {
      ewp $$2 = new ewp($$1).c(8.0, 6.0, 8.0);
      List<cef> $$3 = $$0.a(cef.class, $$2);
      if (!$$3.isEmpty()) {
         List<cly> $$4 = $$0.a(cly.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cef $$5 : $$3) {
            if ($$5.p() == null) {
               cly $$6 = ad.a($$4, $$0.A);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dca $$0, ir $$1) {
      a($$0, $$1, new cuh(cuk.yj, 3));
   }

   @Override
   protected bqc a(cuh $$0, dtc $$1, dca $$2, ir $$3, cly $$4, bpz $$5, ewq $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cuc $$9 = $$0.f();
         if ($$0.a(cuk.ts)) {
            $$2.a($$4, $$4.dz(), $$4.dB(), $$4.dF(), avo.cc, avq.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bso.d($$5));
            $$8 = true;
            $$2.a($$4, dxv.M, $$3);
         } else if ($$0.a(cuk.tI)) {
            $$0.h(1);
            $$2.a($$4, $$4.dz(), $$4.dB(), $$4.dF(), avo.cH, avq.e, 1.0F, 1.0F);
            if ($$0.d()) {
               $$4.a($$5, new cuh(cuk.ym));
            } else if (!$$4.gl().f(new cuh(cuk.ym))) {
               $$4.a(new cuh(cuk.ym), false);
            }

            $$8 = true;
            $$2.a($$4, dxv.y, $$3);
         }

         if (!$$2.x_() && $$8) {
            $$4.b(avz.c.b($$9));
         }
      }

      if ($$8) {
         if (!dfq.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dpy.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bqc.a($$2.C);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dca $$0, ir $$1) {
      return $$0.c_($$1) instanceof dpy $$3 ? !$$3.c() : false;
   }

   public void a(dca $$0, dtc $$1, ir $$2, @Nullable cly $$3, dpy.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dpy $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dca $$0, dtc $$1, ir $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dca $$0, ir $$1, dtc $$2) {
      if ($$2.u().c() && !($$0.A.i() < 0.3F)) {
         exn $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(iw.a.b);
         if ($$4 >= 1.0 && !$$2.a(awe.ap)) {
            double $$5 = $$3.b(iw.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               ir $$6 = $$1.d();
               dtc $$7 = $$0.a_($$6);
               exn $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(iw.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dca $$0, ir $$1, exn $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(iw.a.a), (double)$$1.u() + $$2.c(iw.a.a), (double)$$1.w() + $$2.b(iw.a.c), (double)$$1.w() + $$2.c(iw.a.c), $$3);
   }

   private void a(dca $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(lb.at, aym.d($$0.A.j(), $$1, $$2), $$5, aym.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dtc a(cyd $$0) {
      return this.n().a(b, $$0.g().g());
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.c;
   }

   @Nullable
   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dpy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      return $$0.C ? null : a($$2, dqe.I, dpy::a);
   }

   @Override
   public dtc a(dca $$0, ir $$1, dtc $$2, cly $$3) {
      if (!$$0.C && $$3.f() && $$0.ab().b(dbw.h) && $$0.c_($$1) instanceof dpy $$5) {
         int $$6 = $$2.c(c);
         boolean $$7 = !$$5.c();
         if ($$7 || $$6 > 0) {
            cuh $$8 = new cuh(this);
            $$8.a($$5.s());
            $$8.b(ke.aa, cxb.a.a(c, $$6));
            cig $$9 = new cig($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
            $$9.u();
            $$0.b($$9);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cuh> a(dtc $$0, ers.a $$1) {
      brv $$2 = $$1.b(eug.a);
      if ($$2 instanceof cih || $$2 instanceof cio || $$2 instanceof cnh || $$2 instanceof chu || $$2 instanceof coi) {
         dqc $$3 = $$1.b(eug.h);
         if ($$3 instanceof dpy $$4) {
            $$4.a(null, $$0, dpy.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$3.a_($$5).b() instanceof dif && $$3.c_($$4) instanceof dpy $$7) {
         $$7.a(null, $$0, dpy.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dtc a(dtc $$0, dmd $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
