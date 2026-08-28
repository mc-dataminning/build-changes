import java.util.Set;

public record bxm(fdw b, fdw c, float d, float e) {
   public static final yu<vs, bxm> a = yu.a(fdw.b, bxm::a, fdw.b, bxm::b, ys.l, bxm::c, ys.l, bxm::d, bxm::new);

   public static bxm a(bwa $$0) {
      return $$0.bR() ? new bxm($$0.N_().a(), $$0.ah(), $$0.N_().b(), $$0.N_().c()) : new bxm($$0.dt(), $$0.ah(), $$0.dL(), $$0.dN());
   }

   public static bxm a(ewv $$0) {
      return new bxm($$0.c(), $$0.d(), $$0.e(), $$0.f());
   }

   public static bxm a(bxm $$0, bxm $$1, Set<bxn> $$2) {
      double $$3 = $$2.contains(bxn.a) ? $$0.b.d : 0.0;
      double $$4 = $$2.contains(bxn.b) ? $$0.b.e : 0.0;
      double $$5 = $$2.contains(bxn.c) ? $$0.b.f : 0.0;
      float $$6 = $$2.contains(bxn.d) ? $$0.d : 0.0F;
      float $$7 = $$2.contains(bxn.e) ? $$0.e : 0.0F;
      fdw $$8 = new fdw($$3 + $$1.b.d, $$4 + $$1.b.e, $$5 + $$1.b.f);
      float $$9 = $$6 + $$1.d;
      float $$10 = azk.a($$7 + $$1.e, -90.0F, 90.0F);
      fdw $$11 = $$0.c;
      if ($$2.contains(bxn.i)) {
         float $$12 = $$0.d - $$9;
         float $$13 = $$0.e - $$10;
         $$11 = $$11.a((float)Math.toRadians((double)$$13));
         $$11 = $$11.b((float)Math.toRadians((double)$$12));
      }

      fdw $$14 = new fdw(a($$11.d, $$1.c.d, $$2, bxn.f), a($$11.e, $$1.c.e, $$2, bxn.g), a($$11.f, $$1.c.f, $$2, bxn.h));
      return new bxm($$8, $$14, $$9, $$10);
   }

   private static double a(double $$0, double $$1, Set<bxn> $$2, bxn $$3) {
      return $$2.contains($$3) ? $$0 + $$1 : $$1;
   }

   public fdw a() {
      return this.b;
   }

   public fdw b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
