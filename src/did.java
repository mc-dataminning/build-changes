import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class did extends dhv {
   public static final MapCodec<did> a = b(did::new);
   public static final dwl<jm> b = dme.aF;
   public static final dwn c = dwe.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<did> a() {
      return a;
   }

   public did(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)).b(b, jm.c));
   }

   @Override
   protected boolean c_(dvo $$0) {
      return true;
   }

   @Override
   protected int a(dvo $$0, dff $$1, jh $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dff $$0, cor $$1, jh $$2, dvo $$3, @Nullable dsr $$4, cwf $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.C && $$4 instanceof dso $$6) {
         if (!dby.a($$5, axg.q)) {
            $$6.a($$1, $$3, dso.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         ao.L.a((arr)$$1, $$3, $$5, $$6.f());
      }
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, dex $$3, BiConsumer<cwf, jh> $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      this.b($$1, $$2);
   }

   private void b(dff $$0, jh $$1) {
      ezm $$2 = new ezm($$1).c(8.0, 6.0, 8.0);
      List<cgw> $$3 = $$0.a(cgw.class, $$2);
      if (!$$3.isEmpty()) {
         List<cor> $$4 = $$0.a(cor.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cgw $$5 : $$3) {
            if ($$5.m() == null) {
               cor $$6 = ae.a($$4, $$0.A);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dff $$0, jh $$1) {
      a($$0, $$1, new cwf(cwj.wS, 3));
   }

   @Override
   protected bsh a(cwf $$0, dvo $$1, dff $$2, jh $$3, cor $$4, bsg $$5, ezn $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cwb $$9 = $$0.h();
         if ($$0.a(cwj.sm)) {
            $$2.a($$4, $$4.dD(), $$4.dF(), $$4.dJ(), awo.bX, awp.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bve.d($$5));
            $$8 = true;
            $$2.a($$4, eak.M, $$3);
         } else if ($$0.a(cwj.sB)) {
            $$0.h(1);
            $$2.a($$4, $$4.dD(), $$4.dF(), $$4.dJ(), awo.cC, awp.e, 1.0F, 1.0F);
            if ($$0.f()) {
               $$4.a($$5, new cwf(cwj.wV));
            } else if (!$$4.gl().f(new cwf(cwj.wV))) {
               $$4.a(new cwf(cwj.wV), false);
            }

            $$8 = true;
            $$2.a($$4, eak.y, $$3);
         }

         if (!$$2.y_() && $$8) {
            $$4.b(awy.c.b($$9));
         }
      }

      if ($$8) {
         if (!dix.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dso.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bsh.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dff $$0, jh $$1) {
      return $$0.c_($$1) instanceof dso $$3 ? !$$3.c() : false;
   }

   public void a(dff $$0, dvo $$1, jh $$2, @Nullable cor $$3, dso.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dso $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dff $$0, dvo $$1, jh $$2) {
      $$0.a($$2, $$1.b(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dvo $$0, dff $$1, jh $$2, azv $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dff $$0, jh $$1, dvo $$2) {
      if ($$2.y().c() && !($$0.A.i() < 0.3F)) {
         fal $$3 = $$2.g($$0, $$1);
         double $$4 = $$3.c(jm.a.b);
         if ($$4 >= 1.0 && !$$2.a(axd.aq)) {
            double $$5 = $$3.b(jm.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               jh $$6 = $$1.e();
               dvo $$7 = $$0.a_($$6);
               fal $$8 = $$7.g($$0, $$6);
               double $$9 = $$8.c(jm.a.b);
               if (($$9 < 1.0 || !$$7.m($$0, $$6)) && $$7.y().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dff $$0, jh $$1, fal $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(jm.a.a), (double)$$1.u() + $$2.c(jm.a.a), (double)$$1.w() + $$2.b(jm.a.c), (double)$$1.w() + $$2.c(jm.a.c), $$3);
   }

   private void a(dff $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(ls.av, azn.d($$0.A.j(), $$1, $$2), $$5, azn.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dvo a(czw $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.c;
   }

   @Nullable
   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dso($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsr> dss<T> a(dff $$0, dvo $$1, dst<T> $$2) {
      return $$0.C ? null : a($$2, dst.H, dso::a);
   }

   @Override
   public dvo a(dff $$0, jh $$1, dvo $$2, cor $$3) {
      if (!$$0.C && $$3.f() && $$0.ac().b(dfb.h) && $$0.c_($$1) instanceof dso $$5) {
         int $$6 = $$2.c(c);
         boolean $$7 = !$$5.c();
         if ($$7 || $$6 > 0) {
            cwf $$8 = new cwf(this);
            $$8.b($$5.r());
            $$8.b(ku.am, cyh.a.a(c, $$6));
            ckz $$9 = new ckz($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
            $$9.q();
            $$0.b($$9);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cwf> a(dvo $$0, euj.a $$1) {
      bui $$2 = $$1.b(exc.a);
      if ($$2 instanceof cla || $$2 instanceof clh || $$2 instanceof cpy || $$2 instanceof ckm || $$2 instanceof crb) {
         dsr $$3 = $$1.b(exc.h);
         if ($$3 instanceof dso $$4) {
            $$4.a(null, $$0, dso.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$1.a_($$5).b() instanceof dli && $$1.c_($$3) instanceof dso $$9) {
         $$9.a(null, $$0, dso.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dvo a(dvo $$0, dow $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public void a(cwf $$0, cwb.b $$1, List<xl> $$2, cxx $$3) {
      super.a($$0, $$1, $$2, $$3);
      cyh $$4 = $$0.a(ku.am, cyh.a);
      int $$5 = Objects.requireNonNullElse($$4.a(c), 0);
      int $$6 = $$0.a(ku.an, List.of()).size();
      $$2.add(xl.a("container.beehive.bees", $$6, 3).a(n.h));
      $$2.add(xl.a("container.beehive.honey", $$5, 5).a(n.h));
   }
}
