import com.mojang.serialization.MapCodec;

public class dni extends dgs {
   public static final MapCodec<dni> a = b(dni::new);
   public static final int b = 2;
   public static final dta c = dsq.aq;
   private static final float g = 3.0F;
   private static final ewi[] h = new ewi[]{dex.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), dex.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dni> a() {
      return a;
   }

   public dni(drz.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(c);
   }

   @Override
   public ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected dta b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dbv d() {
      return cuq.vi;
   }

   @Override
   public dsa b(int $$0) {
      return $$0 == 2 ? dez.bS.o() : super.b($$0);
   }

   @Override
   public void b(dsa $$0, are $$1, iz $$2, azf $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dbw $$0) {
      return 1;
   }
}
