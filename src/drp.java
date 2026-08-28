import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drp extends diy {
   public static final MapCodec<drp> c = b(drp::new);

   @Override
   public MapCodec<drp> a() {
      return c;
   }

   protected drp(dxn.d $$0) {
      super($$0);
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dwg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      return a($$0, $$2, dus.C);
   }

   @Override
   protected void a(dgz $$0, jh $$1, cpo $$2) {
      duq $$3 = $$0.c_($$1);
      if ($$3 instanceof dwg) {
         $$2.a((btc)$$3);
         $$2.a(axf.at);
      }
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awv.yZ, aww.e, 1.0F, 1.0F, false);
         }

         $$1.a(ls.ag, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
