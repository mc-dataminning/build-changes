import com.mojang.serialization.MapCodec;

public class cxo extends cum {
   public static final MapCodec<cxo> a = b(cxo::new);
   protected static final ekn b = cva.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<cxo> a() {
      return a;
   }

   protected cxo(dhh.d $$0) {
      super($$0);
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dgt($$0, $$1);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return b;
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, bkq $$3) {
      if ($$1 instanceof ame && $$3.ct() && ekk.c(ekk.a($$3.cH().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), ejy.i)) {
         agh<csa> $$4 = $$1.ad() == csa.j ? csa.h : csa.j;
         ame $$5 = ((ame)$$1).n().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(js.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public clj a(csd $$0, ht $$1, dhi $$2) {
      return clj.b;
   }

   @Override
   public boolean a(dhi $$0, ecr $$1) {
      return false;
   }
}
