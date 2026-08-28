import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cxz extends dai {
   public static final int a = 20;
   public static final int b = 15;

   public cxz(czj.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(czn $$0, djm $$1, bxj $$2, int $$3) {
      if (!($$2 instanceof crm $$4)) {
         return false;
      } else {
         czn $$5 = $$4.d($$0);
         if ($$5.f()) {
            return false;
         } else {
            int $$6 = this.a($$0, $$2) - $$3;
            float $$7 = a($$6);
            if ((double)$$7 < 0.1) {
               return false;
            } else {
               List<czn> $$8 = a($$0, $$5, $$4);
               if ($$1 instanceof arq $$9 && !$$8.isEmpty()) {
                  this.a($$9, $$4, $$4.fz(), $$0, $$8, $$7 * 3.0F, 1.0F, $$7 == 1.0F, null);
               }

               $$1.a(null, $$4.dz(), $$4.dB(), $$4.dF(), awn.aG, awo.h, 1.0F, 1.0F / ($$1.C_().i() * 0.4F + 1.2F) + $$7 * 0.5F);
               $$4.b(awx.c.b(this));
               return true;
            }
         }
      }
   }

   @Override
   protected void a(bxj $$0, csh $$1, int $$2, float $$3, float $$4, float $$5, @Nullable bxj $$6) {
      $$1.a($$0, $$0.dM(), $$0.dK() + $$5, 0.0F, $$3, $$4);
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
   public int a(czn $$0, bxj $$1) {
      return 72000;
   }

   @Override
   public czp b(czn $$0) {
      return czp.e;
   }

   @Override
   public bug a(djm $$0, crm $$1, buf $$2) {
      czn $$3 = $$1.b($$2);
      boolean $$4 = !$$1.d($$3).f();
      if (!$$1.fU() && !$$4) {
         return bug.d;
      } else {
         $$1.c($$2);
         return bug.c;
      }
   }

   @Override
   public Predicate<czn> a() {
      return c;
   }

   @Override
   public int b() {
      return 15;
   }
}
