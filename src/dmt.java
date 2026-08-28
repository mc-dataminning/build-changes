import com.mojang.serialization.MapCodec;

public class dmt extends dhv {
   public static final MapCodec<dmt> a = b(dmt::new);
   public static final int b = 3;
   public static final dvs c = dvi.as;
   private static final ezq[] d = new ezq[]{
      dhm.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dhm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dhm.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      dhm.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dmt> a() {
      return a;
   }

   protected dmt(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dus $$0, ddo $$1, jf $$2) {
      return $$0.a(dho.dW);
   }

   @Override
   protected boolean f(dus $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cvs a(dem $$0, jf $$1, dus $$2) {
      return new cvs(cvw.sk);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(c);
   }
}
