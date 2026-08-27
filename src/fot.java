public class fot<T extends cfh> extends fon<T> implements fne, fom {
   private final frf a;
   private final frf b;
   private final frf f;
   private final frf g;
   private final frf h;
   private final frf i;
   private final frf j;
   private final frf k;

   public fot(frf $$0) {
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

   public static frl b() {
      frn $$0 = new frn();
      fro $$1 = $$0.a();
      fro $$2 = $$1.a("head", frk.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), frh.a(0.0F, 0.0F, 0.0F));
      $$2.a("hat", frk.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 12.0F, 8.0F, new frj(0.45F)), frh.a);
      $$2.a("nose", frk.c().a(24, 0).a(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F), frh.a(0.0F, -2.0F, 0.0F));
      $$1.a(
         "body",
         frk.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new frj(0.5F)),
         frh.a(0.0F, 0.0F, 0.0F)
      );
      fro $$3 = $$1.a(
         "arms",
         frk.c().a(44, 22).a(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F).a(40, 38).a(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F),
         frh.a(0.0F, 3.0F, -1.0F, -0.75F, 0.0F, 0.0F)
      );
      $$3.a("left_shoulder", frk.c().a(44, 22).a().a(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F), frh.a);
      $$1.a("right_leg", frk.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), frh.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", frk.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), frh.a(2.0F, 12.0F, 0.0F));
      $$1.a("right_arm", frk.c().a(40, 46).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), frh.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", frk.c().a(40, 46).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), frh.a(5.0F, 2.0F, 0.0F));
      return frl.a($$0, 64, 64);
   }

   @Override
   public frf a() {
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

      cfh.a $$6 = $$0.r();
      if ($$6 == cfh.a.b) {
         if ($$0.eU().b()) {
            fnc.a(this.k, this.j, true, this.c, $$3);
         } else {
            fnc.a(this.j, this.k, $$0, this.c, $$3);
         }
      } else if ($$6 == cfh.a.c) {
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
      } else if ($$6 == cfh.a.d) {
         this.j.f = -0.1F + this.b.f;
         this.j.e = (float) (-Math.PI / 2) + this.b.e;
         this.k.e = -0.9424779F + this.b.e;
         this.k.f = this.b.f - 0.4F;
         this.k.g = (float) (Math.PI / 2);
      } else if ($$6 == cfh.a.e) {
         fnc.a(this.j, this.k, this.b, true);
      } else if ($$6 == cfh.a.f) {
         fnc.a(this.j, this.k, $$0, true);
      } else if ($$6 == cfh.a.g) {
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

      boolean $$7 = $$6 == cfh.a.a;
      this.g.k = $$7;
      this.k.k = !$$7;
      this.j.k = !$$7;
   }

   private frf a(bpj $$0) {
      return $$0 == bpj.a ? this.k : this.j;
   }

   public frf c() {
      return this.f;
   }

   @Override
   public frf d() {
      return this.b;
   }

   @Override
   public void a(bpj $$0, eub $$1) {
      this.a($$0).a($$1);
   }
}
