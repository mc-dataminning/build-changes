public class ftn<T extends bfz> extends ftg<T, fck<T>> {
   public static final acq a = new acq("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fee c;

   public ftn(fqt<T, fck<T>> $$0, fea $$1) {
      super($$0);
      fee $$2 = $$1.a(fed.aT);
      this.c = $$2.b("box");
   }

   public static fek a() {
      fem $$0 = new fem();
      fen $$1 = $$0.a();
      $$1.a("box", fej.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), feg.a);
      return fek.a($$0, 64, 64);
   }

   public void a(eij $$0, fjx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fe()) {
         ein $$10 = $$1.getBuffer(fkf.d(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, fum.d);
            $$0.b();
         }
      }
   }
}
