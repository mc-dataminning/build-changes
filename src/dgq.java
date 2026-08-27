import com.mojang.serialization.MapCodec;

public class dgq extends czf {
   public static final MapCodec<dgq> a = b(dgq::new);
   protected static final epo b = czf.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dgq> a() {
      return a;
   }

   public dgq(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected epo b(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return b;
   }

   @Override
   protected epo b_(dme $$0, cvk $$1, ib $$2) {
      return epl.b();
   }

   @Override
   protected epo c(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return epl.b();
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      czl.b($$1, $$2.c(), $$0);
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$1 == ih.b && $$2.a(czh.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }

   @Override
   protected float d(dme $$0, cvk $$1, ib $$2) {
      return 0.2F;
   }
}
