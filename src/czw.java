import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class czw extends czo {
   public static final MapCodec<czw> a = b(czw::new);
   public static final dnv b = ddx.aE;
   public static final dob c = dnr.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<czw> a() {
      return a;
   }

   public czw(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, ih.c));
   }

   @Override
   protected boolean d_(dnb $$0) {
      return true;
   }

   @Override
   protected int a(dnb $$0, cxb $$1, ib $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(cxb $$0, ciu $$1, ib $$2, dnb $$3, @Nullable dki $$4, cqm $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dkf $$6) {
         if (cux.a(cuz.v, $$5) == 0) {
            $$6.a($$1, $$3, dkf.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         am.L.a((apg)$$1, $$3, $$5, $$6.f());
      }
   }

   private void b(cxb $$0, ib $$1) {
      epo $$2 = new epo($$1).c(8.0, 6.0, 8.0);
      List<cbf> $$3 = $$0.a(cbf.class, $$2);
      if (!$$3.isEmpty()) {
         List<ciu> $$4 = $$0.a(ciu.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cbf $$5 : $$3) {
            if ($$5.p() == null) {
               ciu $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(cxb $$0, ib $$1) {
      a($$0, $$1, new cqm(cqp.ws, 3));
   }

   @Override
   protected bnf a(cqm $$0, dnb $$1, cxb $$2, ib $$3, ciu $$4, bnc $$5, epp $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cqh $$9 = $$0.d();
         if ($$0.a(cqp.rU)) {
            $$2.a($$4, $$4.dr(), $$4.dt(), $$4.dx(), aty.bX, atz.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bpp.d($$5));
            $$8 = true;
            $$2.a($$4, drp.M, $$3);
         } else if ($$0.a(cqp.sk)) {
            $$0.h(1);
            $$2.a($$4, $$4.dr(), $$4.dt(), $$4.dx(), aty.cB, atz.e, 1.0F, 1.0F);
            if ($$0.b()) {
               $$4.a($$5, new cqm(cqp.wv));
            } else if (!$$4.fZ().e(new cqm(cqp.wv))) {
               $$4.a(new cqm(cqp.wv), false);
            }

            $$8 = true;
            $$2.a($$4, drp.y, $$3);
         }

         if (!$$2.x_() && $$8) {
            $$4.b(aui.c.b($$9));
         }
      }

      if ($$8) {
         if (!daq.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dkf.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bnf.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(cxb $$0, ib $$1) {
      return $$0.c_($$1) instanceof dkf $$3 ? !$$3.c() : false;
   }

   public void a(cxb $$0, dnb $$1, ib $$2, @Nullable ciu $$3, dkf.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dkf $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(cxb $$0, dnb $$1, ib $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(cxb $$0, ib $$1, dnb $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         eqm $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(ih.a.b);
         if ($$4 >= 1.0 && !$$2.a(aun.ao)) {
            double $$5 = $$3.b(ih.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               ib $$6 = $$1.d();
               dnb $$7 = $$0.a_($$6);
               eqm $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(ih.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(cxb $$0, ib $$1, eqm $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(ih.a.a), (double)$$1.u() + $$2.c(ih.a.a), (double)$$1.w() + $$2.b(ih.a.c), (double)$$1.w() + $$2.c(ih.a.c), $$3);
   }

   private void a(cxb $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(kc.at, aww.d($$0.z.j(), $$1, $$2), $$5, aww.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dnb a(csu $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.c;
   }

   @Nullable
   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dkf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dki> dkj<T> a(cxb $$0, dnb $$1, dkk<T> $$2) {
      return $$0.B ? null : a($$2, dkk.H, dkf::a);
   }

   @Override
   public dnb a(cxb $$0, ib $$1, dnb $$2, ciu $$3) {
      if (!$$0.B && $$3.f() && $$0.Z().b(cwx.h) && $$0.c_($$1) instanceof dkf $$5) {
         cqm $$6 = new cqm(this);
         int $$7 = $$2.c(c);
         boolean $$8 = !$$5.c();
         if ($$8 || $$7 > 0) {
            if ($$8) {
               ta $$9 = new ta();
               $$9.a("Bees", $$5.k());
               coh.a($$6, dkk.H, $$9);
            }

            ta $$10 = new ta();
            $$10.a("honey_level", $$7);
            $$6.a("BlockStateTag", $$10);
            cfe $$11 = new cfe($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
            $$11.s();
            $$0.b($$11);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cqm> a(dnb $$0, elc.a $$1) {
      box $$2 = $$1.b(enh.a);
      if ($$2 instanceof cff || $$2 instanceof cfm || $$2 instanceof cka || $$2 instanceof ces || $$2 instanceof clb) {
         dki $$3 = $$1.b(enh.h);
         if ($$3 instanceof dkf $$4) {
            $$4.a(null, $$0, dkf.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$3.a_($$5).b() instanceof ddc && $$3.c_($$4) instanceof dkf $$7) {
         $$7.a(null, $$0, dkf.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dnb a(dnb $$0, dgo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
