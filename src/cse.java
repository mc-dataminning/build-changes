import java.util.List;
import javax.annotation.Nullable;

public class cse extends crx {
   public static final dfs a = cwd.aC;
   public static final dfy b = dfo.aN;
   public static final int c = 5;
   private static final int d = 3;

   public cse(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)).a(a, hb.c));
   }

   @Override
   public boolean d_(dey $$0) {
      return true;
   }

   @Override
   public int a(dey $$0, cpk $$1, gv $$2) {
      return $$0.c(b);
   }

   @Override
   public void a(cpk $$0, cbl $$1, gv $$2, dey $$3, @Nullable dck $$4, ciw $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dch $$6) {
         if (cnf.a(cnh.v, $$5) == 0) {
            $$6.a($$1, $$3, dch.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         ai.K.a((akj)$$1, $$3, $$5, $$6.g());
      }
   }

   private void b(cpk $$0, gv $$1) {
      List<buj> $$2 = $$0.a(buj.class, new eha($$1).c(8.0, 6.0, 8.0));
      if (!$$2.isEmpty()) {
         List<cbl> $$3 = $$0.a(cbl.class, new eha($$1).c(8.0, 6.0, 8.0));
         int $$4 = $$3.size();

         for (buj $$5 : $$2) {
            if ($$5.j() == null) {
               $$5.h($$3.get($$0.z.a($$4)));
            }
         }
      }
   }

   public static void a(cpk $$0, gv $$1) {
      a($$0, $$1, new ciw(ciz.vA, 3));
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      ciw $$6 = $$3.b($$4);
      int $$7 = $$0.c(b);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cir $$9 = $$6.d();
         if ($$6.a(ciz.rg)) {
            $$1.a($$3, $$3.dp(), $$3.dr(), $$3.dv(), aou.bI, aov.e, 1.0F, 1.0F);
            a($$1, $$2);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$8 = true;
            $$1.a($$3, dji.M, $$2);
         } else if ($$6.a(ciz.rw)) {
            $$6.h(1);
            $$1.a($$3, $$3.dp(), $$3.dr(), $$3.dv(), aou.ci, aov.e, 1.0F, 1.0F);
            if ($$6.b()) {
               $$3.a($$4, new ciw(ciz.vD));
            } else if (!$$3.fQ().e(new ciw(ciz.vD))) {
               $$3.a(new ciw(ciz.vD), false);
            }

            $$8 = true;
            $$1.a($$3, dji.y, $$2);
         }

         if (!$$1.r_() && $$8) {
            $$3.b(ape.c.b($$9));
         }
      }

      if ($$8) {
         if (!csx.a($$1, $$2)) {
            if (this.c($$1, $$2)) {
               this.b($$1, $$2);
            }

            this.a($$1, $$0, $$2, $$3, dch.b.c);
         } else {
            this.a($$1, $$0, $$2);
         }

         return bgo.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private boolean c(cpk $$0, gv $$1) {
      return $$0.c_($$1) instanceof dch $$3 ? !$$3.d() : false;
   }

   public void a(cpk $$0, dey $$1, gv $$2, @Nullable cbl $$3, dch.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dch $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(cpk $$0, dey $$1, gv $$2) {
      $$0.a($$2, $$1.a(b, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
      if ($$0.c(b) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(cpk $$0, gv $$1, dey $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         ehy $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(hb.a.b);
         if ($$4 >= 1.0 && !$$2.a(apj.an)) {
            double $$5 = $$3.b(hb.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               gv $$6 = $$1.d();
               dey $$7 = $$0.a_($$6);
               ehy $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(hb.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(cpk $$0, gv $$1, ehy $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(hb.a.a), (double)$$1.u() + $$2.c(hb.a.a), (double)$$1.w() + $$2.b(hb.a.c), (double)$$1.w() + $$2.c(hb.a.c), $$3);
   }

   private void a(cpk $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(iw.ap, aro.d($$0.z.j(), $$1, $$2), $$5, aro.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dey a(cle $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(b, a);
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.c;
   }

   @Nullable
   @Override
   public dck a(gv $$0, dey $$1) {
      return new dch($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dck> dcl<T> a(cpk $$0, dey $$1, dcm<T> $$2) {
      return $$0.B ? null : a($$2, dcm.H, dch::a);
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, cbl $$3) {
      if (!$$0.B && $$3.f() && $$0.X().b(cpg.g) && $$0.c_($$1) instanceof dch $$5) {
         ciw $$6 = new ciw(this);
         int $$7 = $$2.c(b);
         boolean $$8 = !$$5.d();
         if ($$8 || $$7 > 0) {
            if ($$8) {
               qs $$9 = new qs();
               $$9.a("Bees", $$5.j());
               cgp.a($$6, dcm.H, $$9);
            }

            qs $$10 = new qs();
            $$10.a("honey_level", $$7);
            $$6.a("BlockStateTag", $$10);
            bye $$11 = new bye($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
            $$11.o();
            $$0.b($$11);
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<ciw> a(dey $$0, ecn.a $$1) {
      big $$2 = $$1.b(eet.a);
      if ($$2 instanceof byf || $$2 instanceof byl || $$2 instanceof ccq || $$2 instanceof bxs || $$2 instanceof cdo) {
         dck $$3 = $$1.b(eet.h);
         if ($$3 instanceof dch $$4) {
            $$4.a(null, $$0, dch.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$3.a_($$5).b() instanceof cvg && $$3.c_($$4) instanceof dch $$7) {
         $$7.a(null, $$0, dch.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
