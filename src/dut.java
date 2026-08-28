import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dut extends dlx {
   public static final MapCodec<dut> c = b(dut::new);

   @Override
   public MapCodec<dut> a() {
      return c;
   }

   protected dut(ebd.d $$0) {
      super($$0);
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dzt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      return a($$0, $$2, dye.C);
   }

   @Override
   protected void a(djx $$0, iv $$1, crx $$2) {
      dyc $$3 = $$0.c_($$1);
      if ($$3 instanceof dzt) {
         $$2.a((but)$$3);
         $$2.a(awz.at);
      }
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awp.zo, awq.e, 1.0F, 1.0F, false);
         }

         $$1.a(ly.ah, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
