import com.mojang.serialization.MapCodec;

public class dim extends dbx {
   public static final MapCodec<dim> a = b(dim::new);
   public static final int b = 2;
   public static final dob c = dnr.aq;
   private static final float g = 3.0F;
   private static final eqm[] h = new eqm[]{dac.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), dac.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dim> a() {
      return a;
   }

   public dim(dna.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(c);
   }

   @Override
   public eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected dob b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected cxa d() {
      return cqp.vg;
   }

   @Override
   public dnb b(int $$0) {
      return $$0 == 2 ? dae.bS.o() : super.b($$0);
   }

   @Override
   public void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(cxb $$0) {
      return 1;
   }
}
