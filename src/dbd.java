import com.mojang.serialization.MapCodec;

public class dbd extends ctl implements ctf {
   public static final MapCodec<dbd> a = b(dbd::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dgd c = dft.as;
   private static final eia e = ctc.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final eia f = ctc.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dbd> a() {
      return a;
   }

   public dbd(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public cjl a(cqe $$0, gw $$1, dfd $$2) {
      return new cjl(cjo.vv);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean e_(dfd $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   public void b(dfd $$0, akt $$1, gw $$2, ash $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dfd $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(djn.c, $$2, djn.a.a($$5));
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, biw $$3) {
      if ($$3 instanceof bjm && $$3.ag() != bja.N && $$3.ag() != bja.h) {
         $$3.a($$0, new ehh(0.8F, 0.75, 0.8F));
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
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      int $$6 = $$0.c(c);
      boolean $$7 = $$6 == 3;
      if (!$$7 && $$3.b($$4).a(cjo.qK)) {
         return bhe.d;
      } else if ($$6 > 1) {
         int $$8 = 1 + $$1.z.a(2);
         a($$1, $$2, new cjl(cjo.vv, $$8 + ($$7 ? 1 : 0)));
         $$1.a(null, $$2, apg.xF, aph.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dfd $$9 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$9, 2);
         $$1.a(djn.c, $$2, djn.a.a($$3, $$9));
         return bhe.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(cqe $$0, gw $$1, dfd $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(cqb $$0, ash $$1, gw $$2, dfd $$3) {
      return true;
   }

   @Override
   public void a(akt $$0, ash $$1, gw $$2, dfd $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
