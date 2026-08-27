public class fru<T extends cen> extends fsa<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fur g;
   private final fur h;
   private final fur i;
   private final fur j;
   private final fur k;
   private final fur l;
   private final fur m;
   private final fur n;
   private final fur o;
   private final fur p;

   public fru(fur $$0) {
      this.g = $$0.b("root");
      this.h = this.g.b("body");
      this.i = this.h.b("head");
      this.j = this.i.b("eyes");
      this.k = this.h.b("tongue");
      this.l = this.h.b("left_arm");
      this.m = this.h.b("right_arm");
      this.n = this.g.b("left_leg");
      this.o = this.g.b("right_leg");
      this.p = this.h.b("croaking_body");
   }

   public static fux b() {
      fuz $$0 = new fuz();
      fva $$1 = $$0.a();
      fva $$2 = $$1.a("root", fuw.c(), fut.a(0.0F, 24.0F, 0.0F));
      fva $$3 = $$2.a(
         "body", fuw.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fut.a(0.0F, -2.0F, 4.0F)
      );
      fva $$4 = $$3.a(
         "head", fuw.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fut.a(0.0F, -2.0F, -1.0F)
      );
      fva $$5 = $$4.a("eyes", fuw.c(), fut.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fuw.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fut.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fuw.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fut.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fuw.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fuv(-0.1F)), fut.a(0.0F, -1.0F, -5.0F));
      fva $$6 = $$3.a("tongue", fuw.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fut.a(0.0F, -1.01F, 1.0F));
      fva $$7 = $$3.a("left_arm", fuw.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fut.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fuw.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fut.a(0.0F, 3.0F, -1.0F));
      fva $$8 = $$3.a("right_arm", fuw.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fut.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fuw.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fut.a(0.0F, 3.0F, 0.0F));
      fva $$9 = $$2.a("left_leg", fuw.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fut.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fuw.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fut.a(2.0F, 3.0F, 0.0F));
      fva $$10 = $$2.a("right_leg", fuw.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fut.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fuw.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fut.a(-2.0F, 3.0F, 0.0F));
      return fux.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fur::c);
      this.a($$0.cd, fds.c, $$3);
      this.a($$0.ce, fds.a, $$3);
      this.a($$0.cf, fds.d, $$3);
      if ($$0.bf()) {
         this.a(fds.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(fds.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cg, fds.f, $$3);
      this.p.k = $$0.ce.c();
   }

   @Override
   public fur a() {
      return this.g;
   }
}
