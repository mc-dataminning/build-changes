import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhx extends dgt {
   public static final MapCodec<dhx> c = b(dhx::new);

   @Override
   public MapCodec<dhx> a() {
      return c;
   }

   protected dhx(dvc.d $$0) {
      super($$0);
   }

   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dsf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsg> dsh<T> a(dev $$0, dvd $$1, dsi<T> $$2) {
      return a($$0, $$2, dsi.C);
   }

   @Override
   protected void a(dev $$0, jg $$1, coh $$2) {
      dsg $$3 = $$0.c_($$1);
      if ($$3 instanceof dsf) {
         $$2.a((bsa)$$3);
         $$2.a(awu.as);
      }
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awk.cA, awl.e, 1.0F, 1.0F, false);
         }

         jl $$7 = $$0.c(a);
         jl.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == jl.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 9.0 / 16.0;
         double $$13 = $$8 == jl.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(lq.ae, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
