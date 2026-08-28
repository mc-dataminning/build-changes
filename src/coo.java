import java.util.Optional;
import javax.annotation.Nullable;

public class coo implements dfs {
   private static final int b = 1200;
   public static final int a = 24000;
   private static final int c = 25;
   private static final int d = 75;
   private static final int e = 25;
   private static final int f = 10;
   private static final int g = 10;
   private final azg h = azg.a();
   private final evi i;
   private int j;
   private int k;
   private int l;

   public coo(evi $$0) {
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
   public int a(arc $$0, boolean $$1, boolean $$2) {
      if (!$$0.O().b(dgc.M)) {
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
            if (!$$0.O().b(dgc.e)) {
               return 0;
            } else {
               int $$3 = this.l;
               this.l = ayy.a(this.l + 25, 25, 75);
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

   private boolean a(arc $$0) {
      cov $$1 = $$0.k();
      if ($$1 == null) {
         return true;
      } else if (this.h.a(10) != 0) {
         return false;
      } else {
         ji $$2 = $$1.dw();
         int $$3 = 48;
         cgj $$4 = $$0.A();
         Optional<ji> $$5 = $$4.d($$0x -> $$0x.a(cgn.o), $$0x -> true, $$2, 48, cgj.b.c);
         ji $$6 = $$5.orElse($$2);
         ji $$7 = this.a($$0, $$6, 48);
         if ($$7 != null && this.a($$0, $$7)) {
            if ($$0.t($$7).a(awn.ah)) {
               return false;
            }

            com $$8 = buq.bE.a($$0, $$7, bup.h);
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

   private void a(arc $$0, com $$1, int $$2) {
      ji $$3 = this.a($$0, $$1.dw(), $$2);
      if ($$3 != null) {
         cji $$4 = buq.bx.a($$0, $$3, bup.h);
         if ($$4 != null) {
            $$4.b($$1, true);
         }
      }
   }

   @Nullable
   private ji a(dgj $$0, ji $$1, int $$2) {
      ji $$3 = null;
      bvz $$4 = bwb.a(buq.bE);

      for (int $$5 = 0; $$5 < 10; $$5++) {
         int $$6 = $$1.u() + this.h.a($$2 * 2) - $$2;
         int $$7 = $$1.w() + this.h.a($$2 * 2) - $$2;
         int $$8 = $$0.a(ecq.a.b, $$6, $$7);
         ji $$9 = new ji($$6, $$8, $$7);
         if ($$4.isSpawnPositionOk($$0, $$9, buq.bE)) {
            $$3 = $$9;
            break;
         }
      }

      return $$3;
   }

   private boolean a(dfl $$0, ji $$1) {
      for (ji $$2 : ji.c($$1, $$1.b(1, 2, 1))) {
         if (!$$0.a_($$2).g($$0, $$2).c()) {
            return false;
         }
      }

      return true;
   }
}
