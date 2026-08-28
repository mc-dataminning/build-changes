import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dhy extends dhq {
   public static final MapCodec<dhy> a = b(dhy::new);
   public static final dwd b = dlz.aF;
   public static final dwj c = dvz.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dhy> a() {
      return a;
   }

   public dhy(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)).b(b, jm.c));
   }

   @Override
   protected boolean c_(dvj $$0) {
      return true;
   }

   @Override
   protected int a(dvj $$0, dfb $$1, jh $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dfb $$0, com $$1, jh $$2, dvj $$3, @Nullable dsm $$4, cwb $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.C && $$4 instanceof dsj $$6) {
         if (!dbu.a($$5, axd.q)) {
            $$6.a($$1, $$3, dsj.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         ao.L.a((aro)$$1, $$3, $$5, $$6.f());
      }
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, det $$3, BiConsumer<cwb, jh> $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      this.b($$1, $$2);
   }

   private void b(dfb $$0, jh $$1) {
      ezi $$2 = new ezi($$1).c(8.0, 6.0, 8.0);
      List<cgs> $$3 = $$0.a(cgs.class, $$2);
      if (!$$3.isEmpty()) {
         List<com> $$4 = $$0.a(com.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cgs $$5 : $$3) {
            if ($$5.m() == null) {
               com $$6 = ae.a($$4, $$0.A);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dfb $$0, jh $$1) {
      a($$0, $$1, new cwb(cwf.wC, 3));
   }

   @Override
   protected bsd a(cwb $$0, dvj $$1, dfb $$2, jh $$3, com $$4, bsc $$5, ezj $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cvx $$9 = $$0.h();
         if ($$0.a(cwf.rW)) {
            $$2.a($$4, $$4.dC(), $$4.dE(), $$4.dI(), awl.bX, awm.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bva.d($$5));
            $$8 = true;
            $$2.a($$4, eag.M, $$3);
         } else if ($$0.a(cwf.sl)) {
            $$0.h(1);
            $$2.a($$4, $$4.dC(), $$4.dE(), $$4.dI(), awl.cC, awm.e, 1.0F, 1.0F);
            if ($$0.f()) {
               $$4.a($$5, new cwb(cwf.wF));
            } else if (!$$4.gk().f(new cwb(cwf.wF))) {
               $$4.a(new cwb(cwf.wF), false);
            }

            $$8 = true;
            $$2.a($$4, eag.y, $$3);
         }

         if (!$$2.y_() && $$8) {
            $$4.b(awv.c.b($$9));
         }
      }

      if ($$8) {
         if (!dis.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dsj.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bsd.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dfb $$0, jh $$1) {
      return $$0.c_($$1) instanceof dsj $$3 ? !$$3.c() : false;
   }

   public void a(dfb $$0, dvj $$1, jh $$2, @Nullable com $$3, dsj.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dsj $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dfb $$0, dvj $$1, jh $$2) {
      $$0.a($$2, $$1.b(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, azs $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dfb $$0, jh $$1, dvj $$2) {
      if ($$2.y().c() && !($$0.A.i() < 0.3F)) {
         fah $$3 = $$2.g($$0, $$1);
         double $$4 = $$3.c(jm.a.b);
         if ($$4 >= 1.0 && !$$2.a(axa.ap)) {
            double $$5 = $$3.b(jm.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               jh $$6 = $$1.e();
               dvj $$7 = $$0.a_($$6);
               fah $$8 = $$7.g($$0, $$6);
               double $$9 = $$8.c(jm.a.b);
               if (($$9 < 1.0 || !$$7.m($$0, $$6)) && $$7.y().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dfb $$0, jh $$1, fah $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(jm.a.a), (double)$$1.u() + $$2.c(jm.a.a), (double)$$1.w() + $$2.b(jm.a.c), (double)$$1.w() + $$2.c(jm.a.c), $$3);
   }

   private void a(dfb $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(lr.av, azk.d($$0.A.j(), $$1, $$2), $$5, azk.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dvj a(czs $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.c;
   }

   @Nullable
   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dsj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsm> dsn<T> a(dfb $$0, dvj $$1, dso<T> $$2) {
      return $$0.C ? null : a($$2, dso.H, dsj::a);
   }

   @Override
   public dvj a(dfb $$0, jh $$1, dvj $$2, com $$3) {
      if (!$$0.C && $$3.f() && $$0.ac().b(dex.h) && $$0.c_($$1) instanceof dsj $$5) {
         int $$6 = $$2.c(c);
         boolean $$7 = !$$5.c();
         if ($$7 || $$6 > 0) {
            cwb $$8 = new cwb(this);
            $$8.b($$5.r());
            $$8.b(ku.am, cyd.a.a(c, $$6));
            ckv $$9 = new ckv($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
            $$9.q();
            $$0.b($$9);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cwb> a(dvj $$0, euf.a $$1) {
      bue $$2 = $$1.b(ewy.a);
      if ($$2 instanceof ckw || $$2 instanceof cld || $$2 instanceof cpu || $$2 instanceof cki || $$2 instanceof cqx) {
         dsm $$3 = $$1.b(ewy.h);
         if ($$3 instanceof dsj $$4) {
            $$4.a(null, $$0, dsj.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$3.a_($$5).b() instanceof dld && $$3.c_($$4) instanceof dsj $$7) {
         $$7.a(null, $$0, dsj.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dvj a(dvj $$0, dor $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public void a(cwb $$0, cvx.b $$1, List<xi> $$2, cxt $$3) {
      super.a($$0, $$1, $$2, $$3);
      cyd $$4 = $$0.a(ku.am, cyd.a);
      int $$5 = Objects.requireNonNullElse($$4.a(c), 0);
      int $$6 = $$0.a(ku.an, List.of()).size();
      $$2.add(xi.a("container.beehive.bees", $$6, 3).a(n.h));
      $$2.add(xi.a("container.beehive.honey", $$5, 5).a(n.h));
   }
}
