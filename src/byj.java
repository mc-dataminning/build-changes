import java.util.Set;

public record byj(ffs b, ffs c, float d, float e) {
   public static final za<vy, byj> a = za.a(ffs.b, byj::a, ffs.b, byj::b, yy.l, byj::c, yy.l, byj::d, byj::new);

   public static byj a(bwv $$0) {
      return $$0.bQ() ? new byj($$0.R_().a(), $$0.ae(), $$0.R_().b(), $$0.R_().c()) : new byj($$0.dt(), $$0.ae(), $$0.dL(), $$0.dN());
   }

   public static byj a(eyq $$0) {
      return new byj($$0.c(), $$0.d(), $$0.e(), $$0.f());
   }

   public static byj a(byj $$0, byj $$1, Set<byk> $$2) {
      double $$3 = $$2.contains(byk.a) ? $$0.b.d : 0.0;
      double $$4 = $$2.contains(byk.b) ? $$0.b.e : 0.0;
      double $$5 = $$2.contains(byk.c) ? $$0.b.f : 0.0;
      float $$6 = $$2.contains(byk.d) ? $$0.d : 0.0F;
      float $$7 = $$2.contains(byk.e) ? $$0.e : 0.0F;
      ffs $$8 = new ffs($$3 + $$1.b.d, $$4 + $$1.b.e, $$5 + $$1.b.f);
      float $$9 = $$6 + $$1.d;
      float $$10 = azq.a($$7 + $$1.e, -90.0F, 90.0F);
      ffs $$11 = $$0.c;
      if ($$2.contains(byk.i)) {
         float $$12 = $$0.d - $$9;
         float $$13 = $$0.e - $$10;
         $$11 = $$11.a((float)Math.toRadians((double)$$13));
         $$11 = $$11.b((float)Math.toRadians((double)$$12));
      }

      ffs $$14 = new ffs(a($$11.d, $$1.c.d, $$2, byk.f), a($$11.e, $$1.c.e, $$2, byk.g), a($$11.f, $$1.c.f, $$2, byk.h));
      return new byj($$8, $$14, $$9, $$10);
   }

   private static double a(double $$0, double $$1, Set<byk> $$2, byk $$3) {
      return $$2.contains($$3) ? $$0 + $$1 : $$1;
   }

   public ffs a() {
      return this.b;
   }

   public ffs b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
