import java.util.Set;

public record bvs(fay b, fay c, float d, float e) {
   public static final ym<vl, bvs> a = ym.a(fay.b, bvs::a, fay.b, bvs::b, yk.l, bvs::c, yk.l, bvs::d, bvs::new);

   public static bvs a(buj $$0) {
      return new bvs($$0.du(), $$0.ah(), $$0.dM(), $$0.dO());
   }

   public static bvs b(buj $$0) {
      return new bvs(new fay($$0.R_(), $$0.S_(), $$0.g_()), $$0.ah(), $$0.dM(), $$0.dO());
   }

   public static bvs a(etx $$0) {
      return new bvs($$0.c(), $$0.d(), $$0.e(), $$0.f());
   }

   public static bvs a(bvs $$0, bvs $$1, Set<bvt> $$2) {
      double $$3 = $$2.contains(bvt.a) ? $$0.b.d : 0.0;
      double $$4 = $$2.contains(bvt.b) ? $$0.b.e : 0.0;
      double $$5 = $$2.contains(bvt.c) ? $$0.b.f : 0.0;
      float $$6 = $$2.contains(bvt.d) ? $$0.d : 0.0F;
      float $$7 = $$2.contains(bvt.e) ? $$0.e : 0.0F;
      fay $$8 = new fay($$3 + $$1.b.d, $$4 + $$1.b.e, $$5 + $$1.b.f);
      float $$9 = $$6 + $$1.d;
      float $$10 = $$7 + $$1.e;
      fay $$11 = $$0.c;
      if ($$2.contains(bvt.i)) {
         float $$12 = $$0.d - $$9;
         float $$13 = $$0.e - $$10;
         $$11 = $$11.a((float)Math.toRadians((double)$$13));
         $$11 = $$11.b((float)Math.toRadians((double)$$12));
      }

      fay $$14 = new fay(a($$11.d, $$1.c.d, $$2, bvt.f), a($$11.e, $$1.c.e, $$2, bvt.g), a($$11.f, $$1.c.f, $$2, bvt.h));
      return new bvs($$8, $$14, $$9, $$10);
   }

   private static double a(double $$0, double $$1, Set<bvt> $$2, bvt $$3) {
      return $$2.contains($$3) ? $$0 + $$1 : $$1;
   }

   public fay a() {
      return this.b;
   }

   public fay b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
