import java.util.EnumSet;
import java.util.List;

public class brl extends bre {
   public final bxw a;
   private double b;
   private static final int c = 8;
   private int d;

   public brl(bxw $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bre.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.fS() && !this.a.gS()) {
         List<bjt> $$0 = this.a.dL().a(this.a, this.a.cG().c(9.0, 4.0, 9.0), $$0x -> {
            bjx<?> $$1x = $$0x.ag();
            return $$1x == bjx.aj || $$1x == bjx.ba;
         });
         bxw $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (bjt $$3 : $$0) {
            bxw $$4 = (bxw)$$3;
            if ($$4.gS() && !$$4.gR()) {
               double $$5 = this.a.f($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (bjt $$6 : $$0) {
               bxw $$7 = (bxw)$$6;
               if ($$7.fS() && !$$7.gR()) {
                  double $$8 = this.a.f($$7);
                  if (!($$8 > $$2)) {
                     $$2 = $$8;
                     $$1 = $$7;
                  }
               }
            }
         }

         if ($$1 == null) {
            return false;
         } else if ($$2 < 4.0) {
            return false;
         } else if (!$$1.fS() && !this.a($$1, 1)) {
            return false;
         } else {
            this.a.a($$1);
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean b() {
      if (this.a.gS() && this.a.gT().bv() && this.a(this.a, 0)) {
         double $$0 = this.a.f(this.a.gT());
         if ($$0 > 676.0) {
            if (this.b <= 3.0) {
               this.b *= 1.2;
               this.d = b(40);
               return true;
            }

            if (this.d == 0) {
               return false;
            }
         }

         if (this.d > 0) {
            this.d--;
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void d() {
      this.a.gQ();
      this.b = 2.1;
   }

   @Override
   public void e() {
      if (this.a.gS()) {
         if (!(this.a.fT() instanceof bzk)) {
            bxw $$0 = this.a.gT();
            double $$1 = (double)this.a.e($$0);
            float $$2 = 2.0F;
            eif $$3 = new eif($$0.dq() - this.a.dq(), $$0.ds() - this.a.ds(), $$0.dw() - this.a.dw()).d().a(Math.max($$1 - 2.0, 0.0));
            this.a.L().a(this.a.dq() + $$3.c, this.a.ds() + $$3.d, this.a.dw() + $$3.e, this.b);
         }
      }
   }

   private boolean a(bxw $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.gS()) {
         return $$0.gT().fS() ? true : this.a($$0.gT(), ++$$1);
      } else {
         return false;
      }
   }
}
