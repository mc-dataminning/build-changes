import java.util.List;
import javax.annotation.Nullable;

public class csg extends crz {
   public static final dfu a = cwf.aC;
   public static final dga b = dfq.aN;
   public static final int c = 5;
   private static final int d = 3;

   public csg(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)).a(a, ha.c));
   }

   @Override
   public boolean d_(dfa $$0) {
      return true;
   }

   @Override
   public int a(dfa $$0, cpm $$1, gu $$2) {
      return $$0.c(b);
   }

   @Override
   public void a(cpm $$0, cbn $$1, gu $$2, dfa $$3, @Nullable dcm $$4, ciy $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dcj $$6) {
         if (cnh.a(cnj.v, $$5) == 0) {
            $$6.a($$1, $$3, dcj.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         ai.K.a((akl)$$1, $$3, $$5, $$6.g());
      }
   }

   private void b(cpm $$0, gu $$1) {
      List<bul> $$2 = $$0.a(bul.class, new egz($$1).c(8.0, 6.0, 8.0));
      if (!$$2.isEmpty()) {
         List<cbn> $$3 = $$0.a(cbn.class, new egz($$1).c(8.0, 6.0, 8.0));
         int $$4 = $$3.size();

         for (bul $$5 : $$2) {
            if ($$5.j() == null) {
               $$5.h($$3.get($$0.z.a($$4)));
            }
         }
      }
   }

   public static void a(cpm $$0, gu $$1) {
      a($$0, $$1, new ciy(cjb.vA, 3));
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      ciy $$6 = $$3.b($$4);
      int $$7 = $$0.c(b);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cit $$9 = $$6.d();
         if ($$6.a(cjb.rg)) {
            $$1.a($$3, $$3.dp(), $$3.dr(), $$3.dv(), aow.bI, aox.e, 1.0F, 1.0F);
            a($$1, $$2);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$8 = true;
            $$1.a($$3, djk.M, $$2);
         } else if ($$6.a(cjb.rw)) {
            $$6.h(1);
            $$1.a($$3, $$3.dp(), $$3.dr(), $$3.dv(), aow.ci, aox.e, 1.0F, 1.0F);
            if ($$6.b()) {
               $$3.a($$4, new ciy(cjb.vD));
            } else if (!$$3.fQ().e(new ciy(cjb.vD))) {
               $$3.a(new ciy(cjb.vD), false);
            }

            $$8 = true;
            $$1.a($$3, djk.y, $$2);
         }

         if (!$$1.r_() && $$8) {
            $$3.b(apg.c.b($$9));
         }
      }

      if ($$8) {
         if (!csz.a($$1, $$2)) {
            if (this.c($$1, $$2)) {
               this.b($$1, $$2);
            }

            this.a($$1, $$0, $$2, $$3, dcj.b.c);
         } else {
            this.a($$1, $$0, $$2);
         }

         return bgq.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private boolean c(cpm $$0, gu $$1) {
      return $$0.c_($$1) instanceof dcj $$3 ? !$$3.d() : false;
   }

   public void a(cpm $$0, dfa $$1, gu $$2, @Nullable cbn $$3, dcj.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dcj $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(cpm $$0, dfa $$1, gu $$2) {
      $$0.a($$2, $$1.a(b, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, aru $$3) {
      if ($$0.c(b) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(cpm $$0, gu $$1, dfa $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         ehx $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(ha.a.b);
         if ($$4 >= 1.0 && !$$2.a(apl.an)) {
            double $$5 = $$3.b(ha.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               gu $$6 = $$1.d();
               dfa $$7 = $$0.a_($$6);
               ehx $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(ha.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(cpm $$0, gu $$1, ehx $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(ha.a.a), (double)$$1.u() + $$2.c(ha.a.a), (double)$$1.w() + $$2.b(ha.a.c), (double)$$1.w() + $$2.c(ha.a.c), $$3);
   }

   private void a(cpm $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(iv.ap, arp.d($$0.z.j(), $$1, $$2), $$5, arp.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dfa a(clg $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(b, a);
   }

   @Override
   public cyr b_(dfa $$0) {
      return cyr.c;
   }

   @Nullable
   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new dcj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcm> dcn<T> a(cpm $$0, dfa $$1, dco<T> $$2) {
      return $$0.B ? null : a($$2, dco.H, dcj::a);
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, cbn $$3) {
      if (!$$0.B && $$3.f() && $$0.X().b(cpi.g) && $$0.c_($$1) instanceof dcj $$5) {
         ciy $$6 = new ciy(this);
         int $$7 = $$2.c(b);
         boolean $$8 = !$$5.d();
         if ($$8 || $$7 > 0) {
            if ($$8) {
               qr $$9 = new qr();
               $$9.a("Bees", $$5.j());
               cgr.a($$6, dco.H, $$9);
            }

            qr $$10 = new qr();
            $$10.a("honey_level", $$7);
            $$6.a("BlockStateTag", $$10);
            byg $$11 = new byg($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
            $$11.o();
            $$0.b($$11);
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<ciy> a(dfa $$0, ecn.a $$1) {
      bii $$2 = $$1.b(ees.a);
      if ($$2 instanceof byh || $$2 instanceof byn || $$2 instanceof ccs || $$2 instanceof bxu || $$2 instanceof cdq) {
         dcm $$3 = $$1.b(ees.h);
         if ($$3 instanceof dcj $$4) {
            $$4.a(null, $$0, dcj.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$3.a_($$5).b() instanceof cvi && $$3.c_($$4) instanceof dcj $$7) {
         $$7.a(null, $$0, dcj.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
