public class fhk extends fgg<caq> {
   private final fiw a;
   private final fiw b;
   private final fiw f;
   private final fiw g;
   private final fiw h;
   private final fiw i;
   private final fiw j;
   private final fiw k;

   public fhk(fiw $$0) {
      this.a = $$0;
      this.k = $$0.b("neck");
      this.b = this.k.b("head");
      this.f = this.b.b("mouth");
      this.g = $$0.b("right_hind_leg");
      this.h = $$0.b("left_hind_leg");
      this.i = $$0.b("right_front_leg");
      this.j = $$0.b("left_front_leg");
   }

   public static fjc b() {
      fje $$0 = new fje();
      fjf $$1 = $$0.a();
      int $$2 = 16;
      fjf $$3 = $$1.a("neck", fjb.c().a(68, 73).a(-5.0F, -1.0F, -18.0F, 10.0F, 10.0F, 18.0F), fiy.a(0.0F, -7.0F, 5.5F));
      fjf $$4 = $$3.a(
         "head", fjb.c().a(0, 0).a(-8.0F, -20.0F, -14.0F, 16.0F, 20.0F, 16.0F).a(0, 0).a(-2.0F, -6.0F, -18.0F, 4.0F, 8.0F, 4.0F), fiy.a(0.0F, 16.0F, -17.0F)
      );
      $$4.a("right_horn", fjb.c().a(74, 55).a(0.0F, -14.0F, -2.0F, 2.0F, 14.0F, 4.0F), fiy.a(-10.0F, -14.0F, -8.0F, 1.0995574F, 0.0F, 0.0F));
      $$4.a("left_horn", fjb.c().a(74, 55).a().a(0.0F, -14.0F, -2.0F, 2.0F, 14.0F, 4.0F), fiy.a(8.0F, -14.0F, -8.0F, 1.0995574F, 0.0F, 0.0F));
      $$4.a("mouth", fjb.c().a(0, 36).a(-8.0F, 0.0F, -16.0F, 16.0F, 3.0F, 16.0F), fiy.a(0.0F, -2.0F, 2.0F));
      $$1.a(
         "body",
         fjb.c().a(0, 55).a(-7.0F, -10.0F, -7.0F, 14.0F, 16.0F, 20.0F).a(0, 91).a(-6.0F, 6.0F, -7.0F, 12.0F, 13.0F, 18.0F),
         fiy.a(0.0F, 1.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      $$1.a("right_hind_leg", fjb.c().a(96, 0).a(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F), fiy.a(-8.0F, -13.0F, 18.0F));
      $$1.a("left_hind_leg", fjb.c().a(96, 0).a().a(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F), fiy.a(8.0F, -13.0F, 18.0F));
      $$1.a("right_front_leg", fjb.c().a(64, 0).a(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F), fiy.a(-8.0F, -13.0F, -5.0F));
      $$1.a("left_front_leg", fjb.c().a(64, 0).a().a(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F), fiy.a(8.0F, -13.0F, -5.0F));
      return fjc.a($$0, 128, 128);
   }

   @Override
   public fiw a() {
      return this.a;
   }

   public void a(caq $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.b.e = $$5 * (float) (Math.PI / 180.0);
      this.b.f = $$4 * (float) (Math.PI / 180.0);
      float $$6 = 0.4F * $$2;
      this.g.e = asy.b($$1 * 0.6662F) * $$6;
      this.h.e = asy.b($$1 * 0.6662F + (float) Math.PI) * $$6;
      this.i.e = asy.b($$1 * 0.6662F + (float) Math.PI) * $$6;
      this.j.e = asy.b($$1 * 0.6662F) * $$6;
   }

   public void a(caq $$0, float $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = $$0.ge();
      int $$5 = $$0.go();
      int $$6 = 20;
      int $$7 = $$0.t();
      int $$8 = 10;
      if ($$7 > 0) {
         float $$9 = asy.e((float)$$7 - $$3, 10.0F);
         float $$10 = (1.0F + $$9) * 0.5F;
         float $$11 = $$10 * $$10 * $$10 * 12.0F;
         float $$12 = $$11 * asy.a(this.k.e);
         this.k.d = -6.5F + $$11;
         this.k.c = -7.0F - $$12;
         float $$13 = asy.a(((float)$$7 - $$3) / 10.0F * (float) Math.PI * 0.25F);
         this.f.e = (float) (Math.PI / 2) * $$13;
         if ($$7 > 5) {
            this.f.e = asy.a(((float)(-4 + $$7) - $$3) / 4.0F) * (float) Math.PI * 0.4F;
         } else {
            this.f.e = (float) (Math.PI / 20) * asy.a((float) Math.PI * ((float)$$7 - $$3) / 10.0F);
         }
      } else {
         float $$14 = -1.0F;
         float $$15 = -1.0F * asy.a(this.k.e);
         this.k.b = 0.0F;
         this.k.c = -7.0F - $$15;
         this.k.d = 5.5F;
         boolean $$16 = $$4 > 0;
         this.k.e = $$16 ? 0.21991149F : 0.0F;
         this.f.e = (float) Math.PI * ($$16 ? 0.05F : 0.01F);
         if ($$16) {
            double $$17 = (double)$$4 / 40.0;
            this.k.b = (float)Math.sin($$17 * 10.0) * 3.0F;
         } else if ($$5 > 0) {
            float $$18 = asy.a(((float)(20 - $$5) - $$3) / 20.0F * (float) Math.PI * 0.25F);
            this.f.e = (float) (Math.PI / 2) * $$18;
         }
      }
   }
}
