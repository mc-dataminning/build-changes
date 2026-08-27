import com.mojang.serialization.MapCodec;

public abstract class cxo extends cut implements cxn {
   public cxo(dgv.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cxo> a();

   @Override
   public void b(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if (h($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cae $$4 = cae.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cae $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean h(dgw $$0) {
      return $$0.i() || $$0.a(arc.aJ) || $$0.k() || $$0.r();
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, ato $$3) {
      if ($$3.a(16) == 0) {
         ht $$4 = $$2.d();
         if (h($$1.a_($$4))) {
            atl.a($$1, $$2, $$3, new jk(js.z, $$0));
         }
      }
   }

   public int d(dgw $$0, cqy $$1, ht $$2) {
      return -16777216;
   }
}
