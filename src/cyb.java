import com.mojang.serialization.MapCodec;

public abstract class cyb extends cvf implements cya {
   public cyb(dhm.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cyb> a();

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if (h($$1.a_($$2.d())) && $$2.v() >= $$1.J_()) {
         car $$4 = car.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(car $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean h(dhn $$0) {
      return $$0.i() || $$0.a(ark.aJ) || $$0.k() || $$0.r();
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      if ($$3.a(16) == 0) {
         hx $$4 = $$2.d();
         if (h($$1.a_($$4))) {
            att.a($$1, $$2, $$3, new jo(jw.z, $$0));
         }
      }
   }

   public int b(dhn $$0, crl $$1, hx $$2) {
      return -16777216;
   }
}
