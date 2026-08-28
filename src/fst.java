public class fst extends fsp<cgj> {
   private static final float a = 16.02F;
   private static final float b = 25.0F;
   private static final float f = 22.5F;
   private static final float g = 16.5F;
   private static final float h = 2.5F;
   private static final String i = "head_cube";
   private static final String j = "right_ear_cube";
   private static final String k = "left_ear_cube";
   private final fwv l;
   private final fwv m;
   private final fwv n;
   private final fwv o;
   private final fwv p;
   private final fwv q;
   private final fwv r;

   public fst(fwv $$0) {
      super(0.6F, 16.02F);
      this.l = $$0;
      this.m = $$0.b("body");
      this.n = $$0.b("right_hind_leg");
      this.o = $$0.b("left_hind_leg");
      this.q = this.m.b("head");
      this.r = this.m.b("tail");
      this.p = $$0.b("cube");
   }

   public static fxb b() {
      fxd $$0 = new fxd();
      fxe $$1 = $$0.a();
      fxe $$2 = $$1.a(
         "body",
         fxa.c().a(0, 20).a(-4.0F, -7.0F, -10.0F, 8.0F, 8.0F, 12.0F, new fwz(0.3F)).a(0, 40).a(-4.0F, -7.0F, -10.0F, 8.0F, 8.0F, 12.0F, new fwz(0.0F)),
         fwx.a(0.0F, 21.0F, 4.0F)
      );
      $$2.a("tail", fxa.c().a(44, 53).a(-0.5F, -0.0865F, 0.0933F, 1.0F, 6.0F, 1.0F, new fwz(0.0F)), fwx.a(0.0F, -3.0F, 1.0F, 0.5061F, 0.0F, 0.0F));
      fxe $$3 = $$2.a("head", fxa.c(), fwx.a(0.0F, -2.0F, -11.0F));
      $$3.a("head_cube", fxa.c().a(43, 15).a(-1.5F, -1.0F, -1.0F, 3.0F, 5.0F, 2.0F, new fwz(0.0F)), fwx.a(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
      fxe $$4 = $$3.a("right_ear", fxa.c(), fwx.a(-1.0F, -1.0F, 0.0F));
      $$4.a("right_ear_cube", fxa.c().a(43, 10).a(-2.0F, -3.0F, 0.0F, 2.0F, 5.0F, 0.0F, new fwz(0.0F)), fwx.a(-0.5F, 0.0F, -0.6F, 0.1886F, -0.3864F, -0.0718F));
      fxe $$5 = $$3.a("left_ear", fxa.c(), fwx.a(1.0F, -2.0F, 0.0F));
      $$5.a("left_ear_cube", fxa.c().a(47, 10).a(0.0F, -3.0F, 0.0F, 2.0F, 5.0F, 0.0F, new fwz(0.0F)), fwx.a(0.5F, 1.0F, -0.6F, 0.1886F, 0.3864F, 0.0718F));
      $$1.a("right_hind_leg", fxa.c().a(51, 31).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new fwz(0.0F)), fwx.a(-2.0F, 21.0F, 4.0F));
      $$1.a("left_hind_leg", fxa.c().a(42, 31).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new fwz(0.0F)), fwx.a(2.0F, 21.0F, 4.0F));
      $$1.a("right_front_leg", fxa.c().a(51, 43).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new fwz(0.0F)), fwx.a(-2.0F, 21.0F, -4.0F));
      $$1.a("left_front_leg", fxa.c().a(42, 43).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new fwz(0.0F)), fwx.a(2.0F, 21.0F, -4.0F));
      $$1.a("cube", fxa.c().a(0, 0).a(-5.0F, -10.0F, -6.0F, 10.0F, 10.0F, 10.0F, new fwz(0.0F)), fwx.a(0.0F, 24.0F, 0.0F));
      return fxb.a($$0, 64, 64);
   }

   @Override
   public fwv a() {
      return this.l;
   }

   public void a(cgj $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fwv::c);
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
         this.q.e = ayu.a($$5, -22.5F, 25.0F) * (float) (Math.PI / 180.0);
         this.q.f = ayu.a($$4, -32.5F, 32.5F) * (float) (Math.PI / 180.0);
      }

      this.a(fft.b, $$1, $$2, 16.5F, 2.5F);
      this.a($$0.cc, fft.d, $$3, 1.0F);
      this.a($$0.cd, fft.a, $$3, 1.0F);
      this.a($$0.ce, fft.c, $$3, 1.0F);
   }
}
