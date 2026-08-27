import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cve extends cua {
   public static final MapCodec<cve> c = b(cve::new);

   @Override
   public MapCodec<cve> a() {
      return c;
   }

   protected cve(dhm.d $$0) {
      super($$0);
   }

   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dfh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfi> dfj<T> a(csf $$0, dhn $$1, dfk<T> $$2) {
      return a($$0, $$2, dfk.C);
   }

   @Override
   protected void a(csf $$0, hx $$1, cdz $$2) {
      dfi $$3 = $$0.c_($$1);
      if ($$3 instanceof dfh) {
         $$2.a((bje)$$3);
         $$2.a(arf.as);
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, aqv.cg, aqw.e, 1.0F, 1.0F, false);
         }

         ib $$7 = $$0.c(a);
         ib.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == ib.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 9.0 / 16.0;
         double $$13 = $$8 == ib.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(jw.Z, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
