import java.util.Set;

public record bys(fgc b, fgc c, float d, float e) {
   public static final ze<vy, bys> a = ze.a(fgc.b, bys::a, fgc.b, bys::b, zc.l, bys::c, zc.l, bys::d, bys::new);

   public static bys a(bxe $$0) {
      return $$0.bQ() ? new bys($$0.l_().a(), $$0.ad(), $$0.l_().b(), $$0.l_().c()) : new bys($$0.dt(), $$0.ad(), $$0.dL(), $$0.dN());
   }

   public static bys a(eza $$0) {
      return new bys($$0.c(), $$0.d(), $$0.e(), $$0.f());
   }

   public static bys a(bys $$0, bys $$1, Set<byt> $$2) {
      double $$3 = $$2.contains(byt.a) ? $$0.b.d : 0.0;
      double $$4 = $$2.contains(byt.b) ? $$0.b.e : 0.0;
      double $$5 = $$2.contains(byt.c) ? $$0.b.f : 0.0;
      float $$6 = $$2.contains(byt.d) ? $$0.d : 0.0F;
      float $$7 = $$2.contains(byt.e) ? $$0.e : 0.0F;
      fgc $$8 = new fgc($$3 + $$1.b.d, $$4 + $$1.b.e, $$5 + $$1.b.f);
      float $$9 = $$6 + $$1.d;
      float $$10 = azz.a($$7 + $$1.e, -90.0F, 90.0F);
      fgc $$11 = $$0.c;
      if ($$2.contains(byt.i)) {
         float $$12 = $$0.d - $$9;
         float $$13 = $$0.e - $$10;
         $$11 = $$11.a((float)Math.toRadians((double)$$13));
         $$11 = $$11.b((float)Math.toRadians((double)$$12));
      }

      fgc $$14 = new fgc(a($$11.d, $$1.c.d, $$2, byt.f), a($$11.e, $$1.c.e, $$2, byt.g), a($$11.f, $$1.c.f, $$2, byt.h));
      return new bys($$8, $$14, $$9, $$10);
   }

   private static double a(double $$0, double $$1, Set<byt> $$2, byt $$3) {
      return $$2.contains($$3) ? $$0 + $$1 : $$1;
   }

   public fgc a() {
      return this.b;
   }

   public fgc b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
