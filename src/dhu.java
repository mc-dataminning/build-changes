import com.mojang.serialization.MapCodec;

public abstract class dhu extends dey implements dht {
   public dhu(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dhu> a();

   @Override
   protected void b(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      if (m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cjf $$4 = cjf.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cjf $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean m(dsb $$0) {
      return $$0.i() || $$0.a(awo.aK) || $$0.k() || $$0.r();
   }

   @Override
   public void a(dsb $$0, dbx $$1, iz $$2, azg $$3) {
      if ($$3.a(16) == 0) {
         iz $$4 = $$2.d();
         if (m($$1.a_($$4))) {
            azc.a($$1, $$2, $$3, new la(li.C, $$0));
         }
      }
   }

   public int b(dsb $$0, dbd $$1, iz $$2) {
      return -16777216;
   }
}
