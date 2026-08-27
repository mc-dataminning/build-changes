import java.util.Optional;
import javax.annotation.Nullable;

public class chb implements cva {
   private static final int b = 1200;
   public static final int a = 24000;
   private static final int c = 25;
   private static final int d = 75;
   private static final int e = 25;
   private static final int f = 10;
   private static final int g = 10;
   private final awo h = awo.a();
   private final eiq i;
   private int j;
   private int k;
   private int l;

   public chb(eiq $$0) {
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
   public int a(aov $$0, boolean $$1, boolean $$2) {
      if (!$$0.Z().b(cvj.L)) {
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
            if (!$$0.Z().b(cvj.e)) {
               return 0;
            } else {
               int $$3 = this.l;
               this.l = awh.a(this.l + 25, 25, 75);
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

   private boolean a(aov $$0) {
      chh $$1 = $$0.j();
      if ($$1 == null) {
         return true;
      } else if (this.h.a(10) != 0) {
         return false;
      } else {
         hz $$2 = $$1.dm();
         int $$3 = 48;
         bzh $$4 = $$0.y();
         Optional<hz> $$5 = $$4.d($$0x -> $$0x.a(bzl.o), $$0x -> true, $$2, 48, bzh.b.c);
         hz $$6 = $$5.orElse($$2);
         hz $$7 = this.a($$0, $$6, 48);
         if ($$7 != null && this.a($$0, $$7)) {
            if ($$0.t($$7).a(aty.ah)) {
               return false;
            }

            cha $$8 = bnu.bj.a($$0, $$7, bok.h);
            if ($$8 != null) {
               for (int $$9 = 0; $$9 < 2; $$9++) {
                  this.a($$0, $$8, 4);
               }

               this.i.a($$8.cw());
               $$8.v(48000);
               $$8.i($$6);
               $$8.a($$6, 16);
               return true;
            }
         }

         return false;
      }
   }

   private void a(aov $$0, cha $$1, int $$2) {
      hz $$3 = this.a($$0, $$1.dm(), $$2);
      if ($$3 != null) {
         ccd $$4 = bnu.bc.a($$0, $$3, bok.h);
         if ($$4 != null) {
            $$4.b($$1, true);
         }
      }
   }

   @Nullable
   private hz a(cvq $$0, hz $$1, int $$2) {
      hz $$3 = null;

      for (int $$4 = 0; $$4 < 10; $$4++) {
         int $$5 = $$1.u() + this.h.a($$2 * 2) - $$2;
         int $$6 = $$1.w() + this.h.a($$2 * 2) - $$2;
         int $$7 = $$0.a(dqo.a.b, $$5, $$6);
         hz $$8 = new hz($$5, $$7, $$6);
         if (cvy.a(boz.c.a, $$0, $$8, bnu.bj)) {
            $$3 = $$8;
            break;
         }
      }

      return $$3;
   }

   private boolean a(cut $$0, hz $$1) {
      for (hz $$2 : hz.a($$1, $$1.b(1, 2, 1))) {
         if (!$$0.a_($$2).k($$0, $$2).c()) {
            return false;
         }
      }

      return true;
   }
}
