import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dfs extends dfk {
   public static final MapCodec<dfs> a = b(dfs::new);
   public static final dtw b = dju.aE;
   public static final duc c = dts.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dfs> a() {
      return a;
   }

   public dfs(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, ji.c));
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dcw $$1, jd $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dcw $$0, cmx $$1, jd $$2, dtc $$3, @Nullable dqh $$4, cuq $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dqe $$6) {
         if (!dae.a($$5, awh.q)) {
            $$6.a($$1, $$3, dqe.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         an.L.a((aqv)$$1, $$3, $$5, $$6.f());
      }
   }

   private void b(dcw $$0, jd $$1) {
      ewx $$2 = new ewx($$1).c(8.0, 6.0, 8.0);
      List<cff> $$3 = $$0.a(cff.class, $$2);
      if (!$$3.isEmpty()) {
         List<cmx> $$4 = $$0.a(cmx.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cff $$5 : $$3) {
            if ($$5.p() == null) {
               cmx $$6 = ad.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dcw $$0, jd $$1) {
      a($$0, $$1, new cuq(cut.wz, 3));
   }

   @Override
   protected bqt a(cuq $$0, dtc $$1, dcw $$2, jd $$3, cmx $$4, bqq $$5, ewy $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cul $$9 = $$0.g();
         if ($$0.a(cut.rV)) {
            $$2.a($$4, $$4.dt(), $$4.dv(), $$4.dz(), avp.bX, avq.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, btn.d($$5));
            $$8 = true;
            $$2.a($$4, dxz.M, $$3);
         } else if ($$0.a(cut.sl)) {
            $$0.h(1);
            $$2.a($$4, $$4.dt(), $$4.dv(), $$4.dz(), avp.cC, avq.e, 1.0F, 1.0F);
            if ($$0.e()) {
               $$4.a($$5, new cuq(cut.wC));
            } else if (!$$4.fY().f(new cuq(cut.wC))) {
               $$4.a(new cuq(cut.wC), false);
            }

            $$8 = true;
            $$2.a($$4, dxz.y, $$3);
         }

         if (!$$2.x_() && $$8) {
            $$4.b(avz.c.b($$9));
         }
      }

      if ($$8) {
         if (!dgm.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dqe.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bqt.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dcw $$0, jd $$1) {
      return $$0.c_($$1) instanceof dqe $$3 ? !$$3.c() : false;
   }

   public void a(dcw $$0, dtc $$1, jd $$2, @Nullable cmx $$3, dqe.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dqe $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dcw $$0, dtc $$1, jd $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, ayw $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dcw $$0, jd $$1, dtc $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         exv $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(ji.a.b);
         if ($$4 >= 1.0 && !$$2.a(awe.ap)) {
            double $$5 = $$3.b(ji.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               jd $$6 = $$1.e();
               dtc $$7 = $$0.a_($$6);
               exv $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(ji.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dcw $$0, jd $$1, exv $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(ji.a.a), (double)$$1.u() + $$2.c(ji.a.a), (double)$$1.w() + $$2.b(ji.a.c), (double)$$1.w() + $$2.c(ji.a.c), $$3);
   }

   private void a(dcw $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(lm.av, ayo.d($$0.z.j(), $$1, $$2), $$5, ayo.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dtc a(cyd $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dmf a_(dtc $$0) {
      return dmf.c;
   }

   @Nullable
   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new dqe($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqh> dqi<T> a(dcw $$0, dtc $$1, dqj<T> $$2) {
      return $$0.B ? null : a($$2, dqj.H, dqe::a);
   }

   @Override
   public dtc a(dcw $$0, jd $$1, dtc $$2, cmx $$3) {
      if (!$$0.B && $$3.f() && $$0.ab().b(dcs.h) && $$0.c_($$1) instanceof dqe $$5) {
         int $$6 = $$2.c(c);
         boolean $$7 = !$$5.c();
         if ($$7 || $$6 > 0) {
            cuq $$8 = new cuq(this);
            $$8.b($$5.s());
            $$8.b(kq.ac, cxd.a.a(c, $$6));
            cjh $$9 = new cjh($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
            $$9.v();
            $$0.b($$9);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cuq> a(dtc $$0, eru.a $$1) {
      bsr $$2 = $$1.b(eun.a);
      if ($$2 instanceof cji || $$2 instanceof cjp || $$2 instanceof cod || $$2 instanceof ciu || $$2 instanceof cpf) {
         dqh $$3 = $$1.b(eun.h);
         if ($$3 instanceof dqe $$4) {
            $$4.a(null, $$0, dqe.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$3.a_($$5).b() instanceof diy && $$3.c_($$4) instanceof dqe $$7) {
         $$7.a(null, $$0, dqe.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dtc a(dtc $$0, dmm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
