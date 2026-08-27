import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class cym extends cye {
   public static final MapCodec<cym> a = b(cym::new);
   public static final dmd b = dcn.aE;
   public static final dmj c = dlz.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<cym> a() {
      return a;
   }

   public cym(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, ie.c));
   }

   @Override
   protected boolean d_(dlj $$0) {
      return true;
   }

   @Override
   protected int a(dlj $$0, cvr $$1, hz $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(cvr $$0, chl $$1, hz $$2, dlj $$3, @Nullable dix $$4, cpd $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof diu $$6) {
         if (ctn.a(ctp.v, $$5) == 0) {
            $$6.a($$1, $$3, diu.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         am.L.a((aox)$$1, $$3, $$5, $$6.g());
      }
   }

   private void b(cvr $$0, hz $$1) {
      enu $$2 = new enu($$1).c(8.0, 6.0, 8.0);
      List<bzy> $$3 = $$0.a(bzy.class, $$2);
      if (!$$3.isEmpty()) {
         List<chl> $$4 = $$0.a(chl.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (bzy $$5 : $$3) {
            if ($$5.q() == null) {
               chl $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(cvr $$0, hz $$1) {
      a($$0, $$1, new cpd(cpg.wq, 3));
   }

   @Override
   protected bly a(cpd $$0, dlj $$1, cvr $$2, hz $$3, chl $$4, blv $$5, env $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         coy $$9 = $$0.d();
         if ($$0.a(cpg.rU)) {
            $$2.a($$4, $$4.dr(), $$4.dt(), $$4.dx(), atl.bV, atm.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, boi.d($$5));
            $$8 = true;
            $$2.a($$4, dpw.M, $$3);
         } else if ($$0.a(cpg.sk)) {
            $$0.h(1);
            $$2.a($$4, $$4.dr(), $$4.dt(), $$4.dx(), atl.cv, atm.e, 1.0F, 1.0F);
            if ($$0.b()) {
               $$4.a($$5, new cpd(cpg.wt));
            } else if (!$$4.fT().e(new cpd(cpg.wt))) {
               $$4.a(new cpd(cpg.wt), false);
            }

            $$8 = true;
            $$2.a($$4, dpw.y, $$3);
         }

         if (!$$2.y_() && $$8) {
            $$4.b(atv.c.b($$9));
         }
      }

      if ($$8) {
         if (!czg.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, diu.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bly.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(cvr $$0, hz $$1) {
      return $$0.c_($$1) instanceof diu $$3 ? !$$3.d() : false;
   }

   public void a(cvr $$0, dlj $$1, hz $$2, @Nullable chl $$3, diu.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof diu $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(cvr $$0, dlj $$1, hz $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dlj $$0, cvr $$1, hz $$2, awp $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(cvr $$0, hz $$1, dlj $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         eos $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(ie.a.b);
         if ($$4 >= 1.0 && !$$2.a(aua.an)) {
            double $$5 = $$3.b(ie.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               hz $$6 = $$1.d();
               dlj $$7 = $$0.a_($$6);
               eos $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(ie.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(cvr $$0, hz $$1, eos $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(ie.a.a), (double)$$1.u() + $$2.c(ie.a.a), (double)$$1.w() + $$2.b(ie.a.c), (double)$$1.w() + $$2.c(ie.a.c), $$3);
   }

   private void a(cvr $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(jz.as, awi.d($$0.z.j(), $$1, $$2), $$5, awi.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dlj a(crk $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.c;
   }

   @Nullable
   @Override
   public dix a(hz $$0, dlj $$1) {
      return new diu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dix> diy<T> a(cvr $$0, dlj $$1, diz<T> $$2) {
      return $$0.B ? null : a($$2, diz.H, diu::a);
   }

   @Override
   public dlj a(cvr $$0, hz $$1, dlj $$2, chl $$3) {
      if (!$$0.B && $$3.f() && $$0.Z().b(cvn.h) && $$0.c_($$1) instanceof diu $$5) {
         cpd $$6 = new cpd(this);
         int $$7 = $$2.c(c);
         boolean $$8 = !$$5.d();
         if ($$8 || $$7 > 0) {
            if ($$8) {
               sw $$9 = new sw();
               $$9.a("Bees", $$5.l());
               cmw.a($$6, diz.H, $$9);
            }

            sw $$10 = new sw();
            $$10.a("honey_level", $$7);
            $$6.a("BlockStateTag", $$10);
            cdw $$11 = new cdw($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
            $$11.u();
            $$0.b($$11);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cpd> a(dlj $$0, eji.a $$1) {
      bnq $$2 = $$1.b(eln.a);
      if ($$2 instanceof cdx || $$2 instanceof ced || $$2 instanceof cis || $$2 instanceof cdk || $$2 instanceof cjq) {
         dix $$3 = $$1.b(eln.h);
         if ($$3 instanceof diu $$4) {
            $$4.a(null, $$0, diu.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$3.a_($$5).b() instanceof dbs && $$3.c_($$4) instanceof diu $$7) {
         $$7.a(null, $$0, diu.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dlj a(dlj $$0, dfe $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
