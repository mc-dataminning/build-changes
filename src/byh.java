import java.util.Set;

public record byh(ffq b, ffq c, float d, float e) {
   public static final yy<vw, byh> a = yy.a(ffq.b, byh::a, ffq.b, byh::b, yw.l, byh::c, yw.l, byh::d, byh::new);

   public static byh a(bwt $$0) {
      return $$0.bQ() ? new byh($$0.R_().a(), $$0.ae(), $$0.R_().b(), $$0.R_().c()) : new byh($$0.dt(), $$0.ae(), $$0.dL(), $$0.dN());
   }

   public static byh a(eyo $$0) {
      return new byh($$0.c(), $$0.d(), $$0.e(), $$0.f());
   }

   public static byh a(byh $$0, byh $$1, Set<byi> $$2) {
      double $$3 = $$2.contains(byi.a) ? $$0.b.d : 0.0;
      double $$4 = $$2.contains(byi.b) ? $$0.b.e : 0.0;
      double $$5 = $$2.contains(byi.c) ? $$0.b.f : 0.0;
      float $$6 = $$2.contains(byi.d) ? $$0.d : 0.0F;
      float $$7 = $$2.contains(byi.e) ? $$0.e : 0.0F;
      ffq $$8 = new ffq($$3 + $$1.b.d, $$4 + $$1.b.e, $$5 + $$1.b.f);
      float $$9 = $$6 + $$1.d;
      float $$10 = azo.a($$7 + $$1.e, -90.0F, 90.0F);
      ffq $$11 = $$0.c;
      if ($$2.contains(byi.i)) {
         float $$12 = $$0.d - $$9;
         float $$13 = $$0.e - $$10;
         $$11 = $$11.a((float)Math.toRadians((double)$$13));
         $$11 = $$11.b((float)Math.toRadians((double)$$12));
      }

      ffq $$14 = new ffq(a($$11.d, $$1.c.d, $$2, byi.f), a($$11.e, $$1.c.e, $$2, byi.g), a($$11.f, $$1.c.f, $$2, byi.h));
      return new byh($$8, $$14, $$9, $$10);
   }

   private static double a(double $$0, double $$1, Set<byi> $$2, byi $$3) {
      return $$2.contains($$3) ? $$0 + $$1 : $$1;
   }

   public ffq a() {
      return this.b;
   }

   public ffq b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
