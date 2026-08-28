import com.mojang.serialization.MapCodec;

public class dho extends dem {
   public static final MapCodec<dho> a = b(dho::new);
   protected static final ewl b = dfa.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dho> a() {
      return a;
   }

   protected dho(dsc.d $$0) {
      super($$0);
   }

   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dqz($$0, $$1);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return b;
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, bsv $$3) {
      if ($$1 instanceof arf && $$3.cw() && ewi.c(ewi.a($$3.cK().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), evw.i)) {
         ale<dbz> $$4 = $$1.af() == dbz.j ? dbz.h : dbz.j;
         arf $$5 = ((arf)$$1).o().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(dsd $$0, dbz $$1, iz $$2, azh $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(li.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cuq a(dcc $$0, iz $$1, dsd $$2) {
      return cuq.l;
   }

   @Override
   protected boolean a(dsd $$0, env $$1) {
      return false;
   }
}
