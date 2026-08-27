public class fpd extends fol<cbt> {
   private static final String a = "feather";
   private final frd b;
   private final frd f;
   private final frd g;
   private final frd h;
   private final frd i;
   private final frd j;
   private final frd k;
   private final frd l;
   private final frd m;

   public fpd(frd $$0) {
      this.b = $$0;
      this.f = $$0.b("body");
      this.g = $$0.b("tail");
      this.h = $$0.b("left_wing");
      this.i = $$0.b("right_wing");
      this.j = $$0.b("head");
      this.k = this.j.b("feather");
      this.l = $$0.b("left_leg");
      this.m = $$0.b("right_leg");
   }

   public static frj b() {
      frl $$0 = new frl();
      frm $$1 = $$0.a();
      $$1.a("body", fri.c().a(2, 8).a(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F), frf.a(0.0F, 16.5F, -3.0F));
      $$1.a("tail", fri.c().a(22, 1).a(-1.5F, -1.0F, -1.0F, 3.0F, 4.0F, 1.0F), frf.a(0.0F, 21.07F, 1.16F));
      $$1.a("left_wing", fri.c().a(19, 8).a(-0.5F, 0.0F, -1.5F, 1.0F, 5.0F, 3.0F), frf.a(1.5F, 16.94F, -2.76F));
      $$1.a("right_wing", fri.c().a(19, 8).a(-0.5F, 0.0F, -1.5F, 1.0F, 5.0F, 3.0F), frf.a(-1.5F, 16.94F, -2.76F));
      frm $$2 = $$1.a("head", fri.c().a(2, 2).a(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F), frf.a(0.0F, 15.69F, -2.76F));
      $$2.a("head2", fri.c().a(10, 0).a(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F), frf.a(0.0F, -2.0F, -1.0F));
      $$2.a("beak1", fri.c().a(11, 7).a(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F), frf.a(0.0F, -0.5F, -1.5F));
      $$2.a("beak2", fri.c().a(16, 7).a(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), frf.a(0.0F, -1.75F, -2.45F));
      $$2.a("feather", fri.c().a(2, 18).a(0.0F, -4.0F, -2.0F, 0.0F, 5.0F, 4.0F), frf.a(0.0F, -2.15F, 0.15F));
      fri $$3 = fri.c().a(14, 18).a(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F);
      $$1.a("left_leg", $$3, frf.a(1.0F, 22.0F, -1.05F));
      $$1.a("right_leg", $$3, frf.a(-1.0F, 22.0F, -1.05F));
      return frj.a($$0, 32, 32);
   }

   @Override
   public frd a() {
      return this.b;
   }

   public void a(cbt $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a(a($$0), $$0.ah, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(cbt $$0, float $$1, float $$2, float $$3) {
      this.a(a($$0));
   }

   public void a(etz $$0, eud $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7, int $$8) {
      this.a(fpd.a.e);
      this.a(fpd.a.e, $$8, $$4, $$5, 0.0F, $$6, $$7);
      this.b.a($$0, $$1, $$2, $$3);
   }

   private void a(fpd.a $$0, int $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      this.j.e = $$6 * (float) (Math.PI / 180.0);
      this.j.f = $$5 * (float) (Math.PI / 180.0);
      this.j.g = 0.0F;
      this.j.b = 0.0F;
      this.f.b = 0.0F;
      this.g.b = 0.0F;
      this.i.b = -1.5F;
      this.h.b = 1.5F;
      switch ($$0) {
         case c:
            break;
         case d:
            float $$7 = aww.b((float)$$1);
            float $$8 = aww.a((float)$$1);
            this.j.b = $$7;
            this.j.c = 15.69F + $$8;
            this.j.e = 0.0F;
            this.j.f = 0.0F;
            this.j.g = aww.a((float)$$1) * 0.4F;
            this.f.b = $$7;
            this.f.c = 16.5F + $$8;
            this.h.g = -0.0873F - $$4;
            this.h.b = 1.5F + $$7;
            this.h.c = 16.94F + $$8;
            this.i.g = 0.0873F + $$4;
            this.i.b = -1.5F + $$7;
            this.i.c = 16.94F + $$8;
            this.g.b = $$7;
            this.g.c = 21.07F + $$8;
            break;
         case b:
            this.l.e = this.l.e + aww.b($$2 * 0.6662F) * 1.4F * $$3;
            this.m.e = this.m.e + aww.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$3;
         case a:
         case e:
         default:
            float $$9 = $$4 * 0.3F;
            this.j.c = 15.69F + $$9;
            this.g.e = 1.015F + aww.b($$2 * 0.6662F) * 0.3F * $$3;
            this.g.c = 21.07F + $$9;
            this.f.c = 16.5F + $$9;
            this.h.g = -0.0873F - $$4;
            this.h.c = 16.94F + $$9;
            this.i.g = 0.0873F + $$4;
            this.i.c = 16.94F + $$9;
            this.l.c = 22.0F + $$9;
            this.m.c = 22.0F + $$9;
      }
   }

   private void a(fpd.a $$0) {
      this.k.e = -0.2214F;
      this.f.e = 0.4937F;
      this.h.e = -0.6981F;
      this.h.f = (float) -Math.PI;
      this.i.e = -0.6981F;
      this.i.f = (float) -Math.PI;
      this.l.e = -0.0299F;
      this.m.e = -0.0299F;
      this.l.c = 22.0F;
      this.m.c = 22.0F;
      this.l.g = 0.0F;
      this.m.g = 0.0F;
      switch ($$0) {
         case c:
            float $$1 = 1.9F;
            this.j.c = 17.59F;
            this.g.e = 1.5388988F;
            this.g.c = 22.97F;
            this.f.c = 18.4F;
            this.h.g = -0.0873F;
            this.h.c = 18.84F;
            this.i.g = 0.0873F;
            this.i.c = 18.84F;
            this.l.c++;
            this.m.c++;
            this.l.e++;
            this.m.e++;
            break;
         case d:
            this.l.g = (float) (-Math.PI / 9);
            this.m.g = (float) (Math.PI / 9);
         case b:
         case e:
         default:
            break;
         case a:
            this.l.e += (float) (Math.PI * 2.0 / 9.0);
            this.m.e += (float) (Math.PI * 2.0 / 9.0);
      }
   }

   private static fpd.a a(cbt $$0) {
      if ($$0.gu()) {
         return fpd.a.d;
      } else if ($$0.y()) {
         return fpd.a.c;
      } else {
         return $$0.gA() ? fpd.a.a : fpd.a.b;
      }
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }
}
