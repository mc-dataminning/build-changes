import com.mojang.serialization.MapCodec;

public abstract class cyv extends cvz implements cyu {
   public cyv(dio.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cyv> a();

   @Override
   public void b(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      if (h($$1.a_($$2.d())) && $$2.v() >= $$1.J_()) {
         cbd $$4 = cbd.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cbd $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean h(dip $$0) {
      return $$0.i() || $$0.a(arr.aJ) || $$0.k() || $$0.r();
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      if ($$3.a(16) == 0) {
         hv $$4 = $$2.d();
         if (h($$1.a_($$4))) {
            aub.a($$1, $$2, $$3, new jn(jv.B, $$0));
         }
      }
   }

   public int b(dip $$0, cse $$1, hv $$2) {
      return -16777216;
   }
}
