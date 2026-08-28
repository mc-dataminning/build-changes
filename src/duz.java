import com.mojang.serialization.MapCodec;

public class duz extends dvy implements dmp {
   public static final MapCodec<duz> a = b(duz::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final ebo c = ebe.av;
   private static final ffr e = dmm.b(10.0, 0.0, 8.0);
   private static final ffr f = dmm.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<duz> a() {
      return a;
   }

   public duz(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected czk a(djk $$0, iv $$1, eao $$2, boolean $$3) {
      return new czk(czo.xG);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return switch ($$0.c(c)) {
         case 0 -> e;
         case 3 -> ffo.b();
         default -> f;
      };
   }

   @Override
   protected boolean f(eao $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.d(), 0) >= 9) {
         eao $$5 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(efo.c, $$2, efo.a.a($$5));
      }
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, bwi $$3, bxb $$4) {
      if ($$3 instanceof bxj && $$3.an() != bwr.aa && $$3.an() != bwr.l) {
         $$3.a($$0, new fex(0.8F, 0.75, 0.8F));
         if ($$1 instanceof arq $$5 && $$0.c(c) != 0) {
            fex $$7 = $$3.L_() ? $$3.ae() : $$3.bz().d($$3.ds());
            if ($$7.j() > 0.0) {
               double $$8 = Math.abs($$7.a());
               double $$9 = Math.abs($$7.c());
               if ($$8 >= 0.003F || $$9 >= 0.003F) {
                  $$3.a($$5, $$1.al().u(), 1.0F);
               }
            }

            return;
         }
      }
   }

   @Override
   protected bug a(czk $$0, eao $$1, djh $$2, iv $$3, crj $$4, buf $$5, fet $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return (bug)(!$$8 && $$0.a(czo.sG) ? bug.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.A.a(2);
         a($$1, $$2, new czk(czo.xG, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, awn.Aw, awo.e, 1.0F, 0.8F + $$1.A.i() * 0.4F);
         eao $$8 = $$0.b(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(efo.c, $$2, efo.a.a($$3, $$8));
         return bug.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.b(c, Integer.valueOf($$4)), 2);
   }
}
