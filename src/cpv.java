import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cpv extends csi {
   public static final int a = 20;
   public static final int b = 15;

   public cpv(crn.a $$0) {
      super($$0);
   }

   @Override
   public void a(crs $$0, czg $$1, bqt $$2, int $$3) {
      if ($$2 instanceof cka $$4) {
         crs $$5 = $$4.g($$0);
         if (!$$5.d()) {
            int $$6 = this.b($$0) - $$3;
            float $$7 = a($$6);
            if (!((double)$$7 < 0.1)) {
               List<crs> $$8 = a($$0, $$5, $$4);
               if (!$$1.x_() && !$$8.isEmpty()) {
                  this.a($$1, $$4, $$4.ft(), $$0, $$8, $$7 * 3.0F, 1.0F, $$7 == 1.0F, null);
               }

               $$1.a(null, $$4.dr(), $$4.dt(), $$4.dx(), auo.aG, aup.h, 1.0F, 1.0F / ($$1.E_().i() * 0.4F + 1.2F) + $$7 * 0.5F);
               $$4.b(auz.c.b(this));
            }
         }
      }
   }

   @Override
   protected void a(bqt $$0, cks $$1, int $$2, float $$3, float $$4, float $$5, @Nullable bqt $$6) {
      $$1.a($$0, $$0.dE(), $$0.dC() + $$5, 0.0F, $$3, $$4);
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
   public int b(crs $$0) {
      return 72000;
   }

   @Override
   public ctk c(crs $$0) {
      return ctk.e;
   }

   @Override
   public bog<crs> a(czg $$0, cka $$1, boe $$2) {
      crs $$3 = $$1.b($$2);
      boolean $$4 = !$$1.g($$3).d();
      if (!$$1.fM() && !$$4) {
         return bog.d($$3);
      } else {
         $$1.c($$2);
         return bog.b($$3);
      }
   }

   @Override
   public Predicate<crs> b() {
      return c;
   }

   @Override
   public int c() {
      return 15;
   }
}
