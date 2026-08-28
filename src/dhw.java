import com.mojang.serialization.MapCodec;

public class dhw extends deu {
   public static final MapCodec<dhw> a = b(dhw::new);
   protected static final exa b = dfi.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dhw> a() {
      return a;
   }

   protected dhw(dsk.d $$0) {
      super($$0);
   }

   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dri($$0, $$1);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return b;
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, bsh $$3) {
      if ($$1 instanceof aqm && $$3.cy() && ewx.c(ewx.a($$3.cM().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), ewl.i)) {
         akj<dcg> $$4 = $$1.af() == dcg.j ? dcg.h : dcg.j;
         aqm $$5 = ((aqm)$$1).o().a($$4);
         if ($$5 == null) {
            return;
         }

         if ($$1.af() == dcg.j && $$3 instanceof aqn $$6 && !$$6.f) {
            $$6.q();
            return;
         }

         $$3.a(() -> $$3.a($$5));
      }
   }

   @Override
   public void a(dsl $$0, dcg $$1, ja $$2, ayo $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(lj.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cud a(dcj $$0, ja $$1, dsl $$2) {
      return cud.l;
   }

   @Override
   protected boolean a(dsl $$0, eoi $$1) {
      return false;
   }
}
