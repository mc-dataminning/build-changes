import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dez extends der {
   public static final MapCodec<dez> a = b(dez::new);
   public static final dtb b = djb.aE;
   public static final dth c = dsx.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dez> a() {
      return a;
   }

   public dez(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, jf.c));
   }

   @Override
   protected boolean c_(dsh $$0) {
      return true;
   }

   @Override
   protected int a(dsh $$0, dcd $$1, ja $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dcd $$0, cmh $$1, ja $$2, dsh $$3, @Nullable dpn $$4, cua $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dpk $$6) {
         if (!czl.a($$5, avx.q)) {
            $$6.a($$1, $$3, dpk.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         am.L.a((aql)$$1, $$3, $$5, $$6.f());
      }
   }

   private void b(dcd $$0, ja $$1) {
      evu $$2 = new evu($$1).c(8.0, 6.0, 8.0);
      List<cep> $$3 = $$0.a(cep.class, $$2);
      if (!$$3.isEmpty()) {
         List<cmh> $$4 = $$0.a(cmh.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cep $$5 : $$3) {
            if ($$5.p() == null) {
               cmh $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dcd $$0, ja $$1) {
      a($$0, $$1, new cua(cud.wz, 3));
   }

   @Override
   protected bqf a(cua $$0, dsh $$1, dcd $$2, ja $$3, cmh $$4, bqc $$5, evv $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         ctv $$9 = $$0.g();
         if ($$0.a(cud.rV)) {
            $$2.a($$4, $$4.du(), $$4.dw(), $$4.dA(), avf.bX, avg.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bsy.d($$5));
            $$8 = true;
            $$2.a($$4, dxa.M, $$3);
         } else if ($$0.a(cud.sl)) {
            $$0.h(1);
            $$2.a($$4, $$4.du(), $$4.dw(), $$4.dA(), avf.cC, avg.e, 1.0F, 1.0F);
            if ($$0.e()) {
               $$4.a($$5, new cua(cud.wC));
            } else if (!$$4.fY().f(new cua(cud.wC))) {
               $$4.a(new cua(cud.wC), false);
            }

            $$8 = true;
            $$2.a($$4, dxa.y, $$3);
         }

         if (!$$2.x_() && $$8) {
            $$4.b(avp.c.b($$9));
         }
      }

      if ($$8) {
         if (!dft.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dpk.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bqf.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dcd $$0, ja $$1) {
      return $$0.c_($$1) instanceof dpk $$3 ? !$$3.c() : false;
   }

   public void a(dcd $$0, dsh $$1, ja $$2, @Nullable cmh $$3, dpk.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dpk $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dcd $$0, dsh $$1, ja $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dsh $$0, dcd $$1, ja $$2, aym $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dcd $$0, ja $$1, dsh $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         ews $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(jf.a.b);
         if ($$4 >= 1.0 && !$$2.a(avu.ao)) {
            double $$5 = $$3.b(jf.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               ja $$6 = $$1.d();
               dsh $$7 = $$0.a_($$6);
               ews $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(jf.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dcd $$0, ja $$1, ews $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(jf.a.a), (double)$$1.u() + $$2.c(jf.a.a), (double)$$1.w() + $$2.b(jf.a.c), (double)$$1.w() + $$2.c(jf.a.c), $$3);
   }

   private void a(dcd $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(lj.av, aye.d($$0.z.j(), $$1, $$2), $$5, aye.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dsh a(cxk $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.c;
   }

   @Nullable
   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dpk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpn> dpo<T> a(dcd $$0, dsh $$1, dpp<T> $$2) {
      return $$0.B ? null : a($$2, dpp.H, dpk::a);
   }

   @Override
   public dsh a(dcd $$0, ja $$1, dsh $$2, cmh $$3) {
      if (!$$0.B && $$3.f() && $$0.ab().b(dbz.h) && $$0.c_($$1) instanceof dpk $$5) {
         int $$6 = $$2.c(c);
         boolean $$7 = !$$5.c();
         if ($$7 || $$6 > 0) {
            cua $$8 = new cua(this);
            $$8.b($$5.s());
            $$8.b(kn.ab, cwk.a.a(c, $$6));
            cir $$9 = new cir($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
            $$9.v();
            $$0.b($$9);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cua> a(dsh $$0, eqr.a $$1) {
      bsd $$2 = $$1.b(etk.a);
      if ($$2 instanceof cis || $$2 instanceof ciz || $$2 instanceof cnn || $$2 instanceof cie || $$2 instanceof cop) {
         dpn $$3 = $$1.b(etk.h);
         if ($$3 instanceof dpk $$4) {
            $$4.a(null, $$0, dpk.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$3.a_($$5).b() instanceof dif && $$3.c_($$4) instanceof dpk $$7) {
         $$7.a(null, $$0, dpk.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dsh a(dsh $$0, dls $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
