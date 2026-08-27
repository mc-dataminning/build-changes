import com.mojang.serialization.MapCodec;

public class cvo extends cso {
   public static final MapCodec<cvo> a = b(cvo::new);
   protected static final eia b = ctc.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<cvo> a() {
      return a;
   }

   protected cvo(dfc.d $$0) {
      super($$0);
   }

   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new deo($$0, $$1);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return b;
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, biw $$3) {
      if ($$1 instanceof akt && $$3.cs() && ehx.c(ehx.a($$3.cG().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), ehl.i)) {
         aey<cqb> $$4 = $$1.ac() == cqb.j ? cqb.h : cqb.j;
         akt $$5 = ((akt)$$1).n().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(iv.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cjl a(cqe $$0, gw $$1, dfd $$2) {
      return cjl.b;
   }

   @Override
   public boolean a(dfd $$0, eaf $$1) {
      return false;
   }
}
