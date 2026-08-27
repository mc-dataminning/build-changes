import java.util.Optional;
import javax.annotation.Nullable;

public class cdo implements crn {
   private static final int b = 1200;
   public static final int a = 24000;
   private static final int c = 25;
   private static final int d = 75;
   private static final int e = 25;
   private static final int f = 10;
   private static final int g = 10;
   private final ats h = ats.a();
   private final ees i;
   private int j;
   private int k;
   private int l;

   public cdo(ees $$0) {
      this.i = $$0;
      this.j = 1200;
      this.k = $$0.v();
      this.l = $$0.w();
      if (this.k == 0 && this.l == 0) {
         this.k = 24000;
         $$0.g(this.k);
         this.l = 25;
         $$0.h(this.l);
      }
   }

   @Override
   public int a(ame $$0, boolean $$1, boolean $$2) {
      if (!$$0.Y().b(crw.L)) {
         return 0;
      } else if (--this.j > 0) {
         return 0;
      } else {
         this.j = 1200;
         this.k -= 1200;
         this.i.g(this.k);
         if (this.k > 0) {
            return 0;
         } else {
            this.k = 24000;
            if (!$$0.Y().b(crw.e)) {
               return 0;
            } else {
               int $$3 = this.l;
               this.l = atm.a(this.l + 25, 25, 75);
               this.i.h(this.l);
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

   private boolean a(ame $$0) {
      cdu $$1 = $$0.i();
      if ($$1 == null) {
         return true;
      } else if (this.h.a(10) != 0) {
         return false;
      } else {
         ht $$2 = $$1.dn();
         int $$3 = 48;
         bwf $$4 = $$0.x();
         Optional<ht> $$5 = $$4.d($$0x -> $$0x.a(bwj.o), $$0x -> true, $$2, 48, bwf.b.c);
         ht $$6 = $$5.orElse($$2);
         ht $$7 = this.a($$0, $$6, 48);
         if ($$7 != null && this.a($$0, $$7)) {
            if ($$0.s($$7).a(arf.ag)) {
               return false;
            }

            cdn $$8 = bku.bh.a($$0, $$7, blk.h);
            if ($$8 != null) {
               for (int $$9 = 0; $$9 < 2; $$9++) {
                  this.a($$0, $$8, 4);
               }

               this.i.a($$8.cw());
               $$8.u(48000);
               $$8.i($$6);
               $$8.a($$6, 16);
               return true;
            }
         }

         return false;
      }
   }

   private void a(ame $$0, cdn $$1, int $$2) {
      ht $$3 = this.a($$0, $$1.dn(), $$2);
      if ($$3 != null) {
         byy $$4 = bku.ba.a($$0, $$3, blk.h);
         if ($$4 != null) {
            $$4.b($$1, true);
         }
      }
   }

   @Nullable
   private ht a(csd $$0, ht $$1, int $$2) {
      ht $$3 = null;

      for (int $$4 = 0; $$4 < 10; $$4++) {
         int $$5 = $$1.u() + this.h.a($$2 * 2) - $$2;
         int $$6 = $$1.w() + this.h.a($$2 * 2) - $$2;
         int $$7 = $$0.a(dmr.a.b, $$5, $$6);
         ht $$8 = new ht($$5, $$7, $$6);
         if (csl.a(bma.c.a, $$0, $$8, bku.bh)) {
            $$3 = $$8;
            break;
         }
      }

      return $$3;
   }

   private boolean a(crg $$0, ht $$1) {
      for (ht $$2 : ht.a($$1, $$1.b(1, 2, 1))) {
         if (!$$0.a_($$2).k($$0, $$2).c()) {
            return false;
         }
      }

      return true;
   }
}
