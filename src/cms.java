import java.util.Optional;
import javax.annotation.Nullable;

public class cms implements dbm {
   private static final int b = 1200;
   public static final int a = 24000;
   private static final int c = 25;
   private static final int d = 75;
   private static final int e = 25;
   private static final int f = 10;
   private static final int g = 10;
   private final azh h = azh.a();
   private final eqc i;
   private int j;
   private int k;
   private int l;

   public cms(eqc $$0) {
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
   public int a(arf $$0, boolean $$1, boolean $$2) {
      if (!$$0.ab().b(dbv.L)) {
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
            if (!$$0.ab().b(dbv.e)) {
               return 0;
            } else {
               int $$3 = this.l;
               this.l = ayz.a(this.l + 25, 25, 75);
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

   private boolean a(arf $$0) {
      cmy $$1 = $$0.j();
      if ($$1 == null) {
         return true;
      } else if (this.h.a(10) != 0) {
         return false;
      } else {
         iz $$2 = $$1.dp();
         int $$3 = 48;
         ceu $$4 = $$0.y();
         Optional<iz> $$5 = $$4.d($$0x -> $$0x.a(cey.o), $$0x -> true, $$2, 48, ceu.b.c);
         iz $$6 = $$5.orElse($$2);
         iz $$7 = this.a($$0, $$6, 48);
         if ($$7 != null && this.a($$0, $$7)) {
            if ($$0.t($$7).a(awo.ah)) {
               return false;
            }

            cmr $$8 = btb.bl.a($$0, $$7, btu.h);
            if ($$8 != null) {
               for (int $$9 = 0; $$9 < 2; $$9++) {
                  this.a($$0, $$8, 4);
               }

               this.i.a($$8.cz());
               $$8.v(48000);
               $$8.i($$6);
               $$8.a($$6, 16);
               return true;
            }
         }

         return false;
      }
   }

   private void a(arf $$0, cmr $$1, int $$2) {
      iz $$3 = this.a($$0, $$1.dp(), $$2);
      if ($$3 != null) {
         chs $$4 = btb.be.a($$0, $$3, btu.h);
         if ($$4 != null) {
            $$4.b($$1, true);
         }
      }
   }

   @Nullable
   private iz a(dcc $$0, iz $$1, int $$2) {
      iz $$3 = null;
      buk $$4 = bum.a(btb.bl);

      for (int $$5 = 0; $$5 < 10; $$5++) {
         int $$6 = $$1.u() + this.h.a($$2 * 2) - $$2;
         int $$7 = $$1.w() + this.h.a($$2 * 2) - $$2;
         int $$8 = $$0.a(dxv.a.b, $$6, $$7);
         iz $$9 = new iz($$6, $$8, $$7);
         if ($$4.isSpawnPositionOk($$0, $$9, btb.bl)) {
            $$3 = $$9;
            break;
         }
      }

      return $$3;
   }

   private boolean a(dbf $$0, iz $$1) {
      for (iz $$2 : iz.c($$1, $$1.b(1, 2, 1))) {
         if (!$$0.a_($$2).k($$0, $$2).c()) {
            return false;
         }
      }

      return true;
   }
}
