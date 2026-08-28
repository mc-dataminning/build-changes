import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dhs extends dhk {
   public static final MapCodec<dhs> a = b(dhs::new);
   public static final dvx b = dlt.aF;
   public static final dwd c = dvt.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dhs> a() {
      return a;
   }

   public dhs(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)).b(b, jl.c));
   }

   @Override
   protected boolean c_(dvd $$0) {
      return true;
   }

   @Override
   protected int a(dvd $$0, dev $$1, jg $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dev $$0, coh $$1, jg $$2, dvd $$3, @Nullable dsg $$4, cvx $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.C && $$4 instanceof dsd $$6) {
         if (!dbo.a($$5, axc.q)) {
            $$6.a($$1, $$3, dsd.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         an.L.a((arn)$$1, $$3, $$5, $$6.f());
      }
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, den $$3, BiConsumer<cvx, jg> $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      this.b($$1, $$2);
   }

   private void b(dev $$0, jg $$1) {
      ezc $$2 = new ezc($$1).c(8.0, 6.0, 8.0);
      List<cgn> $$3 = $$0.a(cgn.class, $$2);
      if (!$$3.isEmpty()) {
         List<coh> $$4 = $$0.a(coh.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cgn $$5 : $$3) {
            if ($$5.m() == null) {
               coh $$6 = ad.a($$4, $$0.A);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dev $$0, jg $$1) {
      a($$0, $$1, new cvx(cwb.wC, 3));
   }

   @Override
   protected bry a(cvx $$0, dvd $$1, dev $$2, jg $$3, coh $$4, brx $$5, ezd $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cvt $$9 = $$0.h();
         if ($$0.a(cwb.rW)) {
            $$2.a($$4, $$4.dC(), $$4.dE(), $$4.dI(), awk.bX, awl.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, buv.d($$5));
            $$8 = true;
            $$2.a($$4, eaa.M, $$3);
         } else if ($$0.a(cwb.sl)) {
            $$0.h(1);
            $$2.a($$4, $$4.dC(), $$4.dE(), $$4.dI(), awk.cC, awl.e, 1.0F, 1.0F);
            if ($$0.f()) {
               $$4.a($$5, new cvx(cwb.wF));
            } else if (!$$4.gk().f(new cvx(cwb.wF))) {
               $$4.a(new cvx(cwb.wF), false);
            }

            $$8 = true;
            $$2.a($$4, eaa.y, $$3);
         }

         if (!$$2.y_() && $$8) {
            $$4.b(awu.c.b($$9));
         }
      }

      if ($$8) {
         if (!dim.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dsd.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bry.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dev $$0, jg $$1) {
      return $$0.c_($$1) instanceof dsd $$3 ? !$$3.c() : false;
   }

   public void a(dev $$0, dvd $$1, jg $$2, @Nullable coh $$3, dsd.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dsd $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dev $$0, dvd $$1, jg $$2) {
      $$0.a($$2, $$1.b(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dev $$0, jg $$1, dvd $$2) {
      if ($$2.y().c() && !($$0.A.i() < 0.3F)) {
         fab $$3 = $$2.g($$0, $$1);
         double $$4 = $$3.c(jl.a.b);
         if ($$4 >= 1.0 && !$$2.a(awz.ap)) {
            double $$5 = $$3.b(jl.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               jg $$6 = $$1.e();
               dvd $$7 = $$0.a_($$6);
               fab $$8 = $$7.g($$0, $$6);
               double $$9 = $$8.c(jl.a.b);
               if (($$9 < 1.0 || !$$7.m($$0, $$6)) && $$7.y().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dev $$0, jg $$1, fab $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(jl.a.a), (double)$$1.u() + $$2.c(jl.a.a), (double)$$1.w() + $$2.b(jl.a.c), (double)$$1.w() + $$2.c(jl.a.c), $$3);
   }

   private void a(dev $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(lq.av, azj.d($$0.A.j(), $$1, $$2), $$5, azj.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dvd a(czm $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.c;
   }

   @Nullable
   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dsd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsg> dsh<T> a(dev $$0, dvd $$1, dsi<T> $$2) {
      return $$0.C ? null : a($$2, dsi.H, dsd::a);
   }

   @Override
   public dvd a(dev $$0, jg $$1, dvd $$2, coh $$3) {
      if (!$$0.C && $$3.f() && $$0.ac().b(der.h) && $$0.c_($$1) instanceof dsd $$5) {
         int $$6 = $$2.c(c);
         boolean $$7 = !$$5.c();
         if ($$7 || $$6 > 0) {
            cvx $$8 = new cvx(this);
            $$8.b($$5.r());
            $$8.b(kt.al, cxz.a.a(c, $$6));
            ckq $$9 = new ckq($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
            $$9.q();
            $$0.b($$9);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cvx> a(dvd $$0, etz.a $$1) {
      btz $$2 = $$1.b(ews.a);
      if ($$2 instanceof ckr || $$2 instanceof cky || $$2 instanceof cpp || $$2 instanceof ckd || $$2 instanceof cqs) {
         dsg $$3 = $$1.b(ews.h);
         if ($$3 instanceof dsd $$4) {
            $$4.a(null, $$0, dsd.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$3.a_($$5).b() instanceof dkx && $$3.c_($$4) instanceof dsd $$7) {
         $$7.a(null, $$0, dsd.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dvd a(dvd $$0, dol $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public void a(cvx $$0, cvt.b $$1, List<xh> $$2, cxp $$3) {
      super.a($$0, $$1, $$2, $$3);
      cxz $$4 = $$0.a(kt.al, cxz.a);
      int $$5 = Objects.requireNonNullElse($$4.a(c), 0);
      int $$6 = $$0.a(kt.am, List.of()).size();
      $$2.add(xh.a("container.beehive.bees", $$6, 3).a(n.h));
      $$2.add(xh.a("container.beehive.honey", $$5, 5).a(n.h));
   }
}
