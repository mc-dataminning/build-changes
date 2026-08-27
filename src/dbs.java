import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dbs extends dbk {
   public static final MapCodec<dbs> a = b(dbs::new);
   public static final dpt b = dft.aE;
   public static final dpz c = dpp.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dbs> a() {
      return a;
   }

   public dbs(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, ih.c));
   }

   @Override
   protected boolean d_(doz $$0) {
      return true;
   }

   @Override
   protected int a(doz $$0, cyx $$1, ib $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(cyx $$0, cjt $$1, ib $$2, doz $$3, @Nullable dmf $$4, crj $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dmc $$6) {
         if (cwr.a(cwt.v, $$5) == 0) {
            $$6.a($$1, $$3, dmc.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         am.L.a((apt)$$1, $$3, $$5, $$6.f());
      }
   }

   private void b(cyx $$0, ib $$1) {
      erv $$2 = new erv($$1).c(8.0, 6.0, 8.0);
      List<cce> $$3 = $$0.a(cce.class, $$2);
      if (!$$3.isEmpty()) {
         List<cjt> $$4 = $$0.a(cjt.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cce $$5 : $$3) {
            if ($$5.p() == null) {
               cjt $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(cyx $$0, ib $$1) {
      a($$0, $$1, new crj(crm.ws, 3));
   }

   @Override
   protected boc a(crj $$0, doz $$1, cyx $$2, ib $$3, cjt $$4, bnz $$5, erw $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cre $$9 = $$0.f();
         if ($$0.a(crm.rU)) {
            $$2.a($$4, $$4.dr(), $$4.dt(), $$4.dx(), aum.bX, aun.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bqo.d($$5));
            $$8 = true;
            $$2.a($$4, dts.M, $$3);
         } else if ($$0.a(crm.sk)) {
            $$0.g(1);
            $$2.a($$4, $$4.dr(), $$4.dt(), $$4.dx(), aum.cC, aun.e, 1.0F, 1.0F);
            if ($$0.d()) {
               $$4.a($$5, new crj(crm.wv));
            } else if (!$$4.fZ().e(new crj(crm.wv))) {
               $$4.a(new crj(crm.wv), false);
            }

            $$8 = true;
            $$2.a($$4, dts.y, $$3);
         }

         if (!$$2.x_() && $$8) {
            $$4.b(auw.c.b($$9));
         }
      }

      if ($$8) {
         if (!dcm.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dmc.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return boc.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(cyx $$0, ib $$1) {
      return $$0.c_($$1) instanceof dmc $$3 ? !$$3.c() : false;
   }

   public void a(cyx $$0, doz $$1, ib $$2, @Nullable cjt $$3, dmc.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dmc $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(cyx $$0, doz $$1, ib $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(cyx $$0, ib $$1, doz $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         est $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(ih.a.b);
         if ($$4 >= 1.0 && !$$2.a(avc.ao)) {
            double $$5 = $$3.b(ih.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               ib $$6 = $$1.d();
               doz $$7 = $$0.a_($$6);
               est $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(ih.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(cyx $$0, ib $$1, est $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(ih.a.a), (double)$$1.u() + $$2.c(ih.a.a), (double)$$1.w() + $$2.b(ih.a.c), (double)$$1.w() + $$2.c(ih.a.c), $$3);
   }

   private void a(cyx $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(kl.at, axk.d($$0.z.j(), $$1, $$2), $$5, axk.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public doz a(cuo $$0) {
      return this.n().a(b, $$0.g().g());
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected did b_(doz $$0) {
      return did.c;
   }

   @Nullable
   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dmc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmf> dmg<T> a(cyx $$0, doz $$1, dmh<T> $$2) {
      return $$0.B ? null : a($$2, dmh.H, dmc::a);
   }

   @Override
   public doz a(cyx $$0, ib $$1, doz $$2, cjt $$3) {
      if (!$$0.B && $$3.f() && $$0.aa().b(cyt.h) && $$0.c_($$1) instanceof dmc $$5) {
         int $$6 = $$2.c(c);
         boolean $$7 = !$$5.c();
         if ($$7 || $$6 > 0) {
            crj $$8 = new crj(this);
            $$8.a($$5.s());
            $$8.b(jp.R, ctq.a.a(c, $$6));
            cgd $$9 = new cgd($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
            $$9.v();
            $$0.b($$9);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<crj> a(doz $$0, enh.a $$1) {
      bpv $$2 = $$1.b(epo.a);
      if ($$2 instanceof cge || $$2 instanceof cgl || $$2 instanceof ckz || $$2 instanceof cfr || $$2 instanceof cma) {
         dmf $$3 = $$1.b(epo.h);
         if ($$3 instanceof dmc $$4) {
            $$4.a(null, $$0, dmc.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$3.a_($$5).b() instanceof dey && $$3.c_($$4) instanceof dmc $$7) {
         $$7.a(null, $$0, dmc.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public doz a(doz $$0, dik $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
