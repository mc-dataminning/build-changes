import java.util.Set;

public record bws(fbx b, fbx c, float d, float e) {
   public static final zt<ws, bws> a = zt.a(fbx.b, bws::a, fbx.b, bws::b, zr.l, bws::c, zr.l, bws::d, bws::new);

   public static bws a(bvj $$0) {
      return new bws($$0.du(), $$0.ah(), $$0.dM(), $$0.dO());
   }

   public static bws b(bvj $$0) {
      return new bws(new fbx($$0.R_(), $$0.S_(), $$0.g_()), $$0.ah(), $$0.dM(), $$0.dO());
   }

   public static bws a(euw $$0) {
      return new bws($$0.c(), $$0.d(), $$0.e(), $$0.f());
   }

   public static bws a(bws $$0, bws $$1, Set<bwt> $$2) {
      double $$3 = $$2.contains(bwt.a) ? $$0.b.d : 0.0;
      double $$4 = $$2.contains(bwt.b) ? $$0.b.e : 0.0;
      double $$5 = $$2.contains(bwt.c) ? $$0.b.f : 0.0;
      float $$6 = $$2.contains(bwt.d) ? $$0.d : 0.0F;
      float $$7 = $$2.contains(bwt.e) ? $$0.e : 0.0F;
      fbx $$8 = new fbx($$3 + $$1.b.d, $$4 + $$1.b.e, $$5 + $$1.b.f);
      float $$9 = $$6 + $$1.d;
      float $$10 = $$7 + $$1.e;
      fbx $$11 = $$0.c;
      if ($$2.contains(bwt.i)) {
         float $$12 = $$0.d - $$9;
         float $$13 = $$0.e - $$10;
         $$11 = $$11.a((float)Math.toRadians((double)$$13));
         $$11 = $$11.b((float)Math.toRadians((double)$$12));
      }

      fbx $$14 = new fbx(a($$11.d, $$1.c.d, $$2, bwt.f), a($$11.e, $$1.c.e, $$2, bwt.g), a($$11.f, $$1.c.f, $$2, bwt.h));
      return new bws($$8, $$14, $$9, $$10);
   }

   private static double a(double $$0, double $$1, Set<bwt> $$2, bwt $$3) {
      return $$2.contains($$3) ? $$0 + $$1 : $$1;
   }

   public fbx a() {
      return this.b;
   }

   public fbx b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
