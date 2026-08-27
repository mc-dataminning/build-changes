public class ffi<T extends bwi> extends ffo<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fie g;
   private final fie h;
   private final fie i;
   private final fie j;
   private final fie k;
   private final fie l;
   private final fie m;
   private final fie n;
   private final fie o;
   private final fie p;

   public ffi(fie $$0) {
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

   public static fik b() {
      fim $$0 = new fim();
      fin $$1 = $$0.a();
      fin $$2 = $$1.a("root", fij.c(), fig.a(0.0F, 24.0F, 0.0F));
      fin $$3 = $$2.a(
         "body", fij.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fig.a(0.0F, -2.0F, 4.0F)
      );
      fin $$4 = $$3.a(
         "head", fij.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fig.a(0.0F, -2.0F, -1.0F)
      );
      fin $$5 = $$4.a("eyes", fij.c(), fig.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fij.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fig.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fij.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fig.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fij.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fii(-0.1F)), fig.a(0.0F, -1.0F, -5.0F));
      fin $$6 = $$3.a("tongue", fij.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fig.a(0.0F, -1.01F, 1.0F));
      fin $$7 = $$3.a("left_arm", fij.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fig.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fij.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fig.a(0.0F, 3.0F, -1.0F));
      fin $$8 = $$3.a("right_arm", fij.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fig.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fij.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fig.a(0.0F, 3.0F, 0.0F));
      fin $$9 = $$2.a("left_leg", fij.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fig.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fij.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fig.a(2.0F, 3.0F, 0.0F));
      fin $$10 = $$2.a("right_leg", fij.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fig.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fij.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fig.a(-2.0F, 3.0F, 0.0F));
      return fik.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fie::c);
      this.a($$0.bY, ers.c, $$3);
      this.a($$0.bZ, ers.a, $$3);
      this.a($$0.ca, ers.d, $$3);
      if ($$0.ba()) {
         this.a(ers.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(ers.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cb, ers.f, $$3);
      this.p.k = $$0.bZ.c();
   }

   @Override
   public fie a() {
      return this.g;
   }
}
