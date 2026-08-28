import com.mojang.serialization.MapCodec;

public class dht extends der {
   public static final MapCodec<dht> a = b(dht::new);
   protected static final ews b = dff.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dht> a() {
      return a;
   }

   protected dht(dsg.d $$0) {
      super($$0);
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dre($$0, $$1);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return b;
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, bsd $$3) {
      if ($$1 instanceof aqk && $$3.cw() && ewp.c(ewp.a($$3.cK().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), ewd.i)) {
         akj<dcd> $$4 = $$1.af() == dcd.j ? dcd.h : dcd.j;
         aqk $$5 = ((aqk)$$1).o().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(dsh $$0, dcd $$1, ja $$2, aym $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(lj.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cua a(dcg $$0, ja $$1, dsh $$2) {
      return cua.l;
   }

   @Override
   protected boolean a(dsh $$0, eoa $$1) {
      return false;
   }
}
