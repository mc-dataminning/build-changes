import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcg extends ctv {
   public static final MapCodec<dcg> c = b(dcg::new);

   @Override
   public MapCodec<dcg> a() {
      return c;
   }

   protected dcg(dhh.d $$0) {
      super($$0);
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dgp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfd> dfe<T> a(csa $$0, dhi $$1, dff<T> $$2) {
      return a($$0, $$2, dff.B);
   }

   @Override
   protected void a(csa $$0, ht $$1, cdu $$2) {
      dfd $$3 = $$0.c_($$1);
      if ($$3 instanceof dgp) {
         $$2.a((bja)$$3);
         $$2.a(arb.at);
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, aqr.wS, aqs.e, 1.0F, 1.0F, false);
         }

         $$1.a(js.Z, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
