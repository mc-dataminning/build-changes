import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cup extends cxb {
   public static final int a = 20;
   public static final int b = 15;

   public cup(cwb.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(cwf $$0, dff $$1, bve $$2, int $$3) {
      if (!($$2 instanceof cor $$4)) {
         return false;
      } else {
         cwf $$5 = $$4.d($$0);
         if ($$5.f()) {
            return false;
         } else {
            int $$6 = this.a($$0, $$2) - $$3;
            float $$7 = a($$6);
            if ((double)$$7 < 0.1) {
               return false;
            } else {
               List<cwf> $$8 = a($$0, $$5, $$4);
               if ($$1 instanceof arq $$9 && !$$8.isEmpty()) {
                  this.a($$9, $$4, $$4.fD(), $$0, $$8, $$7 * 3.0F, 1.0F, $$7 == 1.0F, null);
               }

               $$1.a(null, $$4.dD(), $$4.dF(), $$4.dJ(), awo.aG, awp.h, 1.0F, 1.0F / ($$1.E_().i() * 0.4F + 1.2F) + $$7 * 0.5F);
               $$4.b(awy.c.b(this));
               return true;
            }
         }
      }
   }

   @Override
   protected void a(bve $$0, cpk $$1, int $$2, float $$3, float $$4, float $$5, @Nullable bve $$6) {
      $$1.a($$0, $$0.dQ(), $$0.dO() + $$5, 0.0F, $$3, $$4);
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
   public int a(cwf $$0, bve $$1) {
      return 72000;
   }

   @Override
   public cwh b(cwf $$0) {
      return cwh.e;
   }

   @Override
   public bsh a(dff $$0, cor $$1, bsg $$2) {
      cwf $$3 = $$1.b($$2);
      boolean $$4 = !$$1.d($$3).f();
      if (!$$1.fY() && !$$4) {
         return bsh.d;
      } else {
         $$1.c($$2);
         return bsh.c;
      }
   }

   @Override
   public Predicate<cwf> b() {
      return c;
   }

   @Override
   public int c() {
      return 15;
   }
}
