import java.util.Set;

public record bxw(fex b, fex c, float d, float e) {
   public static final yw<vu, bxw> a = yw.a(fex.b, bxw::a, fex.b, bxw::b, yu.l, bxw::c, yu.l, bxw::d, bxw::new);

   public static bxw a(bwi $$0) {
      return $$0.bP() ? new bxw($$0.N_().a(), $$0.ae(), $$0.N_().b(), $$0.N_().c()) : new bxw($$0.ds(), $$0.ae(), $$0.dK(), $$0.dM());
   }

   public static bxw a(exv $$0) {
      return new bxw($$0.c(), $$0.d(), $$0.e(), $$0.f());
   }

   public static bxw a(bxw $$0, bxw $$1, Set<bxx> $$2) {
      double $$3 = $$2.contains(bxx.a) ? $$0.b.d : 0.0;
      double $$4 = $$2.contains(bxx.b) ? $$0.b.e : 0.0;
      double $$5 = $$2.contains(bxx.c) ? $$0.b.f : 0.0;
      float $$6 = $$2.contains(bxx.d) ? $$0.d : 0.0F;
      float $$7 = $$2.contains(bxx.e) ? $$0.e : 0.0F;
      fex $$8 = new fex($$3 + $$1.b.d, $$4 + $$1.b.e, $$5 + $$1.b.f);
      float $$9 = $$6 + $$1.d;
      float $$10 = azm.a($$7 + $$1.e, -90.0F, 90.0F);
      fex $$11 = $$0.c;
      if ($$2.contains(bxx.i)) {
         float $$12 = $$0.d - $$9;
         float $$13 = $$0.e - $$10;
         $$11 = $$11.a((float)Math.toRadians((double)$$13));
         $$11 = $$11.b((float)Math.toRadians((double)$$12));
      }

      fex $$14 = new fex(a($$11.d, $$1.c.d, $$2, bxx.f), a($$11.e, $$1.c.e, $$2, bxx.g), a($$11.f, $$1.c.f, $$2, bxx.h));
      return new bxw($$8, $$14, $$9, $$10);
   }

   private static double a(double $$0, double $$1, Set<bxx> $$2, bxx $$3) {
      return $$2.contains($$3) ? $$0 + $$1 : $$1;
   }

   public fex a() {
      return this.b;
   }

   public fex b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
