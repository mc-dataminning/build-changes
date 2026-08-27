import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddd extends dbz {
   public static final MapCodec<ddd> c = b(ddd::new);

   @Override
   public MapCodec<ddd> a() {
      return c;
   }

   protected ddd(dqg.d $$0) {
      super($$0);
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dnl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnm> dnn<T> a(dad $$0, dqh $$1, dno<T> $$2) {
      return a($$0, $$2, dno.C);
   }

   @Override
   protected void a(dad $$0, in $$1, clh $$2) {
      dnm $$3 = $$0.c_($$1);
      if ($$3 instanceof dnl) {
         $$2.a((bpq)$$3);
         $$2.a(avm.as);
      }
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, avc.cA, avd.e, 1.0F, 1.0F, false);
         }

         is $$7 = $$0.c(a);
         is.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == is.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 9.0 / 16.0;
         double $$13 = $$8 == is.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(kx.ab, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
