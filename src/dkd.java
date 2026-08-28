import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkd extends diz {
   public static final MapCodec<dkd> c = b(dkd::new);

   @Override
   public MapCodec<dkd> a() {
      return c;
   }

   protected dkd(dxp.d $$0) {
      super($$0);
   }

   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dur($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dus> dut<T> a(dgz $$0, dxq $$1, duu<T> $$2) {
      return a($$0, $$2, duu.D);
   }

   @Override
   protected void a(dgz $$0, ji $$1, cpr $$2) {
      dus $$3 = $$0.c_($$1);
      if ($$3 instanceof dur) {
         $$2.a((bta)$$3);
         $$2.a(awk.as);
      }
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awa.cA, awb.e, 1.0F, 1.0F, false);
         }

         jn $$7 = $$0.c(a);
         jn.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == jn.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 9.0 / 16.0;
         double $$13 = $$8 == jn.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(lt.ah, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
