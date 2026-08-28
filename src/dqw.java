import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqw extends dif {
   public static final MapCodec<dqw> c = b(dqw::new);

   @Override
   public MapCodec<dqw> a() {
      return c;
   }

   protected dqw(dwu.d $$0) {
      super($$0);
   }

   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dvn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      return a($$0, $$2, dtz.C);
   }

   @Override
   protected void a(dgg $$0, ji $$1, cov $$2) {
      dtx $$3 = $$0.c_($$1);
      if ($$3 instanceof dvn) {
         $$2.a((bsk)$$3);
         $$2.a(awj.at);
      }
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, avz.yY, awa.e, 1.0F, 1.0F, false);
         }

         $$1.a(lt.ag, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
