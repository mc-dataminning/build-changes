import java.util.Set;

public record bvu(ezy a, ezy b, float c, float d) {
   public static bvu a(bul $$0) {
      return new bvu($$0.dt(), $$0.ah(), $$0.dL(), $$0.dN());
   }

   public static bvu a(aeo $$0) {
      return new bvu($$0.e(), $$0.f(), $$0.g(), $$0.h());
   }

   public static bvu a(est $$0) {
      return new bvu($$0.b(), $$0.c(), $$0.d(), $$0.e());
   }

   public static bvu a(bvu $$0, bvu $$1, Set<bvv> $$2) {
      double $$3 = $$2.contains(bvv.a) ? $$0.a.d : 0.0;
      double $$4 = $$2.contains(bvv.b) ? $$0.a.e : 0.0;
      double $$5 = $$2.contains(bvv.c) ? $$0.a.f : 0.0;
      float $$6 = $$2.contains(bvv.d) ? $$0.c : 0.0F;
      float $$7 = $$2.contains(bvv.e) ? $$0.d : 0.0F;
      ezy $$8 = new ezy($$3 + $$1.a.d, $$4 + $$1.a.e, $$5 + $$1.a.f);
      float $$9 = $$6 + $$1.c;
      float $$10 = $$7 + $$1.d;
      ezy $$11 = $$0.b;
      if ($$2.contains(bvv.i)) {
         float $$12 = $$0.c - $$9;
         float $$13 = $$0.d - $$10;
         $$11 = $$11.a((float)Math.toRadians((double)$$13));
         $$11 = $$11.b((float)Math.toRadians((double)$$12));
      }

      ezy $$14 = new ezy(a($$11.d, $$1.b.d, $$2, bvv.f), a($$11.e, $$1.b.e, $$2, bvv.g), a($$11.f, $$1.b.f, $$2, bvv.h));
      return new bvu($$8, $$14, $$9, $$10);
   }

   private static double a(double $$0, double $$1, Set<bvv> $$2, bvv $$3) {
      return $$2.contains($$3) ? $$0 + $$1 : $$1;
   }
}
