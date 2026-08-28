import java.util.Set;

public record bwt(fby b, fby c, float d, float e) {
   public static final zt<ws, bwt> a = zt.a(fby.b, bwt::a, fby.b, bwt::b, zr.l, bwt::c, zr.l, bwt::d, bwt::new);

   public static bwt a(bvk $$0) {
      return new bwt($$0.du(), $$0.ah(), $$0.dM(), $$0.dO());
   }

   public static bwt b(bvk $$0) {
      return new bwt(new fby($$0.R_(), $$0.S_(), $$0.g_()), $$0.ah(), $$0.dM(), $$0.dO());
   }

   public static bwt a(eux $$0) {
      return new bwt($$0.c(), $$0.d(), $$0.e(), $$0.f());
   }

   public static bwt a(bwt $$0, bwt $$1, Set<bwu> $$2) {
      double $$3 = $$2.contains(bwu.a) ? $$0.b.d : 0.0;
      double $$4 = $$2.contains(bwu.b) ? $$0.b.e : 0.0;
      double $$5 = $$2.contains(bwu.c) ? $$0.b.f : 0.0;
      float $$6 = $$2.contains(bwu.d) ? $$0.d : 0.0F;
      float $$7 = $$2.contains(bwu.e) ? $$0.e : 0.0F;
      fby $$8 = new fby($$3 + $$1.b.d, $$4 + $$1.b.e, $$5 + $$1.b.f);
      float $$9 = $$6 + $$1.d;
      float $$10 = $$7 + $$1.e;
      fby $$11 = $$0.c;
      if ($$2.contains(bwu.i)) {
         float $$12 = $$0.d - $$9;
         float $$13 = $$0.e - $$10;
         $$11 = $$11.a((float)Math.toRadians((double)$$13));
         $$11 = $$11.b((float)Math.toRadians((double)$$12));
      }

      fby $$14 = new fby(a($$11.d, $$1.c.d, $$2, bwu.f), a($$11.e, $$1.c.e, $$2, bwu.g), a($$11.f, $$1.c.f, $$2, bwu.h));
      return new bwt($$8, $$14, $$9, $$10);
   }

   private static double a(double $$0, double $$1, Set<bwu> $$2, bwu $$3) {
      return $$2.contains($$3) ? $$0 + $$1 : $$1;
   }

   public fby a() {
      return this.b;
   }

   public fby b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
