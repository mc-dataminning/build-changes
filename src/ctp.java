import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ctp extends cwi {
   public static final int a = 20;
   public static final int b = 15;

   public ctp(cvg.a $$0) {
      super($$0);
   }

   @Override
   public void a(cvl $$0, dds $$1, buf $$2, int $$3) {
      if ($$2 instanceof cnp $$4) {
         cvl $$5 = $$4.h($$0);
         if (!$$5.f()) {
            int $$6 = this.a($$0, $$2) - $$3;
            float $$7 = a($$6);
            if (!((double)$$7 < 0.1)) {
               List<cvl> $$8 = a($$0, $$5, $$4);
               if ($$1 instanceof arg $$9 && !$$8.isEmpty()) {
                  this.a($$9, $$4, $$4.fw(), $$0, $$8, $$7 * 3.0F, 1.0F, $$7 == 1.0F, null);
               }

               $$1.a(null, $$4.dx(), $$4.dz(), $$4.dD(), awd.aG, awe.h, 1.0F, 1.0F / ($$1.C_().i() * 0.4F + 1.2F) + $$7 * 0.5F);
               $$4.b(awn.c.b(this));
            }
         }
      }
   }

   @Override
   protected void a(buf $$0, coi $$1, int $$2, float $$3, float $$4, float $$5, @Nullable buf $$6) {
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
   public int a(cvl $$0, buf $$1) {
      return 72000;
   }

   @Override
   public cxh b(cvl $$0) {
      return cxh.e;
   }

   @Override
   public brk a(dds $$0, cnp $$1, brj $$2) {
      cvl $$3 = $$1.b($$2);
      boolean $$4 = !$$1.h($$3).f();
      if (!$$1.fP() && !$$4) {
         return brk.d;
      } else {
         $$1.c($$2);
         return brk.c;
      }
   }

   @Override
   public Predicate<cvl> b() {
      return c;
   }

   @Override
   public int c() {
      return 15;
   }
}
