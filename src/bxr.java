import java.util.Set;

public record bxr(feq b, feq c, float d, float e) {
   public static final yw<vu, bxr> a = yw.a(feq.b, bxr::a, feq.b, bxr::b, yu.l, bxr::c, yu.l, bxr::d, bxr::new);

   public static bxr a(bwf $$0) {
      return $$0.bR() ? new bxr($$0.N_().a(), $$0.ah(), $$0.N_().b(), $$0.N_().c()) : new bxr($$0.dt(), $$0.ah(), $$0.dL(), $$0.dN());
   }

   public static bxr a(exo $$0) {
      return new bxr($$0.c(), $$0.d(), $$0.e(), $$0.f());
   }

   public static bxr a(bxr $$0, bxr $$1, Set<bxs> $$2) {
      double $$3 = $$2.contains(bxs.a) ? $$0.b.d : 0.0;
      double $$4 = $$2.contains(bxs.b) ? $$0.b.e : 0.0;
      double $$5 = $$2.contains(bxs.c) ? $$0.b.f : 0.0;
      float $$6 = $$2.contains(bxs.d) ? $$0.d : 0.0F;
      float $$7 = $$2.contains(bxs.e) ? $$0.e : 0.0F;
      feq $$8 = new feq($$3 + $$1.b.d, $$4 + $$1.b.e, $$5 + $$1.b.f);
      float $$9 = $$6 + $$1.d;
      float $$10 = azm.a($$7 + $$1.e, -90.0F, 90.0F);
      feq $$11 = $$0.c;
      if ($$2.contains(bxs.i)) {
         float $$12 = $$0.d - $$9;
         float $$13 = $$0.e - $$10;
         $$11 = $$11.a((float)Math.toRadians((double)$$13));
         $$11 = $$11.b((float)Math.toRadians((double)$$12));
      }

      feq $$14 = new feq(a($$11.d, $$1.c.d, $$2, bxs.f), a($$11.e, $$1.c.e, $$2, bxs.g), a($$11.f, $$1.c.f, $$2, bxs.h));
      return new bxr($$8, $$14, $$9, $$10);
   }

   private static double a(double $$0, double $$1, Set<bxs> $$2, bxs $$3) {
      return $$2.contains($$3) ? $$0 + $$1 : $$1;
   }

   public feq a() {
      return this.b;
   }

   public feq b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
