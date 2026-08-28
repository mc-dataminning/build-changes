import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cxe extends czn {
   public static final int a = 20;
   public static final int b = 15;

   public cxe(cyo.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(cys $$0, dip $$1, bwz $$2, int $$3) {
      if (!($$2 instanceof cqs $$4)) {
         return false;
      } else {
         cys $$5 = $$4.e($$0);
         if ($$5.f()) {
            return false;
         } else {
            int $$6 = this.a($$0, $$2) - $$3;
            float $$7 = a($$6);
            if ((double)$$7 < 0.1) {
               return false;
            } else {
               List<cys> $$8 = a($$0, $$5, $$4);
               if ($$1 instanceof aro $$9 && !$$8.isEmpty()) {
                  this.a($$9, $$4, $$4.fz(), $$0, $$8, $$7 * 3.0F, 1.0F, $$7 == 1.0F, null);
               }

               $$1.a(null, $$4.dA(), $$4.dC(), $$4.dG(), awl.aG, awm.h, 1.0F, 1.0F / ($$1.C_().i() * 0.4F + 1.2F) + $$7 * 0.5F);
               $$4.b(awv.c.b(this));
               return true;
            }
         }
      }
   }

   @Override
   protected void a(bwz $$0, crm $$1, int $$2, float $$3, float $$4, float $$5, @Nullable bwz $$6) {
      $$1.a($$0, $$0.dN(), $$0.dL() + $$5, 0.0F, $$3, $$4);
   }

   public static float a(int $$0) {
      float $$1 = (float)$$0 / 20.0F;
      $$1 = ($$1 * $$1 + $$1 * 2.0F) / 3.0F;
      if ($$1 > 1.0F) {
         $$1 = 1.0F;
      }

      return $$1;
   }

   @Override
   public int a(cys $$0, bwz $$1) {
      return 72000;
   }

   @Override
   public cyu b(cys $$0) {
      return cyu.e;
   }

   @Override
   public bty a(dip $$0, cqs $$1, btx $$2) {
      cys $$3 = $$1.b($$2);
      boolean $$4 = !$$1.e($$3).f();
      if (!$$1.fU() && !$$4) {
         return bty.d;
      } else {
         $$1.c($$2);
         return bty.c;
      }
   }

   @Override
   public Predicate<cys> a() {
      return c;
   }

   @Override
   public int b() {
      return 15;
   }
}
