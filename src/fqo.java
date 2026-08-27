public class fqo extends fon<cgo> implements fne {
   private final frf a;
   private final frf b;
   private final frf f;
   private final frf g;
   private final frf h;
   private final frf i;
   private final frf j;

   public fqo(frf $$0) {
      super(fya::i);
      this.a = $$0.b("root");
      this.b = this.a.b("body");
      this.f = this.b.b("right_arm");
      this.g = this.b.b("left_arm");
      this.h = this.b.b("right_wing");
      this.i = this.b.b("left_wing");
      this.j = this.a.b("head");
   }

   public static frl b() {
      frn $$0 = new frn();
      fro $$1 = $$0.a();
      fro $$2 = $$1.a("root", frk.c(), frh.a(0.0F, -2.5F, 0.0F));
      $$2.a("head", frk.c().a(0, 0).a(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F, new frj(0.0F)), frh.a(0.0F, 20.0F, 0.0F));
      fro $$3 = $$2.a(
         "body",
         frk.c().a(0, 10).a(-1.5F, 0.0F, -1.0F, 3.0F, 4.0F, 2.0F, new frj(0.0F)).a(0, 16).a(-1.5F, 1.0F, -1.0F, 3.0F, 5.0F, 2.0F, new frj(-0.2F)),
         frh.a(0.0F, 20.0F, 0.0F)
      );
      $$3.a("right_arm", frk.c().a(23, 0).a(-1.25F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new frj(-0.1F)), frh.a(-1.75F, 0.25F, 0.0F));
      $$3.a("left_arm", frk.c().a(23, 6).a(-0.75F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new frj(-0.1F)), frh.a(1.75F, 0.25F, 0.0F));
      $$3.a("left_wing", frk.c().a(16, 14).a().a(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 8.0F, new frj(0.0F)).a(false), frh.a(0.5F, 1.0F, 1.0F));
      $$3.a("right_wing", frk.c().a(16, 14).a(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 8.0F, new frj(0.0F)), frh.a(-0.5F, 1.0F, 1.0F));
      return frl.a($$0, 32, 32);
   }

   public void a(cgo $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(frf::c);
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

   private void a(cqm $$0, cqm $$1, float $$2) {
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
   public frf a() {
      return this.a;
   }

   @Override
   public void a(bpj $$0, eub $$1) {
      boolean $$2 = $$0 == bpj.b;
      frf $$3 = $$2 ? this.f : this.g;
      this.a.a($$1);
      this.b.a($$1);
      $$3.a($$1);
      $$1.b(0.55F, 0.55F, 0.55F);
      this.a($$1, $$2);
   }

   private void a(eub $$0, boolean $$1) {
      if ($$1) {
         $$0.a(0.046875, -0.15625, 0.078125);
      } else {
         $$0.a(-0.046875, -0.15625, 0.078125);
      }
   }
}
