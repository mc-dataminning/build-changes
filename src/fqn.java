public class fqn extends fsa<cdz> implements fqq {
   private final fur a;
   private final fur b;
   private final fur f;
   private final fur g;
   private final fur h;
   private final fur i;
   private final fur j;
   private static final float k = (float) (Math.PI / 4);
   private static final float l = -1.134464F;
   private static final float m = (float) (-Math.PI / 3);

   public fqn(fur $$0) {
      super(gbm::i);
      this.a = $$0.b("root");
      this.b = this.a.b("head");
      this.f = this.a.b("body");
      this.g = this.f.b("right_arm");
      this.h = this.f.b("left_arm");
      this.i = this.f.b("right_wing");
      this.j = this.f.b("left_wing");
   }

   @Override
   public fur a() {
      return this.a;
   }

   public static fux b() {
      fuz $$0 = new fuz();
      fva $$1 = $$0.a();
      fva $$2 = $$1.a("root", fuw.c(), fut.a(0.0F, 23.5F, 0.0F));
      $$2.a("head", fuw.c().a(0, 0).a(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F, new fuv(0.0F)), fut.a(0.0F, -3.99F, 0.0F));
      fva $$3 = $$2.a(
         "body",
         fuw.c().a(0, 10).a(-1.5F, 0.0F, -1.0F, 3.0F, 4.0F, 2.0F, new fuv(0.0F)).a(0, 16).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F, new fuv(-0.2F)),
         fut.a(0.0F, -4.0F, 0.0F)
      );
      $$3.a("right_arm", fuw.c().a(23, 0).a(-0.75F, -0.5F, -1.0F, 1.0F, 4.0F, 2.0F, new fuv(-0.01F)), fut.a(-1.75F, 0.5F, 0.0F));
      $$3.a("left_arm", fuw.c().a(23, 6).a(-0.25F, -0.5F, -1.0F, 1.0F, 4.0F, 2.0F, new fuv(-0.01F)), fut.a(1.75F, 0.5F, 0.0F));
      $$3.a("right_wing", fuw.c().a(16, 14).a(0.0F, 1.0F, 0.0F, 0.0F, 5.0F, 8.0F, new fuv(0.0F)), fut.a(-0.5F, 0.0F, 0.6F));
      $$3.a("left_wing", fuw.c().a(16, 14).a(0.0F, 1.0F, 0.0F, 0.0F, 5.0F, 8.0F, new fuv(0.0F)), fut.a(0.5F, 0.0F, 0.6F));
      return fux.a($$0, 32, 32);
   }

   public void a(cdz $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fur::c);
      float $$6 = $$3 * 20.0F * (float) (Math.PI / 180.0) + $$1;
      float $$7 = axw.b($$6) * (float) Math.PI * 0.15F + $$2;
      float $$8 = $$3 - (float)$$0.ai;
      float $$9 = $$3 * 9.0F * (float) (Math.PI / 180.0);
      float $$10 = Math.min($$2 / 0.3F, 1.0F);
      float $$11 = 1.0F - $$10;
      float $$12 = $$0.G($$8);
      if ($$0.gp()) {
         float $$13 = $$3 * 8.0F * (float) (Math.PI / 180.0) + $$2;
         float $$14 = axw.b($$13) * 16.0F * (float) (Math.PI / 180.0);
         float $$15 = $$0.H($$8);
         float $$16 = axw.b($$13) * 14.0F * (float) (Math.PI / 180.0);
         float $$17 = axw.b($$13) * 30.0F * (float) (Math.PI / 180.0);
         this.a.f = $$0.gq() ? (float) (Math.PI * 4) * $$15 : this.a.f;
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
      float $$18 = $$12 * axw.i($$10, (float) (-Math.PI / 3), -1.134464F);
      this.a.c = this.a.c + (float)Math.cos((double)$$9) * 0.25F * $$11;
      this.g.e = $$18;
      this.h.e = $$18;
      float $$19 = $$11 * (1.0F - $$12);
      float $$20 = 0.43633232F - axw.b($$9 + (float) (Math.PI * 3.0 / 2.0)) * (float) Math.PI * 0.075F * $$19;
      this.h.g = -$$20;
      this.g.g = $$20;
      this.g.f = 0.27925268F * $$12;
      this.h.f = -0.27925268F * $$12;
   }

   @Override
   public void a(bqy $$0, exn $$1) {
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
