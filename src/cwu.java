import com.mojang.serialization.MapCodec;

public abstract class cwu extends cua implements cwt {
   public cwu(dga.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cwu> a();

   @Override
   public void b(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if (h($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         bzp $$4 = bzp.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(bzp $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean h(dgb $$0) {
      return $$0.i() || $$0.a(aqs.aJ) || $$0.k() || $$0.r();
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, ate $$3) {
      if ($$3.a(16) == 0) {
         ht $$4 = $$2.d();
         if (h($$1.a_($$4))) {
            atb.a($$1, $$2, $$3, new jk(js.z, $$0));
         }
      }
   }

   public int d(dgb $$0, cqf $$1, ht $$2) {
      return -16777216;
   }
}
