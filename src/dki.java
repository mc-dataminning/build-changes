import com.mojang.serialization.MapCodec;

public class dki extends ddt {
   public static final MapCodec<dki> a = b(dki::new);
   public static final int b = 2;
   public static final dpz c = dpp.aq;
   private static final float g = 3.0F;
   private static final est[] h = new est[]{dby.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), dby.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dki> a() {
      return a;
   }

   public dki(doy.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(c);
   }

   @Override
   public est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected dpz b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected cyw d() {
      return crm.vg;
   }

   @Override
   public doz b(int $$0) {
      return $$0 == 2 ? dca.bS.n() : super.b($$0);
   }

   @Override
   public void b(doz $$0, aps $$1, ib $$2, axr $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(cyx $$0) {
      return 1;
   }
}
