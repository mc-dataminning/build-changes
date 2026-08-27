import com.mojang.serialization.MapCodec;

public class csx extends cuv {
   public static final MapCodec<csx> a = b(csx::new);
   public static final int b = 3;
   public static final dgd c = dft.as;
   private static final eia[] g = new eia[]{
      ctc.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      ctc.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      ctc.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      ctc.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<csx> a() {
      return a;
   }

   public csx(dfc.d $$0) {
      super($$0);
   }

   @Override
   protected dgd b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected cqa d() {
      return cjo.ur;
   }

   @Override
   public void b(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(cqb $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(c);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return g[this.g($$0)];
   }
}
