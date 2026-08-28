import java.util.Optional;
import javax.annotation.Nullable;

public class cqv implements din {
   private static final int b = 1200;
   public static final int a = 24000;
   private static final int c = 25;
   private static final int d = 75;
   private static final int e = 25;
   private static final int f = 10;
   private static final int g = 10;
   private final azv h = azv.a();
   private final eza i;
   private int j;
   private int k;
   private int l;

   public cqv(eza $$0) {
      this.i = $$0;
      this.j = 1200;
      this.k = $$0.t();
      this.l = $$0.u();
      if (this.k == 0 && this.l == 0) {
         this.k = 24000;
         $$0.d(this.k);
         this.l = 25;
         $$0.e(this.l);
      }
   }

   @Override
   public void a(arq $$0, boolean $$1, boolean $$2) {
      if ($$0.O().c(diw.N)) {
         if (--this.j <= 0) {
            this.j = 1200;
            this.k -= 1200;
            this.i.d(this.k);
            if (this.k <= 0) {
               this.k = 24000;
               if ($$0.O().c(diw.f)) {
                  int $$3 = this.l;
                  this.l = azm.a(this.l + 25, 25, 75);
                  this.i.e(this.l);
                  if (this.h.a(100) <= $$3) {
                     if (this.a($$0)) {
                        this.l = 25;
                     }
                  }
               }
            }
         }
      }
   }

   private boolean a(arq $$0) {
      crc $$1 = $$0.k();
      if ($$1 == null) {
         return true;
      } else if (this.h.a(10) != 0) {
         return false;
      } else {
         iu $$2 = $$1.dv();
         int $$3 = 48;
         cig $$4 = $$0.A();
         Optional<iu> $$5 = $$4.d($$0x -> $$0x.a(cik.o), $$0x -> true, $$2, 48, cig.b.c);
         iu $$6 = $$5.orElse($$2);
         iu $$7 = this.a($$0, $$6, 48);
         if ($$7 != null && this.a($$0, $$7)) {
            if ($$0.u($$7).a(axb.ah)) {
               return false;
            }

            cqu $$8 = bwo.bF.a($$0, $$7, bwn.h);
            if ($$8 != null) {
               for (int $$9 = 0; $$9 < 2; $$9++) {
                  this.a($$0, $$8, 4);
               }

               this.i.a($$8.cG());
               $$8.t(48000);
               $$8.h($$6);
               $$8.a($$6, 16);
               return true;
            }
         }

         return false;
      }
   }

   private void a(arq $$0, cqu $$1, int $$2) {
      iu $$3 = this.a($$0, $$1.dv(), $$2);
      if ($$3 != null) {
         clp $$4 = bwo.by.a($$0, $$3, bwn.h);
         if ($$4 != null) {
            $$4.a_($$1, true);
         }
      }
   }

   @Nullable
   private iu a(djd $$0, iu $$1, int $$2) {
      iu $$3 = null;
      bxx $$4 = bxz.a(bwo.bF);

      for (int $$5 = 0; $$5 < 10; $$5++) {
         int $$6 = $$1.u() + this.h.a($$2 * 2) - $$2;
         int $$7 = $$1.w() + this.h.a($$2 * 2) - $$2;
         int $$8 = $$0.a(egg.a.b, $$6, $$7);
         iu $$9 = new iu($$6, $$8, $$7);
         if ($$4.isSpawnPositionOk($$0, $$9, bwo.bF)) {
            $$3 = $$9;
            break;
         }
      }

      return $$3;
   }

   private boolean a(dig $$0, iu $$1) {
      for (iu $$2 : iu.c($$1, $$1.b(1, 2, 1))) {
         if (!$$0.a_($$2).g($$0, $$2).c()) {
            return false;
         }
      }

      return true;
   }
}
