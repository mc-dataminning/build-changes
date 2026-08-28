import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cym extends dav {
   public static final int a = 20;
   public static final int b = 15;

   public cym(czw.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(daa $$0, djz $$1, bxw $$2, int $$3) {
      if (!($$2 instanceof crz $$4)) {
         return false;
      } else {
         daa $$5 = $$4.d($$0);
         if ($$5.f()) {
            return false;
         } else {
            int $$6 = this.a($$0, $$2) - $$3;
            float $$7 = a($$6);
            if ((double)$$7 < 0.1) {
               return false;
            } else {
               List<daa> $$8 = a($$0, $$5, $$4);
               if ($$1 instanceof aru $$9 && !$$8.isEmpty()) {
                  this.a($$9, $$4, $$4.fA(), $$0, $$8, $$7 * 3.0F, 1.0F, $$7 == 1.0F, null);
               }

               $$1.a(null, $$4.dA(), $$4.dC(), $$4.dG(), awr.aG, aws.h, 1.0F, 1.0F / ($$1.G_().i() * 0.4F + 1.2F) + $$7 * 0.5F);
               $$4.b(axb.c.b(this));
               return true;
            }
         }
      }
   }

   @Override
   protected void a(bxw $$0, csu $$1, int $$2, float $$3, float $$4, float $$5, @Nullable bxw $$6) {
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
   public int a(daa $$0, bxw $$1) {
      return 72000;
   }

   @Override
   public dac b(daa $$0) {
      return dac.e;
   }

   @Override
   public but a(djz $$0, crz $$1, bus $$2) {
      daa $$3 = $$1.b($$2);
      boolean $$4 = !$$1.d($$3).f();
      if (!$$1.fV() && !$$4) {
         return but.d;
      } else {
         $$1.c($$2);
         return but.c;
      }
   }

   @Override
   public Predicate<daa> a() {
      return c;
   }

   @Override
   public int b() {
      return 15;
   }
}
