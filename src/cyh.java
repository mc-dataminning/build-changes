import com.mojang.serialization.MapCodec;

public class cyh extends ctl {
   public static final MapCodec<cyh> a = b(cyh::new);
   public static final int b = 3;
   public static final dgd c = dft.as;
   private static final eia[] d = new eia[]{
      ctc.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      ctc.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      ctc.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      ctc.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<cyh> a() {
      return a;
   }

   protected cyh(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean d(dfd $$0, cph $$1, gw $$2) {
      return $$0.a(cte.dW);
   }

   @Override
   public boolean e_(dfd $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   public void b(dfd $$0, akt $$1, gw $$2, ash $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cjl a(cqe $$0, gw $$1, dfd $$2) {
      return new cjl(cjo.ru);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(c);
   }
}
