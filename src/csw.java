import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class csw extends cso {
   public static final MapCodec<csw> a = b(csw::new);
   public static final dfx b = cww.aE;
   public static final dgd c = dft.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<csw> a() {
      return a;
   }

   public csw(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, ha.c));
   }

   @Override
   public boolean d_(dfd $$0) {
      return true;
   }

   @Override
   public int a(dfd $$0, cqb $$1, gw $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(cqb $$0, cca $$1, gw $$2, dfd $$3, @Nullable dcz $$4, cjl $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dcw $$6) {
         if (cnw.a(cny.v, $$5) == 0) {
            $$6.a($$1, $$3, dcw.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         al.K.a((aku)$$1, $$3, $$5, $$6.g());
      }
   }

   private void b(cqb $$0, gw $$1) {
      ehc $$2 = new ehc($$1).c(8.0, 6.0, 8.0);
      List<buy> $$3 = $$0.a(buy.class, $$2);
      if (!$$3.isEmpty()) {
         List<cca> $$4 = $$0.a(cca.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (buy $$5 : $$3) {
            if ($$5.q() == null) {
               cca $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(cqb $$0, gw $$1) {
      a($$0, $$1, new cjl(cjo.vA, 3));
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      cjl $$6 = $$3.b($$4);
      int $$7 = $$0.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cjg $$9 = $$6.d();
         if ($$6.a(cjo.rg)) {
            $$1.a($$3, $$3.dq(), $$3.ds(), $$3.dw(), apg.bI, aph.e, 1.0F, 1.0F);
            a($$1, $$2);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$8 = true;
            $$1.a($$3, djn.M, $$2);
         } else if ($$6.a(cjo.rw)) {
            $$6.h(1);
            $$1.a($$3, $$3.dq(), $$3.ds(), $$3.dw(), apg.ci, aph.e, 1.0F, 1.0F);
            if ($$6.b()) {
               $$3.a($$4, new cjl(cjo.vD));
            } else if (!$$3.fS().e(new cjl(cjo.vD))) {
               $$3.a(new cjl(cjo.vD), false);
            }

            $$8 = true;
            $$1.a($$3, djn.y, $$2);
         }

         if (!$$1.w_() && $$8) {
            $$3.b(apq.c.b($$9));
         }
      }

      if ($$8) {
         if (!ctq.a($$1, $$2)) {
            if (this.c($$1, $$2)) {
               this.b($$1, $$2);
            }

            this.a($$1, $$0, $$2, $$3, dcw.b.c);
         } else {
            this.a($$1, $$0, $$2);
         }

         return bhe.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private boolean c(cqb $$0, gw $$1) {
      return $$0.c_($$1) instanceof dcw $$3 ? !$$3.d() : false;
   }

   public void a(cqb $$0, dfd $$1, gw $$2, @Nullable cca $$3, dcw.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dcw $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(cqb $$0, dfd $$1, gw $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(cqb $$0, gw $$1, dfd $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         eia $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(ha.a.b);
         if ($$4 >= 1.0 && !$$2.a(apv.an)) {
            double $$5 = $$3.b(ha.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               gw $$6 = $$1.d();
               dfd $$7 = $$0.a_($$6);
               eia $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(ha.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(cqb $$0, gw $$1, eia $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(ha.a.a), (double)$$1.u() + $$2.c(ha.a.a), (double)$$1.w() + $$2.b(ha.a.c), (double)$$1.w() + $$2.c(ha.a.c), $$3);
   }

   private void a(cqb $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(iv.ap, asb.d($$0.z.j(), $$1, $$2), $$5, asb.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dfd a(clt $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(c, b);
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.c;
   }

   @Nullable
   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new dcw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcz> dda<T> a(cqb $$0, dfd $$1, ddb<T> $$2) {
      return $$0.B ? null : a($$2, ddb.H, dcw::a);
   }

   @Override
   public dfd a(cqb $$0, gw $$1, dfd $$2, cca $$3) {
      if (!$$0.B && $$3.f() && $$0.X().b(cpx.g) && $$0.c_($$1) instanceof dcw $$5) {
         cjl $$6 = new cjl(this);
         int $$7 = $$2.c(c);
         boolean $$8 = !$$5.d();
         if ($$8 || $$7 > 0) {
            if ($$8) {
               qw $$9 = new qw();
               $$9.a("Bees", $$5.j());
               che.a($$6, ddb.H, $$9);
            }

            qw $$10 = new qw();
            $$10.a("honey_level", $$7);
            $$6.a("BlockStateTag", $$10);
            byt $$11 = new byt($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
            $$11.t();
            $$0.b($$11);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<cjl> a(dfd $$0, ecq.a $$1) {
      biw $$2 = $$1.b(eev.a);
      if ($$2 instanceof byu || $$2 instanceof bza || $$2 instanceof cdf || $$2 instanceof byh || $$2 instanceof ced) {
         dcz $$3 = $$1.b(eev.h);
         if ($$3 instanceof dcw $$4) {
            $$4.a(null, $$0, dcw.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$3.a_($$5).b() instanceof cwa && $$3.c_($$4) instanceof dcw $$7) {
         $$7.a(null, $$0, dcw.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
