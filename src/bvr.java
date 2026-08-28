import java.util.Set;

public record bvr(ezr a, ezr b, float c, float d) {
   public static bvr a(bui $$0) {
      return new bvr($$0.dw(), $$0.ai(), $$0.dO(), $$0.dQ());
   }

   public static bvr a(aeq $$0) {
      return new bvr($$0.e(), $$0.f(), $$0.g(), $$0.h());
   }

   public static bvr a(esm $$0) {
      return new bvr($$0.b(), $$0.c(), $$0.d(), $$0.e());
   }

   public static bvr a(bvr $$0, bvr $$1, Set<bvs> $$2) {
      double $$3 = $$2.contains(bvs.a) ? $$0.a.d : 0.0;
      double $$4 = $$2.contains(bvs.b) ? $$0.a.e : 0.0;
      double $$5 = $$2.contains(bvs.c) ? $$0.a.f : 0.0;
      float $$6 = $$2.contains(bvs.d) ? $$0.c : 0.0F;
      float $$7 = $$2.contains(bvs.e) ? $$0.d : 0.0F;
      ezr $$8 = new ezr($$3 + $$1.a.d, $$4 + $$1.a.e, $$5 + $$1.a.f);
      float $$9 = $$6 + $$1.c;
      float $$10 = $$7 + $$1.d;
      ezr $$11 = $$0.b;
      if ($$2.contains(bvs.i)) {
         float $$12 = $$0.c - $$9;
         float $$13 = $$0.d - $$10;
         $$11 = $$11.a((float)Math.toRadians((double)$$13));
         $$11 = $$11.b((float)Math.toRadians((double)$$12));
      }

      ezr $$14 = new ezr(a($$11.d, $$1.b.d, $$2, bvs.f), a($$11.e, $$1.b.e, $$2, bvs.g), a($$11.f, $$1.b.f, $$2, bvs.h));
      return new bvr($$8, $$14, $$9, $$10);
   }

   private static double a(double $$0, double $$1, Set<bvs> $$2, bvs $$3) {
      return $$2.contains($$3) ? $$0 + $$1 : $$1;
   }
}
