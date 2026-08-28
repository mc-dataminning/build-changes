import java.util.Optional;
import javax.annotation.Nullable;

public class cmf implements dbt {
   private static final int b = 1200;
   public static final int a = 24000;
   private static final int c = 25;
   private static final int d = 75;
   private static final int e = 25;
   private static final int f = 10;
   private static final int g = 10;
   private final ayo h = ayo.a();
   private final eqp i;
   private int j;
   private int k;
   private int l;

   public cmf(eqp $$0) {
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
   public int a(aqm $$0, boolean $$1, boolean $$2) {
      if (!$$0.ab().b(dcc.L)) {
         return 0;
      } else if (--this.j > 0) {
         return 0;
      } else {
         this.j = 1200;
         this.k -= 1200;
         this.i.d(this.k);
         if (this.k > 0) {
            return 0;
         } else {
            this.k = 24000;
            if (!$$0.ab().b(dcc.e)) {
               return 0;
            } else {
               int $$3 = this.l;
               this.l = ayg.a(this.l + 25, 25, 75);
               this.i.e(this.l);
               if (this.h.a(100) > $$3) {
                  return 0;
               } else if (this.a($$0)) {
                  this.l = 25;
                  return 1;
               } else {
                  return 0;
               }
            }
         }
      }
   }

   private boolean a(aqm $$0) {
      cml $$1 = $$0.j();
      if ($$1 == null) {
         return true;
      } else if (this.h.a(10) != 0) {
         return false;
      } else {
         ja $$2 = $$1.dr();
         int $$3 = 48;
         ceg $$4 = $$0.y();
         Optional<ja> $$5 = $$4.d($$0x -> $$0x.a(cek.o), $$0x -> true, $$2, 48, ceg.b.c);
         ja $$6 = $$5.orElse($$2);
         ja $$7 = this.a($$0, $$6, 48);
         if ($$7 != null && this.a($$0, $$7)) {
            if ($$0.t($$7).a(avv.ah)) {
               return false;
            }

            cme $$8 = bsn.bl.a($$0, $$7, btg.h);
            if ($$8 != null) {
               for (int $$9 = 0; $$9 < 2; $$9++) {
                  this.a($$0, $$8, 4);
               }

               this.i.a($$8.cB());
               $$8.u(48000);
               $$8.h($$6);
               $$8.a($$6, 16);
               return true;
            }
         }

         return false;
      }
   }

   private void a(aqm $$0, cme $$1, int $$2) {
      ja $$3 = this.a($$0, $$1.dr(), $$2);
      if ($$3 != null) {
         che $$4 = bsn.be.a($$0, $$3, btg.h);
         if ($$4 != null) {
            $$4.b($$1, true);
         }
      }
   }

   @Nullable
   private ja a(dcj $$0, ja $$1, int $$2) {
      ja $$3 = null;
      btw $$4 = bty.a(bsn.bl);

      for (int $$5 = 0; $$5 < 10; $$5++) {
         int $$6 = $$1.u() + this.h.a($$2 * 2) - $$2;
         int $$7 = $$1.w() + this.h.a($$2 * 2) - $$2;
         int $$8 = $$0.a(dyg.a.b, $$6, $$7);
         ja $$9 = new ja($$6, $$8, $$7);
         if ($$4.isSpawnPositionOk($$0, $$9, bsn.bl)) {
            $$3 = $$9;
            break;
         }
      }

      return $$3;
   }

   private boolean a(dbm $$0, ja $$1) {
      for (ja $$2 : ja.c($$1, $$1.b(1, 2, 1))) {
         if (!$$0.a_($$2).k($$0, $$2).c()) {
            return false;
         }
      }

      return true;
   }
}
