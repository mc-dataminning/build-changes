public class fdm<T extends bfj> extends fax<T> {
   private final fee a;
   private final fee b;

   public fdm(fee $$0) {
      this.a = $$0;
      this.b = $$0.b("tail");
   }

   public static fek a(fei $$0) {
      fem $$1 = new fem();
      fen $$2 = $$1.a();
      int $$3 = 19;
      $$2.a("body", fej.c().a(0, 20).a(-1.0F, -3.0F, -3.0F, 2.0F, 6.0F, 6.0F, $$0), feg.a(0.0F, 19.0F, 0.0F));
      $$2.a("tail", fej.c().a(21, 16).a(0.0F, -3.0F, 0.0F, 0.0F, 6.0F, 5.0F, $$0), feg.a(0.0F, 19.0F, 3.0F));
      $$2.a("right_fin", fej.c().a(2, 16).a(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), feg.a(-1.0F, 20.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("left_fin", fej.c().a(2, 12).a(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), feg.a(1.0F, 20.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("top_fin", fej.c().a(20, 11).a(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 6.0F, $$0), feg.a(0.0F, 16.0F, -3.0F));
      $$2.a("bottom_fin", fej.c().a(20, 21).a(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 6.0F, $$0), feg.a(0.0F, 22.0F, -3.0F));
      return fek.a($$1, 32, 32);
   }

   @Override
   public fee a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 1.0F;
      if (!$$0.aV()) {
         $$6 = 1.5F;
      }

      this.b.f = -$$6 * 0.45F * apa.a(0.6F * $$3);
   }
}
