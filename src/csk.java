import java.util.List;
import javax.annotation.Nullable;

public class csk extends csd {
   public static final dfy a = cwj.aC;
   public static final dge b = dfu.aN;
   public static final int c = 5;
   private static final int d = 3;

   public csk(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)).a(a, hc.c));
   }

   @Override
   public boolean d_(dfe $$0) {
      return true;
   }

   @Override
   public int a(dfe $$0, cpq $$1, gw $$2) {
      return $$0.c(b);
   }

   @Override
   public void a(cpq $$0, cbp $$1, gw $$2, dfe $$3, @Nullable dcq $$4, cja $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dcn $$6) {
         if (cnl.a(cnn.v, $$5) == 0) {
            $$6.a($$1, $$3, dcn.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         al.K.a((ako)$$1, $$3, $$5, $$6.g());
      }
   }

   private void b(cpq $$0, gw $$1) {
      List<bun> $$2 = $$0.a(bun.class, new ehd($$1).c(8.0, 6.0, 8.0));
      if (!$$2.isEmpty()) {
         List<cbp> $$3 = $$0.a(cbp.class, new ehd($$1).c(8.0, 6.0, 8.0));
         int $$4 = $$3.size();

         for (bun $$5 : $$2) {
            if ($$5.j() == null) {
               $$5.h($$3.get($$0.z.a($$4)));
            }
         }
      }
   }

   public static void a(cpq $$0, gw $$1) {
      a($$0, $$1, new cja(cjd.vA, 3));
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      cja $$6 = $$3.b($$4);
      int $$7 = $$0.c(b);
      boolean $$8 = false;
      if ($$7 >= 5) {
         civ $$9 = $$6.d();
         if ($$6.a(cjd.rg)) {
            $$1.a($$3, $$3.dp(), $$3.dr(), $$3.dv(), aoz.bI, apa.e, 1.0F, 1.0F);
            a($$1, $$2);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$8 = true;
            $$1.a($$3, djo.M, $$2);
         } else if ($$6.a(cjd.rw)) {
            $$6.h(1);
            $$1.a($$3, $$3.dp(), $$3.dr(), $$3.dv(), aoz.ci, apa.e, 1.0F, 1.0F);
            if ($$6.b()) {
               $$3.a($$4, new cja(cjd.vD));
            } else if (!$$3.fQ().e(new cja(cjd.vD))) {
               $$3.a(new cja(cjd.vD), false);
            }

            $$8 = true;
            $$1.a($$3, djo.y, $$2);
         }

         if (!$$1.r_() && $$8) {
            $$3.b(apj.c.b($$9));
         }
      }

      if ($$8) {
         if (!ctd.a($$1, $$2)) {
            if (this.c($$1, $$2)) {
               this.b($$1, $$2);
            }

            this.a($$1, $$0, $$2, $$3, dcn.b.c);
         } else {
            this.a($$1, $$0, $$2);
         }

         return bgt.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private boolean c(cpq $$0, gw $$1) {
      return $$0.c_($$1) instanceof dcn $$3 ? !$$3.d() : false;
   }

   public void a(cpq $$0, dfe $$1, gw $$2, @Nullable cbp $$3, dcn.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dcn $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(cpq $$0, dfe $$1, gw $$2) {
      $$0.a($$2, $$1.a(b, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, arx $$3) {
      if ($$0.c(b) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(cpq $$0, gw $$1, dfe $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         eib $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(hc.a.b);
         if ($$4 >= 1.0 && !$$2.a(apo.an)) {
            double $$5 = $$3.b(hc.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               gw $$6 = $$1.d();
               dfe $$7 = $$0.a_($$6);
               eib $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(hc.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(cpq $$0, gw $$1, eib $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(hc.a.a), (double)$$1.u() + $$2.c(hc.a.a), (double)$$1.w() + $$2.b(hc.a.c), (double)$$1.w() + $$2.c(hc.a.c), $$3);
   }

   private void a(cpq $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(ix.ap, ars.d($$0.z.j(), $$1, $$2), $$5, ars.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dfe a(cli $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(b, a);
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.c;
   }

   @Nullable
   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new dcn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcq> dcr<T> a(cpq $$0, dfe $$1, dcs<T> $$2) {
      return $$0.B ? null : a($$2, dcs.H, dcn::a);
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, cbp $$3) {
      if (!$$0.B && $$3.f() && $$0.X().b(cpm.g) && $$0.c_($$1) instanceof dcn $$5) {
         cja $$6 = new cja(this);
         int $$7 = $$2.c(b);
         boolean $$8 = !$$5.d();
         if ($$8 || $$7 > 0) {
            if ($$8) {
               qu $$9 = new qu();
               $$9.a("Bees", $$5.j());
               cgt.a($$6, dcs.H, $$9);
            }

            qu $$10 = new qu();
            $$10.a("honey_level", $$7);
            $$6.a("BlockStateTag", $$10);
            byi $$11 = new byi($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
            $$11.o();
            $$0.b($$11);
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<cja> a(dfe $$0, ecr.a $$1) {
      bil $$2 = $$1.b(eew.a);
      if ($$2 instanceof byj || $$2 instanceof byp || $$2 instanceof ccu || $$2 instanceof bxw || $$2 instanceof cds) {
         dcq $$3 = $$1.b(eew.h);
         if ($$3 instanceof dcn $$4) {
            $$4.a(null, $$0, dcn.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$3.a_($$5).b() instanceof cvm && $$3.c_($$4) instanceof dcn $$7) {
         $$7.a(null, $$0, dcn.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
