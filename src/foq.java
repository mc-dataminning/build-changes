public class foq<T extends cfg> extends fol<T> implements fnc, fok {
   private final frd a;
   private final frd b;
   private final frd f;
   private final frd g;
   private final frd h;
   private final frd i;
   private final frd j;
   private final frd k;

   public foq(frd $$0) {
      this.a = $$0;
      this.b = $$0.b("head");
      this.f = this.b.b("hat");
      this.f.k = false;
      this.g = $$0.b("arms");
      this.h = $$0.b("left_leg");
      this.i = $$0.b("right_leg");
      this.k = $$0.b("left_arm");
      this.j = $$0.b("right_arm");
   }

   public static frj b() {
      frl $$0 = new frl();
      frm $$1 = $$0.a();
      frm $$2 = $$1.a("head", fri.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), frf.a(0.0F, 0.0F, 0.0F));
      $$2.a("hat", fri.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 12.0F, 8.0F, new frh(0.45F)), frf.a);
      $$2.a("nose", fri.c().a(24, 0).a(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F), frf.a(0.0F, -2.0F, 0.0F));
      $$1.a(
         "body",
         fri.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new frh(0.5F)),
         frf.a(0.0F, 0.0F, 0.0F)
      );
      frm $$3 = $$1.a(
         "arms",
         fri.c().a(44, 22).a(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F).a(40, 38).a(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F),
         frf.a(0.0F, 3.0F, -1.0F, -0.75F, 0.0F, 0.0F)
      );
      $$3.a("left_shoulder", fri.c().a(44, 22).a().a(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F), frf.a);
      $$1.a("right_leg", fri.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), frf.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fri.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), frf.a(2.0F, 12.0F, 0.0F));
      $$1.a("right_arm", fri.c().a(40, 46).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), frf.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fri.c().a(40, 46).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), frf.a(5.0F, 2.0F, 0.0F));
      return frj.a($$0, 64, 64);
   }

   @Override
   public frd a() {
      return this.a;
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.b.f = $$4 * (float) (Math.PI / 180.0);
      this.b.e = $$5 * (float) (Math.PI / 180.0);
      if (this.d) {
         this.j.e = (float) (-Math.PI / 5);
         this.j.f = 0.0F;
         this.j.g = 0.0F;
         this.k.e = (float) (-Math.PI / 5);
         this.k.f = 0.0F;
         this.k.g = 0.0F;
         this.i.e = -1.4137167F;
         this.i.f = (float) (Math.PI / 10);
         this.i.g = 0.07853982F;
         this.h.e = -1.4137167F;
         this.h.f = (float) (-Math.PI / 10);
         this.h.g = -0.07853982F;
      } else {
         this.j.e = aww.b($$1 * 0.6662F + (float) Math.PI) * 2.0F * $$2 * 0.5F;
         this.j.f = 0.0F;
         this.j.g = 0.0F;
         this.k.e = aww.b($$1 * 0.6662F) * 2.0F * $$2 * 0.5F;
         this.k.f = 0.0F;
         this.k.g = 0.0F;
         this.i.e = aww.b($$1 * 0.6662F) * 1.4F * $$2 * 0.5F;
         this.i.f = 0.0F;
         this.i.g = 0.0F;
         this.h.e = aww.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2 * 0.5F;
         this.h.f = 0.0F;
         this.h.g = 0.0F;
      }

      cfg.a $$6 = $$0.r();
      if ($$6 == cfg.a.b) {
         if ($$0.eU().b()) {
            fna.a(this.k, this.j, true, this.c, $$3);
         } else {
            fna.a(this.j, this.k, $$0, this.c, $$3);
         }
      } else if ($$6 == cfg.a.c) {
         this.j.d = 0.0F;
         this.j.b = -5.0F;
         this.k.d = 0.0F;
         this.k.b = 5.0F;
         this.j.e = aww.b($$3 * 0.6662F) * 0.25F;
         this.k.e = aww.b($$3 * 0.6662F) * 0.25F;
         this.j.g = (float) (Math.PI * 3.0 / 4.0);
         this.k.g = (float) (-Math.PI * 3.0 / 4.0);
         this.j.f = 0.0F;
         this.k.f = 0.0F;
      } else if ($$6 == cfg.a.d) {
         this.j.f = -0.1F + this.b.f;
         this.j.e = (float) (-Math.PI / 2) + this.b.e;
         this.k.e = -0.9424779F + this.b.e;
         this.k.f = this.b.f - 0.4F;
         this.k.g = (float) (Math.PI / 2);
      } else if ($$6 == cfg.a.e) {
         fna.a(this.j, this.k, this.b, true);
      } else if ($$6 == cfg.a.f) {
         fna.a(this.j, this.k, $$0, true);
      } else if ($$6 == cfg.a.g) {
         this.j.d = 0.0F;
         this.j.b = -5.0F;
         this.j.e = aww.b($$3 * 0.6662F) * 0.05F;
         this.j.g = 2.670354F;
         this.j.f = 0.0F;
         this.k.d = 0.0F;
         this.k.b = 5.0F;
         this.k.e = aww.b($$3 * 0.6662F) * 0.05F;
         this.k.g = (float) (-Math.PI * 3.0 / 4.0);
         this.k.f = 0.0F;
      }

      boolean $$7 = $$6 == cfg.a.a;
      this.g.k = $$7;
      this.k.k = !$$7;
      this.j.k = !$$7;
   }

   private frd a(bpi $$0) {
      return $$0 == bpi.a ? this.k : this.j;
   }

   public frd c() {
      return this.f;
   }

   @Override
   public frd d() {
      return this.b;
   }

   @Override
   public void a(bpi $$0, etz $$1) {
      this.a($$0).a($$1);
   }
}
