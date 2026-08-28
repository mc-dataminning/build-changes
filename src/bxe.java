import java.util.Set;

public record bxe(fcu b, fcu c, float d, float e) {
   public static final yt<vr, bxe> a = yt.a(fcu.b, bxe::a, fcu.b, bxe::b, yr.l, bxe::c, yr.l, bxe::d, bxe::new);

   public static bxe a(bvs $$0) {
      return $$0.bR() ? new bxe($$0.N_().a(), $$0.ah(), $$0.N_().b(), $$0.N_().c()) : new bxe($$0.dt(), $$0.ah(), $$0.dL(), $$0.dN());
   }

   public static bxe a(evt $$0) {
      return new bxe($$0.c(), $$0.d(), $$0.e(), $$0.f());
   }

   public static bxe a(bxe $$0, bxe $$1, Set<bxf> $$2) {
      double $$3 = $$2.contains(bxf.a) ? $$0.b.d : 0.0;
      double $$4 = $$2.contains(bxf.b) ? $$0.b.e : 0.0;
      double $$5 = $$2.contains(bxf.c) ? $$0.b.f : 0.0;
      float $$6 = $$2.contains(bxf.d) ? $$0.d : 0.0F;
      float $$7 = $$2.contains(bxf.e) ? $$0.e : 0.0F;
      fcu $$8 = new fcu($$3 + $$1.b.d, $$4 + $$1.b.e, $$5 + $$1.b.f);
      float $$9 = $$6 + $$1.d;
      float $$10 = azk.a($$7 + $$1.e, -90.0F, 90.0F);
      fcu $$11 = $$0.c;
      if ($$2.contains(bxf.i)) {
         float $$12 = $$0.d - $$9;
         float $$13 = $$0.e - $$10;
         $$11 = $$11.a((float)Math.toRadians((double)$$13));
         $$11 = $$11.b((float)Math.toRadians((double)$$12));
      }

      fcu $$14 = new fcu(a($$11.d, $$1.c.d, $$2, bxf.f), a($$11.e, $$1.c.e, $$2, bxf.g), a($$11.f, $$1.c.f, $$2, bxf.h));
      return new bxe($$8, $$14, $$9, $$10);
   }

   private static double a(double $$0, double $$1, Set<bxf> $$2, bxf $$3) {
      return $$2.contains($$3) ? $$0 + $$1 : $$1;
   }

   public fcu a() {
      return this.b;
   }

   public fcu b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
