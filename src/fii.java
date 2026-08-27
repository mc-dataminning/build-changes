public class fii<T extends bxb> extends fim<T> {
   public fii(fkb $$0) {
      super($$0, true, 16.0F, 4.0F, 2.25F, 2.0F, 24);
   }

   public static fkh c() {
      fkj $$0 = new fkj();
      fkk $$1 = $$0.a();
      $$1.a(
         "head",
         fkg.c()
            .a(0, 0)
            .a(-3.5F, -3.0F, -3.0F, 7.0F, 7.0F, 7.0F)
            .a(0, 44)
            .a("mouth", -2.5F, 1.0F, -6.0F, 5.0F, 3.0F, 3.0F)
            .a(26, 0)
            .a("right_ear", -4.5F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F)
            .a(26, 0)
            .a()
            .a("left_ear", 2.5F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F),
         fkd.a(0.0F, 10.0F, -16.0F)
      );
      $$1.a(
         "body",
         fkg.c().a(0, 19).a(-5.0F, -13.0F, -7.0F, 14.0F, 14.0F, 11.0F).a(39, 0).a(-4.0F, -25.0F, -7.0F, 12.0F, 12.0F, 10.0F),
         fkd.a(-2.0F, 9.0F, 12.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      int $$2 = 10;
      fkg $$3 = fkg.c().a(50, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 8.0F);
      $$1.a("right_hind_leg", $$3, fkd.a(-4.5F, 14.0F, 6.0F));
      $$1.a("left_hind_leg", $$3, fkd.a(4.5F, 14.0F, 6.0F));
      fkg $$4 = fkg.c().a(50, 40).a(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 6.0F);
      $$1.a("right_front_leg", $$4, fkd.a(-3.5F, 14.0F, -8.0F));
      $$1.a("left_front_leg", $$4, fkd.a(3.5F, 14.0F, -8.0F));
      return fkh.a($$0, 128, 64);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$3 - (float)$$0.ah;
      float $$7 = $$0.E($$6);
      $$7 *= $$7;
      float $$8 = 1.0F - $$7;
      this.b.e = (float) (Math.PI / 2) - $$7 * (float) Math.PI * 0.35F;
      this.b.c = 9.0F * $$8 + 11.0F * $$7;
      this.h.c = 14.0F * $$8 - 6.0F * $$7;
      this.h.d = -8.0F * $$8 - 4.0F * $$7;
      this.h.e -= $$7 * (float) Math.PI * 0.45F;
      this.i.c = this.h.c;
      this.i.d = this.h.d;
      this.i.e -= $$7 * (float) Math.PI * 0.45F;
      if (this.e) {
         this.a.c = 10.0F * $$8 - 9.0F * $$7;
         this.a.d = -16.0F * $$8 - 7.0F * $$7;
      } else {
         this.a.c = 10.0F * $$8 - 14.0F * $$7;
         this.a.d = -16.0F * $$8 - 3.0F * $$7;
      }

      this.a.e += $$7 * (float) Math.PI * 0.15F;
   }
}
