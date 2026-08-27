import com.mojang.serialization.MapCodec;

public class dbj extends czf {
   public static final MapCodec<dbj> a = b(dbj::new);
   protected static final epo b = dcc.c;

   @Override
   public MapCodec<dbj> a() {
      return a;
   }

   protected dbj(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(dme $$0) {
      return true;
   }

   @Override
   public dme a(crx $$0) {
      return !this.o().a((cwh)$$0.q(), $$0.a()) ? czf.a(this.o(), czh.j.o(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$1 == ih.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      dcc.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      dme $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dce;
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return b;
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }
}
