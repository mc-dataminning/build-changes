import java.util.Optional;
import javax.annotation.Nullable;

public class crq implements djj {
   private static final int b = 1200;
   public static final int a = 24000;
   private static final int c = 25;
   private static final int d = 75;
   private static final int e = 25;
   private static final int f = 10;
   private static final int g = 10;
   private final azx h = azx.a();
   private final faa i;
   private int j;
   private int k;
   private int l;

   public crq(faa $$0) {
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
   public void a(ars $$0, boolean $$1, boolean $$2) {
      if ($$0.O().c(djt.N)) {
         if (--this.j <= 0) {
            this.j = 1200;
            this.k -= 1200;
            this.i.d(this.k);
            if (this.k <= 0) {
               this.k = 24000;
               if ($$0.O().c(djt.f)) {
                  int $$3 = this.l;
                  this.l = azo.a(this.l + 25, 25, 75);
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

   private boolean a(ars $$0) {
      crx $$1 = $$0.k();
      if ($$1 == null) {
         return true;
      } else if (this.h.a(10) != 0) {
         return false;
      } else {
         iv $$2 = $$1.dv();
         int $$3 = 48;
         ciw $$4 = $$0.A();
         Optional<iv> $$5 = $$4.d($$0x -> $$0x.a(cja.o), $$0x -> true, $$2, 48, ciw.b.c);
         iv $$6 = $$5.orElse($$2);
         iv $$7 = this.a($$0, $$6, 48);
         if ($$7 != null && this.a($$0, $$7)) {
            if ($$0.u($$7).a(axd.ah)) {
               return false;
            }

            crp $$8 = bxc.bG.a($$0, $$7, bxb.h);
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

   private void a(ars $$0, crp $$1, int $$2) {
      iv $$3 = this.a($$0, $$1.dv(), $$2);
      if ($$3 != null) {
         cmb $$4 = bxc.bz.a($$0, $$3, bxb.h);
         if ($$4 != null) {
            $$4.a_($$1, true);
         }
      }
   }

   @Nullable
   private iv a(dka $$0, iv $$1, int $$2) {
      iv $$3 = null;
      byn $$4 = byp.a(bxc.bG);

      for (int $$5 = 0; $$5 < 10; $$5++) {
         int $$6 = $$1.u() + this.h.a($$2 * 2) - $$2;
         int $$7 = $$1.w() + this.h.a($$2 * 2) - $$2;
         int $$8 = $$0.a(ehd.a.b, $$6, $$7);
         iv $$9 = new iv($$6, $$8, $$7);
         if ($$4.isSpawnPositionOk($$0, $$9, bxc.bG)) {
            $$3 = $$9;
            break;
         }
      }

      return $$3;
   }

   private boolean a(djb $$0, iv $$1) {
      for (iv $$2 : iv.c($$1, $$1.b(1, 2, 1))) {
         if (!$$0.a_($$2).g($$0, $$2).c()) {
            return false;
         }
      }

      return true;
   }
}
