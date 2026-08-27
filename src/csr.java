import java.util.List;
import javax.annotation.Nullable;

public class csr extends csk {
   public static final dgf a = cwq.aC;
   public static final dgl b = dgb.aN;
   public static final int c = 5;
   private static final int d = 3;

   public csr(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)).a(a, hc.c));
   }

   @Override
   public boolean d_(dfl $$0) {
      return true;
   }

   @Override
   public int a(dfl $$0, cpx $$1, gw $$2) {
      return $$0.c(b);
   }

   @Override
   public void a(cpx $$0, cbw $$1, gw $$2, dfl $$3, @Nullable dcx $$4, cjh $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dcu $$6) {
         if (cns.a(cnu.v, $$5) == 0) {
            $$6.a($$1, $$3, dcu.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         al.K.a((akt)$$1, $$3, $$5, $$6.g());
      }
   }

   private void b(cpx $$0, gw $$1) {
      List<buu> $$2 = $$0.a(buu.class, new ehk($$1).c(8.0, 6.0, 8.0));
      if (!$$2.isEmpty()) {
         List<cbw> $$3 = $$0.a(cbw.class, new ehk($$1).c(8.0, 6.0, 8.0));
         int $$4 = $$3.size();

         for (buu $$5 : $$2) {
            if ($$5.q() == null) {
               $$5.h($$3.get($$0.z.a($$4)));
            }
         }
      }
   }

   public static void a(cpx $$0, gw $$1) {
      a($$0, $$1, new cjh(cjk.vA, 3));
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      cjh $$6 = $$3.b($$4);
      int $$7 = $$0.c(b);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cjc $$9 = $$6.d();
         if ($$6.a(cjk.rg)) {
            $$1.a($$3, $$3.dq(), $$3.ds(), $$3.dw(), apf.bI, apg.e, 1.0F, 1.0F);
            a($$1, $$2);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$8 = true;
            $$1.a($$3, djv.M, $$2);
         } else if ($$6.a(cjk.rw)) {
            $$6.h(1);
            $$1.a($$3, $$3.dq(), $$3.ds(), $$3.dw(), apf.ci, apg.e, 1.0F, 1.0F);
            if ($$6.b()) {
               $$3.a($$4, new cjh(cjk.vD));
            } else if (!$$3.fR().e(new cjh(cjk.vD))) {
               $$3.a(new cjh(cjk.vD), false);
            }

            $$8 = true;
            $$1.a($$3, djv.y, $$2);
         }

         if (!$$1.w_() && $$8) {
            $$3.b(app.c.b($$9));
         }
      }

      if ($$8) {
         if (!ctk.a($$1, $$2)) {
            if (this.c($$1, $$2)) {
               this.b($$1, $$2);
            }

            this.a($$1, $$0, $$2, $$3, dcu.b.c);
         } else {
            this.a($$1, $$0, $$2);
         }

         return bha.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private boolean c(cpx $$0, gw $$1) {
      return $$0.c_($$1) instanceof dcu $$3 ? !$$3.d() : false;
   }

   public void a(cpx $$0, dfl $$1, gw $$2, @Nullable cbw $$3, dcu.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dcu $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(cpx $$0, dfl $$1, gw $$2) {
      $$0.a($$2, $$1.a(b, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, ase $$3) {
      if ($$0.c(b) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(cpx $$0, gw $$1, dfl $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         eii $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(hc.a.b);
         if ($$4 >= 1.0 && !$$2.a(apu.an)) {
            double $$5 = $$3.b(hc.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               gw $$6 = $$1.d();
               dfl $$7 = $$0.a_($$6);
               eii $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(hc.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(cpx $$0, gw $$1, eii $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(hc.a.a), (double)$$1.u() + $$2.c(hc.a.a), (double)$$1.w() + $$2.b(hc.a.c), (double)$$1.w() + $$2.c(hc.a.c), $$3);
   }

   private void a(cpx $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(ix.ap, ary.d($$0.z.j(), $$1, $$2), $$5, ary.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dfl a(clp $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(b, a);
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.c;
   }

   @Nullable
   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new dcu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcx> dcy<T> a(cpx $$0, dfl $$1, dcz<T> $$2) {
      return $$0.B ? null : a($$2, dcz.H, dcu::a);
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, cbw $$3) {
      if (!$$0.B && $$3.f() && $$0.X().b(cpt.g) && $$0.c_($$1) instanceof dcu $$5) {
         cjh $$6 = new cjh(this);
         int $$7 = $$2.c(b);
         boolean $$8 = !$$5.d();
         if ($$8 || $$7 > 0) {
            if ($$8) {
               qy $$9 = new qy();
               $$9.a("Bees", $$5.j());
               cha.a($$6, dcz.H, $$9);
            }

            qy $$10 = new qy();
            $$10.a("honey_level", $$7);
            $$6.a("BlockStateTag", $$10);
            byp $$11 = new byp($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
            $$11.t();
            $$0.b($$11);
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<cjh> a(dfl $$0, ecy.a $$1) {
      bis $$2 = $$1.b(efd.a);
      if ($$2 instanceof byq || $$2 instanceof byw || $$2 instanceof cdb || $$2 instanceof byd || $$2 instanceof cdz) {
         dcx $$3 = $$1.b(efd.h);
         if ($$3 instanceof dcu $$4) {
            $$4.a(null, $$0, dcu.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$3.a_($$5).b() instanceof cvt && $$3.c_($$4) instanceof dcu $$7) {
         $$7.a(null, $$0, dcu.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
