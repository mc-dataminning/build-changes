import java.util.Optional;
import javax.annotation.Nullable;

public class cbf implements cox {
   private static final int b = 1200;
   public static final int a = 24000;
   private static final int c = 25;
   private static final int d = 75;
   private static final int e = 25;
   private static final int f = 10;
   private static final int g = 10;
   private final art h = art.a();
   private final eca i;
   private int j;
   private int k;
   private int l;

   public cbf(eca $$0) {
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
   public int a(aki $$0, boolean $$1, boolean $$2) {
      if (!$$0.X().b(cpg.H)) {
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
            if (!$$0.X().b(cpg.e)) {
               return 0;
            } else {
               int $$3 = this.l;
               this.l = aro.a(this.l + 25, 25, 75);
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

   private boolean a(aki $$0) {
      cbl $$1 = $$0.i();
      if ($$1 == null) {
         return true;
      } else if (this.h.a(10) != 0) {
         return false;
      } else {
         gv $$2 = $$1.dk();
         int $$3 = 48;
         btw $$4 = $$0.w();
         Optional<gv> $$5 = $$4.d($$0x -> $$0x.a(bua.o), $$0x -> true, $$2, 48, btw.b.c);
         gv $$6 = $$5.orElse($$2);
         gv $$7 = this.a($$0, $$6, 48);
         if ($$7 != null && this.a($$0, $$7)) {
            if ($$0.s($$7).a(api.ag)) {
               return false;
            }

            cbe $$8 = bik.bh.a($$0, $$7, bja.h);
            if ($$8 != null) {
               for (int $$9 = 0; $$9 < 2; $$9++) {
                  this.a($$0, $$8, 4);
               }

               this.i.a($$8.cv());
               $$8.u(48000);
               $$8.i($$6);
               $$8.a($$6, 16);
               return true;
            }
         }

         return false;
      }
   }

   private void a(aki $$0, cbe $$1, int $$2) {
      gv $$3 = this.a($$0, $$1.dk(), $$2);
      if ($$3 != null) {
         bwp $$4 = bik.ba.a($$0, $$3, bja.h);
         if ($$4 != null) {
            $$4.b($$1, true);
         }
      }
   }

   @Nullable
   private gv a(cpn $$0, gv $$1, int $$2) {
      gv $$3 = null;

      for (int $$4 = 0; $$4 < 10; $$4++) {
         int $$5 = $$1.u() + this.h.a($$2 * 2) - $$2;
         int $$6 = $$1.w() + this.h.a($$2 * 2) - $$2;
         int $$7 = $$0.a(dkh.a.b, $$5, $$6);
         gv $$8 = new gv($$5, $$7, $$6);
         if (cpv.a(bjr.c.a, $$0, $$8, bik.bh)) {
            $$3 = $$8;
            break;
         }
      }

      return $$3;
   }

   private boolean a(coq $$0, gv $$1) {
      for (gv $$2 : gv.a($$1, $$1.b(1, 2, 1))) {
         if (!$$0.a_($$2).k($$0, $$2).c()) {
            return false;
         }
      }

      return true;
   }
}
