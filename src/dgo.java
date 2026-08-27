import com.mojang.serialization.MapCodec;

public class dgo extends ddm {
   public static final MapCodec<dgo> a = b(dgo::new);
   protected static final evf b = dea.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dgo> a() {
      return a;
   }

   protected dgo(drc.d $$0) {
      super($$0);
   }

   @Override
   public doi a(io $$0, drd $$1) {
      return new dpz($$0, $$1);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return b;
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, brw $$3) {
      if ($$1 instanceof aqn && $$3.cw() && evc.c(evc.a($$3.cK().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), euq.i)) {
         akm<daz> $$4 = $$1.ae() == daz.j ? daz.h : daz.j;
         aqn $$5 = ((aqn)$$1).o().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(ky.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public ctq a(dbc $$0, io $$1, drd $$2) {
      return ctq.i;
   }

   @Override
   protected boolean a(drd $$0, emv $$1) {
      return false;
   }
}
