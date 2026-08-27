import java.util.List;
import javax.annotation.Nullable;

public class csp extends csi {
   public static final dgd a = cwo.aC;
   public static final dgj b = dfz.aN;
   public static final int c = 5;
   private static final int d = 3;

   public csp(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)).a(a, ha.c));
   }

   @Override
   public boolean d_(dfj $$0) {
      return true;
   }

   @Override
   public int a(dfj $$0, cpv $$1, gw $$2) {
      return $$0.c(b);
   }

   @Override
   public void a(cpv $$0, cbu $$1, gw $$2, dfj $$3, @Nullable dcv $$4, cjf $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dcs $$6) {
         if (cnq.a(cns.v, $$5) == 0) {
            $$6.a($$1, $$3, dcs.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         al.K.a((akr)$$1, $$3, $$5, $$6.g());
      }
   }

   private void b(cpv $$0, gw $$1) {
      List<bus> $$2 = $$0.a(bus.class, new ehi($$1).c(8.0, 6.0, 8.0));
      if (!$$2.isEmpty()) {
         List<cbu> $$3 = $$0.a(cbu.class, new ehi($$1).c(8.0, 6.0, 8.0));
         int $$4 = $$3.size();

         for (bus $$5 : $$2) {
            if ($$5.q() == null) {
               $$5.h($$3.get($$0.z.a($$4)));
            }
         }
      }
   }

   public static void a(cpv $$0, gw $$1) {
      a($$0, $$1, new cjf(cji.vA, 3));
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      cjf $$6 = $$3.b($$4);
      int $$7 = $$0.c(b);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cja $$9 = $$6.d();
         if ($$6.a(cji.rg)) {
            $$1.a($$3, $$3.dq(), $$3.ds(), $$3.dw(), apd.bI, ape.e, 1.0F, 1.0F);
            a($$1, $$2);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$8 = true;
            $$1.a($$3, djt.M, $$2);
         } else if ($$6.a(cji.rw)) {
            $$6.h(1);
            $$1.a($$3, $$3.dq(), $$3.ds(), $$3.dw(), apd.ci, ape.e, 1.0F, 1.0F);
            if ($$6.b()) {
               $$3.a($$4, new cjf(cji.vD));
            } else if (!$$3.fR().e(new cjf(cji.vD))) {
               $$3.a(new cjf(cji.vD), false);
            }

            $$8 = true;
            $$1.a($$3, djt.y, $$2);
         }

         if (!$$1.w_() && $$8) {
            $$3.b(apn.c.b($$9));
         }
      }

      if ($$8) {
         if (!cti.a($$1, $$2)) {
            if (this.c($$1, $$2)) {
               this.b($$1, $$2);
            }

            this.a($$1, $$0, $$2, $$3, dcs.b.c);
         } else {
            this.a($$1, $$0, $$2);
         }

         return bgy.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private boolean c(cpv $$0, gw $$1) {
      return $$0.c_($$1) instanceof dcs $$3 ? !$$3.d() : false;
   }

   public void a(cpv $$0, dfj $$1, gw $$2, @Nullable cbu $$3, dcs.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dcs $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(cpv $$0, dfj $$1, gw $$2) {
      $$0.a($$2, $$1.a(b, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, asc $$3) {
      if ($$0.c(b) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(cpv $$0, gw $$1, dfj $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         eig $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(ha.a.b);
         if ($$4 >= 1.0 && !$$2.a(aps.an)) {
            double $$5 = $$3.b(ha.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               gw $$6 = $$1.d();
               dfj $$7 = $$0.a_($$6);
               eig $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(ha.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(cpv $$0, gw $$1, eig $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(ha.a.a), (double)$$1.u() + $$2.c(ha.a.a), (double)$$1.w() + $$2.b(ha.a.c), (double)$$1.w() + $$2.c(ha.a.c), $$3);
   }

   private void a(cpv $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(iv.ap, arw.d($$0.z.j(), $$1, $$2), $$5, arw.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dfj a(cln $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(b, a);
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.c;
   }

   @Nullable
   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new dcs($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcv> dcw<T> a(cpv $$0, dfj $$1, dcx<T> $$2) {
      return $$0.B ? null : a($$2, dcx.H, dcs::a);
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, cbu $$3) {
      if (!$$0.B && $$3.f() && $$0.X().b(cpr.g) && $$0.c_($$1) instanceof dcs $$5) {
         cjf $$6 = new cjf(this);
         int $$7 = $$2.c(b);
         boolean $$8 = !$$5.d();
         if ($$8 || $$7 > 0) {
            if ($$8) {
               qw $$9 = new qw();
               $$9.a("Bees", $$5.j());
               cgy.a($$6, dcx.H, $$9);
            }

            qw $$10 = new qw();
            $$10.a("honey_level", $$7);
            $$6.a("BlockStateTag", $$10);
            byn $$11 = new byn($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
            $$11.t();
            $$0.b($$11);
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<cjf> a(dfj $$0, ecw.a $$1) {
      biq $$2 = $$1.b(efb.a);
      if ($$2 instanceof byo || $$2 instanceof byu || $$2 instanceof ccz || $$2 instanceof byb || $$2 instanceof cdx) {
         dcv $$3 = $$1.b(efb.h);
         if ($$3 instanceof dcs $$4) {
            $$4.a(null, $$0, dcs.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$3.a_($$5).b() instanceof cvr && $$3.c_($$4) instanceof dcs $$7) {
         $$7.a(null, $$0, dcs.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
