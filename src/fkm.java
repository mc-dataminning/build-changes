public class fkm<T extends bzu> extends fks<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fnj g;
   private final fnj h;
   private final fnj i;
   private final fnj j;
   private final fnj k;
   private final fnj l;
   private final fnj m;
   private final fnj n;
   private final fnj o;
   private final fnj p;

   public fkm(fnj $$0) {
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

   public static fnp b() {
      fnr $$0 = new fnr();
      fns $$1 = $$0.a();
      fns $$2 = $$1.a("root", fno.c(), fnl.a(0.0F, 24.0F, 0.0F));
      fns $$3 = $$2.a(
         "body", fno.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fnl.a(0.0F, -2.0F, 4.0F)
      );
      fns $$4 = $$3.a(
         "head", fno.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fnl.a(0.0F, -2.0F, -1.0F)
      );
      fns $$5 = $$4.a("eyes", fno.c(), fnl.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fno.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fnl.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fno.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fnl.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fno.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fnn(-0.1F)), fnl.a(0.0F, -1.0F, -5.0F));
      fns $$6 = $$3.a("tongue", fno.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fnl.a(0.0F, -1.01F, 1.0F));
      fns $$7 = $$3.a("left_arm", fno.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fnl.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fno.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fnl.a(0.0F, 3.0F, -1.0F));
      fns $$8 = $$3.a("right_arm", fno.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fnl.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fno.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fnl.a(0.0F, 3.0F, 0.0F));
      fns $$9 = $$2.a("left_leg", fno.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fnl.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fno.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fnl.a(2.0F, 3.0F, 0.0F));
      fns $$10 = $$2.a("right_leg", fno.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fnl.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fno.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fnl.a(-2.0F, 3.0F, 0.0F));
      return fnp.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fnj::c);
      this.a($$0.bZ, ewp.c, $$3);
      this.a($$0.ca, ewp.a, $$3);
      this.a($$0.cb, ewp.d, $$3);
      if ($$0.bc()) {
         this.a(ewp.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(ewp.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cc, ewp.f, $$3);
      this.p.k = $$0.ca.c();
   }

   @Override
   public fnj a() {
      return this.g;
   }
}
