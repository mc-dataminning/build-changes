import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfe extends dea {
   public static final MapCodec<dfe> c = b(dfe::new);

   @Override
   public MapCodec<dfe> a() {
      return c;
   }

   protected dfe(dsg.d $$0) {
      super($$0);
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dpm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpn> dpo<T> a(dcd $$0, dsh $$1, dpp<T> $$2) {
      return a($$0, $$2, dpp.C);
   }

   @Override
   protected void a(dcd $$0, ja $$1, cmh $$2) {
      dpn $$3 = $$0.c_($$1);
      if ($$3 instanceof dpm) {
         $$2.a((bqh)$$3);
         $$2.a(avp.as);
      }
   }

   @Override
   public void a(dsh $$0, dcd $$1, ja $$2, aym $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, avf.cA, avg.e, 1.0F, 1.0F, false);
         }

         jf $$7 = $$0.c(a);
         jf.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == jf.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 9.0 / 16.0;
         double $$13 = $$8 == jf.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(lj.ae, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
