import java.util.Set;

public record bvu(fba b, fba c, float d, float e) {
   public static final yn<vl, bvu> a = yn.a(fba.b, bvu::a, fba.b, bvu::b, yl.l, bvu::c, yl.l, bvu::d, bvu::new);

   public static bvu a(bul $$0) {
      return new bvu($$0.dt(), $$0.ah(), $$0.dL(), $$0.dN());
   }

   public static bvu b(bul $$0) {
      return new bvu(new fba($$0.R_(), $$0.S_(), $$0.g_()), $$0.ah(), $$0.dL(), $$0.dN());
   }

   public static bvu a(etz $$0) {
      return new bvu($$0.c(), $$0.d(), $$0.e(), $$0.f());
   }

   public static bvu a(bvu $$0, bvu $$1, Set<bvv> $$2) {
      double $$3 = $$2.contains(bvv.a) ? $$0.b.d : 0.0;
      double $$4 = $$2.contains(bvv.b) ? $$0.b.e : 0.0;
      double $$5 = $$2.contains(bvv.c) ? $$0.b.f : 0.0;
      float $$6 = $$2.contains(bvv.d) ? $$0.d : 0.0F;
      float $$7 = $$2.contains(bvv.e) ? $$0.e : 0.0F;
      fba $$8 = new fba($$3 + $$1.b.d, $$4 + $$1.b.e, $$5 + $$1.b.f);
      float $$9 = $$6 + $$1.d;
      float $$10 = $$7 + $$1.e;
      fba $$11 = $$0.c;
      if ($$2.contains(bvv.i)) {
         float $$12 = $$0.d - $$9;
         float $$13 = $$0.e - $$10;
         $$11 = $$11.a((float)Math.toRadians((double)$$13));
         $$11 = $$11.b((float)Math.toRadians((double)$$12));
      }

      fba $$14 = new fba(a($$11.d, $$1.c.d, $$2, bvv.f), a($$11.e, $$1.c.e, $$2, bvv.g), a($$11.f, $$1.c.f, $$2, bvv.h));
      return new bvu($$8, $$14, $$9, $$10);
   }

   private static double a(double $$0, double $$1, Set<bvv> $$2, bvv $$3) {
      return $$2.contains($$3) ? $$0 + $$1 : $$1;
   }

   public fba a() {
      return this.b;
   }

   public fba b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
