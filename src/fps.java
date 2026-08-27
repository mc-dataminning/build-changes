public class fps extends fon<cgf> {
   private final frf a;
   private final frf b;
   private final frf f;
   private final frf g;
   private final frf h;
   private final frf i;
   private final frf j;
   private final frf k;

   public fps(frf $$0) {
      this.a = $$0;
      this.k = $$0.b("neck");
      this.b = this.k.b("head");
      this.f = this.b.b("mouth");
      this.g = $$0.b("right_hind_leg");
      this.h = $$0.b("left_hind_leg");
      this.i = $$0.b("right_front_leg");
      this.j = $$0.b("left_front_leg");
   }

   public static frl b() {
      frn $$0 = new frn();
      fro $$1 = $$0.a();
      int $$2 = 16;
      fro $$3 = $$1.a("neck", frk.c().a(68, 73).a(-5.0F, -1.0F, -18.0F, 10.0F, 10.0F, 18.0F), frh.a(0.0F, -7.0F, 5.5F));
      fro $$4 = $$3.a(
         "head", frk.c().a(0, 0).a(-8.0F, -20.0F, -14.0F, 16.0F, 20.0F, 16.0F).a(0, 0).a(-2.0F, -6.0F, -18.0F, 4.0F, 8.0F, 4.0F), frh.a(0.0F, 16.0F, -17.0F)
      );
      $$4.a("right_horn", frk.c().a(74, 55).a(0.0F, -14.0F, -2.0F, 2.0F, 14.0F, 4.0F), frh.a(-10.0F, -14.0F, -8.0F, 1.0995574F, 0.0F, 0.0F));
      $$4.a("left_horn", frk.c().a(74, 55).a().a(0.0F, -14.0F, -2.0F, 2.0F, 14.0F, 4.0F), frh.a(8.0F, -14.0F, -8.0F, 1.0995574F, 0.0F, 0.0F));
      $$4.a("mouth", frk.c().a(0, 36).a(-8.0F, 0.0F, -16.0F, 16.0F, 3.0F, 16.0F), frh.a(0.0F, -2.0F, 2.0F));
      $$1.a(
         "body",
         frk.c().a(0, 55).a(-7.0F, -10.0F, -7.0F, 14.0F, 16.0F, 20.0F).a(0, 91).a(-6.0F, 6.0F, -7.0F, 12.0F, 13.0F, 18.0F),
         frh.a(0.0F, 1.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      $$1.a("right_hind_leg", frk.c().a(96, 0).a(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F), frh.a(-8.0F, -13.0F, 18.0F));
      $$1.a("left_hind_leg", frk.c().a(96, 0).a().a(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F), frh.a(8.0F, -13.0F, 18.0F));
      $$1.a("right_front_leg", frk.c().a(64, 0).a(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F), frh.a(-8.0F, -13.0F, -5.0F));
      $$1.a("left_front_leg", frk.c().a(64, 0).a().a(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F), frh.a(8.0F, -13.0F, -5.0F));
      return frl.a($$0, 128, 128);
   }

   @Override
   public frf a() {
      return this.a;
   }

   public void a(cgf $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.b.e = $$5 * (float) (Math.PI / 180.0);
      this.b.f = $$4 * (float) (Math.PI / 180.0);
      float $$6 = 0.4F * $$2;
      this.g.e = aww.b($$1 * 0.6662F) * $$6;
      this.h.e = aww.b($$1 * 0.6662F + (float) Math.PI) * $$6;
      this.i.e = aww.b($$1 * 0.6662F + (float) Math.PI) * $$6;
      this.j.e = aww.b($$1 * 0.6662F) * $$6;
   }

   public void a(cgf $$0, float $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = $$0.gn();
      int $$5 = $$0.gx();
      int $$6 = 20;
      int $$7 = $$0.s();
      int $$8 = 10;
      if ($$7 > 0) {
         float $$9 = aww.e((float)$$7 - $$3, 10.0F);
         float $$10 = (1.0F + $$9) * 0.5F;
         float $$11 = $$10 * $$10 * $$10 * 12.0F;
         float $$12 = $$11 * aww.a(this.k.e);
         this.k.d = -6.5F + $$11;
         this.k.c = -7.0F - $$12;
         float $$13 = aww.a(((float)$$7 - $$3) / 10.0F * (float) Math.PI * 0.25F);
         this.f.e = (float) (Math.PI / 2) * $$13;
         if ($$7 > 5) {
            this.f.e = aww.a(((float)(-4 + $$7) - $$3) / 4.0F) * (float) Math.PI * 0.4F;
         } else {
            this.f.e = (float) (Math.PI / 20) * aww.a((float) Math.PI * ((float)$$7 - $$3) / 10.0F);
         }
      } else {
         float $$14 = -1.0F;
         float $$15 = -1.0F * aww.a(this.k.e);
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
            float $$18 = aww.a(((float)(20 - $$5) - $$3) / 20.0F * (float) Math.PI * 0.25F);
            this.f.e = (float) (Math.PI / 2) * $$18;
         }
      }
   }
}
