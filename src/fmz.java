public class fmz extends fol<cch> implements fnc {
   private final frd a;
   private final frd b;
   private final frd f;
   private final frd g;
   private final frd h;
   private final frd i;
   private final frd j;
   private static final float k = (float) (Math.PI / 4);
   private static final float l = -1.134464F;
   private static final float m = (float) (-Math.PI / 3);

   public fmz(frd $$0) {
      super(fxy::i);
      this.a = $$0.b("root");
      this.b = this.a.b("head");
      this.f = this.a.b("body");
      this.g = this.f.b("right_arm");
      this.h = this.f.b("left_arm");
      this.i = this.f.b("right_wing");
      this.j = this.f.b("left_wing");
   }

   @Override
   public frd a() {
      return this.a;
   }

   public static frj b() {
      frl $$0 = new frl();
      frm $$1 = $$0.a();
      frm $$2 = $$1.a("root", fri.c(), frf.a(0.0F, 23.5F, 0.0F));
      $$2.a("head", fri.c().a(0, 0).a(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F, new frh(0.0F)), frf.a(0.0F, -3.99F, 0.0F));
      frm $$3 = $$2.a(
         "body",
         fri.c().a(0, 10).a(-1.5F, 0.0F, -1.0F, 3.0F, 4.0F, 2.0F, new frh(0.0F)).a(0, 16).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F, new frh(-0.2F)),
         frf.a(0.0F, -4.0F, 0.0F)
      );
      $$3.a("right_arm", fri.c().a(23, 0).a(-0.75F, -0.5F, -1.0F, 1.0F, 4.0F, 2.0F, new frh(-0.01F)), frf.a(-1.75F, 0.5F, 0.0F));
      $$3.a("left_arm", fri.c().a(23, 6).a(-0.25F, -0.5F, -1.0F, 1.0F, 4.0F, 2.0F, new frh(-0.01F)), frf.a(1.75F, 0.5F, 0.0F));
      $$3.a("right_wing", fri.c().a(16, 14).a(0.0F, 1.0F, 0.0F, 0.0F, 5.0F, 8.0F, new frh(0.0F)), frf.a(-0.5F, 0.0F, 0.6F));
      $$3.a("left_wing", fri.c().a(16, 14).a(0.0F, 1.0F, 0.0F, 0.0F, 5.0F, 8.0F, new frh(0.0F)), frf.a(0.5F, 0.0F, 0.6F));
      return frj.a($$0, 32, 32);
   }

   public void a(cch $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(frd::c);
      float $$6 = $$3 * 20.0F * (float) (Math.PI / 180.0) + $$1;
      float $$7 = aww.b($$6) * (float) Math.PI * 0.15F + $$2;
      float $$8 = $$3 - (float)$$0.ah;
      float $$9 = $$3 * 9.0F * (float) (Math.PI / 180.0);
      float $$10 = Math.min($$2 / 0.3F, 1.0F);
      float $$11 = 1.0F - $$10;
      float $$12 = $$0.G($$8);
      if ($$0.gn()) {
         float $$13 = $$3 * 8.0F * (float) (Math.PI / 180.0) + $$2;
         float $$14 = aww.b($$13) * 16.0F * (float) (Math.PI / 180.0);
         float $$15 = $$0.H($$8);
         float $$16 = aww.b($$13) * 14.0F * (float) (Math.PI / 180.0);
         float $$17 = aww.b($$13) * 30.0F * (float) (Math.PI / 180.0);
         this.a.f = $$0.go() ? (float) (Math.PI * 4) * $$15 : this.a.f;
         this.a.g = $$14 * (1.0F - $$15);
         this.b.f = $$17 * (1.0F - $$15);
         this.b.g = $$16 * (1.0F - $$15);
      } else {
         this.b.e = $$5 * (float) (Math.PI / 180.0);
         this.b.f = $$4 * (float) (Math.PI / 180.0);
      }

      this.i.e = 0.43633232F * (1.0F - $$10);
      this.i.f = (float) (-Math.PI / 4) + $$7;
      this.j.e = 0.43633232F * (1.0F - $$10);
      this.j.f = (float) (Math.PI / 4) - $$7;
      this.f.e = $$10 * (float) (Math.PI / 4);
      float $$18 = $$12 * aww.i($$10, (float) (-Math.PI / 3), -1.134464F);
      this.a.c = this.a.c + (float)Math.cos((double)$$9) * 0.25F * $$11;
      this.g.e = $$18;
      this.h.e = $$18;
      float $$19 = $$11 * (1.0F - $$12);
      float $$20 = 0.43633232F - aww.b($$9 + (float) (Math.PI * 3.0 / 2.0)) * (float) Math.PI * 0.075F * $$19;
      this.h.g = -$$20;
      this.g.g = $$20;
      this.g.f = 0.27925268F * $$12;
      this.h.f = -0.27925268F * $$12;
   }

   @Override
   public void a(bpi $$0, etz $$1) {
      float $$2 = 1.0F;
      float $$3 = 3.0F;
      this.a.a($$1);
      this.f.a($$1);
      $$1.a(0.0F, 0.0625F, 0.1875F);
      $$1.a(a.b.rotation(this.g.e));
      $$1.b(0.7F, 0.7F, 0.7F);
      $$1.a(0.0625F, 0.0F, 0.0F);
   }
}
