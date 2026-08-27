import com.mojang.serialization.MapCodec;

public class cxg extends cuf {
   public static final MapCodec<cxg> a = b(cxg::new);
   protected static final ekb b = cut.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<cxg> a() {
      return a;
   }

   protected cxg(dgv.d $$0) {
      super($$0);
   }

   @Override
   public der a(ht $$0, dgw $$1) {
      return new dgh($$0, $$1);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return b;
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, bki $$3) {
      if ($$1 instanceof ama && $$3.cs() && ejy.c(ejy.a($$3.cG().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), ejm.i)) {
         agf<crs> $$4 = $$1.ac() == crs.j ? crs.h : crs.j;
         ama $$5 = ((ama)$$1).n().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, ato $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(js.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public clb a(crv $$0, ht $$1, dgw $$2) {
      return clb.b;
   }

   @Override
   public boolean a(dgw $$0, ecf $$1) {
      return false;
   }
}
