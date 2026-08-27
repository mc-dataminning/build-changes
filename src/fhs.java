public class fhs<T extends byg> extends fhy<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fko g;
   private final fko h;
   private final fko i;
   private final fko j;
   private final fko k;
   private final fko l;
   private final fko m;
   private final fko n;
   private final fko o;
   private final fko p;

   public fhs(fko $$0) {
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

   public static fku b() {
      fkw $$0 = new fkw();
      fkx $$1 = $$0.a();
      fkx $$2 = $$1.a("root", fkt.c(), fkq.a(0.0F, 24.0F, 0.0F));
      fkx $$3 = $$2.a(
         "body", fkt.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fkq.a(0.0F, -2.0F, 4.0F)
      );
      fkx $$4 = $$3.a(
         "head", fkt.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fkq.a(0.0F, -2.0F, -1.0F)
      );
      fkx $$5 = $$4.a("eyes", fkt.c(), fkq.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fkt.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fkq.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fkt.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fkq.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fkt.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fks(-0.1F)), fkq.a(0.0F, -1.0F, -5.0F));
      fkx $$6 = $$3.a("tongue", fkt.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fkq.a(0.0F, -1.01F, 1.0F));
      fkx $$7 = $$3.a("left_arm", fkt.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fkq.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fkt.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fkq.a(0.0F, 3.0F, -1.0F));
      fkx $$8 = $$3.a("right_arm", fkt.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fkq.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fkt.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fkq.a(0.0F, 3.0F, 0.0F));
      fkx $$9 = $$2.a("left_leg", fkt.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fkq.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fkt.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fkq.a(2.0F, 3.0F, 0.0F));
      fkx $$10 = $$2.a("right_leg", fkt.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fkq.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fkt.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fkq.a(-2.0F, 3.0F, 0.0F));
      return fku.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fko::c);
      this.a($$0.bY, etz.c, $$3);
      this.a($$0.bZ, etz.a, $$3);
      this.a($$0.ca, etz.d, $$3);
      if ($$0.bc()) {
         this.a(etz.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(etz.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cb, etz.f, $$3);
      this.p.k = $$0.bZ.c();
   }

   @Override
   public fko a() {
      return this.g;
   }
}
