import com.mojang.serialization.MapCodec;

public class czx extends dbx {
   public static final MapCodec<czx> a = b(czx::new);
   public static final int b = 3;
   public static final dob c = dnr.as;
   private static final eqm[] g = new eqm[]{
      dac.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dac.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dac.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dac.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<czx> a() {
      return a;
   }

   public czx(dna.d $$0) {
      super($$0);
   }

   @Override
   protected dob b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected cxa d() {
      return cqp.vj;
   }

   @Override
   protected void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(cxb $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(c);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return g[this.g($$0)];
   }
}
