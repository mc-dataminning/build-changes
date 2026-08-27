import com.mojang.serialization.MapCodec;

public abstract class dbk extends cyo implements dbj {
   public dbk(dle.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dbk> a();

   @Override
   protected void b(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if (m($$1.a_($$2.d())) && $$2.v() >= $$1.J_()) {
         cdr $$4 = cdr.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cdr $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean m(dlf $$0) {
      return $$0.i() || $$0.a(atz.aJ) || $$0.k() || $$0.r();
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
      if ($$3.a(16) == 0) {
         hz $$4 = $$2.d();
         if (m($$1.a_($$4))) {
            awk.a($$1, $$2, $$3, new jr(jz.B, $$0));
         }
      }
   }

   public int b(dlf $$0, cut $$1, hz $$2) {
      return -16777216;
   }
}
