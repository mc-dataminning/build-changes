import com.mojang.serialization.MapCodec;

public class dki extends dfk {
   public static final MapCodec<dki> a = b(dki::new);
   public static final int b = 3;
   public static final dte c = dsu.as;
   private static final ewm[] d = new ewm[]{
      dfb.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dfb.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dfb.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      dfb.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dki> a() {
      return a;
   }

   protected dki(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dse $$0, dbg $$1, iz $$2) {
      return $$0.a(dfd.dW);
   }

   @Override
   protected boolean d_(dse $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dse $$0, arf $$1, iz $$2, azh $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cur a(dcd $$0, iz $$1, dse $$2) {
      return new cur(cuu.sj);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(c);
   }
}
