public class ftm extends fti<cga> {
   private static final float a = 16.02F;
   private static final float b = 25.0F;
   private static final float f = 22.5F;
   private static final float g = 16.5F;
   private static final float h = 2.5F;
   private static final String i = "head_cube";
   private static final String j = "right_ear_cube";
   private static final String k = "left_ear_cube";
   private final fxo l;
   private final fxo m;
   private final fxo n;
   private final fxo o;
   private final fxo p;
   private final fxo q;
   private final fxo r;

   public ftm(fxo $$0) {
      super(0.6F, 16.02F);
      this.l = $$0;
      this.m = $$0.b("body");
      this.n = $$0.b("right_hind_leg");
      this.o = $$0.b("left_hind_leg");
      this.q = this.m.b("head");
      this.r = this.m.b("tail");
      this.p = $$0.b("cube");
   }

   public static fxu b() {
      fxw $$0 = new fxw();
      fxx $$1 = $$0.a();
      fxx $$2 = $$1.a(
         "body",
         fxt.c().a(0, 20).a(-4.0F, -7.0F, -10.0F, 8.0F, 8.0F, 12.0F, new fxs(0.3F)).a(0, 40).a(-4.0F, -7.0F, -10.0F, 8.0F, 8.0F, 12.0F, new fxs(0.0F)),
         fxq.a(0.0F, 21.0F, 4.0F)
      );
      $$2.a("tail", fxt.c().a(44, 53).a(-0.5F, -0.0865F, 0.0933F, 1.0F, 6.0F, 1.0F, new fxs(0.0F)), fxq.a(0.0F, -3.0F, 1.0F, 0.5061F, 0.0F, 0.0F));
      fxx $$3 = $$2.a("head", fxt.c(), fxq.a(0.0F, -2.0F, -11.0F));
      $$3.a("head_cube", fxt.c().a(43, 15).a(-1.5F, -1.0F, -1.0F, 3.0F, 5.0F, 2.0F, new fxs(0.0F)), fxq.a(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
      fxx $$4 = $$3.a("right_ear", fxt.c(), fxq.a(-1.0F, -1.0F, 0.0F));
      $$4.a("right_ear_cube", fxt.c().a(43, 10).a(-2.0F, -3.0F, 0.0F, 2.0F, 5.0F, 0.0F, new fxs(0.0F)), fxq.a(-0.5F, 0.0F, -0.6F, 0.1886F, -0.3864F, -0.0718F));
      fxx $$5 = $$3.a("left_ear", fxt.c(), fxq.a(1.0F, -2.0F, 0.0F));
      $$5.a("left_ear_cube", fxt.c().a(47, 10).a(0.0F, -3.0F, 0.0F, 2.0F, 5.0F, 0.0F, new fxs(0.0F)), fxq.a(0.5F, 1.0F, -0.6F, 0.1886F, 0.3864F, 0.0718F));
      $$1.a("right_hind_leg", fxt.c().a(51, 31).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new fxs(0.0F)), fxq.a(-2.0F, 21.0F, 4.0F));
      $$1.a("left_hind_leg", fxt.c().a(42, 31).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new fxs(0.0F)), fxq.a(2.0F, 21.0F, 4.0F));
      $$1.a("right_front_leg", fxt.c().a(51, 43).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new fxs(0.0F)), fxq.a(-2.0F, 21.0F, -4.0F));
      $$1.a("left_front_leg", fxt.c().a(42, 43).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new fxs(0.0F)), fxq.a(2.0F, 21.0F, -4.0F));
      $$1.a("cube", fxt.c().a(0, 0).a(-5.0F, -10.0F, -6.0F, 10.0F, 10.0F, 10.0F, new fxs(0.0F)), fxq.a(0.0F, 24.0F, 0.0F));
      return fxu.a($$0, 64, 64);
   }

   @Override
   public fxo a() {
      return this.l;
   }

   public void a(cga $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fxo::c);
      if ($$0.y()) {
         this.m.l = true;
         this.o.k = false;
         this.n.k = false;
         this.r.k = false;
         this.p.k = true;
      } else {
         this.m.l = false;
         this.o.k = true;
         this.n.k = true;
         this.r.k = true;
         this.p.k = false;
         this.q.e = ayg.a($$5, -22.5F, 25.0F) * (float) (Math.PI / 180.0);
         this.q.f = ayg.a($$4, -32.5F, 32.5F) * (float) (Math.PI / 180.0);
      }

      this.a(fgm.b, $$1, $$2, 16.5F, 2.5F);
      this.a($$0.ce, fgm.d, $$3, 1.0F);
      this.a($$0.cf, fgm.a, $$3, 1.0F);
      this.a($$0.cg, fgm.c, $$3, 1.0F);
   }
}
