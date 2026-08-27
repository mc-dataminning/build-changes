import com.mojang.serialization.MapCodec;

public class del extends czo {
   public static final MapCodec<del> a = b(del::new);
   public static final int b = 3;
   public static final dne c = dmu.as;
   private static final epo[] d = new epo[]{
      czf.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      czf.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      czf.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      czf.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<del> a() {
      return a;
   }

   protected del(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dme $$0, cvk $$1, ib $$2) {
      return $$0.a(czh.dW);
   }

   @Override
   protected boolean e_(dme $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dme $$0, apa $$1, ib $$2, awt $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cpq a(cwh $$0, ib $$1, dme $$2) {
      return new cpq(cpt.si);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(c);
   }
}
