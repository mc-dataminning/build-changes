import java.util.Set;

public record bwl(fbx b, fbx c, float d, float e) {
   public static final yn<vl, bwl> a = yn.a(fbx.b, bwl::a, fbx.b, bwl::b, yl.l, bwl::c, yl.l, bwl::d, bwl::new);

   public static bwl a(bva $$0) {
      return $$0.bQ() ? new bwl($$0.N_().a(), $$0.ah(), $$0.N_().b(), $$0.N_().c()) : new bwl($$0.ds(), $$0.ah(), $$0.dK(), $$0.dM());
   }

   public static bwl a(euw $$0) {
      return new bwl($$0.c(), $$0.d(), $$0.e(), $$0.f());
   }

   public static bwl a(bwl $$0, bwl $$1, Set<bwm> $$2) {
      double $$3 = $$2.contains(bwm.a) ? $$0.b.d : 0.0;
      double $$4 = $$2.contains(bwm.b) ? $$0.b.e : 0.0;
      double $$5 = $$2.contains(bwm.c) ? $$0.b.f : 0.0;
      float $$6 = $$2.contains(bwm.d) ? $$0.d : 0.0F;
      float $$7 = $$2.contains(bwm.e) ? $$0.e : 0.0F;
      fbx $$8 = new fbx($$3 + $$1.b.d, $$4 + $$1.b.e, $$5 + $$1.b.f);
      float $$9 = $$6 + $$1.d;
      float $$10 = $$7 + $$1.e;
      fbx $$11 = $$0.c;
      if ($$2.contains(bwm.i)) {
         float $$12 = $$0.d - $$9;
         float $$13 = $$0.e - $$10;
         $$11 = $$11.a((float)Math.toRadians((double)$$13));
         $$11 = $$11.b((float)Math.toRadians((double)$$12));
      }

      fbx $$14 = new fbx(a($$11.d, $$1.c.d, $$2, bwm.f), a($$11.e, $$1.c.e, $$2, bwm.g), a($$11.f, $$1.c.f, $$2, bwm.h));
      return new bwl($$8, $$14, $$9, $$10);
   }

   private static double a(double $$0, double $$1, Set<bwm> $$2, bwm $$3) {
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
