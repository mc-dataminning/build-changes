import com.mojang.serialization.MapCodec;

public class dcv extends cvc implements cuw {
   public static final MapCodec<dcv> a = b(dcv::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dhw c = dhm.as;
   private static final ekb e = cut.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final ekb f = cut.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dcv> a() {
      return a;
   }

   public dcv(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public clb a(crv $$0, ht $$1, dgw $$2) {
      return new clb(cle.vw);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean e_(dgw $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dgw $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dlg.c, $$2, dlg.a.a($$5));
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, bki $$3) {
      if ($$3 instanceof bky && $$3.ag() != bkm.N && $$3.ag() != bkm.h) {
         $$3.a($$0, new eji(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(c) > 0 && ($$3.ac != $$3.dq() || $$3.ae != $$3.dw())) {
            double $$4 = Math.abs($$3.dq() - $$3.ac);
            double $$5 = Math.abs($$3.dw() - $$3.ae);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.ag().s(), 1.0F);
            }
         }
      }
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      int $$6 = $$0.c(c);
      boolean $$7 = $$6 == 3;
      if (!$$7 && $$3.b($$4).a(cle.qK)) {
         return biq.d;
      } else if ($$6 > 1) {
         int $$8 = 1 + $$1.z.a(2);
         a($$1, $$2, new clb(cle.vw, $$8 + ($$7 ? 1 : 0)));
         $$1.a(null, $$2, aqn.xJ, aqo.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dgw $$9 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$9, 2);
         $$1.a(dlg.c, $$2, dlg.a.a($$3, $$9));
         return biq.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(crv $$0, ht $$1, dgw $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(crs $$0, ato $$1, ht $$2, dgw $$3) {
      return true;
   }

   @Override
   public void a(ama $$0, ato $$1, ht $$2, dgw $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
