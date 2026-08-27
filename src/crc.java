import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class crc extends ctq {
   public static final int a = 20;
   public static final int b = 15;

   public crc(csu.a $$0) {
      super($$0);
   }

   @Override
   public void a(csz $$0, dad $$1, bsa $$2, int $$3) {
      if ($$2 instanceof clh $$4) {
         csz $$5 = $$4.g($$0);
         if (!$$5.d()) {
            int $$6 = this.b($$0) - $$3;
            float $$7 = a($$6);
            if (!((double)$$7 < 0.1)) {
               List<csz> $$8 = a($$0, $$5, $$4);
               if (!$$1.x_() && !$$8.isEmpty()) {
                  this.a($$1, $$4, $$4.fu(), $$0, $$8, $$7 * 3.0F, 1.0F, $$7 == 1.0F, null);
               }

               $$1.a(null, $$4.ds(), $$4.du(), $$4.dy(), avc.aG, avd.h, 1.0F, 1.0F / ($$1.E_().i() * 0.4F + 1.2F) + $$7 * 0.5F);
               $$4.b(avm.c.b(this));
            }
         }
      }
   }

   @Override
   protected void a(bsa $$0, clz $$1, int $$2, float $$3, float $$4, float $$5, @Nullable bsa $$6) {
      $$1.a($$0, $$0.dF(), $$0.dD() + $$5, 0.0F, $$3, $$4);
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
   public int b(csz $$0) {
      return 72000;
   }

   @Override
   public cus c(csz $$0) {
      return cus.e;
   }

   @Override
   public bpn<csz> a(dad $$0, clh $$1, bpl $$2) {
      csz $$3 = $$1.b($$2);
      boolean $$4 = !$$1.g($$3).d();
      if (!$$1.fN() && !$$4) {
         return bpn.d($$3);
      } else {
         $$1.c($$2);
         return bpn.b($$3);
      }
   }

   @Override
   public Predicate<csz> b() {
      return c;
   }

   @Override
   public int c() {
      return 15;
   }
}
