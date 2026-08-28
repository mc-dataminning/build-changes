import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dkg extends djy {
   public static final MapCodec<dkg> a = b(dkg::new);
   public static final dys<jm> b = dok.aF;
   public static final dyu c = dyl.aO;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dkg> a() {
      return a;
   }

   public dkg(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)).b(b, jm.c));
   }

   @Override
   protected boolean c_(dxv $$0) {
      return true;
   }

   @Override
   protected int a(dxv $$0, dhi $$1, jh $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dhi $$0, cpx $$1, jh $$2, dxv $$3, @Nullable dux $$4, cxp $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.C && $$4 instanceof duu $$6) {
         if (!deb.a($$5, axx.q)) {
            $$6.a($$1, $$3, duu.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         ao.L.a((asi)$$1, $$3, $$5, $$6.f());
      }
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, dha $$3, BiConsumer<cxp, jh> $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      this.b($$1, $$2);
   }

   private void b(dhi $$0, jh $$1) {
      fbt $$2 = new fbt($$1).c(8.0, 6.0, 8.0);
      List<chy> $$3 = $$0.a(chy.class, $$2);
      if (!$$3.isEmpty()) {
         List<cpx> $$4 = $$0.a(cpx.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (chy $$5 : $$3) {
            if ($$5.O_() == null) {
               cpx $$6 = ae.a($$4, $$0.A);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dhi $$0, jh $$1) {
      a($$0, $$1, new cxp(cxt.xq, 3));
   }

   @Override
   protected btj a(cxp $$0, dxv $$1, dhi $$2, jh $$3, cpx $$4, bti $$5, fbu $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cxl $$9 = $$0.h();
         if ($$0.a(cxt.sJ)) {
            $$2.a($$4, $$4.dB(), $$4.dD(), $$4.dH(), axf.bX, axg.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bwg.d($$5));
            $$8 = true;
            $$2.a($$4, ecr.M, $$3);
         } else if ($$0.a(cxt.sY)) {
            $$0.h(1);
            $$2.a($$4, $$4.dB(), $$4.dD(), $$4.dH(), axf.cC, axg.e, 1.0F, 1.0F);
            if ($$0.f()) {
               $$4.a($$5, new cxp(cxt.xt));
            } else if (!$$4.gi().f(new cxp(cxt.xt))) {
               $$4.a(new cxp(cxt.xt), false);
            }

            $$8 = true;
            $$2.a($$4, ecr.y, $$3);
         }

         if (!$$2.B_() && $$8) {
            $$4.b(axp.c.b($$9));
         }
      }

      if ($$8) {
         if (!dlb.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, duu.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return btj.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dhi $$0, jh $$1) {
      return $$0.c_($$1) instanceof duu $$3 ? !$$3.c() : false;
   }

   public void a(dhi $$0, dxv $$1, jh $$2, @Nullable cpx $$3, duu.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof duu $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dhi $$0, dxv $$1, jh $$2) {
      $$0.a($$2, $$1.b(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dxv $$0, dhi $$1, jh $$2, bam $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dhi $$0, jh $$1, dxv $$2) {
      if ($$2.y().c() && !($$0.A.i() < 0.3F)) {
         fcs $$3 = $$2.g($$0, $$1);
         double $$4 = $$3.c(jm.a.b);
         if ($$4 >= 1.0 && !$$2.a(axu.ar)) {
            double $$5 = $$3.b(jm.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               jh $$6 = $$1.e();
               dxv $$7 = $$0.a_($$6);
               fcs $$8 = $$7.g($$0, $$6);
               double $$9 = $$8.c(jm.a.b);
               if (($$9 < 1.0 || !$$7.m($$0, $$6)) && $$7.y().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dhi $$0, jh $$1, fcs $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(jm.a.a), (double)$$1.u() + $$2.c(jm.a.a), (double)$$1.w() + $$2.b(jm.a.c), (double)$$1.w() + $$2.c(jm.a.c), $$3);
   }

   private void a(dhi $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(ls.aw, bae.d($$0.A.j(), $$1, $$2), $$5, bae.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dxv a(dbg $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.c;
   }

   @Nullable
   @Override
   public dux a(jh $$0, dxv $$1) {
      return new duu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dux> duy<T> a(dhi $$0, dxv $$1, duz<T> $$2) {
      return $$0.C ? null : a($$2, duz.I, duu::a);
   }

   @Override
   public dxv a(dhi $$0, jh $$1, dxv $$2, cpx $$3) {
      if ($$0 instanceof ash $$4 && $$3.b() && $$4.N().b(dhe.h) && $$0.c_($$1) instanceof duu $$6) {
         int $$7 = $$2.c(c);
         boolean $$8 = !$$6.c();
         if ($$8 || $$7 > 0) {
            cxp $$9 = new cxp(this);
            $$9.b($$6.r());
            $$9.b(ku.am, czr.a.a(c, $$7));
            cmb $$10 = new cmb($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$9);
            $$10.s();
            $$0.b($$10);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cxp> a(dxv $$0, ews.a $$1) {
      bvk $$2 = $$1.b(ezj.a);
      if ($$2 instanceof cmc || $$2 instanceof cmj || $$2 instanceof cre || $$2 instanceof clo || $$2 instanceof csk) {
         dux $$3 = $$1.b(ezj.h);
         if ($$3 instanceof duu $$4) {
            $$4.a(null, $$0, duu.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$1.a_($$5).b() instanceof dnn && $$1.c_($$3) instanceof duu $$9) {
         $$9.a(null, $$0, duu.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dxv a(dxv $$0, drc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public void a(cxp $$0, cxl.b $$1, List<xv> $$2, czh $$3) {
      super.a($$0, $$1, $$2, $$3);
      czr $$4 = $$0.a(ku.am, czr.a);
      int $$5 = Objects.requireNonNullElse($$4.a(c), 0);
      int $$6 = $$0.a(ku.an, List.of()).size();
      $$2.add(xv.a("container.beehive.bees", $$6, 3).a(n.h));
      $$2.add(xv.a("container.beehive.honey", $$5, 5).a(n.h));
   }
}
