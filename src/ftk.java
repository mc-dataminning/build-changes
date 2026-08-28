public class ftk extends fux<cfx> implements ftn {
   private final fxo a;
   private final fxo b;
   private final fxo f;
   private final fxo g;
   private final fxo h;
   private final fxo i;
   private final fxo j;
   private static final float k = (float) (Math.PI / 4);
   private static final float l = -1.134464F;
   private static final float m = (float) (-Math.PI / 3);

   public ftk(fxo $$0) {
      super(gel::i);
      this.a = $$0.b("root");
      this.b = this.a.b("head");
      this.f = this.a.b("body");
      this.g = this.f.b("right_arm");
      this.h = this.f.b("left_arm");
      this.i = this.f.b("right_wing");
      this.j = this.f.b("left_wing");
   }

   @Override
   public fxo a() {
      return this.a;
   }

   public static fxu b() {
      fxw $$0 = new fxw();
      fxx $$1 = $$0.a();
      fxx $$2 = $$1.a("root", fxt.c(), fxq.a(0.0F, 23.5F, 0.0F));
      $$2.a("head", fxt.c().a(0, 0).a(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F, new fxs(0.0F)), fxq.a(0.0F, -3.99F, 0.0F));
      fxx $$3 = $$2.a(
         "body",
         fxt.c().a(0, 10).a(-1.5F, 0.0F, -1.0F, 3.0F, 4.0F, 2.0F, new fxs(0.0F)).a(0, 16).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F, new fxs(-0.2F)),
         fxq.a(0.0F, -4.0F, 0.0F)
      );
      $$3.a("right_arm", fxt.c().a(23, 0).a(-0.75F, -0.5F, -1.0F, 1.0F, 4.0F, 2.0F, new fxs(-0.01F)), fxq.a(-1.75F, 0.5F, 0.0F));
      $$3.a("left_arm", fxt.c().a(23, 6).a(-0.25F, -0.5F, -1.0F, 1.0F, 4.0F, 2.0F, new fxs(-0.01F)), fxq.a(1.75F, 0.5F, 0.0F));
      $$3.a("right_wing", fxt.c().a(16, 14).a(0.0F, 1.0F, 0.0F, 0.0F, 5.0F, 8.0F, new fxs(0.0F)), fxq.a(-0.5F, 0.0F, 0.6F));
      $$3.a("left_wing", fxt.c().a(16, 14).a(0.0F, 1.0F, 0.0F, 0.0F, 5.0F, 8.0F, new fxs(0.0F)), fxq.a(0.5F, 0.0F, 0.6F));
      return fxu.a($$0, 32, 32);
   }

   public void a(cfx $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fxo::c);
      float $$6 = $$3 * 20.0F * (float) (Math.PI / 180.0) + $$1;
      float $$7 = ayg.b($$6) * (float) Math.PI * 0.15F + $$2;
      float $$8 = $$3 - (float)$$0.ai;
      float $$9 = $$3 * 9.0F * (float) (Math.PI / 180.0);
      float $$10 = Math.min($$2 / 0.3F, 1.0F);
      float $$11 = 1.0F - $$10;
      float $$12 = $$0.H($$8);
      if ($$0.go()) {
         float $$13 = $$3 * 8.0F * (float) (Math.PI / 180.0) + $$2;
         float $$14 = ayg.b($$13) * 16.0F * (float) (Math.PI / 180.0);
         float $$15 = $$0.I($$8);
         float $$16 = ayg.b($$13) * 14.0F * (float) (Math.PI / 180.0);
         float $$17 = ayg.b($$13) * 30.0F * (float) (Math.PI / 180.0);
         this.a.f = $$0.gp() ? (float) (Math.PI * 4) * $$15 : this.a.f;
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
      float $$18 = $$12 * ayg.i($$10, (float) (-Math.PI / 3), -1.134464F);
      this.a.c = this.a.c + (float)Math.cos((double)$$9) * 0.25F * $$11;
      this.g.e = $$18;
      this.h.e = $$18;
      float $$19 = $$11 * (1.0F - $$12);
      float $$20 = 0.43633232F - ayg.b($$9 + (float) (Math.PI * 3.0 / 2.0)) * (float) Math.PI * 0.075F * $$19;
      this.h.g = -$$20;
      this.g.g = $$20;
      this.g.f = 0.27925268F * $$12;
      this.h.f = -0.27925268F * $$12;
   }

   @Override
   public void a(bsv $$0, fam $$1) {
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
