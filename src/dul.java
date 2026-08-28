import com.mojang.serialization.MapCodec;

public class dul extends dvj implements dmd {
   public static final MapCodec<dul> a = b(dul::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final eaz c = eap.av;
   private static final ffc e = dma.b(10.0, 0.0, 8.0);
   private static final ffc f = dma.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dul> a() {
      return a;
   }

   public dul(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected cyy a(diy $$0, iu $$1, dzz $$2, boolean $$3) {
      return new cyy(czc.xB);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return switch ($$0.c(c)) {
         case 0 -> e;
         case 3 -> fez.b();
         default -> f;
      };
   }

   @Override
   protected boolean f(dzz $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.d(), 0) >= 9) {
         dzz $$5 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(eez.c, $$2, eez.a.a($$5));
      }
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, bwd $$3) {
      if ($$3 instanceof bxc && $$3.aq() != bwm.aa && $$3.aq() != bwm.l) {
         $$3.a($$0, new fei(0.8F, 0.75, 0.8F));
         if ($$1 instanceof arq $$4 && $$0.c(c) != 0) {
            fei $$6 = $$3.L_() ? $$3.ah() : $$3.bB().d($$3.dt());
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
   protected bub a(cyy $$0, dzz $$1, div $$2, iu $$3, cqy $$4, bua $$5, fee $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return (bub)(!$$8 && $$0.a(czc.sB) ? bub.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.A.a(2);
         a($$1, $$2, new cyy(czc.xB, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, awn.At, awo.e, 1.0F, 0.8F + $$1.A.i() * 0.4F);
         dzz $$8 = $$0.b(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(eez.c, $$2, eez.a.a($$3, $$8));
         return bub.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean a(diy $$0, iu $$1, dzz $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(div $$0, azv $$1, iu $$2, dzz $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, dzz $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.b(c, Integer.valueOf($$4)), 2);
   }
}
