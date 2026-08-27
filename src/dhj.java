import com.mojang.serialization.MapCodec;

public class dhj extends czo implements czi {
   public static final MapCodec<dhj> a = b(dhj::new);
   protected static final float b = 6.0F;
   protected static final epo c = czf.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dhj> a() {
      return a;
   }

   protected dhj(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return c;
   }

   @Override
   public boolean b(cwh $$0, ib $$1, dme $$2) {
      return true;
   }

   @Override
   public boolean a(cwe $$0, awt $$1, ib $$2, dme $$3) {
      return true;
   }

   @Override
   public void a(apa $$0, awt $$1, ib $$2, dme $$3) {
      dbn $$4 = (dbn)($$3.a(czh.bu) ? czh.iI : czh.iH);
      if ($$4.o().a($$0, $$2) && $$0.u($$2.c())) {
         dbn.a($$0, $$4.o(), $$2, 2);
      }
   }
}
