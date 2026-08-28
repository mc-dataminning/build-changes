import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqx extends dig {
   public static final MapCodec<dqx> c = b(dqx::new);

   @Override
   public MapCodec<dqx> a() {
      return c;
   }

   protected dqx(dwv.d $$0) {
      super($$0);
   }

   @Override
   public dty a(ji $$0, dww $$1) {
      return new dvo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dty> dtz<T> a(dgh $$0, dww $$1, dua<T> $$2) {
      return a($$0, $$2, dua.C);
   }

   @Override
   protected void a(dgh $$0, ji $$1, cow $$2) {
      dty $$3 = $$0.c_($$1);
      if ($$3 instanceof dvo) {
         $$2.a((bsl)$$3);
         $$2.a(awk.at);
      }
   }

   @Override
   public void a(dww $$0, dgh $$1, ji $$2, azh $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awa.yY, awb.e, 1.0F, 1.0F, false);
         }

         $$1.a(lt.ag, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
