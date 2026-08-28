import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnu extends djh {
   public static final MapCodec<dnu> c = b(dnu::new);

   @Override
   public MapCodec<dnu> a() {
      return c;
   }

   protected dnu(dxu.d $$0) {
      super($$0);
   }

   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dvw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dux> duy<T> a(dhi $$0, dxv $$1, duz<T> $$2) {
      return a($$0, $$2, duz.a);
   }

   @Override
   protected void a(dhi $$0, jh $$1, cpx $$2) {
      dux $$3 = $$0.c_($$1);
      if ($$3 instanceof dvw) {
         $$2.a((btl)$$3);
         $$2.a(axp.am);
      }
   }

   @Override
   public void a(dxv $$0, dhi $$1, jh $$2, bam $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, axf.ks, axg.e, 1.0F, 1.0F, false);
         }

         jm $$7 = $$0.c(a);
         jm.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == jm.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 6.0 / 16.0;
         double $$13 = $$8 == jm.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(ls.af, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
         $$1.a(ls.F, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
