import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class crs extends cra {
   private static final int p = 3;
   private static final int q = 3;
   public static final int o = 0;
   private static final int r = 1;
   private static final int s = 9;
   private static final int t = 10;
   private static final int u = 10;
   private static final int v = 37;
   private static final int w = 37;
   private static final int x = 46;
   private final crm y;
   private final cnx z;
   private boolean A;

   public crs(int $$0, cnw $$1) {
      this($$0, $$1, crm.a);
   }

   public crs(int $$0, cnw $$1, crm $$2) {
      super(csi.m, $$0, 3, 3);
      this.y = $$2;
      this.z = $$1.k;
      this.a(this.z, 124, 35);
      this.d(30, 17);
      this.c($$1, 8, 84);
   }

   protected static void a(cqz $$0, dej $$1, cnx $$2, crr $$3, csr $$4, @Nullable dam<daa> $$5) {
      if (!$$1.B) {
         czz $$6 = $$3.aD_();
         ark $$7 = (ark)$$2;
         cvs $$8 = cvs.k;
         Optional<dam<daa>> $$9 = $$1.o().aI().a(daq.a, $$6, $$1, $$5);
         if ($$9.isPresent()) {
            dam<daa> $$10 = $$9.get();
            daa $$11 = $$10.b();
            if ($$4.a($$1, $$7, $$10)) {
               cvs $$12 = $$11.a($$6, $$1.G_());
               if ($$12.a($$1.J())) {
                  $$8 = $$12;
               }
            }
         }

         $$4.a(0, $$8);
         $$0.a(0, $$8);
         $$7.c.b(new acx($$0.l, $$0.k(), 0, $$8));
      }
   }

   @Override
   public void a(brl $$0) {
      if (!this.A) {
         this.y.a(($$0x, $$1) -> a(this, $$0x, this.z, this.m, this.n, null));
      }
   }

   @Override
   public void l() {
      this.A = true;
   }

   @Override
   public void a(dam<daa> $$0) {
      this.A = false;
      this.y.a(($$1, $$2) -> a(this, $$1, this.z, this.m, this.n, $$0));
   }

   @Override
   public void a(cnx $$0) {
      super.a($$0);
      this.y.a(($$1, $$2) -> this.a($$0, this.m));
   }

   @Override
   public boolean b(cnx $$0) {
      return a(this.y, $$0, dho.cA);
   }

   @Override
   public cvs b(cnx $$0, int $$1) {
      cvs $$2 = cvs.k;
      csw $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvs $$4 = $$3.g();
         $$2 = $$4.u();
         if ($$1 == 0) {
            this.y.a(($$2x, $$3x) -> $$4.h().b($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cvs.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cvs.k;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cvs.k;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cvs.k;
         }

         if ($$4.f()) {
            $$3.e(cvs.k);
         } else {
            $$3.c();
         }

         if ($$4.K() == $$2.K()) {
            return cvs.k;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cvs $$0, csw $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public csw m() {
      return this.k.get(0);
   }

   @Override
   public List<csw> n() {
      return this.k.subList(1, 10);
   }

   @Override
   public csp an_() {
      return csp.a;
   }

   @Override
   protected cnx q() {
      return this.z;
   }
}
