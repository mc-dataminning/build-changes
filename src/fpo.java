public class fpo extends fnn<cfu> implements fme {
   private final fqf a;
   private final fqf b;
   private final fqf f;
   private final fqf g;
   private final fqf h;
   private final fqf i;
   private final fqf j;

   public fpo(fqf $$0) {
      super(fwy::i);
      this.a = $$0.b("root");
      this.b = this.a.b("body");
      this.f = this.b.b("right_arm");
      this.g = this.b.b("left_arm");
      this.h = this.b.b("right_wing");
      this.i = this.b.b("left_wing");
      this.j = this.a.b("head");
   }

   public static fql b() {
      fqn $$0 = new fqn();
      fqo $$1 = $$0.a();
      fqo $$2 = $$1.a("root", fqk.c(), fqh.a(0.0F, -2.5F, 0.0F));
      $$2.a("head", fqk.c().a(0, 0).a(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F, new fqj(0.0F)), fqh.a(0.0F, 20.0F, 0.0F));
      fqo $$3 = $$2.a(
         "body",
         fqk.c().a(0, 10).a(-1.5F, 0.0F, -1.0F, 3.0F, 4.0F, 2.0F, new fqj(0.0F)).a(0, 16).a(-1.5F, 1.0F, -1.0F, 3.0F, 5.0F, 2.0F, new fqj(-0.2F)),
         fqh.a(0.0F, 20.0F, 0.0F)
      );
      $$3.a("right_arm", fqk.c().a(23, 0).a(-1.25F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new fqj(-0.1F)), fqh.a(-1.75F, 0.25F, 0.0F));
      $$3.a("left_arm", fqk.c().a(23, 6).a(-0.75F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new fqj(-0.1F)), fqh.a(1.75F, 0.25F, 0.0F));
      $$3.a("left_wing", fqk.c().a(16, 14).a().a(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 8.0F, new fqj(0.0F)).a(false), fqh.a(0.5F, 1.0F, 1.0F));
      $$3.a("right_wing", fqk.c().a(16, 14).a(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 8.0F, new fqj(0.0F)), fqh.a(-0.5F, 1.0F, 1.0F));
      return fql.a($$0, 32, 32);
   }

   public void a(cfu $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fqf::c);
      this.j.f = $$4 * (float) (Math.PI / 180.0);
      this.j.e = $$5 * (float) (Math.PI / 180.0);
      float $$6 = awm.b($$3 * 5.5F * (float) (Math.PI / 180.0)) * 0.1F;
      this.f.g = (float) (Math.PI / 5) + $$6;
      this.g.g = -((float) (Math.PI / 5) + $$6);
      if ($$0.gm()) {
         this.b.e = 0.0F;
         this.a($$0.eR(), $$0.eS(), $$6);
      } else {
         this.b.e = (float) (Math.PI / 20);
      }

      this.i.f = 1.0995574F + awm.b($$3 * 45.836624F * (float) (Math.PI / 180.0)) * (float) (Math.PI / 180.0) * 16.2F;
      this.h.f = -this.i.f;
      this.i.e = 0.47123888F;
      this.i.g = -0.47123888F;
      this.h.e = 0.47123888F;
      this.h.g = 0.47123888F;
   }

   private void a(cpq $$0, cpq $$1, float $$2) {
      if ($$0.b() && $$1.b()) {
         this.f.e = -1.2217305F;
         this.f.f = (float) (Math.PI / 12);
         this.f.g = -0.47123888F - $$2;
         this.g.e = -1.2217305F;
         this.g.f = (float) (-Math.PI / 12);
         this.g.g = 0.47123888F + $$2;
      } else {
         if (!$$0.b()) {
            this.f.e = (float) (Math.PI * 7.0 / 6.0);
            this.f.f = (float) (Math.PI / 12);
            this.f.g = -0.47123888F - $$2;
         }

         if (!$$1.b()) {
            this.g.e = (float) (Math.PI * 7.0 / 6.0);
            this.g.f = (float) (-Math.PI / 12);
            this.g.g = 0.47123888F + $$2;
         }
      }
   }

   @Override
   public fqf a() {
      return this.a;
   }

   @Override
   public void a(bor $$0, etd $$1) {
      boolean $$2 = $$0 == bor.b;
      fqf $$3 = $$2 ? this.f : this.g;
      this.a.a($$1);
      this.b.a($$1);
      $$3.a($$1);
      $$1.b(0.55F, 0.55F, 0.55F);
      this.a($$1, $$2);
   }

   private void a(etd $$0, boolean $$1) {
      if ($$1) {
         $$0.a(0.046875, -0.15625, 0.078125);
      } else {
         $$0.a(-0.046875, -0.15625, 0.078125);
      }
   }
}
