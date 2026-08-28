import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cty extends cwo {
   public static final int a = 20;
   public static final int b = 15;

   public cty(cvn.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(cvs $$0, dej $$1, bun $$2, int $$3) {
      if (!($$2 instanceof cnx $$4)) {
         return false;
      } else {
         cvs $$5 = $$4.f($$0);
         if ($$5.f()) {
            return false;
         } else {
            int $$6 = this.a($$0, $$2) - $$3;
            float $$7 = a($$6);
            if ((double)$$7 < 0.1) {
               return false;
            } else {
               List<cvs> $$8 = a($$0, $$5, $$4);
               if ($$1 instanceof arj $$9 && !$$8.isEmpty()) {
                  this.a($$9, $$4, $$4.fw(), $$0, $$8, $$7 * 3.0F, 1.0F, $$7 == 1.0F, null);
               }

               $$1.a(null, $$4.dx(), $$4.dz(), $$4.dD(), awg.aG, awh.h, 1.0F, 1.0F / ($$1.D_().i() * 0.4F + 1.2F) + $$7 * 0.5F);
               $$4.b(awq.c.b(this));
               return true;
            }
         }
      }
   }

   @Override
   protected void a(bun $$0, cor $$1, int $$2, float $$3, float $$4, float $$5, @Nullable bun $$6) {
      $$1.a($$0, $$0.dK(), $$0.dI() + $$5, 0.0F, $$3, $$4);
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
   public int a(cvs $$0, bun $$1) {
      return 72000;
   }

   @Override
   public cvu a(cvs $$0) {
      return cvu.e;
   }

   @Override
   public brs a(dej $$0, cnx $$1, brr $$2) {
      cvs $$3 = $$1.b($$2);
      boolean $$4 = !$$1.f($$3).f();
      if (!$$1.fR() && !$$4) {
         return brs.d;
      } else {
         $$1.c($$2);
         return brs.c;
      }
   }

   @Override
   public Predicate<cvs> b() {
      return c;
   }

   @Override
   public int c() {
      return 15;
   }
}
