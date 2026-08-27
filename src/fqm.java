public class fqm extends fol<cgm> implements fnc {
   private final frd a;
   private final frd b;
   private final frd f;
   private final frd g;
   private final frd h;
   private final frd i;
   private final frd j;

   public fqm(frd $$0) {
      super(fxy::i);
      this.a = $$0.b("root");
      this.b = this.a.b("body");
      this.f = this.b.b("right_arm");
      this.g = this.b.b("left_arm");
      this.h = this.b.b("right_wing");
      this.i = this.b.b("left_wing");
      this.j = this.a.b("head");
   }

   public static frj b() {
      frl $$0 = new frl();
      frm $$1 = $$0.a();
      frm $$2 = $$1.a("root", fri.c(), frf.a(0.0F, -2.5F, 0.0F));
      $$2.a("head", fri.c().a(0, 0).a(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F, new frh(0.0F)), frf.a(0.0F, 20.0F, 0.0F));
      frm $$3 = $$2.a(
         "body",
         fri.c().a(0, 10).a(-1.5F, 0.0F, -1.0F, 3.0F, 4.0F, 2.0F, new frh(0.0F)).a(0, 16).a(-1.5F, 1.0F, -1.0F, 3.0F, 5.0F, 2.0F, new frh(-0.2F)),
         frf.a(0.0F, 20.0F, 0.0F)
      );
      $$3.a("right_arm", fri.c().a(23, 0).a(-1.25F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new frh(-0.1F)), frf.a(-1.75F, 0.25F, 0.0F));
      $$3.a("left_arm", fri.c().a(23, 6).a(-0.75F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new frh(-0.1F)), frf.a(1.75F, 0.25F, 0.0F));
      $$3.a("left_wing", fri.c().a(16, 14).a().a(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 8.0F, new frh(0.0F)).a(false), frf.a(0.5F, 1.0F, 1.0F));
      $$3.a("right_wing", fri.c().a(16, 14).a(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 8.0F, new frh(0.0F)), frf.a(-0.5F, 1.0F, 1.0F));
      return frj.a($$0, 32, 32);
   }

   public void a(cgm $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(frd::c);
      this.j.f = $$4 * (float) (Math.PI / 180.0);
      this.j.e = $$5 * (float) (Math.PI / 180.0);
      float $$6 = aww.b($$3 * 5.5F * (float) (Math.PI / 180.0)) * 0.1F;
      this.f.g = (float) (Math.PI / 5) + $$6;
      this.g.g = -((float) (Math.PI / 5) + $$6);
      if ($$0.gn()) {
         this.b.e = 0.0F;
         this.a($$0.eU(), $$0.eV(), $$6);
      } else {
         this.b.e = (float) (Math.PI / 20);
      }

      this.i.f = 1.0995574F + aww.b($$3 * 45.836624F * (float) (Math.PI / 180.0)) * (float) (Math.PI / 180.0) * 16.2F;
      this.h.f = -this.i.f;
      this.i.e = 0.47123888F;
      this.i.g = -0.47123888F;
      this.h.e = 0.47123888F;
      this.h.g = 0.47123888F;
   }

   private void a(cqk $$0, cqk $$1, float $$2) {
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
   public frd a() {
      return this.a;
   }

   @Override
   public void a(bpi $$0, etz $$1) {
      boolean $$2 = $$0 == bpi.b;
      frd $$3 = $$2 ? this.f : this.g;
      this.a.a($$1);
      this.b.a($$1);
      $$3.a($$1);
      $$1.b(0.55F, 0.55F, 0.55F);
      this.a($$1, $$2);
   }

   private void a(etz $$0, boolean $$1) {
      if ($$1) {
         $$0.a(0.046875, -0.15625, 0.078125);
      } else {
         $$0.a(-0.046875, -0.15625, 0.078125);
      }
   }
}
