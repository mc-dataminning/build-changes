import java.util.List;
import javax.annotation.Nullable;

public class csf extends cry {
   public static final dft a = cwe.aC;
   public static final dfz b = dfp.aN;
   public static final int c = 5;
   private static final int d = 3;

   public csf(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)).a(a, ha.c));
   }

   @Override
   public boolean d_(dez $$0) {
      return true;
   }

   @Override
   public int a(dez $$0, cpl $$1, gu $$2) {
      return $$0.c(b);
   }

   @Override
   public void a(cpl $$0, cbm $$1, gu $$2, dez $$3, @Nullable dcl $$4, cix $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dci $$6) {
         if (cng.a(cni.v, $$5) == 0) {
            $$6.a($$1, $$3, dci.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         ai.K.a((akl)$$1, $$3, $$5, $$6.g());
      }
   }

   private void b(cpl $$0, gu $$1) {
      List<buk> $$2 = $$0.a(buk.class, new egy($$1).c(8.0, 6.0, 8.0));
      if (!$$2.isEmpty()) {
         List<cbm> $$3 = $$0.a(cbm.class, new egy($$1).c(8.0, 6.0, 8.0));
         int $$4 = $$3.size();

         for (buk $$5 : $$2) {
            if ($$5.j() == null) {
               $$5.h($$3.get($$0.z.a($$4)));
            }
         }
      }
   }

   public static void a(cpl $$0, gu $$1) {
      a($$0, $$1, new cix(cja.vA, 3));
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      cix $$6 = $$3.b($$4);
      int $$7 = $$0.c(b);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cis $$9 = $$6.d();
         if ($$6.a(cja.rg)) {
            $$1.a($$3, $$3.dp(), $$3.dr(), $$3.dv(), aow.bI, aox.e, 1.0F, 1.0F);
            a($$1, $$2);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$8 = true;
            $$1.a($$3, djj.M, $$2);
         } else if ($$6.a(cja.rw)) {
            $$6.h(1);
            $$1.a($$3, $$3.dp(), $$3.dr(), $$3.dv(), aow.ci, aox.e, 1.0F, 1.0F);
            if ($$6.b()) {
               $$3.a($$4, new cix(cja.vD));
            } else if (!$$3.fQ().e(new cix(cja.vD))) {
               $$3.a(new cix(cja.vD), false);
            }

            $$8 = true;
            $$1.a($$3, djj.y, $$2);
         }

         if (!$$1.r_() && $$8) {
            $$3.b(apg.c.b($$9));
         }
      }

      if ($$8) {
         if (!csy.a($$1, $$2)) {
            if (this.c($$1, $$2)) {
               this.b($$1, $$2);
            }

            this.a($$1, $$0, $$2, $$3, dci.b.c);
         } else {
            this.a($$1, $$0, $$2);
         }

         return bgq.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private boolean c(cpl $$0, gu $$1) {
      return $$0.c_($$1) instanceof dci $$3 ? !$$3.d() : false;
   }

   public void a(cpl $$0, dez $$1, gu $$2, @Nullable cbm $$3, dci.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dci $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(cpl $$0, dez $$1, gu $$2) {
      $$0.a($$2, $$1.a(b, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, aru $$3) {
      if ($$0.c(b) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(cpl $$0, gu $$1, dez $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         ehw $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(ha.a.b);
         if ($$4 >= 1.0 && !$$2.a(apl.an)) {
            double $$5 = $$3.b(ha.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               gu $$6 = $$1.d();
               dez $$7 = $$0.a_($$6);
               ehw $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(ha.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(cpl $$0, gu $$1, ehw $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(ha.a.a), (double)$$1.u() + $$2.c(ha.a.a), (double)$$1.w() + $$2.b(ha.a.c), (double)$$1.w() + $$2.c(ha.a.c), $$3);
   }

   private void a(cpl $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(iv.ap, arp.d($$0.z.j(), $$1, $$2), $$5, arp.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dez a(clf $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(b, a);
   }

   @Override
   public cyq b_(dez $$0) {
      return cyq.c;
   }

   @Nullable
   @Override
   public dcl a(gu $$0, dez $$1) {
      return new dci($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcl> dcm<T> a(cpl $$0, dez $$1, dcn<T> $$2) {
      return $$0.B ? null : a($$2, dcn.H, dci::a);
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, cbm $$3) {
      if (!$$0.B && $$3.f() && $$0.X().b(cph.g) && $$0.c_($$1) instanceof dci $$5) {
         cix $$6 = new cix(this);
         int $$7 = $$2.c(b);
         boolean $$8 = !$$5.d();
         if ($$8 || $$7 > 0) {
            if ($$8) {
               qr $$9 = new qr();
               $$9.a("Bees", $$5.j());
               cgq.a($$6, dcn.H, $$9);
            }

            qr $$10 = new qr();
            $$10.a("honey_level", $$7);
            $$6.a("BlockStateTag", $$10);
            byf $$11 = new byf($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
            $$11.o();
            $$0.b($$11);
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<cix> a(dez $$0, ecm.a $$1) {
      bii $$2 = $$1.b(eer.a);
      if ($$2 instanceof byg || $$2 instanceof bym || $$2 instanceof ccr || $$2 instanceof bxt || $$2 instanceof cdp) {
         dcl $$3 = $$1.b(eer.h);
         if ($$3 instanceof dci $$4) {
            $$4.a(null, $$0, dci.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$3.a_($$5).b() instanceof cvh && $$3.c_($$4) instanceof dci $$7) {
         $$7.a(null, $$0, dci.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
