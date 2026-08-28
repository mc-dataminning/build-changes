import java.util.Set;

public record bvn(ezn a, ezn b, float c, float d) {
   public static bvn a(bue $$0) {
      return new bvn($$0.dv(), $$0.ai(), $$0.dN(), $$0.dP());
   }

   public static bvn a(aen $$0) {
      return new bvn($$0.e(), $$0.f(), $$0.g(), $$0.h());
   }

   public static bvn a(esi $$0) {
      return new bvn($$0.b(), $$0.c(), $$0.d(), $$0.e());
   }

   public static bvn a(bvn $$0, bvn $$1, Set<bvo> $$2) {
      double $$3 = $$2.contains(bvo.a) ? $$0.a.d : 0.0;
      double $$4 = $$2.contains(bvo.b) ? $$0.a.e : 0.0;
      double $$5 = $$2.contains(bvo.c) ? $$0.a.f : 0.0;
      float $$6 = $$2.contains(bvo.d) ? $$0.c : 0.0F;
      float $$7 = $$2.contains(bvo.e) ? $$0.d : 0.0F;
      ezn $$8 = new ezn($$3 + $$1.a.d, $$4 + $$1.a.e, $$5 + $$1.a.f);
      float $$9 = $$6 + $$1.c;
      float $$10 = $$7 + $$1.d;
      ezn $$11 = $$0.b;
      if ($$2.contains(bvo.i)) {
         float $$12 = $$0.c - $$9;
         float $$13 = $$0.d - $$10;
         $$11 = $$11.a((float)Math.toRadians((double)$$13));
         $$11 = $$11.b((float)Math.toRadians((double)$$12));
      }

      ezn $$14 = new ezn(a($$11.d, $$1.b.d, $$2, bvo.f), a($$11.e, $$1.b.e, $$2, bvo.g), a($$11.f, $$1.b.f, $$2, bvo.h));
      return new bvn($$8, $$14, $$9, $$10);
   }

   private static double a(double $$0, double $$1, Set<bvo> $$2, bvo $$3) {
      return $$2.contains($$3) ? $$0 + $$1 : $$1;
   }
}
