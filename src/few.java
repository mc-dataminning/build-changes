public class few<T extends bvy> extends ffc<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fhs g;
   private final fhs h;
   private final fhs i;
   private final fhs j;
   private final fhs k;
   private final fhs l;
   private final fhs m;
   private final fhs n;
   private final fhs o;
   private final fhs p;

   public few(fhs $$0) {
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

   public static fhy b() {
      fia $$0 = new fia();
      fib $$1 = $$0.a();
      fib $$2 = $$1.a("root", fhx.c(), fhu.a(0.0F, 24.0F, 0.0F));
      fib $$3 = $$2.a(
         "body", fhx.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fhu.a(0.0F, -2.0F, 4.0F)
      );
      fib $$4 = $$3.a(
         "head", fhx.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fhu.a(0.0F, -2.0F, -1.0F)
      );
      fib $$5 = $$4.a("eyes", fhx.c(), fhu.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fhx.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fhu.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fhx.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fhu.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fhx.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fhw(-0.1F)), fhu.a(0.0F, -1.0F, -5.0F));
      fib $$6 = $$3.a("tongue", fhx.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fhu.a(0.0F, -1.01F, 1.0F));
      fib $$7 = $$3.a("left_arm", fhx.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fhu.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fhx.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fhu.a(0.0F, 3.0F, -1.0F));
      fib $$8 = $$3.a("right_arm", fhx.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fhu.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fhx.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fhu.a(0.0F, 3.0F, 0.0F));
      fib $$9 = $$2.a("left_leg", fhx.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fhu.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fhx.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fhu.a(2.0F, 3.0F, 0.0F));
      fib $$10 = $$2.a("right_leg", fhx.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fhu.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fhx.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fhu.a(-2.0F, 3.0F, 0.0F));
      return fhy.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fhs::c);
      this.a($$0.bY, erg.c, $$3);
      this.a($$0.bZ, erg.a, $$3);
      this.a($$0.ca, erg.d, $$3);
      if ($$0.ba()) {
         this.a(erg.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(erg.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cb, erg.f, $$3);
      this.p.k = $$0.bZ.c();
   }

   @Override
   public fhs a() {
      return this.g;
   }
}
