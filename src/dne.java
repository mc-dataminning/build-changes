import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dne extends der {
   public static final MapCodec<dne> c = b(dne::new);

   @Override
   public MapCodec<dne> a() {
      return c;
   }

   protected dne(dsz.d $$0) {
      super($$0);
   }

   @Override
   public dqf a(jd $$0, dta $$1) {
      return new drt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqf> dqg<T> a(dcu $$0, dta $$1, dqh<T> $$2) {
      return a($$0, $$2, dqh.B);
   }

   @Override
   protected void a(dcu $$0, jd $$1, cmv $$2) {
      dqf $$3 = $$0.c_($$1);
      if ($$3 instanceof drt) {
         $$2.a((bqu)$$3);
         $$2.a(avy.at);
      }
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, avo.yk, avp.e, 1.0F, 1.0F, false);
         }

         $$1.a(lm.ae, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
