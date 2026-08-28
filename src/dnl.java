import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnl extends diy {
   public static final MapCodec<dnl> c = b(dnl::new);

   @Override
   public MapCodec<dnl> a() {
      return c;
   }

   protected dnl(dxn.d $$0) {
      super($$0);
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dvp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      return a($$0, $$2, dus.a);
   }

   @Override
   protected void a(dgz $$0, jh $$1, cpo $$2) {
      duq $$3 = $$0.c_($$1);
      if ($$3 instanceof dvp) {
         $$2.a((btc)$$3);
         $$2.a(axf.am);
      }
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awv.ky, aww.e, 1.0F, 1.0F, false);
         }

         jm $$7 = $$0.c(a);
         jm.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == jm.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 6.0 / 16.0;
         double $$13 = $$8 == jm.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(ls.ag, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
         $$1.a(ls.F, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
