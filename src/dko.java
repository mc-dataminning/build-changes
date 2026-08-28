import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dko extends dkg {
   public static final MapCodec<dko> a = b(dko::new);
   public static final dzk<jo> b = dot.e;
   public static final dzm c = dzc.aQ;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dko> a() {
      return a;
   }

   public dko(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(0)).b(b, jo.c));
   }

   @Override
   protected boolean c_(dym $$0) {
      return true;
   }

   @Override
   protected int a(dym $$0, dhp $$1, jj $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dhp $$0, cqi $$1, jj $$2, dym $$3, @Nullable dvl $$4, cxy $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.C && $$4 instanceof dvi $$6) {
         if (!dej.a($$5, axc.q)) {
            $$6.a($$1, $$3, dvi.b.c);
            btm.a($$3, $$0, $$2);
            this.b($$0, $$2);
         }

         ap.L.a((aro)$$1, $$3, $$5, $$6.f());
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, dhi $$3, BiConsumer<cxy, jj> $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      this.b($$1, $$2);
   }

   private void b(dhp $$0, jj $$1) {
      fcp $$2 = new fcp($$1).c(8.0, 6.0, 8.0);
      List<cih> $$3 = $$0.a(cih.class, $$2);
      if (!$$3.isEmpty()) {
         List<cqi> $$4 = $$0.a(cqi.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cih $$5 : $$3) {
            if ($$5.f() == null) {
               cqi $$6 = af.a($$4, $$0.A);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dhp $$0, jj $$1) {
      a($$0, $$1, new cxy(cyc.xE, 3));
   }

   @Override
   protected btq a(cxy $$0, dym $$1, dhp $$2, jj $$3, cqi $$4, btp $$5, fcq $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cxu $$9 = $$0.h();
         if ($$0.a(cyc.sW)) {
            $$2.a($$4, $$4.dA(), $$4.dC(), $$4.dG(), awk.bX, awl.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bwr.d($$5));
            $$8 = true;
            $$2.a($$4, edm.M, $$3);
         } else if ($$0.a(cyc.tl)) {
            $$0.h(1);
            $$2.a($$4, $$4.dA(), $$4.dC(), $$4.dG(), awk.cC, awl.e, 1.0F, 1.0F);
            if ($$0.f()) {
               $$4.a($$5, new cxy(cyc.xH));
            } else if (!$$4.gi().f(new cxy(cyc.xH))) {
               $$4.a(new cxy(cyc.xH), false);
            }

            $$8 = true;
            $$2.a($$4, edm.y, $$3);
         }

         if (!$$2.w_() && $$8) {
            $$4.b(awu.c.b($$9));
         }
      }

      if ($$8) {
         if (!dlj.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dvi.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return btq.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dhp $$0, jj $$1) {
      return $$0.c_($$1) instanceof dvi $$3 ? !$$3.c() : false;
   }

   public void a(dhp $$0, dym $$1, jj $$2, @Nullable cqi $$3, dvi.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dvi $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dhp $$0, dym $$1, jj $$2) {
      $$0.a($$2, $$1.b(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dhp $$0, jj $$1, dym $$2) {
      if ($$2.y().c() && !($$0.A.i() < 0.3F)) {
         fdo $$3 = $$2.g($$0, $$1);
         double $$4 = $$3.c(jo.a.b);
         if ($$4 >= 1.0 && !$$2.a(awz.ar)) {
            double $$5 = $$3.b(jo.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               jj $$6 = $$1.e();
               dym $$7 = $$0.a_($$6);
               fdo $$8 = $$7.g($$0, $$6);
               double $$9 = $$8.c(jo.a.b);
               if (($$9 < 1.0 || !$$7.m($$0, $$6)) && $$7.y().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dhp $$0, jj $$1, fdo $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(jo.a.a), (double)$$1.u() + $$2.c(jo.a.a), (double)$$1.w() + $$2.b(jo.a.c), (double)$$1.w() + $$2.c(jo.a.c), $$3);
   }

   private void a(dhp $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(lv.ay, azk.d($$0.A.j(), $$1, $$2), $$5, azk.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dym a(dbn $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(c, b);
   }

   @Nullable
   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dvi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      return $$0.C ? null : a($$2, dvn.I, dvi::a);
   }

   @Override
   public dym a(dhp $$0, jj $$1, dym $$2, cqi $$3) {
      if ($$0 instanceof arn $$4 && $$3.gk() && $$4.O().c(dhl.h) && $$0.c_($$1) instanceof dvi $$6) {
         int $$7 = $$2.c(c);
         boolean $$8 = !$$6.c();
         if ($$8 || $$7 > 0) {
            cxy $$9 = new cxy(this);
            $$9.b($$6.q());
            $$9.b(kx.ao, czx.a.a(c, $$7));
            cmn $$10 = new cmn($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$9);
            $$10.j();
            $$0.b($$10);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cxy> a(dym $$0, exo.a $$1) {
      bvs $$2 = $$1.b(faf.a);
      if ($$2 instanceof cmo || $$2 instanceof cmv || $$2 instanceof crp || $$2 instanceof cma || $$2 instanceof csv) {
         dvl $$3 = $$1.b(faf.h);
         if ($$3 instanceof dvi $$4) {
            $$4.a(null, $$0, dvi.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected cxy a(dhs $$0, jj $$1, dym $$2, boolean $$3) {
      cxy $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$3) {
         $$4.b(kx.ao, czx.a.a(c, $$2.c(c)));
      }

      return $$4;
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$1.a_($$5).b() instanceof dnv && $$1.c_($$3) instanceof dvi $$9) {
         $$9.a(null, $$0, dvi.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dym a(dym $$0, drm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public void a(cxy $$0, cxu.b $$1, List<wv> $$2, czn $$3) {
      super.a($$0, $$1, $$2, $$3);
      czx $$4 = $$0.a(kx.ao, czx.a);
      int $$5 = Objects.requireNonNullElse($$4.a(c), 0);
      int $$6 = $$0.a(kx.ap, List.of()).size();
      $$2.add(wv.a("container.beehive.bees", $$6, 3).a(n.h));
      $$2.add(wv.a("container.beehive.honey", $$5, 5).a(n.h));
   }
}
