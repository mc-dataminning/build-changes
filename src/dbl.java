import com.mojang.serialization.MapCodec;

public class dbl extends cuv {
   public static final MapCodec<dbl> a = b(dbl::new);
   public static final int b = 2;
   public static final dgd c = dft.aq;
   private static final float g = 3.0F;
   private static final eia[] h = new eia[]{ctc.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), ctc.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dbl> a() {
      return a;
   }

   public dbl(dfc.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(c);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected dgd b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected cqa d() {
      return cjo.uo;
   }

   @Override
   public dfd b(int $$0) {
      return $$0 == 2 ? cte.bS.o() : super.b($$0);
   }

   @Override
   public void b(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(cqb $$0) {
      return 1;
   }
}
