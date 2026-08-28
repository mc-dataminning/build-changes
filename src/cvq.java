import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cvq extends cyc {
   public static final int a = 20;
   public static final int b = 15;

   public cvq(cxc.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(cxg $$0, dgz $$1, bvx $$2, int $$3) {
      if (!($$2 instanceof cpo $$4)) {
         return false;
      } else {
         cxg $$5 = $$4.d($$0);
         if ($$5.f()) {
            return false;
         } else {
            int $$6 = this.a($$0, $$2) - $$3;
            float $$7 = a($$6);
            if ((double)$$7 < 0.1) {
               return false;
            } else {
               List<cxg> $$8 = a($$0, $$5, $$4);
               if ($$1 instanceof arx $$9 && !$$8.isEmpty()) {
                  this.a($$9, $$4, $$4.fA(), $$0, $$8, $$7 * 3.0F, 1.0F, $$7 == 1.0F, null);
               }

               $$1.a(null, $$4.dB(), $$4.dD(), $$4.dH(), awv.aG, aww.h, 1.0F, 1.0F / ($$1.H_().i() * 0.4F + 1.2F) + $$7 * 0.5F);
               $$4.b(axf.c.b(this));
               return true;
            }
         }
      }
   }

   @Override
   protected void a(bvx $$0, cqh $$1, int $$2, float $$3, float $$4, float $$5, @Nullable bvx $$6) {
      $$1.a($$0, $$0.dO(), $$0.dM() + $$5, 0.0F, $$3, $$4);
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
   public int a(cxg $$0, bvx $$1) {
      return 72000;
   }

   @Override
   public cxi b(cxg $$0) {
      return cxi.e;
   }

   @Override
   public bta a(dgz $$0, cpo $$1, bsz $$2) {
      cxg $$3 = $$1.b($$2);
      boolean $$4 = !$$1.d($$3).f();
      if (!$$1.fV() && !$$4) {
         return bta.d;
      } else {
         $$1.c($$2);
         return bta.c;
      }
   }

   @Override
   public Predicate<cxg> b() {
      return c;
   }

   @Override
   public int c() {
      return 15;
   }
}
