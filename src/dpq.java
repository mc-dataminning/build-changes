import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpq extends dhe {
   public static final MapCodec<dpq> c = b(dpq::new);

   @Override
   public MapCodec<dpq> a() {
      return c;
   }

   protected dpq(dvn.d $$0) {
      super($$0);
   }

   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dug($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsr> dss<T> a(dff $$0, dvo $$1, dst<T> $$2) {
      return a($$0, $$2, dst.B);
   }

   @Override
   protected void a(dff $$0, jh $$1, cor $$2) {
      dsr $$3 = $$0.c_($$1);
      if ($$3 instanceof dug) {
         $$2.a((bsj)$$3);
         $$2.a(awy.at);
      }
   }

   @Override
   public void a(dvo $$0, dff $$1, jh $$2, azv $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awo.yo, awp.e, 1.0F, 1.0F, false);
         }

         $$1.a(ls.ae, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
