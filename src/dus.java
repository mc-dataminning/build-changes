import com.mojang.serialization.MapCodec;

public class dus extends dvr implements dmi {
   public static final MapCodec<dus> a = b(dus::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final ebh c = eax.av;
   private static final ffk e = dmf.b(10.0, 0.0, 8.0);
   private static final ffk f = dmf.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dus> a() {
      return a;
   }

   public dus(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected czd a(djd $$0, iu $$1, eah $$2, boolean $$3) {
      return new czd(czh.xG);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return switch ($$0.c(c)) {
         case 0 -> e;
         case 3 -> ffh.b();
         default -> f;
      };
   }

   @Override
   protected boolean f(eah $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.d(), 0) >= 9) {
         eah $$5 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(efh.c, $$2, efh.a.a($$5));
      }
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, bwf $$3) {
      if ($$3 instanceof bxe && $$3.aq() != bwo.aa && $$3.aq() != bwo.l) {
         $$3.a($$0, new feq(0.8F, 0.75, 0.8F));
         if ($$1 instanceof arq $$4 && $$0.c(c) != 0) {
            feq $$6 = $$3.L_() ? $$3.ah() : $$3.bB().d($$3.dt());
            if ($$6.j() > 0.0) {
               double $$7 = Math.abs($$6.a());
               double $$8 = Math.abs($$6.c());
               if ($$7 >= 0.003F || $$8 >= 0.003F) {
                  $$3.a($$4, $$1.al().u(), 1.0F);
               }
            }

            return;
         }
      }
   }

   @Override
   protected bud a(czd $$0, eah $$1, dja $$2, iu $$3, crc $$4, buc $$5, fem $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return (bud)(!$$8 && $$0.a(czh.sG) ? bud.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.A.a(2);
         a($$1, $$2, new czd(czh.xG, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, awn.Aw, awo.e, 1.0F, 0.8F + $$1.A.i() * 0.4F);
         eah $$8 = $$0.b(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(efh.c, $$2, efh.a.a($$3, $$8));
         return bud.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.b(c, Integer.valueOf($$4)), 2);
   }
}
