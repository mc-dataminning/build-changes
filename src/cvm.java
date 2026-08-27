import com.mojang.serialization.MapCodec;

public class cvm extends cva {
   public static final MapCodec<cvm> a = b(cvm::new);
   public static final int b = 6;
   public static final dii c = dhy.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final ekn[] g = new ekn[]{
      cva.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cva.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cva.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cva.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cva.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cva.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cva.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<cvm> a() {
      return a;
   }

   protected cvm(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return g[$$0.c(c)];
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      clj $$6 = $$3.b($$4);
      cle $$7 = $$6.d();
      if ($$6.a(aro.ai) && $$0.c(c) == 0) {
         cva $$8 = cva.a($$7);
         if ($$8 instanceof cvp) {
            if (!$$3.f()) {
               $$6.h(1);
            }

            $$1.a(null, $$2, aqr.cK, aqs.e, 1.0F, 1.0F);
            $$1.b($$2, cvq.a($$8));
            $$1.a($$3, dls.c, $$2);
            $$3.b(arb.c.b($$7));
            return bix.a;
         }
      }

      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bix.a;
         }

         if ($$6.b()) {
            return bix.b;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bix a(csb $$0, ht $$1, dhi $$2, cdu $$3) {
      if (!$$3.t(false)) {
         return bix.d;
      } else {
         $$3.a(arb.U);
         $$3.gd().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dls.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dls.f, $$1);
         }

         return bix.a;
      }
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      return $$1 == hx.a && !$$0.a($$3, $$4) ? cvc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(c);
   }

   @Override
   public int a(dhi $$0, csa $$1, ht $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   public boolean d_(dhi $$0) {
      return true;
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }
}
