import java.util.Set;

public record bvv(fbb b, fbb c, float d, float e) {
   public static final yn<vl, bvv> a = yn.a(fbb.b, bvv::a, fbb.b, bvv::b, yl.l, bvv::c, yl.l, bvv::d, bvv::new);

   public static bvv a(bum $$0) {
      return new bvv($$0.dt(), $$0.ah(), $$0.dL(), $$0.dN());
   }

   public static bvv b(bum $$0) {
      return new bvv(new fbb($$0.R_(), $$0.S_(), $$0.g_()), $$0.ah(), $$0.dL(), $$0.dN());
   }

   public static bvv a(eua $$0) {
      return new bvv($$0.c(), $$0.d(), $$0.e(), $$0.f());
   }

   public static bvv a(bvv $$0, bvv $$1, Set<bvw> $$2) {
      double $$3 = $$2.contains(bvw.a) ? $$0.b.d : 0.0;
      double $$4 = $$2.contains(bvw.b) ? $$0.b.e : 0.0;
      double $$5 = $$2.contains(bvw.c) ? $$0.b.f : 0.0;
      float $$6 = $$2.contains(bvw.d) ? $$0.d : 0.0F;
      float $$7 = $$2.contains(bvw.e) ? $$0.e : 0.0F;
      fbb $$8 = new fbb($$3 + $$1.b.d, $$4 + $$1.b.e, $$5 + $$1.b.f);
      float $$9 = $$6 + $$1.d;
      float $$10 = $$7 + $$1.e;
      fbb $$11 = $$0.c;
      if ($$2.contains(bvw.i)) {
         float $$12 = $$0.d - $$9;
         float $$13 = $$0.e - $$10;
         $$11 = $$11.a((float)Math.toRadians((double)$$13));
         $$11 = $$11.b((float)Math.toRadians((double)$$12));
      }

      fbb $$14 = new fbb(a($$11.d, $$1.c.d, $$2, bvw.f), a($$11.e, $$1.c.e, $$2, bvw.g), a($$11.f, $$1.c.f, $$2, bvw.h));
      return new bvv($$8, $$14, $$9, $$10);
   }

   private static double a(double $$0, double $$1, Set<bvw> $$2, bvw $$3) {
      return $$2.contains($$3) ? $$0 + $$1 : $$1;
   }

   public fbb a() {
      return this.b;
   }

   public fbb b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
