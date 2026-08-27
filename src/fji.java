public class fji extends fje<bzj> {
   private static final float a = 16.02F;
   private static final float b = 32.5F;
   private static final float f = 25.0F;
   private static final float g = 22.5F;
   private static final float h = 16.5F;
   private static final float i = 2.5F;
   private static final String j = "head_cube";
   private static final String k = "right_ear_cube";
   private static final String l = "left_ear_cube";
   private final fnj m;
   private final fnj n;
   private final fnj o;
   private final fnj p;
   private final fnj q;
   private final fnj r;
   private final fnj s;

   public fji(fnj $$0) {
      super(0.6F, 16.02F);
      this.m = $$0;
      this.n = $$0.b("body");
      this.o = $$0.b("right_hind_leg");
      this.p = $$0.b("left_hind_leg");
      this.r = this.n.b("head");
      this.s = this.n.b("tail");
      this.q = $$0.b("cube");
   }

   public static fnp b() {
      fnr $$0 = new fnr();
      fns $$1 = $$0.a();
      fns $$2 = $$1.a(
         "body",
         fno.c().a(0, 20).a(-4.0F, -7.0F, -10.0F, 8.0F, 8.0F, 12.0F, new fnn(0.3F)).a(0, 40).a(-4.0F, -7.0F, -10.0F, 8.0F, 8.0F, 12.0F, new fnn(0.0F)),
         fnl.a(0.0F, 21.0F, 4.0F)
      );
      $$2.a("tail", fno.c().a(44, 53).a(-0.5F, -0.0865F, 0.0933F, 1.0F, 6.0F, 1.0F, new fnn(0.0F)), fnl.a(0.0F, -3.0F, 1.0F, 0.5061F, 0.0F, 0.0F));
      fns $$3 = $$2.a("head", fno.c(), fnl.a(0.0F, -2.0F, -11.0F));
      $$3.a("head_cube", fno.c().a(43, 15).a(-1.5F, -1.0F, -1.0F, 3.0F, 5.0F, 2.0F, new fnn(0.0F)), fnl.a(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
      fns $$4 = $$3.a("right_ear", fno.c(), fnl.a(-1.0F, -1.0F, 0.0F));
      $$4.a("right_ear_cube", fno.c().a(43, 10).a(-2.0F, -3.0F, 0.0F, 2.0F, 5.0F, 0.0F, new fnn(0.0F)), fnl.a(-0.5F, 0.0F, -0.6F, 0.1886F, -0.3864F, -0.0718F));
      fns $$5 = $$3.a("left_ear", fno.c(), fnl.a(1.0F, -2.0F, 0.0F));
      $$5.a("left_ear_cube", fno.c().a(47, 10).a(0.0F, -3.0F, 0.0F, 2.0F, 5.0F, 0.0F, new fnn(0.0F)), fnl.a(0.5F, 1.0F, -0.6F, 0.1886F, 0.3864F, 0.0718F));
      $$1.a("right_hind_leg", fno.c().a(51, 31).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new fnn(0.0F)), fnl.a(-2.0F, 21.0F, 4.0F));
      $$1.a("left_hind_leg", fno.c().a(42, 31).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new fnn(0.0F)), fnl.a(2.0F, 21.0F, 4.0F));
      $$1.a("right_front_leg", fno.c().a(51, 43).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new fnn(0.0F)), fnl.a(-2.0F, 21.0F, -4.0F));
      $$1.a("left_front_leg", fno.c().a(42, 43).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new fnn(0.0F)), fnl.a(2.0F, 21.0F, -4.0F));
      $$1.a("cube", fno.c().a(0, 0).a(-5.0F, -10.0F, -6.0F, 10.0F, 10.0F, 10.0F, new fnn(0.0F)), fnl.a(0.0F, 24.0F, 0.0F));
      return fnp.a($$0, 64, 64);
   }

   @Override
   public fnj a() {
      return this.m;
   }

   public void a(bzj $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fnj::c);
      if ($$0.A()) {
         this.n.l = true;
         this.p.k = false;
         this.o.k = false;
         this.s.k = false;
         this.q.k = true;
      } else {
         this.n.l = false;
         this.p.k = true;
         this.o.k = true;
         this.s.k = true;
         this.q.k = false;
         this.r.e = aup.a($$5, -22.5F, 25.0F) * (float) (Math.PI / 180.0);
         this.r.f = aup.a($$4, -32.5F, 32.5F) * (float) (Math.PI / 180.0);
      }

      this.a(ewl.b, $$1, $$2, 16.5F, 2.5F);
      this.a($$0.bX, ewl.c, $$3, 1.0F);
      this.a($$0.bY, ewl.a, $$3, 1.0F);
   }
}
