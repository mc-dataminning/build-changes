public class fky extends fmk<cax> implements flb {
   private final fpc a;
   private final fpc b;
   private final fpc f;
   private final fpc g;
   private final fpc h;
   private final fpc i;
   private final fpc j;
   private static final float k = (float) (Math.PI / 4);
   private static final float l = -1.134464F;
   private static final float m = (float) (-Math.PI / 3);

   public fky(fpc $$0) {
      super(fvu::i);
      this.a = $$0.b("root");
      this.b = this.a.b("head");
      this.f = this.a.b("body");
      this.g = this.f.b("right_arm");
      this.h = this.f.b("left_arm");
      this.i = this.f.b("right_wing");
      this.j = this.f.b("left_wing");
   }

   @Override
   public fpc a() {
      return this.a;
   }

   public static fpi b() {
      fpk $$0 = new fpk();
      fpl $$1 = $$0.a();
      fpl $$2 = $$1.a("root", fph.c(), fpe.a(0.0F, 23.5F, 0.0F));
      $$2.a("head", fph.c().a(0, 0).a(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F, new fpg(0.0F)), fpe.a(0.0F, -3.99F, 0.0F));
      fpl $$3 = $$2.a(
         "body",
         fph.c().a(0, 10).a(-1.5F, 0.0F, -1.0F, 3.0F, 4.0F, 2.0F, new fpg(0.0F)).a(0, 16).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F, new fpg(-0.2F)),
         fpe.a(0.0F, -4.0F, 0.0F)
      );
      $$3.a("right_arm", fph.c().a(23, 0).a(-0.75F, -0.5F, -1.0F, 1.0F, 4.0F, 2.0F, new fpg(-0.01F)), fpe.a(-1.75F, 0.5F, 0.0F));
      $$3.a("left_arm", fph.c().a(23, 6).a(-0.25F, -0.5F, -1.0F, 1.0F, 4.0F, 2.0F, new fpg(-0.01F)), fpe.a(1.75F, 0.5F, 0.0F));
      $$3.a("right_wing", fph.c().a(16, 14).a(0.0F, 1.0F, 0.0F, 0.0F, 5.0F, 8.0F, new fpg(0.0F)), fpe.a(-0.5F, 0.0F, 0.6F));
      $$3.a("left_wing", fph.c().a(16, 14).a(0.0F, 1.0F, 0.0F, 0.0F, 5.0F, 8.0F, new fpg(0.0F)), fpe.a(0.5F, 0.0F, 0.6F));
      return fpi.a($$0, 32, 32);
   }

   public void a(cax $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fpc::c);
      float $$6 = $$3 * 20.0F * (float) (Math.PI / 180.0) + $$1;
      float $$7 = awh.b($$6) * (float) Math.PI * 0.15F + $$2;
      float $$8 = $$3 - (float)$$0.ag;
      float $$9 = $$3 * 9.0F * (float) (Math.PI / 180.0);
      float $$10 = Math.min($$2 / 0.3F, 1.0F);
      float $$11 = 1.0F - $$10;
      float $$12 = $$0.E($$8);
      if ($$0.gg()) {
         float $$13 = $$3 * 8.0F * (float) (Math.PI / 180.0) + $$2;
         float $$14 = awh.b($$13) * 16.0F * (float) (Math.PI / 180.0);
         float $$15 = $$0.F($$8);
         float $$16 = awh.b($$13) * 14.0F * (float) (Math.PI / 180.0);
         float $$17 = awh.b($$13) * 30.0F * (float) (Math.PI / 180.0);
         this.a.f = $$0.gh() ? (float) (Math.PI * 4) * $$15 : this.a.f;
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
      float $$18 = $$12 * awh.i($$10, (float) (-Math.PI / 3), -1.134464F);
      this.a.c = this.a.c + (float)Math.cos((double)$$9) * 0.25F * $$11;
      this.g.e = $$18;
      this.h.e = $$18;
      float $$19 = $$11 * (1.0F - $$12);
      float $$20 = 0.43633232F - awh.b($$9 + (float) (Math.PI * 3.0 / 2.0)) * (float) Math.PI * 0.075F * $$19;
      this.h.g = -$$20;
      this.g.g = $$20;
      this.g.f = 0.27925268F * $$12;
      this.h.f = -0.27925268F * $$12;
   }

   @Override
   public void a(boa $$0, esa $$1) {
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
