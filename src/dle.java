import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dle extends dma implements dmd {
   public static final MapCodec<dle> a = b(dle::new);
   private static final ffc C = dma.b(6.0, 0.0, 16.0);
   private static final ffc Q = dma.b(10.0, 0.0, 16.0);
   private static final ffc R = dma.b(3.0, 0.0, 16.0);
   public static final eaz b = eap.at;
   public static final eax<eal> c = eap.bn;
   public static final eaz d = eap.aX;
   public static final int e = 16;
   public static final int f = 0;
   public static final int g = 1;
   public static final int h = 0;
   public static final int i = 1;

   @Override
   public MapCodec<dle> a() {
      return a;
   }

   public dle(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Integer.valueOf(0)).b(c, eal.a).b(d, Integer.valueOf(0)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean e_(dzz $$0) {
      return true;
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      ffc $$4 = $$0.c(c) == eal.c ? Q : C;
      return $$4.a($$0.a($$2));
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }

   @Override
   protected ffc b(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return R.a($$0.a($$2));
   }

   @Override
   protected boolean a_(dzz $$0, dib $$1, iu $$2) {
      return false;
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      ewg $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dzz $$2 = $$0.q().a_($$0.a().e());
         if ($$2.a(axc.ax)) {
            if ($$2.a(dmc.nB)) {
               return this.m().b(b, Integer.valueOf(0));
            } else if ($$2.a(dmc.nC)) {
               int $$3 = $$2.c(b) > 0 ? 1 : 0;
               return this.m().b(b, Integer.valueOf($$3));
            } else {
               dzz $$4 = $$0.q().a_($$0.a().d());
               return $$4.a(dmc.nC) ? this.m().b(b, $$4.c(b)) : dmc.nB.m();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(dzz $$0) {
      return $$0.c(d) == 0;
   }

   @Override
   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if ($$0.c(d) == 0) {
         if ($$3.a(3) == 0 && $$1.v($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
            int $$4 = this.b($$1, $$2) + 1;
            if ($$4 < 16) {
               this.a($$0, $$1, $$2, $$3, $$4);
            }
         }
      }
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      return $$1.a_($$2.e()).a(axc.ax);
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$4 == ja.b && $$6.a(dmc.nC) && $$6.c(b) > $$0.c(b) ? $$0.a(b) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean a(diy $$0, iu $$1, dzz $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(d) != 1;
   }

   @Override
   public boolean a(div $$0, azv $$1, iu $$2, dzz $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, dzz $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         iu $$9 = $$2.b($$4);
         dzz $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(d) == 1 || !$$0.v($$9.d())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   protected void a(dzz $$0, div $$1, iu $$2, azv $$3, int $$4) {
      dzz $$5 = $$1.a_($$2.e());
      iu $$6 = $$2.c(2);
      dzz $$7 = $$1.a_($$6);
      eal $$8 = eal.a;
      if ($$4 >= 1) {
         if (!$$5.a(dmc.nC) || $$5.c(c) == eal.a) {
            $$8 = eal.b;
         } else if ($$5.a(dmc.nC) && $$5.c(c) != eal.a) {
            $$8 = eal.c;
            if ($$7.a(dmc.nC)) {
               $$1.a($$2.e(), $$5.b(c, eal.b), 3);
               $$1.a($$6, $$7.b(c, eal.a), 3);
            }
         }
      }

      int $$9 = $$0.c(b) != 1 && !$$7.a(dmc.nC) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.d(), this.m().b(b, Integer.valueOf($$9)).b(c, $$8).b(d, Integer.valueOf($$10)), 3);
   }

   protected int a(dib $$0, iu $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dmc.nC)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(dib $$0, iu $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dmc.nC)) {
         $$2++;
      }

      return $$2;
   }
}
