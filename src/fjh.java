public class fjh extends fid<cbs> {
   private final fkt a;
   private final fkt b;
   private final fkt f;
   private final fkt g;
   private final fkt h;
   private final fkt i;
   private final fkt j;
   private final fkt k;

   public fjh(fkt $$0) {
      this.a = $$0;
      this.k = $$0.b("neck");
      this.b = this.k.b("head");
      this.f = this.b.b("mouth");
      this.g = $$0.b("right_hind_leg");
      this.h = $$0.b("left_hind_leg");
      this.i = $$0.b("right_front_leg");
      this.j = $$0.b("left_front_leg");
   }

   public static fkz b() {
      flb $$0 = new flb();
      flc $$1 = $$0.a();
      int $$2 = 16;
      flc $$3 = $$1.a("neck", fky.c().a(68, 73).a(-5.0F, -1.0F, -18.0F, 10.0F, 10.0F, 18.0F), fkv.a(0.0F, -7.0F, 5.5F));
      flc $$4 = $$3.a(
         "head", fky.c().a(0, 0).a(-8.0F, -20.0F, -14.0F, 16.0F, 20.0F, 16.0F).a(0, 0).a(-2.0F, -6.0F, -18.0F, 4.0F, 8.0F, 4.0F), fkv.a(0.0F, 16.0F, -17.0F)
      );
      $$4.a("right_horn", fky.c().a(74, 55).a(0.0F, -14.0F, -2.0F, 2.0F, 14.0F, 4.0F), fkv.a(-10.0F, -14.0F, -8.0F, 1.0995574F, 0.0F, 0.0F));
      $$4.a("left_horn", fky.c().a(74, 55).a().a(0.0F, -14.0F, -2.0F, 2.0F, 14.0F, 4.0F), fkv.a(8.0F, -14.0F, -8.0F, 1.0995574F, 0.0F, 0.0F));
      $$4.a("mouth", fky.c().a(0, 36).a(-8.0F, 0.0F, -16.0F, 16.0F, 3.0F, 16.0F), fkv.a(0.0F, -2.0F, 2.0F));
      $$1.a(
         "body",
         fky.c().a(0, 55).a(-7.0F, -10.0F, -7.0F, 14.0F, 16.0F, 20.0F).a(0, 91).a(-6.0F, 6.0F, -7.0F, 12.0F, 13.0F, 18.0F),
         fkv.a(0.0F, 1.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      $$1.a("right_hind_leg", fky.c().a(96, 0).a(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F), fkv.a(-8.0F, -13.0F, 18.0F));
      $$1.a("left_hind_leg", fky.c().a(96, 0).a().a(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F), fkv.a(8.0F, -13.0F, 18.0F));
      $$1.a("right_front_leg", fky.c().a(64, 0).a(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F), fkv.a(-8.0F, -13.0F, -5.0F));
      $$1.a("left_front_leg", fky.c().a(64, 0).a().a(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F), fkv.a(8.0F, -13.0F, -5.0F));
      return fkz.a($$0, 128, 128);
   }

   @Override
   public fkt a() {
      return this.a;
   }

   public void a(cbs $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.b.e = $$5 * (float) (Math.PI / 180.0);
      this.b.f = $$4 * (float) (Math.PI / 180.0);
      float $$6 = 0.4F * $$2;
      this.g.e = atq.b($$1 * 0.6662F) * $$6;
      this.h.e = atq.b($$1 * 0.6662F + (float) Math.PI) * $$6;
      this.i.e = atq.b($$1 * 0.6662F + (float) Math.PI) * $$6;
      this.j.e = atq.b($$1 * 0.6662F) * $$6;
   }

   public void a(cbs $$0, float $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = $$0.gf();
      int $$5 = $$0.gp();
      int $$6 = 20;
      int $$7 = $$0.w();
      int $$8 = 10;
      if ($$7 > 0) {
         float $$9 = atq.e((float)$$7 - $$3, 10.0F);
         float $$10 = (1.0F + $$9) * 0.5F;
         float $$11 = $$10 * $$10 * $$10 * 12.0F;
         float $$12 = $$11 * atq.a(this.k.e);
         this.k.d = -6.5F + $$11;
         this.k.c = -7.0F - $$12;
         float $$13 = atq.a(((float)$$7 - $$3) / 10.0F * (float) Math.PI * 0.25F);
         this.f.e = (float) (Math.PI / 2) * $$13;
         if ($$7 > 5) {
            this.f.e = atq.a(((float)(-4 + $$7) - $$3) / 4.0F) * (float) Math.PI * 0.4F;
         } else {
            this.f.e = (float) (Math.PI / 20) * atq.a((float) Math.PI * ((float)$$7 - $$3) / 10.0F);
         }
      } else {
         float $$14 = -1.0F;
         float $$15 = -1.0F * atq.a(this.k.e);
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
            float $$18 = atq.a(((float)(20 - $$5) - $$3) / 20.0F * (float) Math.PI * 0.25F);
            this.f.e = (float) (Math.PI / 2) * $$18;
         }
      }
   }
}
