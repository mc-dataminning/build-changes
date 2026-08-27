import com.mojang.serialization.MapCodec;

public abstract class dcw extends daa implements dcv {
   public dcw(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dcw> a();

   @Override
   protected void b(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if (m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cfc $$4 = cfc.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cfc $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean m(dmz $$0) {
      return $$0.i() || $$0.a(aun.aK) || $$0.k() || $$0.r();
   }

   @Override
   public void a(dmz $$0, cwz $$1, ib $$2, axd $$3) {
      if ($$3.a(16) == 0) {
         ib $$4 = $$2.d();
         if (m($$1.a_($$4))) {
            awz.a($$1, $$2, $$3, new ju(kc.C, $$0));
         }
      }
   }

   public int b(dmz $$0, cwf $$1, ib $$2) {
      return -16777216;
   }
}
