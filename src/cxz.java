import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxz extends ctn {
   public static final MapCodec<cxz> c = b(cxz::new);

   @Override
   public MapCodec<cxz> a() {
      return c;
   }

   protected cxz(dgv.d $$0) {
      super($$0);
   }

   @Override
   public der a(ht $$0, dgw $$1) {
      return new dfn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends der> des<T> a(crs $$0, dgw $$1, det<T> $$2) {
      return a($$0, $$2, det.a);
   }

   @Override
   protected void a(crs $$0, ht $$1, cdm $$2) {
      der $$3 = $$0.c_($$1);
      if ($$3 instanceof dfn) {
         $$2.a((bit)$$3);
         $$2.a(aqx.am);
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, ato $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, aqn.iV, aqo.e, 1.0F, 1.0F, false);
         }

         hx $$7 = $$0.c(a);
         hx.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == hx.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 6.0 / 16.0;
         double $$13 = $$8 == hx.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(js.Z, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
         $$1.a(js.C, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
