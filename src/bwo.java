import java.util.Set;

public record bwo(fbs b, fbs c, float d, float e) {
   public static final zt<ws, bwo> a = zt.a(fbs.b, bwo::a, fbs.b, bwo::b, zr.l, bwo::c, zr.l, bwo::d, bwo::new);

   public static bwo a(bvf $$0) {
      return new bwo($$0.dt(), $$0.ah(), $$0.dL(), $$0.dN());
   }

   public static bwo b(bvf $$0) {
      return new bwo(new fbs($$0.R_(), $$0.S_(), $$0.g_()), $$0.ah(), $$0.dL(), $$0.dN());
   }

   public static bwo a(eup $$0) {
      return new bwo($$0.c(), $$0.d(), $$0.e(), $$0.f());
   }

   public static bwo a(bwo $$0, bwo $$1, Set<bwp> $$2) {
      double $$3 = $$2.contains(bwp.a) ? $$0.b.d : 0.0;
      double $$4 = $$2.contains(bwp.b) ? $$0.b.e : 0.0;
      double $$5 = $$2.contains(bwp.c) ? $$0.b.f : 0.0;
      float $$6 = $$2.contains(bwp.d) ? $$0.d : 0.0F;
      float $$7 = $$2.contains(bwp.e) ? $$0.e : 0.0F;
      fbs $$8 = new fbs($$3 + $$1.b.d, $$4 + $$1.b.e, $$5 + $$1.b.f);
      float $$9 = $$6 + $$1.d;
      float $$10 = $$7 + $$1.e;
      fbs $$11 = $$0.c;
      if ($$2.contains(bwp.i)) {
         float $$12 = $$0.d - $$9;
         float $$13 = $$0.e - $$10;
         $$11 = $$11.a((float)Math.toRadians((double)$$13));
         $$11 = $$11.b((float)Math.toRadians((double)$$12));
      }

      fbs $$14 = new fbs(a($$11.d, $$1.c.d, $$2, bwp.f), a($$11.e, $$1.c.e, $$2, bwp.g), a($$11.f, $$1.c.f, $$2, bwp.h));
      return new bwo($$8, $$14, $$9, $$10);
   }

   private static double a(double $$0, double $$1, Set<bwp> $$2, bwp $$3) {
      return $$2.contains($$3) ? $$0 + $$1 : $$1;
   }

   public fbs a() {
      return this.b;
   }

   public fbs b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
