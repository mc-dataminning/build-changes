import com.mojang.serialization.MapCodec;

public abstract class dht extends dex implements dhs {
   public dht(drz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dht> a();

   @Override
   protected void b(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      if (m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cje $$4 = cje.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cje $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean m(dsa $$0) {
      return $$0.i() || $$0.a(awo.aK) || $$0.k() || $$0.r();
   }

   @Override
   public void a(dsa $$0, dbw $$1, iz $$2, azf $$3) {
      if ($$3.a(16) == 0) {
         iz $$4 = $$2.d();
         if (m($$1.a_($$4))) {
            azb.a($$1, $$2, $$3, new la(li.C, $$0));
         }
      }
   }

   public int b(dsa $$0, dbc $$1, iz $$2) {
      return -16777216;
   }
}
