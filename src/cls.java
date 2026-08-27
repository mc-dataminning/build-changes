import java.util.Optional;
import javax.annotation.Nullable;

public class cls implements dbn {
   private static final int b = 1200;
   public static final int a = 24000;
   private static final int c = 25;
   private static final int d = 75;
   private static final int e = 25;
   private static final int f = 10;
   private static final int g = 10;
   private final ayt h = ayt.a();
   private final erk i;
   private int j;
   private int k;
   private int l;

   public cls(erk $$0) {
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
   public int a(aqt $$0, boolean $$1, boolean $$2) {
      if (!$$0.ab().b(dbw.M)) {
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
            if (!$$0.ab().b(dbw.e)) {
               return 0;
            } else {
               int $$3 = this.l;
               this.l = aym.a(this.l + 25, 25, 75);
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

   private boolean a(aqt $$0) {
      cly $$1 = $$0.j();
      if ($$1 == null) {
         return true;
      } else if (this.h.a(10) != 0) {
         return false;
      } else {
         ir $$2 = $$1.du();
         int $$3 = 48;
         cdr $$4 = $$0.y();
         Optional<ir> $$5 = $$4.d($$0x -> $$0x.a(cdv.o), $$0x -> true, $$2, 48, cdr.b.c);
         ir $$6 = $$5.orElse($$2);
         ir $$7 = this.a($$0, $$6, 48);
         if ($$7 != null && this.a($$0, $$7)) {
            if ($$0.t($$7).a(awd.al)) {
               return false;
            }

            clr $$8 = bsb.bp.a($$0, $$7, bss.h);
            if ($$8 != null) {
               for (int $$9 = 0; $$9 < 2; $$9++) {
                  this.a($$0, $$8, 4);
               }

               this.i.a($$8.cE());
               $$8.w(48000);
               $$8.e($$6);
               $$8.a($$6, 16);
               return true;
            }
         }

         return false;
      }
   }

   private void a(aqt $$0, clr $$1, int $$2) {
      ir $$3 = this.a($$0, $$1.du(), $$2);
      if ($$3 != null) {
         cgq $$4 = bsb.bi.a($$0, $$3, bss.h);
         if ($$4 != null) {
            $$4.b($$1, true);
         }
      }
   }

   @Nullable
   private ir a(dcd $$0, ir $$1, int $$2) {
      ir $$3 = null;
      bth $$4 = btj.a(bsb.bp);

      for (int $$5 = 0; $$5 < 10; $$5++) {
         int $$6 = $$1.u() + this.h.a($$2 * 2) - $$2;
         int $$7 = $$1.w() + this.h.a($$2 * 2) - $$2;
         int $$8 = $$0.a(dyu.a.b, $$6, $$7);
         ir $$9 = new ir($$6, $$8, $$7);
         if ($$4.isSpawnPositionOk($$0, $$9, bsb.bp)) {
            $$3 = $$9;
            break;
         }
      }

      return $$3;
   }

   private boolean a(dbg $$0, ir $$1) {
      for (ir $$2 : ir.c($$1, $$1.b(1, 2, 1))) {
         if (!$$0.a_($$2).k($$0, $$2).c()) {
            return false;
         }
      }

      return true;
   }
}
