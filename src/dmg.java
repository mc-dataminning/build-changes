import com.mojang.serialization.MapCodec;

public class dmg extends dia {
   public static final MapCodec<dmg> a = b(dmg::new);
   public static final dtt b = dts.s;
   public static final duc e = dts.aA;

   @Override
   public MapCodec<dmg> a() {
      return a;
   }

   protected dmg(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ji.c).a(e, Integer.valueOf(1)).a(b, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, ewy $$4) {
      if (!$$3.fZ().e) {
         return bqr.e;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return bqr.a($$1.B);
      }
   }

   @Override
   protected int g(dtc $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = super.a($$0);
      return $$1.a(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$1 == ji.a && !this.b($$3, $$5, $$2)) {
         return dga.a.o();
      } else {
         return !$$3.x_() && $$1.o() != $$0.c(aE).o() ? $$0.a(b, Boolean.valueOf(this.c($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean c(dcz $$0, jd $$1, dtc $$2) {
      return this.a((ddm)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, ayw $$3) {
      if ($$0.c(d)) {
         ji $$4 = $$0.c(aE);
         double $$5 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.v() + 0.4 + ($$3.j() - 0.5) * 0.2;
         double $$7 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         float $$8 = -5.0F;
         if ($$3.h()) {
            $$8 = (float)($$0.c(e) * 2 - 1);
         }

         $$8 /= 16.0F;
         double $$9 = (double)($$8 * (float)$$4.j());
         double $$10 = (double)($$8 * (float)$$4.l());
         $$1.a(lh.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(aE, e, b, d);
   }
}
