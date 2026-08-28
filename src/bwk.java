import java.util.Set;

public record bwk(fbr b, fbr c, float d, float e) {
   public static final zi<wh, bwk> a = zi.a(fbr.b, bwk::a, fbr.b, bwk::b, zg.l, bwk::c, zg.l, bwk::d, bwk::new);

   public static bwk a(bvb $$0) {
      return new bwk($$0.du(), $$0.ah(), $$0.dM(), $$0.dO());
   }

   public static bwk b(bvb $$0) {
      return new bwk(new fbr($$0.R_(), $$0.S_(), $$0.g_()), $$0.ah(), $$0.dM(), $$0.dO());
   }

   public static bwk a(euq $$0) {
      return new bwk($$0.c(), $$0.d(), $$0.e(), $$0.f());
   }

   public static bwk a(bwk $$0, bwk $$1, Set<bwl> $$2) {
      double $$3 = $$2.contains(bwl.a) ? $$0.b.d : 0.0;
      double $$4 = $$2.contains(bwl.b) ? $$0.b.e : 0.0;
      double $$5 = $$2.contains(bwl.c) ? $$0.b.f : 0.0;
      float $$6 = $$2.contains(bwl.d) ? $$0.d : 0.0F;
      float $$7 = $$2.contains(bwl.e) ? $$0.e : 0.0F;
      fbr $$8 = new fbr($$3 + $$1.b.d, $$4 + $$1.b.e, $$5 + $$1.b.f);
      float $$9 = $$6 + $$1.d;
      float $$10 = $$7 + $$1.e;
      fbr $$11 = $$0.c;
      if ($$2.contains(bwl.i)) {
         float $$12 = $$0.d - $$9;
         float $$13 = $$0.e - $$10;
         $$11 = $$11.a((float)Math.toRadians((double)$$13));
         $$11 = $$11.b((float)Math.toRadians((double)$$12));
      }

      fbr $$14 = new fbr(a($$11.d, $$1.c.d, $$2, bwl.f), a($$11.e, $$1.c.e, $$2, bwl.g), a($$11.f, $$1.c.f, $$2, bwl.h));
      return new bwk($$8, $$14, $$9, $$10);
   }

   private static double a(double $$0, double $$1, Set<bwl> $$2, bwl $$3) {
      return $$2.contains($$3) ? $$0 + $$1 : $$1;
   }

   public fbr a() {
      return this.b;
   }

   public fbr b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
