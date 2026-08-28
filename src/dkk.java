import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkk extends djg {
   public static final MapCodec<dkk> c = b(dkk::new);

   @Override
   public MapCodec<dkk> a() {
      return c;
   }

   protected dkk(dxt.d $$0) {
      super($$0);
   }

   @Override
   public duw a(jh $$0, dxu $$1) {
      return new duv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duw> dux<T> a(dhh $$0, dxu $$1, duy<T> $$2) {
      return a($$0, $$2, duy.D);
   }

   @Override
   protected void a(dhh $$0, jh $$1, cpw $$2) {
      duw $$3 = $$0.c_($$1);
      if ($$3 instanceof duv) {
         $$2.a((btk)$$3);
         $$2.a(axp.as);
      }
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, bam $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, axf.cA, axg.e, 1.0F, 1.0F, false);
         }

         jm $$7 = $$0.c(a);
         jm.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == jm.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 9.0 / 16.0;
         double $$13 = $$8 == jm.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(ls.af, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
