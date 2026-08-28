import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class csg extends cuv {
   public static final int a = 20;
   public static final int b = 15;

   public csg(ctx.a $$0) {
      super($$0);
   }

   @Override
   public void a(cuc $$0, dcf $$1, btb $$2, int $$3) {
      if ($$2 instanceof cmk $$4) {
         cuc $$5 = $$4.g($$0);
         if (!$$5.e()) {
            int $$6 = this.a($$0, $$2) - $$3;
            float $$7 = a($$6);
            if (!((double)$$7 < 0.1)) {
               List<cuc> $$8 = a($$0, $$5, $$4);
               if ($$1 instanceof aqm $$9 && !$$8.isEmpty()) {
                  this.a($$9, $$4, $$4.ft(), $$0, $$8, $$7 * 3.0F, 1.0F, $$7 == 1.0F, null);
               }

               $$1.a(null, $$4.dv(), $$4.dx(), $$4.dB(), avh.aG, avi.h, 1.0F, 1.0F / ($$1.E_().i() * 0.4F + 1.2F) + $$7 * 0.5F);
               $$4.b(avr.c.b(this));
            }
         }
      }
   }

   @Override
   protected void a(btb $$0, cnc $$1, int $$2, float $$3, float $$4, float $$5, @Nullable btb $$6) {
      $$1.a($$0, $$0.dI(), $$0.dG() + $$5, 0.0F, $$3, $$4);
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
   public int a(cuc $$0, btb $$1) {
      return 72000;
   }

   @Override
   public cvx b(cuc $$0) {
      return cvx.e;
   }

   @Override
   public bqh<cuc> a(dcf $$0, cmk $$1, bqf $$2) {
      cuc $$3 = $$1.b($$2);
      boolean $$4 = !$$1.g($$3).e();
      if (!$$1.fM() && !$$4) {
         return bqh.d($$3);
      } else {
         $$1.c($$2);
         return bqh.b($$3);
      }
   }

   @Override
   public Predicate<cuc> b() {
      return c;
   }

   @Override
   public int c() {
      return 15;
   }
}
