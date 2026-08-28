import java.util.Set;

public record bxp(fei b, fei c, float d, float e) {
   public static final yw<vu, bxp> a = yw.a(fei.b, bxp::a, fei.b, bxp::b, yu.l, bxp::c, yu.l, bxp::d, bxp::new);

   public static bxp a(bwd $$0) {
      return $$0.bR() ? new bxp($$0.N_().a(), $$0.ah(), $$0.N_().b(), $$0.N_().c()) : new bxp($$0.dt(), $$0.ah(), $$0.dL(), $$0.dN());
   }

   public static bxp a(exg $$0) {
      return new bxp($$0.c(), $$0.d(), $$0.e(), $$0.f());
   }

   public static bxp a(bxp $$0, bxp $$1, Set<bxq> $$2) {
      double $$3 = $$2.contains(bxq.a) ? $$0.b.d : 0.0;
      double $$4 = $$2.contains(bxq.b) ? $$0.b.e : 0.0;
      double $$5 = $$2.contains(bxq.c) ? $$0.b.f : 0.0;
      float $$6 = $$2.contains(bxq.d) ? $$0.d : 0.0F;
      float $$7 = $$2.contains(bxq.e) ? $$0.e : 0.0F;
      fei $$8 = new fei($$3 + $$1.b.d, $$4 + $$1.b.e, $$5 + $$1.b.f);
      float $$9 = $$6 + $$1.d;
      float $$10 = azm.a($$7 + $$1.e, -90.0F, 90.0F);
      fei $$11 = $$0.c;
      if ($$2.contains(bxq.i)) {
         float $$12 = $$0.d - $$9;
         float $$13 = $$0.e - $$10;
         $$11 = $$11.a((float)Math.toRadians((double)$$13));
         $$11 = $$11.b((float)Math.toRadians((double)$$12));
      }

      fei $$14 = new fei(a($$11.d, $$1.c.d, $$2, bxq.f), a($$11.e, $$1.c.e, $$2, bxq.g), a($$11.f, $$1.c.f, $$2, bxq.h));
      return new bxp($$8, $$14, $$9, $$10);
   }

   private static double a(double $$0, double $$1, Set<bxq> $$2, bxq $$3) {
      return $$2.contains($$3) ? $$0 + $$1 : $$1;
   }

   public fei a() {
      return this.b;
   }

   public fei b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
