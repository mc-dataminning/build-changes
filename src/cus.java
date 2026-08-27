import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class cus extends cvf {
   private static final int c = 8;
   private final float d;
   protected static final float a = 1.0F;
   protected static final eks b = cvf.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   public cus(dhm.d $$0, float $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends cus> a();

   @Override
   public dhn a(cnw $$0) {
      return a($$0.q(), $$0.a());
   }

   public static dhn a(crl $$0, hx $$1) {
      hx $$2 = $$1.d();
      dhn $$3 = $$0.a_($$2);
      return dcp.h($$3) ? cvh.cs.o() : ((cyf)cvh.cr).b($$0, $$1);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return b;
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      if ($$3.a(24) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aqv.ig, aqw.e, 1.0F + $$3.i(), $$3.i() * 0.7F + 0.3F, false);
      }

      hx $$4 = $$2.d();
      dhn $$5 = $$1.a_($$4);
      if (!this.f($$5) && !$$5.d($$1, $$4, ib.b)) {
         if (this.f($$1.a_($$2.g()))) {
            for (int $$10 = 0; $$10 < 2; $$10++) {
               double $$11 = (double)$$2.u() + $$3.j() * 0.1F;
               double $$12 = (double)$$2.v() + $$3.j();
               double $$13 = (double)$$2.w() + $$3.j();
               $$1.a(jw.S, $$11, $$12, $$13, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.h()))) {
            for (int $$14 = 0; $$14 < 2; $$14++) {
               double $$15 = (double)($$2.u() + 1) - $$3.j() * 0.1F;
               double $$16 = (double)$$2.v() + $$3.j();
               double $$17 = (double)$$2.w() + $$3.j();
               $$1.a(jw.S, $$15, $$16, $$17, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.e()))) {
            for (int $$18 = 0; $$18 < 2; $$18++) {
               double $$19 = (double)$$2.u() + $$3.j();
               double $$20 = (double)$$2.v() + $$3.j();
               double $$21 = (double)$$2.w() + $$3.j() * 0.1F;
               $$1.a(jw.S, $$19, $$20, $$21, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.f()))) {
            for (int $$22 = 0; $$22 < 2; $$22++) {
               double $$23 = (double)$$2.u() + $$3.j();
               double $$24 = (double)$$2.v() + $$3.j();
               double $$25 = (double)($$2.w() + 1) - $$3.j() * 0.1F;
               $$1.a(jw.S, $$23, $$24, $$25, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.c()))) {
            for (int $$26 = 0; $$26 < 2; $$26++) {
               double $$27 = (double)$$2.u() + $$3.j();
               double $$28 = (double)($$2.v() + 1) - $$3.j() * 0.1F;
               double $$29 = (double)$$2.w() + $$3.j();
               $$1.a(jw.S, $$27, $$28, $$29, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j() * 0.5 + 0.5;
            double $$9 = (double)$$2.w() + $$3.j();
            $$1.a(jw.S, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   protected abstract boolean f(dhn var1);

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, bkv $$3) {
      if (!$$3.aY()) {
         $$3.h($$3.az() + 1);
         if ($$3.az() == 0) {
            $$3.g(8);
         }
      }

      $$3.a($$1.ah().a(), this.d);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (a($$1)) {
            Optional<edv> $$5 = edv.a($$1, $$2, ib.a.a);
            if ($$5.isPresent()) {
               $$5.get().b();
               return;
            }
         }

         if (!$$0.a((csi)$$1, $$2)) {
            $$1.a($$2, false);
         }
      }
   }

   private static boolean a(csf $$0) {
      return $$0.ad() == csf.h || $$0.ad() == csf.i;
   }

   @Override
   protected void a(csf $$0, cdz $$1, hx $$2, dhn $$3) {
   }

   @Override
   public dhn a(csf $$0, hx $$1, dhn $$2, cdz $$3) {
      if (!$$0.y_()) {
         $$0.a(null, 1009, $$1, 0);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean a(csf $$0, hx $$1, ib $$2) {
      dhn $$3 = $$0.a_($$1);
      return !$$3.i() ? false : a($$0, $$1).a((csi)$$0, $$1) || b($$0, $$1, $$2);
   }

   private static boolean b(csf $$0, hx $$1, ib $$2) {
      if (!a($$0)) {
         return false;
      } else {
         hx.a $$3 = $$1.j();
         boolean $$4 = false;

         for (ib $$5 : ib.values()) {
            if ($$0.a_($$3.g($$1).c($$5)).a(cvh.co)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            ib.a $$6 = $$2.o().d() ? $$2.i().o() : ib.c.a.b($$0.z);
            return edv.a($$0, $$1, $$6).isPresent();
         }
      }
   }
}
