import com.mojang.serialization.MapCodec;

public class dfi extends dal {
   public static final MapCodec<dfi> a = b(dfi::new);
   public static final int b = 3;
   public static final dob c = dnr.as;
   private static final eqm[] d = new eqm[]{
      dac.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dac.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dac.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      dac.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dfi> a() {
      return a;
   }

   protected dfi(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dnb $$0, cwh $$1, ib $$2) {
      return $$0.a(dae.dW);
   }

   @Override
   protected boolean e_(dnb $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cqm a(cxe $$0, ib $$1, dnb $$2) {
      return new cqm(cqp.si);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(c);
   }
}
