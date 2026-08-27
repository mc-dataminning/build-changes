public class fjy<T extends bzm> extends fke<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fmv g;
   private final fmv h;
   private final fmv i;
   private final fmv j;
   private final fmv k;
   private final fmv l;
   private final fmv m;
   private final fmv n;
   private final fmv o;
   private final fmv p;

   public fjy(fmv $$0) {
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

   public static fnb b() {
      fnd $$0 = new fnd();
      fne $$1 = $$0.a();
      fne $$2 = $$1.a("root", fna.c(), fmx.a(0.0F, 24.0F, 0.0F));
      fne $$3 = $$2.a(
         "body", fna.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fmx.a(0.0F, -2.0F, 4.0F)
      );
      fne $$4 = $$3.a(
         "head", fna.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fmx.a(0.0F, -2.0F, -1.0F)
      );
      fne $$5 = $$4.a("eyes", fna.c(), fmx.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fna.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fmx.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fna.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fmx.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fna.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fmz(-0.1F)), fmx.a(0.0F, -1.0F, -5.0F));
      fne $$6 = $$3.a("tongue", fna.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fmx.a(0.0F, -1.01F, 1.0F));
      fne $$7 = $$3.a("left_arm", fna.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fmx.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fna.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fmx.a(0.0F, 3.0F, -1.0F));
      fne $$8 = $$3.a("right_arm", fna.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fmx.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fna.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fmx.a(0.0F, 3.0F, 0.0F));
      fne $$9 = $$2.a("left_leg", fna.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fmx.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fna.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fmx.a(2.0F, 3.0F, 0.0F));
      fne $$10 = $$2.a("right_leg", fna.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fmx.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fna.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fmx.a(-2.0F, 3.0F, 0.0F));
      return fnb.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fmv::c);
      this.a($$0.bY, ewd.c, $$3);
      this.a($$0.bZ, ewd.a, $$3);
      this.a($$0.ca, ewd.d, $$3);
      if ($$0.bc()) {
         this.a(ewd.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(ewd.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cb, ewd.f, $$3);
      this.p.k = $$0.bZ.c();
   }

   @Override
   public fmv a() {
      return this.g;
   }
}
