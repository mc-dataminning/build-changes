import java.util.Optional;
import javax.annotation.Nullable;

public class coa implements deh {
   private static final int b = 1200;
   public static final int a = 24000;
   private static final int c = 25;
   private static final int d = 75;
   private static final int e = 25;
   private static final int f = 10;
   private static final int g = 10;
   private final azr h = azr.a();
   private final etp i;
   private int j;
   private int k;
   private int l;

   public coa(etp $$0) {
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
   public int a(arm $$0, boolean $$1, boolean $$2) {
      if (!$$0.ac().b(der.L)) {
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
            if (!$$0.ac().b(der.e)) {
               return 0;
            } else {
               int $$3 = this.l;
               this.l = azj.a(this.l + 25, 25, 75);
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

   private boolean a(arm $$0) {
      coh $$1 = $$0.j();
      if ($$1 == null) {
         return true;
      } else if (this.h.a(10) != 0) {
         return false;
      } else {
         jg $$2 = $$1.dx();
         int $$3 = 48;
         cfz $$4 = $$0.y();
         Optional<jg> $$5 = $$4.d($$0x -> $$0x.a(cgd.o), $$0x -> true, $$2, 48, cfz.b.c);
         jg $$6 = $$5.orElse($$2);
         jg $$7 = this.a($$0, $$6, 48);
         if ($$7 != null && this.a($$0, $$7)) {
            if ($$0.t($$7).a(awy.ah)) {
               return false;
            }

            cnz $$8 = bug.bl.a($$0, $$7, buf.h);
            if ($$8 != null) {
               for (int $$9 = 0; $$9 < 2; $$9++) {
                  this.a($$0, $$8, 4);
               }

               this.i.a($$8.cH());
               $$8.u(48000);
               $$8.h($$6);
               $$8.a($$6, 16);
               return true;
            }
         }

         return false;
      }
   }

   private void a(arm $$0, cnz $$1, int $$2) {
      jg $$3 = this.a($$0, $$1.dx(), $$2);
      if ($$3 != null) {
         ciy $$4 = bug.be.a($$0, $$3, buf.h);
         if ($$4 != null) {
            $$4.b($$1, true);
         }
      }
   }

   @Nullable
   private jg a(dey $$0, jg $$1, int $$2) {
      jg $$3 = null;
      bvp $$4 = bvr.a(bug.bl);

      for (int $$5 = 0; $$5 < 10; $$5++) {
         int $$6 = $$1.u() + this.h.a($$2 * 2) - $$2;
         int $$7 = $$1.w() + this.h.a($$2 * 2) - $$2;
         int $$8 = $$0.a(eaz.a.b, $$6, $$7);
         jg $$9 = new jg($$6, $$8, $$7);
         if ($$4.isSpawnPositionOk($$0, $$9, bug.bl)) {
            $$3 = $$9;
            break;
         }
      }

      return $$3;
   }

   private boolean a(dea $$0, jg $$1) {
      for (jg $$2 : jg.c($$1, $$1.b(1, 2, 1))) {
         if (!$$0.a_($$2).g($$0, $$2).c()) {
            return false;
         }
      }

      return true;
   }
}
