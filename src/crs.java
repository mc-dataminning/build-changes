import java.util.Optional;
import javax.annotation.Nullable;

public class crs implements djl {
   private static final int b = 1200;
   public static final int a = 24000;
   private static final int c = 25;
   private static final int d = 75;
   private static final int e = 25;
   private static final int f = 10;
   private static final int g = 10;
   private final azz h = azz.a();
   private final fac i;
   private int j;
   private int k;
   private int l;

   public crs(fac $$0) {
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
   public void a(aru $$0, boolean $$1, boolean $$2) {
      if ($$0.O().c(djv.N)) {
         if (--this.j <= 0) {
            this.j = 1200;
            this.k -= 1200;
            this.i.d(this.k);
            if (this.k <= 0) {
               this.k = 24000;
               if ($$0.O().c(djv.f)) {
                  int $$3 = this.l;
                  this.l = azq.a(this.l + 25, 25, 75);
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

   private boolean a(aru $$0) {
      crz $$1 = $$0.k();
      if ($$1 == null) {
         return true;
      } else if (this.h.a(10) != 0) {
         return false;
      } else {
         iw $$2 = $$1.dv();
         int $$3 = 48;
         ciy $$4 = $$0.A();
         Optional<iw> $$5 = $$4.d($$0x -> $$0x.a(cjc.o), $$0x -> true, $$2, 48, ciy.b.c);
         iw $$6 = $$5.orElse($$2);
         iw $$7 = this.a($$0, $$6, 48);
         if ($$7 != null && this.a($$0, $$7)) {
            if ($$0.u($$7).a(axf.ah)) {
               return false;
            }

            crr $$8 = bxe.bG.a($$0, $$7, bxd.h);
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

   private void a(aru $$0, crr $$1, int $$2) {
      iw $$3 = this.a($$0, $$1.dv(), $$2);
      if ($$3 != null) {
         cmd $$4 = bxe.bz.a($$0, $$3, bxd.h);
         if ($$4 != null) {
            $$4.a_($$1, true);
         }
      }
   }

   @Nullable
   private iw a(dkc $$0, iw $$1, int $$2) {
      iw $$3 = null;
      byp $$4 = byr.a(bxe.bG);

      for (int $$5 = 0; $$5 < 10; $$5++) {
         int $$6 = $$1.u() + this.h.a($$2 * 2) - $$2;
         int $$7 = $$1.w() + this.h.a($$2 * 2) - $$2;
         int $$8 = $$0.a(ehf.a.b, $$6, $$7);
         iw $$9 = new iw($$6, $$8, $$7);
         if ($$4.isSpawnPositionOk($$0, $$9, bxe.bG)) {
            $$3 = $$9;
            break;
         }
      }

      return $$3;
   }

   private boolean a(djd $$0, iw $$1) {
      for (iw $$2 : iw.c($$1, $$1.b(1, 2, 1))) {
         if (!$$0.a_($$2).g($$0, $$2).c()) {
            return false;
         }
      }

      return true;
   }
}
