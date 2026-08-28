import java.util.Set;

public record bvi(ezh a, ezh b, float c, float d) {
   public static bvi a(btz $$0) {
      return new bvi($$0.dv(), $$0.ai(), $$0.dN(), $$0.dP());
   }

   public static bvi a(aem $$0) {
      return new bvi($$0.e(), $$0.f(), $$0.g(), $$0.h());
   }

   public static bvi a(esc $$0) {
      return new bvi($$0.b(), $$0.c(), $$0.d(), $$0.e());
   }

   public static bvi a(bvi $$0, bvi $$1, Set<bvj> $$2) {
      double $$3 = $$2.contains(bvj.a) ? $$0.a.d : 0.0;
      double $$4 = $$2.contains(bvj.b) ? $$0.a.e : 0.0;
      double $$5 = $$2.contains(bvj.c) ? $$0.a.f : 0.0;
      float $$6 = $$2.contains(bvj.d) ? $$0.c : 0.0F;
      float $$7 = $$2.contains(bvj.e) ? $$0.d : 0.0F;
      ezh $$8 = new ezh($$3 + $$1.a.d, $$4 + $$1.a.e, $$5 + $$1.a.f);
      float $$9 = $$6 + $$1.c;
      float $$10 = $$7 + $$1.d;
      ezh $$11 = $$0.b;
      if ($$2.contains(bvj.i)) {
         float $$12 = $$0.c - $$9;
         float $$13 = $$0.d - $$10;
         $$11 = $$11.a((float)Math.toRadians((double)$$13));
         $$11 = $$11.b((float)Math.toRadians((double)$$12));
      }

      ezh $$14 = new ezh(a($$11.d, $$1.b.d, $$2, bvj.f), a($$11.e, $$1.b.e, $$2, bvj.g), a($$11.f, $$1.b.f, $$2, bvj.h));
      return new bvi($$8, $$14, $$9, $$10);
   }

   private static double a(double $$0, double $$1, Set<bvj> $$2, bvj $$3) {
      return $$2.contains($$3) ? $$0 + $$1 : $$1;
   }
}
