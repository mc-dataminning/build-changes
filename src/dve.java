import com.mojang.serialization.MapCodec;

public class dve extends dwd implements dmu {
   public static final MapCodec<dve> a = b(dve::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final ebt c = ebj.av;
   private static final ffw e = dmr.b(10.0, 0.0, 8.0);
   private static final ffw f = dmr.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dve> a() {
      return a;
   }

   public dve(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected czn a(djp $$0, iv $$1, eat $$2, boolean $$3) {
      return new czn(czr.xG);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return switch ($$0.c(c)) {
         case 0 -> e;
         case 3 -> fft.b();
         default -> f;
      };
   }

   @Override
   protected boolean f(eat $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.d(), 0) >= 9) {
         eat $$5 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(eft.c, $$2, eft.a.a($$5));
      }
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, bwi $$3, bxb $$4) {
      if ($$3 instanceof bxj && $$3.an() != bwr.aa && $$3.an() != bwr.l) {
         $$3.a($$0, new ffc(0.8F, 0.75, 0.8F));
         if ($$1 instanceof arq $$5 && $$0.c(c) != 0) {
            ffc $$7 = $$3.L_() ? $$3.ae() : $$3.bz().d($$3.ds());
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
   protected bug a(czn $$0, eat $$1, djm $$2, iv $$3, crm $$4, buf $$5, fey $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return (bug)(!$$8 && $$0.a(czr.sG) ? bug.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.A.a(2);
         a($$1, $$2, new czn(czr.xG, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, awn.Aw, awo.e, 1.0F, 0.8F + $$1.A.i() * 0.4F);
         eat $$8 = $$0.b(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(eft.c, $$2, eft.a.a($$3, $$8));
         return bug.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.b(c, Integer.valueOf($$4)), 2);
   }
}
