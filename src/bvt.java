import java.util.Set;

public record bvt(faz b, faz c, float d, float e) {
   public static final yn<vl, bvt> a = yn.a(faz.b, bvt::a, faz.b, bvt::b, yl.l, bvt::c, yl.l, bvt::d, bvt::new);

   public static bvt a(buk $$0) {
      return new bvt($$0.dt(), $$0.ah(), $$0.dL(), $$0.dN());
   }

   public static bvt b(buk $$0) {
      return new bvt(new faz($$0.R_(), $$0.S_(), $$0.g_()), $$0.ah(), $$0.dL(), $$0.dN());
   }

   public static bvt a(ety $$0) {
      return new bvt($$0.c(), $$0.d(), $$0.e(), $$0.f());
   }

   public static bvt a(bvt $$0, bvt $$1, Set<bvu> $$2) {
      double $$3 = $$2.contains(bvu.a) ? $$0.b.d : 0.0;
      double $$4 = $$2.contains(bvu.b) ? $$0.b.e : 0.0;
      double $$5 = $$2.contains(bvu.c) ? $$0.b.f : 0.0;
      float $$6 = $$2.contains(bvu.d) ? $$0.d : 0.0F;
      float $$7 = $$2.contains(bvu.e) ? $$0.e : 0.0F;
      faz $$8 = new faz($$3 + $$1.b.d, $$4 + $$1.b.e, $$5 + $$1.b.f);
      float $$9 = $$6 + $$1.d;
      float $$10 = $$7 + $$1.e;
      faz $$11 = $$0.c;
      if ($$2.contains(bvu.i)) {
         float $$12 = $$0.d - $$9;
         float $$13 = $$0.e - $$10;
         $$11 = $$11.a((float)Math.toRadians((double)$$13));
         $$11 = $$11.b((float)Math.toRadians((double)$$12));
      }

      faz $$14 = new faz(a($$11.d, $$1.c.d, $$2, bvu.f), a($$11.e, $$1.c.e, $$2, bvu.g), a($$11.f, $$1.c.f, $$2, bvu.h));
      return new bvt($$8, $$14, $$9, $$10);
   }

   private static double a(double $$0, double $$1, Set<bvu> $$2, bvu $$3) {
      return $$2.contains($$3) ? $$0 + $$1 : $$1;
   }

   public faz a() {
      return this.b;
   }

   public faz b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
